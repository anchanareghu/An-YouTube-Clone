package com.example.metube;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    List<VideoItemHome> videoItemList;
    RecyclerView recyclerView;

    RecyclerViewAdapter recyclerViewAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        videoItemList = generateVideoItem();

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerView_home);

        recyclerViewAdapter = new RecyclerViewAdapter(videoItemList);
        recyclerView.setAdapter(recyclerViewAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }

    private List<VideoItemHome> generateVideoItem() {

        List<VideoItemHome> videoItems = new ArrayList<>();
        videoItems.add(new VideoItemHome("android.resource://" + getContext().getPackageName() + "/" + R.raw.video2, "Girl Taking Selfie\n" + "cottonbro studio  2.8M views " + "  3 years ago", R.drawable.cottonbrostudio_profile));
        videoItems.add(new VideoItemHome("android.resource://" + getContext().getPackageName() + "/" + R.raw.video1, "Person Playing The Piano \nKendall Hoopes    3.1M Views   a month ago", R.drawable.kendallhoopes_profile));
        videoItems.add(new VideoItemHome("android.resource://" + getContext().getPackageName() + "/" + R.raw.video4, "A View Of Hot-Air Balloons In The Air\nTaryn Elliott    47.1M Views   2 years ago", R.drawable.tarynelliott_profile));
        videoItems.add(new VideoItemHome("android.resource://" + getContext().getPackageName() + "/" + R.raw.video3, "A Girl Wearing A Virtual Reality Headset \nPressmaster    10.8M Views   3 days ago", R.drawable.pressmaster_profile));
        return videoItems;
    }
}

