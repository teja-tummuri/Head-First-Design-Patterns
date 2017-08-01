package com.gani.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Gani on 8/1/17.
 */
public class IOTest {

    public static void main(String[] args){
        int c;

        try{
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

            while((c=in.read())>=0){
                System.out.print((char)c);
            }

            in.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
