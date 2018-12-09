package com.eslamshawky.hp.azkar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
Button azkar,about,close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        azkar = (Button)findViewById(R.id.button_azkar);
        about = (Button)findViewById(R.id.button_about);
        close = (Button)findViewById(R.id.button_close);
        azkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1  = new Intent(Main.this,Azkar.class);
                startActivity(intent1);
        }
    });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2  = new Intent(Main.this,About.class);
                startActivity(intent2);
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

}
}