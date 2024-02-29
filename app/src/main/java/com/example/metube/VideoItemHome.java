package com.example.metube;

public class VideoItemHome {
    private String video;
    private String video_title;
    private int channel;

    public String getVideo() {
        return video;
    }

    public String getVideo_title() {
        return video_title;
    }

    public int getChannel() {
        return channel;
    }

    public VideoItemHome(String video, String video_title, int channel) {
        this.video = video;
        this.video_title = video_title;
        this.channel = channel;
    }
}
