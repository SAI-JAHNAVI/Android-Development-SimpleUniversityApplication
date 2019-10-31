package com.example.simpleucmo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText editText4;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button5 = (Button)findViewById(R.id.button5);
        editText4 = (EditText)findViewById(R.id.editText4);

        button5.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent();
                                           st = editText4.getText().toString();
                                           intent.putExtra("name", st);
                                           setResult(Activity.RESULT_OK, intent);
                                           finish();

                                       }
                                   });



    }
}
