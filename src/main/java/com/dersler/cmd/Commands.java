package com.dersler.cmd;

import java.io.File;

public class Commands {
    public static void listCommand(File currentDirectory){
        File[] files = currentDirectory.listFiles();
        for (File file: files){
            System.out.println(file.getName());
        }
    }

    public static String changeDirectory(String startPath, String changeDirectory){
        String[] komutArray = changeDirectory.split(" ");
        String araKomut = komutArray[1];
        startPath = startPath + "\\" + araKomut;
        return startPath;
    }
}
