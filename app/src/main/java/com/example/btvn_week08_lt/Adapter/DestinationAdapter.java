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
import com.example.btvn_week08_lt.Model.Destination;
import com.example.btvn_week08_lt.Model.PopularDestination;
import com.example.btvn_week08_lt.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DestinationAdapter extends  RecyclerView.Adapter<DestinationAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Destination> mPopular;

    public DestinationAdapter(Context mContext, ArrayList<Destination> mDest) {
        this.mContext = mContext;
        this.mPopular = mDest;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public DestinationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View heroView = inflater.inflate(R.layout.item_popular_destination, parent, false);
        DestinationAdapter.ViewHolder viewHolder = new DestinationAdapter.ViewHolder(heroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DestinationAdapter.ViewHolder holder, int position) {
        Destination populardDes = mPopular.get(position);
//        Glide.with(mContext)
//                .load(populardDes.getmImage())
//                .into(holder.mImage);
        Picasso.get().load(populardDes.getImage()).into(holder.mImage);
        holder.mTextName.setText(populardDes.getName());
    }

    @Override
    public int getItemCount() {
        return mPopular.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImage;
        private TextView mTextName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.imgDes);
            mTextName = itemView.findViewById(R.id.titleDes);
        }
    }
}
