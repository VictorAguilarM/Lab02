package com.example.wordcounter;

public class WordCounter {
    public static int getChars(String phrase){
        return phrase.length();
    }

    public static int getWords(String phrase){
        int count=0;
        int bool=0;

        for(int i=0; i<phrase.length(); i++){
            if(phrase.charAt(i)==' ' || phrase.charAt(i)==',' || phrase.charAt(i)=='.'){
                bool=0;
            } else if((phrase.charAt(i)!=' ' || phrase.charAt(i)==',' || phrase.charAt(i)=='.') && bool==0){
                count++;
                bool=1;
            }
        }

        return count;
    }
}
