package com.example.metube;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShortsViewHolder extends RecyclerView.ViewHolder {
    VideoView videoView;
    ImageView channelLogo;
    TextView channelName;
    TextView videoTitle;

    public ShortsViewHolder(@NonNull View itemView) {
        super(itemView);
        this.videoView = (VideoView) itemView.findViewById(R.id.videoView_shorts);
        this.channelLogo = (ImageView) itemView.findViewById(R.id.shorts_channel_logo);
        this.channelName = (TextView) itemView.findViewById(R.id.shorts_channel_name);
        this.videoTitle = (TextView) itemView.findViewById(R.id.shorts_title);
    }

}
