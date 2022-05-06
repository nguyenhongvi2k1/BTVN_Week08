package com.example.btvn_week08_lt.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btvn_week08_lt.Adapter.PopularDestinationAdapter;
import com.example.btvn_week08_lt.Model.PopularDestination;
import com.example.btvn_week08_lt.R;

import java.util.ArrayList;

public class PopularDestinationActivity extends AppCompatActivity {
    private ArrayList<PopularDestination> mHeros ;
    private RecyclerView mRecyclerHero;
    private PopularDestinationAdapter mHeroAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
//        mRecyclerHero = findViewById(R.id.recyclerPopular);
        mHeros = new ArrayList<>();
        createHeroList();
        mHeroAdapter = new PopularDestinationAdapter(this,mHeros);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        mRecyclerHero.setAdapter(mHeroAdapter);
        mRecyclerHero.setLayoutManager(manager);
    }

    private void createHeroList() {
        mHeros.add(new PopularDestination("Thor", R.drawable.card_singapore));
//        mHeros.add(new Hero("IronMan",R.drawable.image_ironman));
    }
}

