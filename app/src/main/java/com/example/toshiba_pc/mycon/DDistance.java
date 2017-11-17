package com.example.toshiba_pc.mycon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class DDistance extends AppCompatActivity {

    EditText dist;
    RadioButton tokilo;
    RadioButton tomile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ddistance);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        dist=(EditText)findViewById(R.id.editText);
        tokilo=(RadioButton)findViewById(R.id.tok);
        tomile=(RadioButton)findViewById(R.id.tom);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.action1:
                startActivity(new Intent(DDistance.this, MainActivity.class));
                return true;
            case R.id.action3:
                startActivity(new Intent(DDistance.this, FFormula.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

     public void convert(View v ){

        double value=new Double(dist.getText().toString());
        if(tokilo.isChecked()){

            value=mmethods.tok(value);

        }

        else value=mmethods.tom(value);
        dist.setText(new Double(value).toString());






     }


}
