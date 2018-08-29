package thebakcodes.com.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class single_Activity extends AppCompatActivity {
    ImageButton iv00, iv01, iv02, iv10, iv11, iv12, iv20, iv21, iv22;
    Button replay;
    char all[] = {'l', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
int exitt=0;
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_);
        iv00 = (ImageButton) findViewById(R.id.imageButton13);
        iv01 = (ImageButton) findViewById(R.id.imageButton12);
        iv02 = (ImageButton) findViewById(R.id.imageButton11);
        iv10 = (ImageButton) findViewById(R.id.imageButton16);
        iv11 = (ImageButton) findViewById(R.id.imageButton15);
        iv12 = (ImageButton) findViewById(R.id.imageButton14);
        iv20 = (ImageButton) findViewById(R.id.imageButton19);
        iv21 = (ImageButton) findViewById(R.id.imageButton18);
        iv22 = (ImageButton) findViewById(R.id.imageButton17);
        replay=(Button)findViewById(R.id.btreplay);
       /* int random1 = 1;//rand.nextInt(2);
        if(random1==1)
        {
            int randwa=rand.nextInt(9);
            all[randwa]='O';
            check(randwa);
        }*/

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
              /*  iv00.setVisibility(View.VISIBLE);
                iv01.setVisibility(View.VISIBLE);
                iv02.setVisibility(View.VISIBLE);
                iv10.setVisibility(View.VISIBLE);
                iv11.setVisibility(View.VISIBLE);
                iv12.setVisibility(View.VISIBLE);
                iv20.setVisibility(View.VISIBLE);
                iv21.setVisibility(View.VISIBLE);
                iv22.setVisibility(View.VISIBLE);*/
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
                if(exitt!=1)
                check(1);
                //iv00.setImageResource(R.drawable.cross);
            }
        });
        iv01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exitt!=1)
                check(2);
                // iv01.setImageResource(R.drawable.cross);
            }
        });
        iv02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exitt!=1)
                check(3);
                //iv02.setImageResource(R.drawable.cross);
            }
        });
        iv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exitt!=1)
                check(4);
                // iv10.setImageResource(R.drawable.cross);
            }
        });
        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exitt!=1)
                check(5);
                //iv11.setImageResource(R.drawable.cross);
            }
        });
        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exitt!=1)
                check(6);
                // iv12.setImageResource(R.drawable.cross);
            }
        });
        iv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exitt!=1)
                check(7);
                // iv20.setImageResource(R.drawable.cross);
            }
        });
        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exitt!=1)
                check(8);
                //iv21.setImageResource(R.drawable.cross);
            }
        });
        iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exitt!=1)
                check(9);
                // iv22.setImageResource(R.drawable.cross);
            }
        });

    }

    void check(int ax) {
        int index = 9;


       /* System.out.println("  "+all[1]+"  |  "+all[2]+"  |  "+all[3]);
        System.out.println("------------------");
        System.out.println("  "+all[4]+"  |  "+all[5]+"  |  "+all[6]);
        System.out.println("------------------");
        System.out.println("  "+all[7]+"  |  "+all[8]+"  |  "+all[9]);*/

        //while(all[1]==' ' || all[2]==' ' || all[3]==' ' || all[4]==' ' || all[5]==' ' || all[6]==' '  || all[7]==' ' || all[8]==' '|| all[9]==' ')
        //{
            /*System.out.println(" its your turn,give an index where you want to fill X( 1 to 9) ");
            System.out.println("if want to exit press -1");
            System.out.println("");*/
        //int ax=sc.nextInt();
           /* if (ax==-1)
            {
                System.out.println("thanks for playing");
                System.exit(0);
            }*/
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

           /* System.out.println("you did-----");
            System.out.println("  "+all[1]+"  |  "+all[2]+"  |  "+all[3]);
            System.out.println("------------------");
            System.out.println("  "+all[4]+"  |  "+all[5]+"  |  "+all[6]);
            System.out.println("------------------");
            System.out.println("  "+all[7]+"  |  "+all[8]+"  |  "+all[9]);*/
           if(exitt!=1) {
               if (all[5] == 'X' && all[8] == 'X' && all[2] == 'X') {
                   Toast.makeText(single_Activity.this, "You win.", Toast.LENGTH_SHORT).show();
                   //System.exit(0);
                   iv11.setImageResource(R.drawable.crosswin);
                   iv21.setImageResource(R.drawable.crosswin);
                   iv01.setImageResource(R.drawable.crosswin);
                   exitt = 1;
                   madar();
               } else if (all[4] == 'X' && all[5] == 'X' && all[6] == 'X') {
                   Toast.makeText(single_Activity.this, "You win.", Toast.LENGTH_SHORT).show();
                   //System.exit(0);
                   iv10.setImageResource(R.drawable.crosswin);
                   iv11.setImageResource(R.drawable.crosswin);
                   iv12.setImageResource(R.drawable.crosswin);
                   exitt = 1;
                   madar();
               } else if (all[7] == 'X' && all[8] == 'X' && all[9] == 'X') {
                   Toast.makeText(single_Activity.this, "You win.", Toast.LENGTH_SHORT).show();
                   //System.exit(0);
                   iv20.setImageResource(R.drawable.crosswin);
                   iv21.setImageResource(R.drawable.crosswin);
                   iv22.setImageResource(R.drawable.crosswin);
                   exitt = 1;
                   madar();
               } else if (all[3] == 'X' && all[6] == 'X' && all[9] == 'X') {
                   Toast.makeText(single_Activity.this, "You win.", Toast.LENGTH_SHORT).show();
                   // System.exit(0);
                   exitt = 1;
                   iv02.setImageResource(R.drawable.crosswin);
                   iv12.setImageResource(R.drawable.crosswin);
                   iv22.setImageResource(R.drawable.crosswin);
                   madar();
               } else if (all[1] == 'X' && all[4] == 'X' && all[7] == 'X') {
                   Toast.makeText(single_Activity.this, "You win.", Toast.LENGTH_SHORT).show();
                   // System.exit(0);
                   exitt = 1;
                   iv00.setImageResource(R.drawable.crosswin);
                   iv10.setImageResource(R.drawable.crosswin);
                   iv20.setImageResource(R.drawable.crosswin);
                   madar();
               } else if (all[1] == 'X' && all[5] == 'X' && all[9] == 'X') {
                   Toast.makeText(single_Activity.this, "You win.", Toast.LENGTH_SHORT).show();
                   // System.exit(0);
                   exitt = 1;
                   iv00.setImageResource(R.drawable.crosswin);
                   iv11.setImageResource(R.drawable.crosswin);
                   iv22.setImageResource(R.drawable.crosswin);
                   madar();
               } else if (all[1] == 'X' && all[2] == 'X' && all[3] == 'X') {
                   Toast.makeText(single_Activity.this, "You win.", Toast.LENGTH_SHORT).show();
                   // System.exit(0);
                   exitt = 1;
                   iv00.setImageResource(R.drawable.crosswin);
                   iv01.setImageResource(R.drawable.crosswin);
                   iv02.setImageResource(R.drawable.crosswin);
                   madar();
               } else if (all[3] == 'X' && all[5] == 'X' && all[7] == 'X') {
                   Toast.makeText(single_Activity.this, "You win.", Toast.LENGTH_SHORT).show();
                   // System.exit(0);
                   exitt = 1;
                   iv02.setImageResource(R.drawable.crosswin);
                   iv11.setImageResource(R.drawable.crosswin);
                   iv20.setImageResource(R.drawable.crosswin);
                   madar();
               }
           }
               // System.out.println(" ");
               // System.out.println(" ");
            if(exitt!=1) {
                if (all[5] == 'O' && all[8] == 'O' && all[2] == ' ') {
                    all[2] = 'O';
                    iv01.setImageResource(R.drawable.circle);
                } else if (all[5] == 'O' && all[2] == 'O' && all[8] == ' ') {
                    all[8] = 'O';
                    iv21.setImageResource(R.drawable.circle);
                } else if (all[8] == 'O' && all[2] == 'O' && all[5] == ' ') {
                    all[5] = 'O';
                    iv11.setImageResource(R.drawable.circle);
                } else if (all[4] == 'O' && all[5] == 'O' && all[6] == ' ') {
                    all[6] = 'O';
                    iv12.setImageResource(R.drawable.circle);
                } else if (all[4] == 'O' && all[6] == 'O' && all[5] == ' ') {
                    all[5] = 'O';
                    iv11.setImageResource(R.drawable.circle);
                } else if (all[5] == 'O' && all[6] == 'O' && all[4] == ' ') {
                    all[4] = 'O';
                    iv10.setImageResource(R.drawable.circle);
                } else if (all[7] == 'O' && all[8] == 'O' && all[9] == ' ') {
                    all[9] = 'O';
                    iv22.setImageResource(R.drawable.circle);
                } else if (all[7] == 'O' && all[9] == 'O' && all[8] == ' ') {
                    all[8] = 'O';
                    iv21.setImageResource(R.drawable.circle);
                } else if (all[9] == 'O' && all[8] == 'O' && all[7] == ' ') {
                    all[7] = 'O';
                    iv20.setImageResource(R.drawable.circle);
                } else if (all[3] == 'O' && all[6] == 'O' && all[9] == ' ') {
                    all[9] = 'O';
                    iv22.setImageResource(R.drawable.circle);
                } else if (all[3] == 'O' && all[9] == 'O' && all[6] == ' ') {
                    all[6] = 'O';
                    iv12.setImageResource(R.drawable.circle);
                } else if (all[6] == 'O' && all[9] == 'O' && all[3] == ' ') {
                    all[3] = 'O';
                    iv02.setImageResource(R.drawable.circle);
                } else if (all[1] == 'O' && all[4] == 'O' && all[7] == ' ') {
                    all[7] = 'O';
                    iv20.setImageResource(R.drawable.circle);
                } else if (all[1] == 'O' && all[7] == 'O' && all[4] == ' ') {
                    all[4] = 'O';
                    iv10.setImageResource(R.drawable.circle);
                } else if (all[7] == 'O' && all[4] == 'O' && all[1] == ' ') {
                    all[1] = 'O';
                    iv00.setImageResource(R.drawable.circle);
                } else if (all[1] == 'O' && all[5] == 'O' && all[9] == ' ') {
                    all[9] = 'O';
                    iv22.setImageResource(R.drawable.circle);
                } else if (all[1] == 'O' && all[9] == 'O' && all[5] == ' ') {
                    all[5] = 'O';
                    iv11.setImageResource(R.drawable.circle);
                } else if (all[5] == 'O' && all[9] == 'O' && all[1] == ' ') {
                    all[1] = 'O';
                    iv00.setImageResource(R.drawable.circle);
                } else if (all[1] == 'O' && all[2] == 'O' && all[3] == ' ') {
                    all[3] = 'O';
                    iv02.setImageResource(R.drawable.circle);
                } else if (all[1] == 'O' && all[3] == 'O' && all[2] == ' ') {
                    all[2] = 'O';
                    iv01.setImageResource(R.drawable.circle);
                } else if (all[2] == 'O' && all[3] == 'O' && all[1] == ' ') {
                    all[1] = 'O';
                    iv00.setImageResource(R.drawable.circle);
                } else if (all[3] == 'O' && all[5] == 'O' && all[7] == ' ') {
                    all[7] = 'O';
                    iv20.setImageResource(R.drawable.circle);
                } else if (all[3] == 'O' && all[7] == 'O' && all[5] == ' ') {
                    all[5] = 'O';
                    iv11.setImageResource(R.drawable.circle);
                } else if (all[7] == 'O' && all[5] == 'O' && all[3] == ' ') {
                    all[3] = 'O';
                    iv02.setImageResource(R.drawable.circle);
                } else if (all[5] == 'X' && all[8] == 'X' && all[2] == ' ') {
                    all[2] = 'O';
                    iv01.setImageResource(R.drawable.circle);
                } else if (all[5] == 'X' && all[2] == 'X' && all[8] == ' ') {
                    all[8] = 'O';
                    iv21.setImageResource(R.drawable.circle);
                } else if (all[8] == 'X' && all[2] == 'X' && all[5] == ' ') {
                    all[5] = 'O';
                    iv11.setImageResource(R.drawable.circle);
                } else if (all[4] == 'X' && all[5] == 'X' && all[6] == ' ') {
                    all[6] = 'O';
                    iv12.setImageResource(R.drawable.circle);
                } else if (all[4] == 'X' && all[6] == 'X' && all[5] == ' ') {
                    all[5] = 'O';
                    iv11.setImageResource(R.drawable.circle);
                } else if (all[5] == 'X' && all[6] == 'X' && all[4] == ' ') {
                    all[4] = 'O';
                    iv10.setImageResource(R.drawable.circle);
                } else if (all[7] == 'X' && all[8] == 'X' && all[9] == ' ') {
                    all[9] = 'O';
                    iv22.setImageResource(R.drawable.circle);
                } else if (all[7] == 'X' && all[9] == 'X' && all[8] == ' ') {
                    all[8] = 'O';
                    iv21.setImageResource(R.drawable.circle);
                } else if (all[9] == 'X' && all[8] == 'X' && all[7] == ' ') {
                    all[7] = 'O';
                    iv20.setImageResource(R.drawable.circle);
                } else if (all[3] == 'X' && all[6] == 'X' && all[9] == ' ') {
                    all[9] = 'O';
                    iv22.setImageResource(R.drawable.circle);
                } else if (all[3] == 'X' && all[9] == 'X' && all[6] == ' ') {
                    all[6] = 'O';
                    iv12.setImageResource(R.drawable.circle);
                } else if (all[6] == 'X' && all[9] == 'X' && all[3] == ' ') {
                    all[3] = 'O';
                    iv02.setImageResource(R.drawable.circle);
                } else if (all[1] == 'X' && all[4] == 'X' && all[7] == ' ') {
                    all[7] = 'O';
                    iv20.setImageResource(R.drawable.circle);
                } else if (all[1] == 'X' && all[7] == 'X' && all[4] == ' ') {
                    all[4] = 'O';
                    iv10.setImageResource(R.drawable.circle);
                } else if (all[7] == 'X' && all[4] == 'X' && all[1] == ' ') {
                    all[1] = 'O';
                    iv00.setImageResource(R.drawable.circle);
                } else if (all[1] == 'X' && all[5] == 'X' && all[9] == ' ') {
                    all[9] = 'O';
                    iv22.setImageResource(R.drawable.circle);
                } else if (all[1] == 'X' && all[9] == 'X' && all[5] == ' ') {
                    all[5] = 'O';
                    iv11.setImageResource(R.drawable.circle);
                } else if (all[5] == 'X' && all[9] == 'X' && all[1] == ' ') {
                    all[1] = 'O';
                    iv00.setImageResource(R.drawable.circle);
                } else if (all[1] == 'X' && all[2] == 'X' && all[3] == ' ') {
                    all[3] = 'O';
                    iv02.setImageResource(R.drawable.circle);
                } else if (all[1] == 'X' && all[3] == 'X' && all[2] == ' ') {
                    all[2] = 'O';
                    iv01.setImageResource(R.drawable.circle);
                } else if (all[2] == 'X' && all[3] == 'X' && all[1] == ' ') {
                    all[1] = 'O';
                    iv00.setImageResource(R.drawable.circle);
                } else if (all[3] == 'X' && all[5] == 'X' && all[7] == ' ') {
                    all[7] = 'O';
                    iv20.setImageResource(R.drawable.circle);
                } else if (all[3] == 'X' && all[7] == 'X' && all[5] == ' ') {
                    all[5] = 'O';
                    iv11.setImageResource(R.drawable.circle);
                } else if (all[7] == 'X' && all[5] == 'X' && all[3] == ' ') {
                    all[3] = 'O';
                    iv02.setImageResource(R.drawable.circle);
                } else {
                    while (all[1] == ' ' || all[2] == ' ' || all[3] == ' ' || all[4] == ' ' || all[5] == ' ' || all[6] == ' ' || all[7] == ' ' || all[8] == ' ' || all[9] == ' ') {
                        int random = rand.nextInt(index);
                        if (all[random] == ' ') {
                            all[random] = 'O';
                            switch (random) {
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
                            break;
                        }
                    }
                }
            }
            /*System.out.println(" ");
            System.out.println(" ");
            System.out.println("computer did");
            System.out.println("  "+all[1]+"  |  "+all[2]+"  |  "+all[3]);
            System.out.println("------------------");
            System.out.println("  "+all[4]+"  |  "+all[5]+"  |  "+all[6]);
            System.out.println("------------------");
            System.out.println("  "+all[7]+"  |  "+all[8]+"  |  "+all[9]);
            System.out.println(" ");
            System.out.println(" ");*/
            if(exitt!=1) {
                if (all[5] == 'O' && all[8] == 'O' && all[2] == 'O') {
                    Toast.makeText(single_Activity.this, "сова wins.", Toast.LENGTH_SHORT).show();
                    iv11.setImageResource(R.drawable.circlewin);
                    iv21.setImageResource(R.drawable.circlewin);
                    iv01.setImageResource(R.drawable.circlewin);

                    //System.exit(0);
                    exitt = 1;
                    madar();

                } else if (all[4] == 'O' && all[5] == 'O' && all[6] == 'O') {
                    Toast.makeText(single_Activity.this, "сова wins.", Toast.LENGTH_SHORT).show();
                    exitt = 1;
                    iv10.setImageResource(R.drawable.circlewin);
                    iv11.setImageResource(R.drawable.circlewin);
                    iv12.setImageResource(R.drawable.circlewin);
                    madar();
                    // System.exit(0);
                } else if (all[7] == 'O' && all[8] == 'O' && all[9] == 'O') {
                    Toast.makeText(single_Activity.this, "сова wins.", Toast.LENGTH_SHORT).show();
                    exitt = 1;
                    iv20.setImageResource(R.drawable.circlewin);
                    iv21.setImageResource(R.drawable.circlewin);
                    iv22.setImageResource(R.drawable.circlewin);
                    madar();
                    // System.exit(0);
                } else if (all[3] == 'O' && all[6] == 'O' && all[9] == 'O') {
                    Toast.makeText(single_Activity.this, "сова wins.", Toast.LENGTH_SHORT).show();
                    //System.exit(0);
                    iv02.setImageResource(R.drawable.circlewin);
                    iv12.setImageResource(R.drawable.circlewin);
                    iv22.setImageResource(R.drawable.circlewin);
                    exitt = 1;
                    madar();
                } else if (all[1] == 'O' && all[4] == 'O' && all[7] == 'O') {
                    Toast.makeText(single_Activity.this, "сова wins.", Toast.LENGTH_SHORT).show();
                    // System.exit(0);
                    iv00.setImageResource(R.drawable.circlewin);
                    iv10.setImageResource(R.drawable.circlewin);
                    iv20.setImageResource(R.drawable.circlewin);
                    exitt = 1;
                    madar();
                } else if (all[1] == 'O' && all[5] == 'O' && all[9] == 'O') {
                    Toast.makeText(single_Activity.this, "сова wins.", Toast.LENGTH_SHORT).show();
                    //System.exit(0);
                    iv00.setImageResource(R.drawable.circlewin);
                    iv11.setImageResource(R.drawable.circlewin);
                    iv22.setImageResource(R.drawable.circlewin);
                    exitt = 1;
                    madar();
                } else if (all[1] == 'O' && all[2] == 'O' && all[3] == 'O') {
                    Toast.makeText(single_Activity.this, "сова wins.", Toast.LENGTH_SHORT).show();
                    //System.exit(0);
                    iv00.setImageResource(R.drawable.circlewin);
                    iv01.setImageResource(R.drawable.circlewin);
                    iv02.setImageResource(R.drawable.circlewin);
                    exitt = 1;
                    madar();
                } else if (all[3] == 'O' && all[5] == 'O' && all[7] == 'O') {
                    Toast.makeText(single_Activity.this, "сова wins.", Toast.LENGTH_SHORT).show();
                    //System.exit(0);
                    iv02.setImageResource(R.drawable.circlewin);
                    iv11.setImageResource(R.drawable.circlewin);
                    iv20.setImageResource(R.drawable.circlewin);
                    madar();
                    exitt = 1;
                }
            }
            if (all[1] == ' ' || all[2] == ' ' || all[3] == ' ' || all[4] == ' ' || all[5] == ' ' || all[6] == ' ' || all[7] == ' ' || all[8] == ' ' || all[9] == ' ') {

            } else {
                Toast.makeText(single_Activity.this, "It's Draw", Toast.LENGTH_SHORT).show();
                replay.setVisibility(View.VISIBLE);
                replay.setAnimation(new Animation() {
                    @Override
                    public void setDuration(long durationMillis) {
                        super.setDuration(500);
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

            // System.out.println(" ");
            // System.out.println(" ");
        } else {
            Toast.makeText(single_Activity.this, "Already Filled Up", Toast.LENGTH_SHORT).show();
            // System.out.println("this index is already filled up.. try again");

        }
        //System.out.println(" ");
        //System.out.println("nobody wins...");

    }
    void madar()
    {
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

