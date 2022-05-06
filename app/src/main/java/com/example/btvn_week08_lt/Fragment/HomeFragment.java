package com.example.btvn_week08_lt.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.btvn_week08_lt.Activity.HotelActivity;
import com.example.btvn_week08_lt.Adapter.BestDealsAdapter;
import com.example.btvn_week08_lt.Adapter.DestinationAdapter;
import com.example.btvn_week08_lt.Adapter.PopularDestinationAdapter;
import com.example.btvn_week08_lt.Adapter.The_Slide_items_Pager_Adapter;
import com.example.btvn_week08_lt.Adapter.TipsAdapter;
import com.example.btvn_week08_lt.ApiInterface.ApiService;
import com.example.btvn_week08_lt.ApiInterface.UserService;
import com.example.btvn_week08_lt.Model.BestDeals;
import com.example.btvn_week08_lt.Model.Destination;
import com.example.btvn_week08_lt.Model.The_Slide_Items_Model_Class;
import com.example.btvn_week08_lt.Model.Tip;
import com.example.btvn_week08_lt.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeFragment extends Fragment {
//    private ArrayList<PopularDestination> mHeros ;
    private ArrayList<BestDeals> bestDeals = new ArrayList<>();
    private BestDealsAdapter dealsAdapter ;
    private RecyclerView mRecyclerHero, deals_recyclerView, des_recyclerView, recyclerDeal;
    private PopularDestinationAdapter mHeroAdapter ;
    private View card_singapore, card_america, card_italy;

    //Slide header
    private List<The_Slide_Items_Model_Class> listItems;
    private ViewPager page;
    private TabLayout tabLayout;
    private ArrayList<Tip> tipItems;
    private TipsAdapter tipAdapter;
    UserService ApiInterface;

    private DestinationAdapter desAdapter;
    private ArrayList<Destination> desItems;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //Create slide header home
        page = view.findViewById(R.id.my_pager) ;
        tabLayout = view.findViewById(R.id.my_tablayout);

        card_singapore = (View) view.findViewById(R.id.card_singap);
//        card_america = view.findViewById(R.id.card_americ);
//        card_italy = view.findViewById(R.id.card_italia);



//        ApiInterface = RetrofitClient.getInstance().getMyApi();
//        Call<The_Slide_Items_Model_Class> call = ApiInterface.getTips();
//        call.enqueue(new Callback<The_Slide_Items_Model_Class>() {
//            @Override
//            public void onResponse(Call<The_Slide_Items_Model_Class> call, Response<The_Slide_Items_Model_Class> response) {
//                The_Slide_Items_Model_Class result = response.body();
//
//            }
//
//            @Override
//            public void onFailure(Call<The_Slide_Items_Model_Class> call, Throwable t) {
//
//            }
//        });

        listItems = new ArrayList<>() ;
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.header1,"Cinque Terre", "A coastal area within Liguria, in the northwest of Italy. It lies in the west of La Spezia Province, and the coastline, the five villages, and the surrounding hillsides are all part of the Cinque Terre National Park, a UNESCO World Heritage Site."));
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.header2,"Maldives","Officially the Republic of Maldives, is an archipelagic country in the Indian subcontinent of Asia, situated in the Indian Ocean. Maldives is one of the world\\'s most geographically dispersed sovereign states as well as the smallest Asian country by land area with around 557,751 inhabitants, the 2nd least populous country in Asia."));
        listItems.add(new The_Slide_Items_Model_Class(R.drawable.header3,"Banh Mi","In Vietnamese cuisine, Bánh mì or banh mi is a short baguette with thin, crisp crust and soft, airy texture. It is often split lengthwise and filled with savory ingredients like a submarine sandwich and served as a meal, called “bánh mì thịt”."));

        The_Slide_items_Pager_Adapter itemsPager_adapter = new The_Slide_items_Pager_Adapter(getContext(), listItems);
        page.setAdapter(itemsPager_adapter);

        java.util.Timer timer = new java.util.Timer();
//        timer.scheduleAtFixedRate(new The_slide_timer(),2000,5000);
        tabLayout.setupWithViewPager(page,true);

//        mRecyclerHero = view.findViewById(R.id.recyclerPopular);

//        deals_recyclerView = view.findViewById(R.id.deals_recyclerView);
//        deals_recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyclerDeal.setLayoutManager(new LinearLayoutManager(this));
//        recyclerDeal.setHasFixedSize(true);
        recyclerDeal = view.findViewById(R.id.deals_recyclerView);
//        mHeros = new ArrayList<>();
        bestDeals =new ArrayList<>();

        createBestDealList();

//        des_recyclerView = view.findViewById(R.id.recyclerviewDes);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
//        des_recyclerView.setLayoutManager(gridLayoutManager);
//        getDestination();

        card_singapore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HotelActivity.class);
                startActivity(intent);
            }
        });
        return  view;
    }

    private void getDestination() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://nhm204.fun")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService requestInteface = retrofit.create(ApiService.class);
        Call<List<Destination>> call = requestInteface.getDestination();

        call.enqueue(new Callback<List<Destination>>() {
            @Override
            public void onResponse(Call<List<Destination>> call, Response<List<Destination>> response) {
                desItems = new ArrayList<>(response.body());
                desAdapter = new DestinationAdapter(getContext(), desItems);
                des_recyclerView.setAdapter(desAdapter);
                Toast.makeText(getContext(),"Success",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<Destination>> call, Throwable t) {
                Toast.makeText(getContext(),"Failed",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void createBestDealList() {
        recyclerDeal.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerDeal.setItemAnimator(new DefaultItemAnimator());
        bestDeals.add(new BestDeals(R.drawable.discount30,"InterContinental Los Angeles", "900 Wilshire Blvd, Los Angeles, CA 90017, USA", R.drawable.card1, "4-star Hotel", R.drawable.first_price, "$ 559", "Per night"));
        bestDeals.add(new BestDeals(R.drawable.discount_banner,"Sofitel Singapore City Centre", "9 Wallich St, Singapore 078885", R.drawable.card2, "4-star Hotel", R.drawable.first_price2, "$ 320", "Per night"));
        bestDeals.add(new BestDeals(R.drawable.discount_banner,"Mandarin Oriental Bangkok", "48 Oriental Ave, Bang Rak, Bangkok 10500", R.drawable.card3, "5-star Hotel", R.drawable.first_price3, "$ 280", "Per night"));
//        for (int i = 0; i < title.length; i++) {
//            BestDeals itemModel = new BestDeals();
//            itemModel.setTitle(title[i]);
//            itemModel.setRating(rating[i]);
//            itemModel.setLocation(location[i]);
////            itemModel.setNew_price(newPrice[i]);
////            itemModel.setPrice(price[i]);
////            itemModel.setLocation(location[i]);
//            bestDeals.add(itemModel);
//        }
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false);
        BestDealsAdapter adapter = new BestDealsAdapter(getContext(), bestDeals);
        recyclerDeal.setLayoutManager(manager);
        recyclerDeal.setAdapter(adapter);

//        BestDeals adapter = new BestDeals(getApplicationContext(), arrayList1);
//        recyclerView1.setAdapter(adapter);
    }


//    private void createBestDealList() {
//        Retrofit retrofit=new Retrofit.Builder()
//                .baseUrl("https://nhm204.fun")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        ApiService requestInteface = retrofit.create(ApiService.class);
//        Call<List<BestDeals>> call = requestInteface.getBestDeal();
//
//        call.enqueue(new Callback<List<BestDeals>>() {
//            @Override
//            public void onResponse(Call<List<BestDeals>> call, Response<List<BestDeals>> response) {
//                bestDeals = new ArrayList<>(response.body());
//                dealsAdapter =  new BestDealsAdapter(getContext(), bestDeals);
//                deals_recyclerView.setHasFixedSize(true);
//                deals_recyclerView.setAdapter(dealsAdapter);
//                Toast.makeText(getActivity(),"Success",Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(Call<List<BestDeals>> call, Throwable t) {
//                Toast.makeText(getContext(),"Failed",Toast.LENGTH_SHORT).show();
//            }
//        });
//    }


    private class The_slide_timer extends TimerTask {

        @Override
        public void run() {
            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (page.getCurrentItem()< listItems.size()-1) {
                        page.setCurrentItem(page.getCurrentItem()+1);
                    }
                    else
                        page.setCurrentItem(0);
                }
            });
        }
    }

}
