package com.example.simpleucmo;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 = findViewById(R.id.textView2);
        String text = "<font color =#E60505>University of Central Missouri\n</font><font color =#FDFDFE>PO Box 800, Warrensburg, MO 64093, 877-729-8266</font>";
        textView2.setText(Html.fromHtml(text));

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivityForResult(intent, 101);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==101){
            String name = data.getStringExtra("name");
            Toast.makeText(getApplicationContext(),"Name :"+ name, Toast.LENGTH_LONG).show();
        }


    }

    public void onButton1Clicked(View v){
        Toast.makeText(this,"Welcome to Computer Science", Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ucmo.edu/calendar/"));
        startActivity(intent);
    }

    public void onButton3Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:6605431234"));
        startActivity(intent);

    }





}
