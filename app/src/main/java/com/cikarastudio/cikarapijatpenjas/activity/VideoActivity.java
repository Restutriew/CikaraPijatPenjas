package com.cikarastudio.cikarapijatpenjas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.cikarastudio.cikarapijatpenjas.R;
import com.cikarastudio.cikarapijatpenjas.model.Massage;

public class VideoActivity extends AppCompatActivity {
    public static final String EXTRA_MASSAGE = "extra_movie";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        TextView tvTitle = findViewById(R.id.title_masssage);
        TextView tvDescription = findViewById(R.id.description_massage);

        Massage massage = getIntent().getParcelableExtra(EXTRA_MASSAGE);
        String title = massage.getTitle();
        String description = massage.getDescription();

        tvTitle.setText(title);
        tvDescription.setText(description);
        int video = massage.getVideo();

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

    }
}
