package com.example.a2048clone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button upButton = findViewById(R.id.buttonUp);
        Button downButton = findViewById(R.id.buttonDown);
        Button leftButton = findViewById(R.id.buttonLeft);
        Button rightButton = findViewById(R.id.buttonRight);
        Button resetButton = findViewById(R.id.buttonReset);

        int [][] matrix = new int[4] [4];

        EditText zeroZero = findViewById(R.id.editText00);
        EditText zeroOne = findViewById(R.id.editText01);
        EditText zeroTwo = findViewById(R.id.editText02);
        EditText zeroThree = findViewById(R.id.editText03);
        EditText oneZero = findViewById(R.id.editText10);
        EditText oneOne = findViewById(R.id.editText11);
        EditText oneTwo = findViewById(R.id.editText12);
        EditText oneThree = findViewById(R.id.editText13);
        EditText twoZero = findViewById(R.id.editText20);
        EditText twoOne = findViewById(R.id.editText21);
        EditText twoTwo = findViewById(R.id.editText22);
        EditText twoThree = findViewById(R.id.editText23);
        EditText threeZero = findViewById(R.id.editText30);
        EditText threeOne = findViewById(R.id.editText31);
        EditText threeTwo = findViewById(R.id.editText32);
        EditText threeThree = findViewById(R.id.editText33);

        int count = 0;
        Random rand = new Random();

        while(count != 2) {

            int n = rand.nextInt(16);

            if(n == 0) {

                matrix[0][0] = 2;
                count += 1;
                zeroZero.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 1) {

                matrix[1][0] = 2;
                count += 1;
                zeroOne.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 2) {

                matrix[2][0] = 2;
                count += 1;
                zeroTwo.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 3) {

                matrix[3][0] = 2;
                count += 1;
                zeroThree.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 4) {

                matrix[0][1] = 2;
                count += 1;
                oneZero.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 5) {

                matrix[1][1] = 2;
                count += 1;
                oneOne.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 6) {

                matrix[2][1] = 2;
                count += 1;
                oneTwo.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 7) {

                matrix[3][1] = 2;
                count += 1;
                oneThree.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 8) {

                matrix[0][2] = 2;
                count += 1;
                twoZero.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 9) {

                matrix[1][2] = 2;
                count += 1;
                twoOne.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 10) {

                matrix[2][2] = 2;
                count += 1;
                twoTwo.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 11) {

                matrix[3][2] = 2;
                count += 1;
                twoThree.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 12) {

                matrix[0][3] = 2;
                count += 1;
                threeZero.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 13) {

                matrix[1][3] = 2;
                count += 1;
                threeOne.setText("2", EditText.BufferType.EDITABLE);
            }

            else if(n == 14) {

                matrix[2][3] = 2;
                count += 1;
                threeTwo.setText("2", EditText.BufferType.EDITABLE);
            }

            else {

                matrix[3][3] = 2;
                count += 1;
                threeThree.setText("2", EditText.BufferType.EDITABLE);
            }
        }

        resetButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


            }
        });
    }
}
