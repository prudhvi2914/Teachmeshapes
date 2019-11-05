package com.example.quizapp;

public class QuestionsLib {

    private static String[] mquestions = {"How may shapes on Triange?","how many shapes on the circle"};
    private String mchoices [][] = {{"3","4"},{"1","0"}};
    private String mcorrectanswers [] = {"3","0"};


    public static String getquestion(int a){
        String question = mquestions[a];
        return question;
    }
    public String getchoice1(int a){
        String choice = mchoices[a][0];
        return choice;
    }
    public String getchoice2(int a){
        String choice = mchoices[a][1];
        return choice;
    }
    public String correctanswer(int a){
        String ans = mcorrectanswers[a];
        return ans;
    }

}
