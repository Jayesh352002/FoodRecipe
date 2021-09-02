package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class KajuMasalaVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaju_masala_video);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        YouTubePlayerView youTubePlayerView1 = findViewById(R.id.youtube_player_view1);
        getLifecycle().addObserver(youTubePlayerView1);
        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view2);
        getLifecycle().addObserver(youTubePlayerView2);
        YouTubePlayerView youTubePlayerView3 = findViewById(R.id.youtube_player_view3);
        getLifecycle().addObserver(youTubePlayerView3);
    }
}