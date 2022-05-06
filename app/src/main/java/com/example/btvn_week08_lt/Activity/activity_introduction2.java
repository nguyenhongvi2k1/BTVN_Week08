package com.example.btvn_week08_lt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.R;

public class activity_introduction2 extends AppCompatActivity {
    private  Button btn_next1;
    private Button btnskip2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction2);

        btn_next1 =(Button) findViewById(R.id.next1);
        btn_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_introduction2.this, activity_getstarted.class);
                startActivity(intent);
            }
        });
        btnskip2 =(Button) findViewById(R.id.skip1);
        btnskip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_introduction2.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }


}
