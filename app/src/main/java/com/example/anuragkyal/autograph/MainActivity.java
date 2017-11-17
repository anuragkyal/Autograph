package com.example.anuragkyal.autograph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import com.example.anuragkyal.autograph.ui.DrawingView;

public class MainActivity extends AppCompatActivity {

    DrawingView mSignatureDrawingView;
    ImageView mDoneButton;
    ImageView mResetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSignatureDrawingView = (DrawingView) findViewById(R.id.signature_drawing);
        mDoneButton = (ImageView) findViewById(R.id.signature_done);
        mResetButton = (ImageView) findViewById(R.id.signature_reset);

        addDoneButtonClickListener();
        addResetButtonClickListener();
    }

    private void addDoneButtonClickListener() {
        mDoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void addResetButtonClickListener() {
        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSignatureDrawingView.clear();
            }
        });
    }
}
