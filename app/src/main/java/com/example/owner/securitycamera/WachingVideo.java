package com.example.owner.securitycamera;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

public class WachingVideo extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waching_video);

        VideoView videoView=(VideoView)findViewById(R.id.videoView);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);

        //bringing the video from YouTube
        Uri uri= Uri.parse("rtsp://r1---sn-4g5edne6.googlevideo.com/Cj0LENy73wIaNAlqyPh_n69QzxMYDSANFC1JMkNYMOCoAUIASARg5Obz6fLWh7lXigELbG9vbHNTY0h2cG8M/B4F06FCC651320FF31549648180AA63A4ADEBB94.3C56975EB5DD7A2E1B11B664FB253821D0A0DB00/yt6/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();



    }
}
