package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void submitButton(View view) {

        RadioGroup question1 = findViewById( R.id.question1 );
        RadioGroup question2 = findViewById( R.id.question2 );
        RadioGroup question3 = findViewById( R.id.question3 );
        RadioGroup question4 = findViewById( R.id.question4 );
        RadioGroup question5 = findViewById( R.id.question5 );
        RadioGroup question6 = findViewById( R.id.question6 );
        EditText question7 = findViewById( R.id.question7 );
        EditText question8 = findViewById( R.id.question8 );
        RadioGroup question10 = findViewById( R.id.question10 );

        if (question1.getCheckedRadioButtonId() == -1 || question2.getCheckedRadioButtonId() == -1 ||
                question3.getCheckedRadioButtonId() == -1 || question4.getCheckedRadioButtonId() == -1 ||
                question5.getCheckedRadioButtonId() == -1 || question6.getCheckedRadioButtonId() == -1 ||
                question7.getText().equals( "" ) || question8.getText().equals( "" ) || question10.getCheckedRadioButtonId() == -1) {
            String message = getString( R.string.warningMessage );
            Toast.makeText( getApplicationContext(), message, Toast.LENGTH_SHORT ).show();
        } else {

            /*Calculate the score for question one
             * *  Answer is "NULL" option B
             * */
            //Get the id of the RadioButton that is checked and store it as an integer variable.
            int Q1selectedOption = question1.getCheckedRadioButtonId();

            //Checks if the option clicked correspond with the correct answer
            if (Q1selectedOption == R.id.question1_optionB) {
                score += 10;
            }

            /**Calculate the score for question two
             * Answer is "class" option A
             * */

            //Get the id of the RadioButton that is checked and store it as an integer variable.
            int Q2selectedOption = question2.getCheckedRadioButtonId();

            //Checks if the option clicked correspond with the correct answer
            if (Q2selectedOption == R.id.question2_optionA) {
                score += 10;
            }

            /**Calculate the score for question three
             * Answer is "Box obj = new Box();" option A
             * */

            //Get the id of the RadioButton that is checked and store it as an integer variable.
            int Q3selectedOption = question3.getCheckedRadioButtonId();

            //Checks if the option clicked correspond with the correct answer
            if (Q3selectedOption == R.id.question3_optionA) {
                score += 10;
            }

            /**Calculate the score for question four
             * Answer is "new" option C
             * */

            //Get the id of the RadioButton that is checked and store it as an integer variable.
            int Q4selectedOption = question4.getCheckedRadioButtonId();

            //Checks if the option clicked correspond with the correct answer
            if (Q4selectedOption == R.id.question4_optionC) {
                score += 10;
            }

            /**Calculate the score for question five
             * Answer is "Every class must contain a main() method" option A
             * */

            //Get the id of the RadioButton that is checked and store it as an integer variable.
            int Q5selectedOption = question5.getCheckedRadioButtonId();

            //Checks if the option clicked correspond with the correct answer
            if (Q5selectedOption == R.id.question5_optionA) {
                score += 10;
            }

            /**Calculate the score for question six
             * Answer is "Public method is accessible to all other classes in the hierarchy" option A
             * */

            //Get the id of the RadioButton that is checked and store it as an integer variable.
            int selectedOption = question6.getCheckedRadioButtonId();

            //Checks if the option clicked correspond with the correct answer
            if (selectedOption == R.id.question6_optionA) {
                score += 10;
            }

            /**Calculate the score for question seven
             * Answer is "Java Runtime Environment
             * */

            //Get the value of text entered
            EditText q7_input = (EditText) findViewById( R.id.question7 );
            boolean q7answer = getString( R.string.q7_answer ).equals( q7_input.getText().toString() );

            if (q7answer) {
                score += 10;
            }

            /**Calculate the score for question 8
             * Answer is "Java Runtime Environment
             * */

            //Get the value of text entered
            EditText q8_input = (EditText) findViewById( R.id.question8 );
            boolean q8answer = getString( R.string.q8_answer ).equals( q8_input.getText().toString() );

            if (q8answer) {
                score += 10;
            }

            /**
             * Calculate the score for question 9 score
             * the Answer is option A and D
             *
             * */

            CheckBox q9_optionA = findViewById( R.id.question9_optionA );
            CheckBox q9_optionB = findViewById( R.id.question9_optionB );
            CheckBox q9_optionC = findViewById( R.id.question9_optionC );
            CheckBox q9_optionD = findViewById( R.id.question9_optionD );

            if (q9_optionA.isChecked() && q9_optionD.isChecked() &&
                    !q9_optionB.isChecked() && !q9_optionC.isChecked()) {
                score += 10;
            }

            /**Calculate the score for question ten
             *   Answer is "Protected" option C
             **/
            //Get the id of the RadioButton that is checked and store it as an integer variable.
            int Q10selectedOption = question10.getCheckedRadioButtonId();

            //Checks if the option clicked correspond with the correct answer
            if (Q10selectedOption == R.id.question10_optionC) {
                score += 10;
            }

            if (score >= 70) {

                String message = getString( R.string.goodResult1 ) + " " + score;
                message += getString( R.string.goodResult2 );
                Toast.makeText( getApplicationContext(), message, Toast.LENGTH_SHORT ).show();

            } else {
                String message = getString( R.string.badResult1 ) + " " + score;
                message += getString( R.string.badResult2 );
                Toast.makeText( getApplicationContext(), message, Toast.LENGTH_SHORT ).show();
            }
            score=0;
        }
    }

    /**
     * This resets all the radio button, edittext and check boxes
     */

    public void resetButton(View view) {

        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}