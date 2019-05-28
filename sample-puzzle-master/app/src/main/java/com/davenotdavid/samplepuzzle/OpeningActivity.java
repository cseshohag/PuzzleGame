package com.davenotdavid.samplepuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OpeningActivity extends AppCompatActivity {
    private ImageButton startGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        startGame = (ImageButton) findViewById(R.id.start_game);

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opening_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.devInfo:
                //Toast.makeText(MainActivity.this, "DevInfo", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, programmerinfo.class));
                return true;
            case R.id.appInfo:
                //Toast.makeText(MainActivity.this, "App Info", Toast.LENGTH_SHORT).show();
                //startActivity(new Intent(MainActivity.this, programmerinfo.class));
                startActivity(new Intent(this, appinformation.class));
                return true;
            case R.id.devClose:
                //Toast.makeText(MainActivity.this, "Close", Toast.LENGTH_SHORT).show();
                //finish();
                //System.exit(0);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void startGame(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
