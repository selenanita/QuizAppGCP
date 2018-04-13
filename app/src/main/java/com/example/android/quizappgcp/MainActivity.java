package com.example.android.quizappgcp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

// Photo sky2 by PhotoMIX Ltd. from Pexels
// Photo gcp_image from https://www.raps.org/regulatory-focus%E2%84%A2/news-articles/2015/9/amended-ich-gcp-guideline-addresses-evolution-of-trials-landscape

public class MainActivity extends AppCompatActivity {

    /**
     * This is quiz app GCP. Checks correct answers and display the score .
     */

    //Global values

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        
        score = 0;

        RadioButton radioButtonQ1A1 = findViewById(R.id.q1a1);
        boolean answerClickedQ1 = radioButtonQ1A1.isChecked();
        calculateScoreQ1(answerClickedQ1);

        RadioButton radioButtonQ2A3 = findViewById(R.id.q2a3);
        boolean answerClickedQ2 = radioButtonQ2A3.isChecked();
        calculateScoreQ2(answerClickedQ2);

        CheckBox checkBoxQ3A1 = findViewById(R.id.q3a1);
        boolean answerClickedQ3A1 = checkBoxQ3A1.isChecked();

        CheckBox checkBoxQ3A2 = findViewById(R.id.q3a2);
        boolean answerClickedQ3A2 = checkBoxQ3A2.isChecked();

        CheckBox checkBoxQ3A3 = findViewById(R.id.q3a3);
        boolean answerClickedQ3A3 = checkBoxQ3A3.isChecked();

        CheckBox checkBoxQ3A4 = findViewById(R.id.q3a4);
        boolean answerClickedQ3A4 = checkBoxQ3A4.isChecked();
        calculateScoreQ3(answerClickedQ3A1, answerClickedQ3A2, answerClickedQ3A3, answerClickedQ3A4);

        RadioButton radioButtonQ4A2 = findViewById(R.id.q4a2);
        boolean answerClickedQ4 = radioButtonQ4A2.isChecked();
        calculateScoreQ4(answerClickedQ4);

        RadioButton radioButtonQ5A3 = findViewById(R.id.q5a3);
        boolean answerClickedQ5 = radioButtonQ5A3.isChecked();
        calculateScoreQ5(answerClickedQ5);

        CheckBox checkBoxQ6A1 = findViewById(R.id.q6a1);
        boolean answerClickedQ6A1 = checkBoxQ6A1.isChecked();

        CheckBox checkBoxQ6A2 = findViewById(R.id.q6a2);
        boolean answerClickedQ6A2 = checkBoxQ6A2.isChecked();

        CheckBox checkBoxQ6A3 = findViewById(R.id.q6a3);
        boolean answerClickedQ6A3 = checkBoxQ6A3.isChecked();

        CheckBox checkBoxQ6A4 = findViewById(R.id.q6a4);
        boolean answerClickedQ6A4 = checkBoxQ6A4.isChecked();
        calculateScoreQ6(answerClickedQ6A1, answerClickedQ6A2, answerClickedQ6A3, answerClickedQ6A4);

        EditText editTextQ7 = findViewById(R.id.answer_input);
        String answerQ7 = editTextQ7.getText().toString();
        calculateScoreQ7(answerQ7);

        if (score == 7) {
            Toast.makeText(this, "Good job. You did it! Your score is " + score + " out of 7!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Keep trying. Your score is " + score + " out of 7!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * this method check if the user checked the correct button for question 1
     */
    public void calculateScoreQ1(boolean answerClickedQ1) {

        if (answerClickedQ1) {
            score++;
        }
    }

    /**
     * this method check if the user checked the correct button for question 2
     */
    public void calculateScoreQ2(boolean answerClickedQ2) {

        if (answerClickedQ2) {
            score++;
        }
    }

    /**
     * this method check if the user checked the correct check box for question 3
     */

    public void calculateScoreQ3(boolean answerClickedQ3A1, boolean answerClickedQ3A2, boolean answerClickedQ3A3, boolean answerClickedQ3A4) {

        if (answerClickedQ3A1 && !answerClickedQ3A2 && !answerClickedQ3A3 && answerClickedQ3A4) {
            score++;
        }
    }

    /**
     * this method check if the user checked the correct button for question 4
     */
    public void calculateScoreQ4(boolean answerClickedQ4) {

        if (answerClickedQ4) {
            score++;
        }
    }

    /**
     * this method check if the user checked the correct button for question 5
     */
    public void calculateScoreQ5(boolean answerClickedQ5) {

        if (answerClickedQ5) {
            score++;
        }
    }

    /**
     * this method check if the user checked the correct check box for question 6
     */

    public void calculateScoreQ6(boolean answerClickedQ6A1, boolean answerClickedQ6A2, boolean answerClickedQ6A3, boolean answerClickedQ6A4) {

        if (answerClickedQ6A1 && answerClickedQ6A2 && answerClickedQ6A3 && answerClickedQ6A4) {
            score++;
        }
    }

    /**
     * this method check if the user answered correct for question 7
     */

    public void calculateScoreQ7(String answerQ7) {

        if (answerQ7.equalsIgnoreCase("Case Report Form")) {
            score++;
        }
    }

    /**
     * this method calculates the total scores
     */

    public void reset(View view){
        RadioGroup radioGroup1 = findViewById(R.id.RGroup1);
        radioGroup1.clearCheck();

        RadioGroup radioGroup2 = findViewById(R.id.RGroup2);
        radioGroup2.clearCheck();

        RadioGroup radioGroup3 = findViewById(R.id.RGroup3);
        radioGroup3.clearCheck();

        RadioGroup radioGroup4 = findViewById(R.id.RGroup4);
        radioGroup4.clearCheck();

        CheckBox checkBoxQ3A1 = findViewById(R.id.q3a1);
        checkBoxQ3A1.setChecked(false);

        CheckBox checkBoxQ3A2 = findViewById(R.id.q3a2);
        checkBoxQ3A2.setChecked(false);

        CheckBox checkBoxQ3A3 = findViewById(R.id.q3a3);
        checkBoxQ3A3.setChecked(false);

        CheckBox checkBoxQ3A4 = findViewById(R.id.q3a4);
        checkBoxQ3A4.setChecked(false);

        CheckBox checkBoxQ6A1 = findViewById(R.id.q6a1);
        checkBoxQ6A1.setChecked(false);

        CheckBox checkBoxQ6A2 = findViewById(R.id.q6a2);
        checkBoxQ6A2.setChecked(false);

        CheckBox checkBoxQ6A3 = findViewById(R.id.q6a3);
        checkBoxQ6A3.setChecked(false);

        CheckBox checkBoxQ6A4 = findViewById(R.id.q6a4);
        checkBoxQ6A4.setChecked(false);

        EditText editTextQ7 = findViewById(R.id.answer_input);
        editTextQ7.setText("");
    }
}

