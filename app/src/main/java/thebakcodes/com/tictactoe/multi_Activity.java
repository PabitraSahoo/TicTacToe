package thebakcodes.com.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class multi_Activity extends AppCompatActivity {
    char all[] = {'l', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    ImageButton iv00, iv01, iv02, iv10, iv11, iv12, iv20, iv21, iv22;
    Button replay;
    int exitt = 0,turn=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_);
        iv00 = (ImageButton) findViewById(R.id.imageButton13);
        iv01 = (ImageButton) findViewById(R.id.imageButton12);
        iv02 = (ImageButton) findViewById(R.id.imageButton11);
        iv10 = (ImageButton) findViewById(R.id.imageButton16);
        iv11 = (ImageButton) findViewById(R.id.imageButton15);
        iv12 = (ImageButton) findViewById(R.id.imageButton14);
        iv20 = (ImageButton) findViewById(R.id.imageButton19);
        iv21 = (ImageButton) findViewById(R.id.imageButton18);
        iv22 = (ImageButton) findViewById(R.id.imageButton17);
        replay = (Button) findViewById(R.id.btreplay1);
        replay.setVisibility(View.INVISIBLE);
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                all[0]='l';
                all[1]=' ';
                all[2]=' ';
                all[3]=' ';
                all[4]=' ';
                all[5]=' ';
                all[6]=' ';
                all[7]=' ';
                all[8]=' ';
                all[9]=' ';

                replay.setVisibility(View.INVISIBLE);
                iv00.setImageResource(R.drawable.blank1);
                iv01.setImageResource(R.drawable.blank1);
                iv02.setImageResource(R.drawable.blank1);
                iv10.setImageResource(R.drawable.blank1);
                iv11.setImageResource(R.drawable.blank1);
                iv12.setImageResource(R.drawable.blank1);
                iv20.setImageResource(R.drawable.blank1);
                iv21.setImageResource(R.drawable.blank1);
                iv22.setImageResource(R.drawable.blank1);

                exitt=0;

            }
        });
        iv00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exitt != 1) {
                    if (turn == 1){
                        check1(1);
                       // turn=2;
                    }
                    else
                    {
                        check2(1);
                      //  turn=1;
                    }
                }
                //iv00.setImageResource(R.drawable.cross);
            }
        });
        iv01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exitt != 1) {
                    if (turn == 1){
                        check1(2);
                       // turn=2;
                    }
                    else
                    {
                        check2(2);
                       // turn=1;
                    }
                }
                // iv01.setImageResource(R.drawable.cross);
            }
        });
        iv02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exitt != 1) {
                    if (turn == 1){
                        check1(3);
                      //  turn=2;
                    }
                    else
                    {
                        check2(3);
                      //  turn=1;
                    }
                }
                //iv02.setImageResource(R.drawable.cross);
            }
        });
        iv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exitt != 1) {
                    if (turn == 1){
                        check1(4);
                       // turn=2;
                    }
                    else
                    {
                        check2(4);
                        //turn=1;
                    }
                }
                // iv10.setImageResource(R.drawable.cross);
            }
        });
        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exitt != 1) {
                    if (turn == 1){
                        check1(5);
                        //turn=2;
                    }
                    else
                    {
                        check2(5);
                       // turn=1;
                    }
                }
                //iv11.setImageResource(R.drawable.cross);
            }
        });
        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exitt != 1) {
                    if (turn == 1){
                        check1(6);
                      //  turn=2;
                    }
                    else
                    {
                        check2(6);
                       // turn=1;
                    }
                }
                // iv12.setImageResource(R.drawable.cross);
            }
        });
        iv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exitt != 1) {
                    if (turn == 1){
                        check1(7);
                       // turn=2;
                    }
                    else
                    {
                        check2(7);
                       // turn=1;
                    }
                }
                // iv20.setImageResource(R.drawable.cross);
            }
        });
        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exitt != 1) {
                    if (turn == 1){
                        check1(8);
                       // turn=2;
                    }
                    else
                    {
                        check2(8);
                       // turn=1;
                    }
                }
                //iv21.setImageResource(R.drawable.cross);
            }
        });
        iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exitt != 1) {
                    if (turn == 1){
                        check1(9);
                        //turn=2;
                    }
                    else
                    {
                        check2(9);
                       // turn=1;
                    }
                }
                // iv22.setImageResource(R.drawable.cross);
            }
        });
    }

    void check1(int ax) {

        if (all[ax] == ' ') {
            all[ax] = 'O';
            switch (ax) {
                case 1:
                    iv00.setImageResource(R.drawable.circle);
                    break;
                case 2:
                    iv01.setImageResource(R.drawable.circle);
                    break;
                case 3:
                    iv02.setImageResource(R.drawable.circle);
                    break;
                case 4:
                    iv10.setImageResource(R.drawable.circle);
                    break;
                case 5:
                    iv11.setImageResource(R.drawable.circle);
                    break;
                case 6:
                    iv12.setImageResource(R.drawable.circle);
                    break;
                case 7:
                    iv20.setImageResource(R.drawable.circle);
                    break;
                case 8:
                    iv21.setImageResource(R.drawable.circle);
                    break;
                case 9:
                    iv22.setImageResource(R.drawable.circle);
                    break;
            }
            turn=2;
        }
        else
            Toast.makeText(multi_Activity.this, "Already filled up", Toast.LENGTH_SHORT).show();
        if (exitt != 1) {
            if (all[5] == 'O' && all[8] == 'O' && all[2] == 'O') {
                Toast.makeText(multi_Activity.this, "O Win", Toast.LENGTH_SHORT).show();
                //System.exit(0);
                iv11.setImageResource(R.drawable.circlewin);
                iv21.setImageResource(R.drawable.circlewin);
                iv01.setImageResource(R.drawable.circlewin);
                exitt = 1;
                madar();
            } else if (all[4] == 'O' && all[5] == 'O' && all[6] == 'O') {
                Toast.makeText(multi_Activity.this, "O wins", Toast.LENGTH_SHORT).show();
                //System.exit(0);
                iv10.setImageResource(R.drawable.circlewin);
                iv11.setImageResource(R.drawable.circlewin);
                iv12.setImageResource(R.drawable.circlewin);
                exitt = 1;
                madar();
            } else if (all[7] == 'O' && all[8] == 'O' && all[9] == 'O') {
                Toast.makeText(multi_Activity.this, "O wins", Toast.LENGTH_SHORT).show();
                //System.exit(0);
                iv20.setImageResource(R.drawable.circlewin);
                iv21.setImageResource(R.drawable.circlewin);
                iv22.setImageResource(R.drawable.circlewin);
                exitt = 1;
                madar();
            } else if (all[3] == 'O' && all[6] == 'O' && all[9] == 'O') {
                Toast.makeText(multi_Activity.this, "O wins", Toast.LENGTH_SHORT).show();
                // System.exit(0);
                exitt = 1;
                iv02.setImageResource(R.drawable.circlewin);
                iv12.setImageResource(R.drawable.circlewin);
                iv22.setImageResource(R.drawable.circlewin);
                madar();
            } else if (all[1] == 'O' && all[4] == 'O' && all[7] == 'O') {
                Toast.makeText(multi_Activity.this, "O wins", Toast.LENGTH_SHORT).show();
                // System.exit(0);
                iv00.setImageResource(R.drawable.circlewin);
                iv10.setImageResource(R.drawable.circlewin);
                iv20.setImageResource(R.drawable.circlewin);
                exitt = 1;
                madar();
            } else if (all[1] == 'O' && all[5] == 'O' && all[9] == 'O') {
                Toast.makeText(multi_Activity.this, "O wins", Toast.LENGTH_SHORT).show();
                // System.exit(0);
                exitt = 1;
                iv00.setImageResource(R.drawable.circlewin);
                iv11.setImageResource(R.drawable.circlewin);
                iv22.setImageResource(R.drawable.circlewin);
                madar();
            } else if (all[1] == 'O' && all[2] == 'O' && all[3] == 'O') {
                Toast.makeText(multi_Activity.this, "O wins", Toast.LENGTH_SHORT).show();
                // System.exit(0);
                exitt = 1;
                iv00.setImageResource(R.drawable.circlewin);
                iv01.setImageResource(R.drawable.circlewin);
                iv02.setImageResource(R.drawable.circlewin);
                madar();
            } else if (all[3] == 'O' && all[5] == 'O' && all[7] == 'O') {
                Toast.makeText(multi_Activity.this, "O wins", Toast.LENGTH_SHORT).show();
                // System.exit(0);
                exitt = 1;
                iv02.setImageResource(R.drawable.circlewin);
                iv11.setImageResource(R.drawable.circlewin);
                iv20.setImageResource(R.drawable.circlewin);
                madar();
            }

        }
        if(exitt!=1) {
            if (all[1] == ' ' || all[2] == ' ' || all[3] == ' ' || all[4] == ' ' || all[5] == ' ' || all[6] == ' ' || all[7] == ' ' || all[8] == ' ' || all[9] == ' ') {

            } else {
                Toast.makeText(multi_Activity.this, "It's a Draw", Toast.LENGTH_SHORT).show();
                replay.setVisibility(View.VISIBLE);
            }
        }
    }



    void check2(int ax) {
        if (all[ax] == ' ') {
            all[ax] = 'X';
            switch (ax) {
                case 1:
                    iv00.setImageResource(R.drawable.cross);
                    break;
                case 2:
                    iv01.setImageResource(R.drawable.cross);
                    break;
                case 3:
                    iv02.setImageResource(R.drawable.cross);
                    break;
                case 4:
                    iv10.setImageResource(R.drawable.cross);
                    break;
                case 5:
                    iv11.setImageResource(R.drawable.cross);
                    break;
                case 6:
                    iv12.setImageResource(R.drawable.cross);
                    break;
                case 7:
                    iv20.setImageResource(R.drawable.cross);
                    break;
                case 8:
                    iv21.setImageResource(R.drawable.cross);
                    break;
                case 9:
                    iv22.setImageResource(R.drawable.cross);
                    break;
            }
            turn=1;
        }
        else
            Toast.makeText(multi_Activity.this, "Already filled up..", Toast.LENGTH_SHORT).show();
        if (exitt != 1) {
            if (all[5] == 'X' && all[8] == 'X' && all[2] == 'X') {
                Toast.makeText(multi_Activity.this, "X wins", Toast.LENGTH_SHORT).show();
                //System.exit(0);
                iv11.setImageResource(R.drawable.crosswin);
                iv21.setImageResource(R.drawable.crosswin);
                iv01.setImageResource(R.drawable.crosswin);
                exitt = 1;
                madar();
            } else if (all[4] == 'X' && all[5] == 'X' && all[6] == 'X') {
                Toast.makeText(multi_Activity.this, "X wins", Toast.LENGTH_SHORT).show();
                //System.exit(0);
                exitt = 1;
                iv10.setImageResource(R.drawable.crosswin);
                iv11.setImageResource(R.drawable.crosswin);
                iv12.setImageResource(R.drawable.crosswin);
                madar();
            } else if (all[7] == 'X' && all[8] == 'X' && all[9] == 'X') {
                Toast.makeText(multi_Activity.this, "X wins", Toast.LENGTH_SHORT).show();
                //System.exit(0);
                iv20.setImageResource(R.drawable.crosswin);
                iv21.setImageResource(R.drawable.crosswin);
                iv22.setImageResource(R.drawable.crosswin);
                exitt = 1;
                madar();
            } else if (all[3] == 'X' && all[6] == 'X' && all[9] == 'X') {
                Toast.makeText(multi_Activity.this, "X wins", Toast.LENGTH_SHORT).show();
                // System.exit(0);
                iv02.setImageResource(R.drawable.crosswin);
                iv12.setImageResource(R.drawable.crosswin);
                iv22.setImageResource(R.drawable.crosswin);
                exitt = 1;
                madar();
            } else if (all[1] == 'X' && all[4] == 'X' && all[7] == 'X') {
                Toast.makeText(multi_Activity.this, "X wins", Toast.LENGTH_SHORT).show();
                // System.exit(0);
                iv00.setImageResource(R.drawable.crosswin);
                iv10.setImageResource(R.drawable.crosswin);
                iv20.setImageResource(R.drawable.crosswin);
                exitt = 1;
                madar();
            } else if (all[1] == 'X' && all[5] == 'X' && all[9] == 'X') {
                Toast.makeText(multi_Activity.this, "X wins", Toast.LENGTH_SHORT).show();
                // System.exit(0);
                iv00.setImageResource(R.drawable.crosswin);
                iv11.setImageResource(R.drawable.crosswin);
                iv22.setImageResource(R.drawable.crosswin);
                exitt = 1;
                madar();
            } else if (all[1] == 'X' && all[2] == 'X' && all[3] == 'X') {
                Toast.makeText(multi_Activity.this, "X wins", Toast.LENGTH_SHORT).show();
                // System.exit(0);
                iv00.setImageResource(R.drawable.crosswin);
                iv01.setImageResource(R.drawable.crosswin);
                iv02.setImageResource(R.drawable.crosswin);
                exitt = 1;
                madar();
            } else if (all[3] == 'X' && all[5] == 'X' && all[7] == 'X') {
                Toast.makeText(multi_Activity.this, "X wins", Toast.LENGTH_SHORT).show();
                // System.exit(0);
                exitt = 1;
                iv02.setImageResource(R.drawable.crosswin);
                iv11.setImageResource(R.drawable.crosswin);
                iv20.setImageResource(R.drawable.crosswin);
                madar();
            }

        }
        if(exitt!=1) {
            if (all[1] == ' ' || all[2] == ' ' || all[3] == ' ' || all[4] == ' ' || all[5] == ' ' || all[6] == ' ' || all[7] == ' ' || all[8] == ' ' || all[9] == ' ') {

            } else {
                Toast.makeText(multi_Activity.this, "Nobody Wins \n Game Over", Toast.LENGTH_SHORT).show();
                replay.setVisibility(View.VISIBLE);
            }
        }
    }

    void madar() {
        replay.setVisibility(View.VISIBLE);
        replay.setAnimation(new Animation() {
            @Override
            public void setDuration(long durationMillis) {
                super.setDuration(2000);
            }
        });
       /* iv00.setVisibility(View.INVISIBLE);
        iv01.setVisibility(View.INVISIBLE);
        iv02.setVisibility(View.INVISIBLE);
        iv10.setVisibility(View.INVISIBLE);
        iv11.setVisibility(View.INVISIBLE);
        iv12.setVisibility(View.INVISIBLE);
        iv20.setVisibility(View.INVISIBLE);
        iv21.setVisibility(View.INVISIBLE);
        iv22.setVisibility(View.INVISIBLE);*/
    }
}

