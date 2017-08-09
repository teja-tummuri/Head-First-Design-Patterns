package com.gani.compound.MVC;

import javax.sound.midi.*;
import java.util.ArrayList;

/**
 * Created by Gani on 8/7/17.
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {

    Sequencer sequencer;
    ArrayList<BeatObserver> beatObservers = new ArrayList<>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<>();
    int bpm;

    Sequence sequence;
    Track track;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();

    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    void beatEvent() {
        notifyBeatObservers();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int index = beatObservers.indexOf(o);
        if (index >= 0)
            beatObservers.remove(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        int index = bpmObservers.indexOf(o);
        if (index >= 0)
            bpmObservers.remove(o);
    }

    public void notifyBPMObservers() {
        bpmObservers.forEach(bpmObserver -> bpmObserver.updateBPM());
    }

    public void notifyBeatObservers() {
        beatObservers.forEach(beatObserver -> beatObserver.updateBeat());
    }

    @Override
    public void meta(MetaMessage message) {
        if (message.getType() == 47) {
            beatEvent();
            System.out.println("Beat is: "+getBPM());
            sequencer.start();
            setBPM(getBPM());

        }
    }

    private void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};
        sequence.deleteTrack(null);
        track = sequence.createTrack();
        makeTracks(trackList);
        track.add(makeEvent(192,9,1,0,4));
        try{
            sequencer.setSequence(sequence);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void makeTracks(int[] trackList) {
        for(int i=0;i<trackList.length;i++){
            int key = trackList[i];
            if(key!=0){
                track.add(makeEvent(144,9,key,100,i));
                track.add(makeEvent(128,9,key,100,i+1));
            }
        }
    }

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;

        try {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(comd,chan,one,two);
            event = new MidiEvent(msg,tick);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return event;
    }
}
