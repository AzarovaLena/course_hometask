package Lesson8;

import Lesson2.T;
import Lesson7.robot.heads.IHead;

import java.util.Arrays;

public class TextFormater {

    public static void main(String[] args) {
        TextFormater t = new TextFormater( );
       t.setText("Привет, дед. Как твои дела? Давай играть!");
       t.getText();
       t.sizeSentences(t.getText());
       t.PalindromeWords(t.getText());
    }




    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public static void sizeSentences(String text) {
        String[] sentence = text.split("[.!?]\\s*");

        for (int i=0; i<sentence.length; i++) {
            String [] words =sentence[i].split (" ");
            if (words.length<=5 && words.length>=3) {
                System.out.println("Подходящие предложения:\n" +sentence[i]);
            }
        }
    }

    public static void PalindromeWords(String text) {
       String sentences[] = text.split("[.!?]\\s*");


       for (String sentence : sentences) {
           String[] words = sentence.split(" ");
           for (String str1 : words) {
               if (isPalindrome(str1) && (words.length<3 || words.length>5)) {
                   System.out.println(sentence);
               } else {
                   continue;
               }
           }
       }
   }
    public static boolean isPalindrome(String str){
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}

