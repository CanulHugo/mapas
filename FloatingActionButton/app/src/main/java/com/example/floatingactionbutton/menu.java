package com.example.floatingactionbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void uno(View view) {
        Intent uno = new Intent(this, botonuno.class);
        startActivity(uno);
    }

    public void dos(View view) {
        Intent dos = new Intent(this, botondos.class);
        startActivity(dos);
    }

    public void tres(View view) {
        Intent tres = new Intent(this, botontres.class);
        startActivity(tres);
    }

    public void cuatro(View view) {
        Intent cuatro = new Intent(this, botoncuatro.class);
        startActivity(cuatro);
    }
}
