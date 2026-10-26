package com.example.quizzler;

public class TrueFalse {
    private int mQuestionID; //rappresenta l'ID della domanda
    private boolean mAnswer; //rappresenta la risposta
    public TrueFalse(int mQuestionID, boolean mAnswer){
        this.mQuestionID = mQuestionID;
        this.mAnswer = mAnswer;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
