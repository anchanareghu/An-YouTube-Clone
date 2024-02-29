package com.example.metube;

public class ShortsData {
    private final String shortsPath;
    private final String shortsTitle;
    private final String shortsChannelName;
    private final int shortsChannelDp;


    public String getShortsPath() {
        return shortsPath;
    }

        public String getShortsTitle() {
        return shortsTitle;
    }

    public String getShortsChannelName() {
        return shortsChannelName;
    }

    public int getShortsChannelDp() {
        return shortsChannelDp;
    }

    public ShortsData(String shortsPath, String shortsTitle, String shortsChannelName, int shortsChannelDp) {
        this.shortsPath = shortsPath;
        this.shortsTitle = shortsTitle;
        this.shortsChannelName = shortsChannelName;
        this.shortsChannelDp = shortsChannelDp;
    }

}

