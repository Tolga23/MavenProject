package com.dersler.cmd;

import java.io.File;
import java.util.Scanner;

public class CmdApp {
    public static void main(String[] args) {
        String startPath = "C:\\";
        File file = new File(startPath);

        String absolutePath = file.getAbsolutePath();
        while (true) {
            System.out.print(startPath + ">");
            // User input
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();

            String[] cmd = userInput.split(" ");

            if (cmd[0].equals("cd"))            startPath = Commands.changeDirectory(startPath,userInput);
            else if(cmd[0].equals("dir"))       Commands.listCommand(file);
            else if(cmd[0].equals("rmv"))       Commands.remove(file,cmd[1]);
            else if(cmd[0].equals("mkdir"))     Commands.makeDirectory(file,cmd[1]);
        }


        // dir

    }
}
