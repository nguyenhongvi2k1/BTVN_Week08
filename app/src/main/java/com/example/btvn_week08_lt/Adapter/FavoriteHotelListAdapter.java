package com.example.btvn_week08_lt.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btvn_week08_lt.Model.FavoriteHotelList;
import com.example.btvn_week08_lt.R;

import java.util.ArrayList;

public class FavoriteHotelListAdapter extends RecyclerView.Adapter<FavoriteHotelListAdapter.ViewHolder> {
    Context context;
    ArrayList<FavoriteHotelList> arrayList;
    public FavoriteHotelListAdapter(Context context, ArrayList<FavoriteHotelList> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public FavoriteHotelListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_favorite, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteHotelListAdapter.ViewHolder holder, int position) {
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

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImage, oldPrice;
        TextView title, location, newPrice, rating, pernight;
        public ViewHolder(@NonNull View itemView) {
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
