package com.example.tio.projectkuis;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;

/**
 * Created by tio on 04/07/18.
 */

public class babLima extends AppCompatActivity {
    VideoView videoView, vv;
    private ProgressBar progressBar;
    private MediaController mediacontroller;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bablima);

        progressBar = (ProgressBar) findViewById(R.id.progrss);
        vv = (VideoView) findViewById(R.id.videoView);

        mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView(vv);
        String uriPath = "http://websupportmlm.com/profile/tio/kuis/video/bab1.mp4"; //update package name
        uri = Uri.parse(uriPath);
        vv.setVideoURI(uri);
        vv.setMediaController(mediacontroller);
//        progressBar.setVisibility(View.VISIBLE);
        vv.requestFocus();

        vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                vv.start();
            }
        });
    }
}
