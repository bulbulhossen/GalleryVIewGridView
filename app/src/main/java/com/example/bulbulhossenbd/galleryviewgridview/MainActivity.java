package com.example.bulbulhossenbd.galleryviewgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> list;
    int[] imageId = {
            R.drawable.facebook,
            R.drawable.facebook,
            R.drawable.facebook,
            R.drawable.facebook,
            R.drawable.facebook,
            R.drawable.facebook,
    };
    String[] web = {
            "Google",
            "Github",
            "Instagram",
            "Facebook",
            "Flickr",
            "Pinterest",
            "Quora",
            "Twitter",
            "Vimeo",
            "WordPress",
            "Youtube",
            "Stumbleupon",
            "SoundCloud",
            "Reddit",
            "Blogger"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageAdapter adapter = new ImageAdapter(MainActivity.this, web,
                imageId);
        GridView grid = (GridView) findViewById(R.id.grid_view);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
            }
        });

    }
}