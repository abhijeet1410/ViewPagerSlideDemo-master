package com.abhijeet14.viewpagerdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentViewPager extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        TextView tv = v.findViewById(R.id.title);
        tv.setText(getArguments().getString("text"));

        ImageView img = v.findViewById(R.id.image);
        img.setBackgroundResource(getArguments().getInt("img"));
        return v;
    }

    public static FragmentViewPager newInstance(String text, int image){
        FragmentViewPager f = new FragmentViewPager();

            Bundle b = new Bundle();
            b.putString("text",text);
            b.putInt("img",image);

        f.setArguments(b);

         return f;
    }
}
