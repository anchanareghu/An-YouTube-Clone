package com.example.metube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;


public class ShortsFragment extends Fragment {
    ViewPager2 viewPager2;
    List<ShortsData> shortsDataList;

    ShortsAdapter shortsAdapter;

    public ShortsFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        shortsDataList = generateShortsItem();

        View view = inflater.inflate(R.layout.fragment_shorts, container, false);

        viewPager2 = view.findViewById(R.id.viewPagerView);
        shortsAdapter = new ShortsAdapter(shortsDataList);
        viewPager2.setAdapter(shortsAdapter);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();

    }

    private List<ShortsData> generateShortsItem() {

        List<ShortsData> shortsData = new ArrayList<>();

        shortsData.add(new ShortsData("android.resource://" + getContext().getPackageName() + "/" + R.raw.reel01, "An astronaut Holding A Space Helmet\n", "cottonbro studio", R.drawable.cottonbrostudio_profile));
        shortsData.add(new ShortsData("android.resource://" + getContext().getPackageName() + "/" + R.raw.reel03, "A Dog with Red Sunglasses\n", "RDNE Stock project", R.drawable.rdnestockproject_profile));
        shortsData.add(new ShortsData("android.resource://" + getContext().getPackageName() + "/" + R.raw.reel05, "A Woman Talking On Her Cellphone\n", "Tima Miroshnichenko", R.drawable.timamiroshnichenko_profile));
        shortsData.add(new ShortsData("android.resource://" + getContext().getPackageName() + "/" + R.raw.reel02, "A Beautiful Woman in Red\n", "cottonbro studio", R.drawable.cottonbrostudio_profile));
        shortsData.add(new ShortsData("android.resource://" + getContext().getPackageName() + "/" + R.raw.reel04, "Woman Holding a Polaroid Camera with an android robot\n", " Yaroslav Shuraev", R.drawable.yaroslavshuraev_profile));

        return shortsData;
    }
}
