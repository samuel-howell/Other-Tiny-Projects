package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input = readFileAsString("startingText.txt");;
    StringBuilder sb = new StringBuilder();


;
	String[] wrdArr = input.split(" ");

	while(true){
        System.out.println("Word to replace: ");
        String replacedWord = sc.next().trim();

        //replaced word addons
        String replacedWordWithPeriod = replacedWord + ".";
        String replacedWordWithExclam = replacedWord + "!";
        String replacedWordWithComma  = replacedWord + ",";
        String replacedWordWithSemicolon = replacedWord + ";";
        String replacedWordWithColon = replacedWord + ':';
        String replacedWordWithApostrophe = replacedWord + "'s";
        String replacedWordWithED = replacedWord +"ed";
        String replacedWordWithS = replacedWord +"s";
        String replacedWordWithING = replacedWord +"ing";
        String replacedWordWithFrontQuote = "\"" + replacedWord;
        String replacedWordWithBackQuote = replacedWord + "\"";
        String replacedWordWithFrontNewLine = "\n" + replacedWord;
        String replacedWordWithBackNewLine = replacedWord + "\n";


        //new word addons
        System.out.println("Replacement word: ");
        String newWord = sc.next().trim();
        String newWordWithPeriod = newWord + ".";
        String newWordWithExclam = newWord + "!";
        String newWordWithComma  = newWord + ",";
        String newWordWithSemicolon = newWord + ';';
        String newWordWithColon = newWord + ':';
        String newWordWithApostrophe = newWord + "'s";
        String newWordWithED = newWord +"ed";
        String newWordWithS = newWord +"s";
        String newWordWithING = newWord +"ing";
        String newWordWithFrontQuote = "\"" + newWord;
        String newWordWithBackQuote = newWord + "\"";
        String newWordWithFrontNewLine = "\\n\\s\\w" + newWord;
        String newWordWithBackNewLine = newWord + "\\n\\s\\w";




        for(int i = 0; i < wrdArr.length; i++) {
            if (wrdArr[i].equalsIgnoreCase(replacedWord)) wrdArr[i] = newWord;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithPeriod)) wrdArr[i] = newWordWithPeriod;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithExclam)) wrdArr[i] = newWordWithExclam;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithComma)) wrdArr[i] = newWordWithComma;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithColon)) wrdArr[i] = newWordWithColon;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithSemicolon)) wrdArr[i] = newWordWithSemicolon;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithApostrophe)) wrdArr[i] = newWordWithApostrophe;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithED)) wrdArr[i] = newWordWithED;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithS)) wrdArr[i] = newWordWithS;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithING)) wrdArr[i] = newWordWithING;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithFrontQuote)) wrdArr[i] = newWordWithFrontQuote;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithBackQuote)) wrdArr[i] = newWordWithBackQuote;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithFrontNewLine)) wrdArr[i] = newWordWithFrontNewLine;
            if (wrdArr[i].equalsIgnoreCase(replacedWordWithBackNewLine)) wrdArr[i] = newWordWithBackNewLine;


        }
        System.out.println("Another?");
        String response = sc.next().toLowerCase();
        if(response.equals("no")) break;

        }

        //print out'
        System.out.println("____________________________________________________________");
        for (int i = 0 ; i < wrdArr.length; i++){
            if(wrdArr[i].equals("\n")) sb.append("\n");
            else {
                sb.append(wrdArr[i]).append(" ");
            }
        }

        writeToFile("endingText.txt", sb);
    }

    public static String readFileAsString(String fileName) {
        String input ="";
        try {
            input = new String(Files.readAllBytes(Paths.get("startingText.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    public static void writeToFile(String filename, StringBuilder sb) {
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write(String.valueOf(sb));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
