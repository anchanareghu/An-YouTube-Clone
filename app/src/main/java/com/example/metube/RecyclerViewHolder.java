package com.example.metube;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    VideoView videoView;
    TextView textView;

    ImageView channelLogoView;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        this.videoView = (VideoView) itemView.findViewById(R.id.videoView_shorts);
        this.textView = itemView.findViewById(R.id.text);
        this.channelLogoView = itemView.findViewById(R.id.channel);
    }

}
