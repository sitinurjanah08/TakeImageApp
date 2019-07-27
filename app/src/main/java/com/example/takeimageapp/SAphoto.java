package com.example.takeimageapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class SAphoto extends AppCompatActivity {
    ImageAdapter myImageAdapter;
    ArrayList<String> myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saphoto);

        String imgPath = this.getIntent().getExtras().getString("Path");
        ImageView iv =(ImageView) findViewById(R.id.singleimage);
        BitmapFactory.Options myBitmap = new BitmapFactory.Options();
        myBitmap.inJustDecodeBounds=false;
        myBitmap.inSampleSize=4;
        myBitmap.inPurgeable=true;
        Bitmap bitmap = BitmapFactory.decodeFile(imgPath, myBitmap);
        iv.setImageBitmap(bitmap);
    }
}
