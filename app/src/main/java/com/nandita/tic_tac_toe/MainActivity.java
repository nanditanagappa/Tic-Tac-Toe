package com.nandita.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    String flag = "player1";
    private HashMap<Integer, String> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }



    public void click(View v ){
        Button b  = (Button) v;
        if(flag.equals("player1")&& !map.containsKey(b.getId()))
        {
            b.setText("X");
            b.setBackgroundColor(Color.YELLOW);
            flag = "player2";
            map.put(b.getId(),"p1");

            checkWinner();
        }
        else if(flag.equals("player2")&& !map.containsKey(b.getId())){

            b.setText("O");
            b.setBackgroundColor(Color.CYAN);

            flag = "player1";
            map.put(b.getId(),"p2");

            if(map.get(R.id.b1).equals("p1")&& map.get(R.id.b2).equals("p1")&& map.get(R.id.b3).equals("p1")||
                    map.get(R.id.b4).equals("p1")&& map.get(R.id.b5).equals("p1")&& map.get(R.id.b6).equals("p1") ||
                    map.get(R.id.b7).equals("p1")&& map.get(R.id.b8).equals("p1")&& map.get(R.id.b9).equals("p1")||
                    map.get(R.id.b1).equals("p1")&& map.get(R.id.b4).equals("p1")&& map.get(R.id.b7).equals("p1")||
                    map.get(R.id.b2).equals("p1")&& map.get(R.id.b5).equals("p1")&& map.get(R.id.b8).equals("p1")||
                    map.get(R.id.b3).equals("p1")&& map.get(R.id.b6).equals("p1")&& map.get(R.id.b9).equals("p1")||
                    map.get(R.id.b1).equals("p1")&& map.get(R.id.b5).equals("p1")&& map.get(R.id.b9).equals("p1")||
                    map.get(R.id.b7).equals("p1")&& map.get(R.id.b5).equals("p1")&& map.get(R.id.b3).equals("p1")) {
                checkWinner();
            }
        }


    }

    void checkWinner(){

        if(map.get(R.id.b1).equals("p1")&& map.get(R.id.b2).equals("p1")&& map.get(R.id.b3).equals("p1")||
                map.get(R.id.b4).equals("p1")&& map.get(R.id.b5).equals("p1")&& map.get(R.id.b6).equals("p1") ||
                map.get(R.id.b7).equals("p1")&& map.get(R.id.b8).equals("p1")&& map.get(R.id.b9).equals("p1")||
                map.get(R.id.b1).equals("p1")&& map.get(R.id.b4).equals("p1")&& map.get(R.id.b7).equals("p1")||
                map.get(R.id.b2).equals("p1")&& map.get(R.id.b5).equals("p1")&& map.get(R.id.b8).equals("p1")||
                map.get(R.id.b3).equals("p1")&& map.get(R.id.b6).equals("p1")&& map.get(R.id.b9).equals("p1")||
                map.get(R.id.b1).equals("p1")&& map.get(R.id.b5).equals("p1")&& map.get(R.id.b9).equals("p1")||
                map.get(R.id.b7).equals("p1")&& map.get(R.id.b5).equals("p1")&& map.get(R.id.b3).equals("p1")){


            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("You Win");
            dlgAlert.setTitle("Congratulations  Player 1 Won");
            dlgAlert.setCancelable(true);

            dlgAlert.show();
        }

        else if(map.get(R.id.b1).equals("p2")&& map.get(R.id.b2).equals("p2")&& map.get(R.id.b3).equals("p2")||
                map.get(R.id.b4).equals("p2")&& map.get(R.id.b5).equals("p2")&& map.get(R.id.b6).equals("p2") ||
                map.get(R.id.b7).equals("p2")&& map.get(R.id.b8).equals("p2")&& map.get(R.id.b9).equals("p2")||
                map.get(R.id.b1).equals("p2")&& map.get(R.id.b4).equals("p2")&& map.get(R.id.b7).equals("p2")||
                map.get(R.id.b2).equals("p2")&& map.get(R.id.b5).equals("p2")&& map.get(R.id.b8).equals("p2")||
                map.get(R.id.b3).equals("p2")&& map.get(R.id.b6).equals("p2")&& map.get(R.id.b9).equals("p2")||
                map.get(R.id.b1).equals("p2")&& map.get(R.id.b5).equals("p2")&& map.get(R.id.b9).equals("p2")||
                map.get(R.id.b7).equals("p2")&& map.get(R.id.b5).equals("p2")&& map.get(R.id.b3).equals("p2")){

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("You Win");
            dlgAlert.setTitle("Congratulations  Player 2 Won");
            dlgAlert.setCancelable(true);

            dlgAlert.show();

        }

        else {
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Draw");
            dlgAlert.setTitle("Nobody wins!!!");
            dlgAlert.setCancelable(true);

            dlgAlert.show();
        }
    }



}
