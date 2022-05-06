package com.example.btvn_week08_lt.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.btvn_week08_lt.R;

public class activity_introduction1 extends AppCompatActivity {
    private  Button btnnext;
    private Button btnskip1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction1);
        btnnext =(Button) findViewById(R.id.next);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_introduction1.this, activity_introduction2.class);
                startActivity(intent);

            }
        });
        btnskip1 =(Button) findViewById(R.id.skip);
        btnskip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_introduction1.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
