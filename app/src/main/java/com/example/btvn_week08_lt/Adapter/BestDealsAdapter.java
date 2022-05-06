package com.example.btvn_week08_lt.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.btvn_week08_lt.Model.BestDeals;
import com.example.btvn_week08_lt.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BestDealsAdapter extends RecyclerView.Adapter<BestDealsAdapter.viewHolder>{

//    Context context;
//    ArrayList<BestDeals> bestdealList = new ArrayList<>();
//
//
//    public BestDealsAdapter(Context context, ArrayList<BestDeals> arrayList) {
//        this.context = context;
//        this.bestdealList = arrayList;
//    }
//
//
//    @NonNull
//    public  BestDealsAdapter.viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//        View view = LayoutInflater.from(context).inflate(R.layout.cars_list_item, viewGroup, false);
//        return new BestDealsAdapter.viewHolder(view);
//    }
//
//    @Override
//    public  void onBindViewHolder(BestDealsAdapter.viewHolder holder, int position) {
//
//        holder.title.setText(bestdealList.get(position).getRooms().get(position).getHotel().getName());
////        holder.location.setText(bestdealList.get(position).getRooms().get(0).getHotel().getLocation());
////        holder.rating.setText(bestdealList.get(position).getRooms().get(0).getHotel().getRating().toString());
//
////        Picasso.get().load(bestdealList.get(position).getRooms().get(position).getImage()).into(holder.mImage);
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return bestdealList.size();
//    }
//
//    public class viewHolder extends RecyclerView.ViewHolder {
//        ImageView mImage, oldPrice;
//        TextView title, location, newPrice, rating, pernight;
//
//        public viewHolder(View itemView) {
//            super(itemView);
//            mImage = (ImageView) itemView.findViewById(R.id.deal_image);
////            title = (TextView) itemView.findViewById(R.id.deal_title);
////            location = (TextView) itemView.findViewById(R.id.deal_location);
////            rating = (TextView) itemView.findViewById(R.id.deal_rating);
//
//            title = (TextView) itemView.findViewById(R.id.deal_desc);
//        }
//    }

    Context context;
    ArrayList<BestDeals> arrayList;
    public BestDealsAdapter(Context context, ArrayList<BestDeals> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @NonNull
    public  viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_best_deals, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    public  void onBindViewHolder(viewHolder holder, int position) {
        holder.title.setText(arrayList.get(position).getTitle());
        holder.location.setText(arrayList.get(position).getLocation());
        holder.rating.setText(arrayList.get(position).getRating());
        holder.newPrice.setText(arrayList.get(position).getNew_price());
        holder.pernight.setText(arrayList.get(position).getPerNight());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView mImage, oldPrice;
        TextView title, location, newPrice, rating, pernight;

        public viewHolder(View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.idIVImage);
            title = (TextView) itemView.findViewById(R.id.idTVTitle);
            location = (TextView) itemView.findViewById(R.id.idTVLocation);
            rating = (TextView) itemView.findViewById(R.id.idTVRating);
//            oldPrice = itemView.findViewById(R.id.old_price);
            newPrice = (TextView) itemView.findViewById(R.id.new_price);
            pernight = itemView.findViewById(R.id.per_night);
        }
    }

}
