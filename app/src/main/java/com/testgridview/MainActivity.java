package com.testgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    String[] values = {
            "Brazil", "Cameroon", "Canada", "England", "France", "Germany",
            "Ireland", "Italy", "Mauritania", "Nigeria", "Palestine",
            "Samoa"
    } ;

    int[] images = {
            R.drawable.brazil, R.drawable.cameroon, R.drawable.canada, R.drawable.england,
            R.drawable.france, R.drawable.germany, R.drawable.ireland, R.drawable.italy,
            R.drawable.mauritania, R.drawable.nigeria, R.drawable.palestine, R.drawable.samoa
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridView);
        GridAdapter gridAdapter = new GridAdapter(this, values, images);
        gridView.setAdapter(gridAdapter);
        gridAdapter.setOnClickListener(new GridAdapter.OnClickListener() {
            @Override
            public void onClicked(int position, String value) {
                Toast.makeText(MainActivity.this, "Flag Clicked "+values[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
