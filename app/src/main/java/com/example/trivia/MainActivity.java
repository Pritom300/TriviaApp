package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.trivia.controller.AppController;
import com.example.trivia.data.AnswerListAsyncResponse;
import com.example.trivia.data.QuestionBank;
import com.example.trivia.model.Question;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //Get All Questions and via interface by calling AnswerListAsyncResponse interface
      List<Question> questionList=  new QuestionBank().getQuestions(new AnswerListAsyncResponse() {
          @Override
          public void processFinished(ArrayList<Question> questionArrayList) {

          }
      });


    }
}