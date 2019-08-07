package com.pwpb.inputuser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button btn = findViewById(R.id.bukaYutup);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitClick();
            }
        });
    }

    public void submitClick(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com"));
        startActivity(intent);
    }
}
