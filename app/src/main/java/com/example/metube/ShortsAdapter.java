package com.example.metube;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShortsAdapter extends RecyclerView.Adapter<ShortsViewHolder> {
    List<ShortsData> shortsDataList;

    public ShortsAdapter(List<ShortsData> shortsDataList) {
        this.shortsDataList = shortsDataList;
    }

    @NonNull
    @Override
    public ShortsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shorts, parent, false);
        return new ShortsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShortsViewHolder holder, int position) {
        ShortsData shortsData = shortsDataList.get(position);

        holder.videoView.setVideoPath(shortsData.getShortsPath());
        holder.videoView.setBackgroundResource(R.raw.reel01);


        holder.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
                holder.videoView.start();

                float videoRatio = (float) mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight();
                float screenRatio = (float) holder.videoView.getWidth() / holder.videoView.getHeight();

                float scale = videoRatio / screenRatio;

                if (scale >= 1f) {
                    holder.videoView.setScaleX(scale);
                } else {
                    holder.videoView.setScaleY(1f / scale);
                }

            }
        });
        holder.channelName.setText(shortsData.getShortsChannelName());
        holder.videoTitle.setText(shortsData.getShortsTitle());
        holder.channelLogo.setImageResource(shortsData.getShortsChannelDp());
    }

    @Override
    public int getItemCount() {
        return shortsDataList.size();
    }


}
