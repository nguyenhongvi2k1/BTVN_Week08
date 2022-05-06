package com.example.btvn_week08_lt.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btvn_week08_lt.Adapter.FavoriteHotelListAdapter;
import com.example.btvn_week08_lt.Model.BestDeals;
import com.example.btvn_week08_lt.Model.FavoriteHotelList;
import com.example.btvn_week08_lt.R;

import java.util.ArrayList;

public class FavoriteFragment extends Fragment {

    private ArrayList<FavoriteHotelList> favoriteHotelLists;
    private RecyclerView recyclerFavorite;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        recyclerFavorite = view.findViewById(R.id.recyclerFavorite);
        favoriteHotelLists = new ArrayList<>();

        createFavoriteHotelList();

        return view;
    }
    private void createFavoriteHotelList() {
        recyclerFavorite.setLayoutManager(new GridLayoutManager(getContext(), 4));
        recyclerFavorite.setItemAnimator(new DefaultItemAnimator());
        favoriteHotelLists.add(new FavoriteHotelList(R.drawable.discount30,"InterContinental Los Angeles", "900 Wilshire Blvd, Los Angeles, CA 90017, USA", R.drawable.card1, "4-star Hotel", R.drawable.first_price, "$ 559", "Per night"));
        favoriteHotelLists.add(new FavoriteHotelList(R.drawable.discount30,"InterContinental Los Angeles", "900 Wilshire Blvd, Los Angeles, CA 90017, USA", R.drawable.card1, "4-star Hotel", R.drawable.first_price, "$ 559", "Per night"));
        favoriteHotelLists.add(new FavoriteHotelList(R.drawable.discount30,"InterContinental Los Angeles", "900 Wilshire Blvd, Los Angeles, CA 90017, USA", R.drawable.card1, "4-star Hotel", R.drawable.first_price, "$ 559", "Per night"));
        favoriteHotelLists.add(new FavoriteHotelList(R.drawable.discount30,"InterContinental Los Angeles", "900 Wilshire Blvd, Los Angeles, CA 90017, USA", R.drawable.card1, "4-star Hotel", R.drawable.first_price, "$ 559", "Per night"));


        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false);
        FavoriteHotelListAdapter adapter = new FavoriteHotelListAdapter(getContext(), favoriteHotelLists);
        recyclerFavorite.setLayoutManager(manager);
        recyclerFavorite.setAdapter(adapter);
//        favoriteHotelLists.add(new BestDeals(R.drawable.discount_banner,"Sofitel Singapore City Centre", "9 Wallich St, Singapore 078885", R.drawable.card2, "4-star Hotel", R.drawable.first_price2, "$ 320", "Per night"));
//        favoriteHotelLists.add(new BestDeals(R.drawable.discount_banner,"Mandarin Oriental Bangkok", "48 Oriental Ave, Bang Rak, Bangkok 10500", R.drawable.card3, "5-star Hotel", R.drawable.first_price3, "$ 280", "Per night"));
//
    }

}
