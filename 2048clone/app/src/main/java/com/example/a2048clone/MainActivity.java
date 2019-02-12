package com.example.a2048clone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int [][] matrix = new int[4][4];
    EditText[][] textMatrix = new EditText[4][4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button upButton = findViewById(R.id.buttonUp);
        Button downButton = findViewById(R.id.buttonDown);
        Button leftButton = findViewById(R.id.buttonLeft);
        Button rightButton = findViewById(R.id.buttonRight);
        Button resetButton = findViewById(R.id.buttonReset);

        for(int i = 0; i < 4; i++) {

            for(int j = 0; j < 4; j++) {

                System.out.print(i);
                matrix[i][j] = 0;
            }
        }

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

        textMatrix[0][0] = zeroZero;
        textMatrix[1][0] = zeroOne;
        textMatrix[2][0] = zeroTwo;
        textMatrix[3][0] = zeroThree;
        textMatrix[0][1] = oneZero;
        textMatrix[1][1] = oneOne;
        textMatrix[2][1] = oneTwo;
        textMatrix[3][1] = oneThree;
        textMatrix[0][2] = twoZero;
        textMatrix[1][2] = twoOne;
        textMatrix[2][2] = twoTwo;
        textMatrix[3][2] = twoThree;
        textMatrix[0][3] = threeZero;
        textMatrix[1][3] = threeOne;
        textMatrix[2][3] = threeTwo;
        textMatrix[3][3] = threeThree;

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

                for(int i = 0; i < 4; i++) {

                    for(int j = 0; j < 4; j++) {

                        if(matrix[j][i] != 0) {

                            matrix[j][i] = 0;
                            textMatrix[j][i].setText("", EditText.BufferType.EDITABLE);
                        }
                    }
                }

                int count = 0;

                Random rand = new Random();

                while(count != 2) {

                    int n = rand.nextInt(16);

                    if (n == 0) {

                        if(matrix[0][0] == 2) {

                            continue;
                        }

                        matrix[0][0] = 2;
                        textMatrix[0][0].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 1) {

                        if(matrix[1][0] == 2) {

                            continue;
                        }

                        matrix[1][0] = 2;
                        textMatrix[1][0].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 2) {

                        if(matrix[2][0] == 2) {

                            continue;
                        }

                        matrix[2][0] = 2;
                        textMatrix[2][0].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 3) {

                        if(matrix[3][0] == 2) {

                            continue;
                        }

                        matrix[3][0] = 2;
                        textMatrix[3][0].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 4) {

                        if(matrix[0][1] == 2) {

                            continue;
                        }

                        matrix[0][1] = 2;
                        textMatrix[0][1].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 5) {

                        if(matrix[1][1] == 2) {

                            continue;
                        }

                        matrix[1][1] = 2;
                        textMatrix[1][1].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 6) {

                        if(matrix[2][1] == 2) {

                            continue;
                        }

                        matrix[2][1] = 2;
                        textMatrix[2][1].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 7) {

                        if(matrix[3][1] == 2) {

                            continue;
                        }

                        matrix[3][1] = 2;
                        textMatrix[3][1].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 8) {

                        if(matrix[0][2] == 2) {

                            continue;
                        }

                        matrix[0][2] = 2;
                        textMatrix[0][2].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 9) {

                        if(matrix[1][2] == 2) {

                            continue;
                        }

                        matrix[1][2] = 2;
                        textMatrix[1][2].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 10) {

                        if(matrix[2][2] == 2) {

                            continue;
                        }

                        matrix[2][2] = 2;
                        textMatrix[2][2].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 11) {

                        if(matrix[3][2] == 2) {

                            continue;
                        }

                        matrix[3][2] = 2;
                        textMatrix[3][2].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 12) {

                        if(matrix[0][3] == 2) {

                            continue;
                        }

                        matrix[0][3] = 2;
                        textMatrix[0][3].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 13) {

                        if(matrix[1][3] == 2) {

                            continue;
                        }

                        matrix[1][3] = 2;
                        textMatrix[1][3].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else if (n == 14) {

                        if(matrix[2][3] == 2) {

                            continue;
                        }

                        matrix[2][3] = 2;
                        textMatrix[2][3].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;

                    } else {

                        if(matrix[3][3] == 2) {

                            continue;
                        }

                        matrix[3][3] = 2;
                        textMatrix[3][3].setText("2", EditText.BufferType.EDITABLE);
                        count += 1;
                    }
                }
            }
        });
    }
}
