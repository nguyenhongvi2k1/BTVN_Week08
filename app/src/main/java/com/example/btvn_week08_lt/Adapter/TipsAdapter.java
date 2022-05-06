package com.example.btvn_week08_lt.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.btvn_week08_lt.Model.The_Slide_Items_Model_Class;
import com.example.btvn_week08_lt.Model.Tip;
import com.example.btvn_week08_lt.R;
import com.squareup.picasso.Picasso;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class TipsAdapter extends PagerAdapter {
    private Context Mcontext;
    private List<Tip> tipsList;

    public TipsAdapter(Context Mcontext, List<Tip> tipsList) {
        this.Mcontext = Mcontext;
        this.tipsList = tipsList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) Mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View sliderLayout = inflater.inflate(R.layout.item_header_home,null);

        ImageView featured_image = sliderLayout.findViewById(R.id.my_featured_image);
        TextView caption_title = sliderLayout.findViewById(R.id.my_caption_title);

        Picasso.get().load(tipsList.get(position).getImage()).into(featured_image);
        caption_title.setText(tipsList.get(position).getName());
        container.addView(sliderLayout);
        return sliderLayout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return tipsList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
