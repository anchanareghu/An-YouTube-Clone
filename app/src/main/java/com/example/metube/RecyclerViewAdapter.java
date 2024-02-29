package com.example.metube;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    public RecyclerViewAdapter(List<VideoItemHome> videoItemList) {
        this.videoItemList = videoItemList;
    }

    List<VideoItemHome> videoItemList;

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video_home, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        VideoItemHome videoItem = videoItemList.get(position);

        holder.videoView.setVideoPath(videoItem.getVideo());
        holder.videoView.setBackgroundResource(R.raw.video1);

//        MediaController mediaController = new MediaController(holder.videoView.getContext());
//        mediaController.setAnchorView(holder.videoView);
//        holder.videoView.setMediaController(mediaController);

        holder.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
                holder.videoView.start();
            }
        });
        holder.channelLogoView.setImageResource(videoItem.getChannel());
        holder.textView.setText(videoItem.getVideo_title());

    }


    @Override
    public int getItemCount() {
        return videoItemList.size();
    }
}
