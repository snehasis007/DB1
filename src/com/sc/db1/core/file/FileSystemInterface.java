package com.sc.db1.core.file;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

/**
 * Created by snehasis_2 on 4/30/2017.
 */
public class FileSystemInterface {

    private void getFLatfile(){
        //Path a=FileSystems.getDefault().getPath("file1","fileC.ffg");
        Path a=Paths.get(System.getProperty("user.home"),"db1data/data1");
        //Path a=Paths.get("db1data/data1");
        //Charset ch=Charset.forName("UTF-8");
        Charset ch=Charset.forName("US-ASCII");
        //System.out.println(""+Charset.availableCharsets().toString());
        try{
            Files.createDirectories(a);
        }catch(Exception e){

        }

        Path b=Paths.get(System.getProperty("user.home"),"db1data/data1","fileA.ffg");
       // Path b=Paths.get("db1data/data1","fileA.ffg");
        String s = "Hello World! ";
        String s2="\u09f7";
        ByteBuffer bf=ch.encode(s);

        byte data[] = s.getBytes();
//        try (BufferedWriter writer =
//                Files.newBufferedWriter(b,ch,CREATE, APPEND)) {
//            writer.write(s2, 0, s2.length());
//        } catch (IOException x) {
//            System.err.println(x);
//        }
        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(b, CREATE,APPEND))) {
            //out.write(bf.array(), 0, bf.array().length);
           out.write(s2.getBytes(), 0, s2.getBytes().length);
        } catch (IOException x) {
            System.err.println(x);
        }
        System.out.println(""+b.toString());
    }
    public static void main(String... args){
        FileSystemInterface fs=new FileSystemInterface();
        fs.getFLatfile();
    }


}
