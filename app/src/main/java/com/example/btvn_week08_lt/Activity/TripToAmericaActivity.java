package com.example.btvn_week08_lt.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.btvn_week08_lt.Adapter.BestDealsAdapter;
import com.example.btvn_week08_lt.Model.BestDeals;
import com.example.btvn_week08_lt.R;

import java.util.ArrayList;

public class TripToAmericaActivity extends AppCompatActivity {

    private ArrayList<BestDeals> card_des = new ArrayList<>();
    private BestDealsAdapter dealsAdapter ;
    private View btn_Back;
    private TextView filter;

    RecyclerView rcv_TriptoAmerica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_to_america);

        rcv_TriptoAmerica = (RecyclerView) findViewById(R.id.rcv_TriptoAmarica);
        card_des =new ArrayList<>();
        createCard();

        btn_Back = findViewById(R.id.btn_Back_America);
        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        filter = findViewById(R.id.filter);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TripToAmericaActivity.this, FIlterActivity.class);
                startActivity(intent);
            }
        });
    }

    private void createCard() {
        rcv_TriptoAmerica.setLayoutManager(new GridLayoutManager(TripToAmericaActivity.this, 2));
        rcv_TriptoAmerica.setItemAnimator(new DefaultItemAnimator());
        card_des.add(new BestDeals(R.drawable.discount30,"InterContinental Los Angeles", "900 Wilshire Blvd, Los Angeles, CA 90017, USA", R.drawable.card1, "4-star Hotel", R.drawable.first_price, "$ 559", "Per night"));
        card_des.add(new BestDeals(R.drawable.discount_banner,"Sofitel Singapore City Centre", "9 Wallich St, Singapore 078885", R.drawable.card2, "4-star Hotel", R.drawable.first_price2, "$ 320", "Per night"));
        card_des.add(new BestDeals(R.drawable.discount_banner,"Mandarin Oriental Bangkok", "48 Oriental Ave, Bang Rak, Bangkok 10500", R.drawable.card3, "5-star Hotel", R.drawable.first_price3, "$ 280", "Per night"));

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        BestDealsAdapter adapter = new BestDealsAdapter(this, card_des);
        rcv_TriptoAmerica.setLayoutManager(manager);
        rcv_TriptoAmerica.setAdapter(adapter);
    }
}