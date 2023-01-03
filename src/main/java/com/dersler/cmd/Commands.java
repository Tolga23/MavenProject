package com.dersler.cmd;

import java.io.File;

public class Commands {
    public static void listCommand(File currentDirectory) {
        File[] files = currentDirectory.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    public static String changeDirectory(String startPath, String changeDirectory) {
        String[] komutArray = changeDirectory.split(" ");
        String araKomut = komutArray[1];
        startPath = startPath + "\\" + araKomut;
        return startPath;
    }

    public static void remove(File currentDirectory, String file) {
        File toDelete = new File(currentDirectory, file);
        if (toDelete.delete()) {
            System.out.println("Removed!");
        } else {
            System.out.println("Error deleting file");
        }
    }


    public static void makeDirectory(File currentDirectory, String directory) {
        File newDirectory = new File(currentDirectory, directory);
        if (newDirectory.mkdir()) {
            System.out.println("Directory created");
        } else {
            System.out.println("Error creating directory");
        }
    }
}