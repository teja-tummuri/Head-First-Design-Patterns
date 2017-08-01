package com.gani.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Gani on 8/1/17.
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return c == -1 ? c: Character.toLowerCase((char)c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result =  in.read(b, off, len);

        for(int i=off;i<off+result;i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }

        return result;
    }
}
