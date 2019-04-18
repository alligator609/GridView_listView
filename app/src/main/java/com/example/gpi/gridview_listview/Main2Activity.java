package com.example.gpi.gridview_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = (ImageView) findViewById(R.id.image_show);
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        My_custom_adapter_class imageAdapter = new My_custom_adapter_class(this);

       // ImageView imageView = (ImageView) findViewById(R.id.SingleView);
        imageView.setImageResource(imageAdapter.image_array[position]);

    }
}
