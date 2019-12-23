//MAINCLASS THAT RUNS THE Interpreter
//Class 4308 section 2
//Professor: Deepa
//Code by: Mohsin Kabir


package com.company;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
public class Main {
    public static void main(String args[]) throws IOException {
        HashMap<Character, Integer> assignVar = new HashMap<Character, Integer>();
        String line;
        String[] words;
        int lineCounter = 0;
        String space = " ";
        //Buffered reader & Buffered Writer
        try (
                InputStream in = new FileInputStream("input.txt");
                InputStreamReader inR = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(inR);
        ) {
            //Takes line and breaks it into "elements" by space
            while ((line = br.readLine()) != null) {
                words = line.split(space);
                for (int i = 0; i < words.length; i++) {
                    if (i == 0) {
                        lineCounter++;
                    }
                    if ((words[i].equals("" + EnumKeyword.PRINT.getString()) && (i == 0))) {//current word is PRINT and its place is 0
                        PrintStatement.print(words, i, assignVar, lineCounter);
                    }
                    else if ((words[i].equals("" + EnumToken.ASSIG.getString()) )) {//current word is = and its place is 1
                        if ((i == 1)) {
                            AssignmentStatement.assign(words, i, assignVar, lineCounter);
                        }else{
                            System.out.println("Make sure your assignment statement follows the correct syntax");
                            System.out.println("This Julia version doesn't support anything between the variable and \"=\"");
                            System.out.println("Ex: a = 5");
                            System.out.println("Ex: b = + 5 a");
                            System.exit(25);
                        }
                    }
                }
            }
        }
    }
}






