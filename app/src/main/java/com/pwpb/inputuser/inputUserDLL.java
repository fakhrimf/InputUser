package com.pwpb.inputuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class inputUserDLL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_user_dll);

        String username = getIntent().getStringExtra("username");
        TextView tv = findViewById(R.id.textView);
        tv.setText("Hello "+username+"!");

        Button btn = findViewById(R.id.btnSubmit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Mengirim Data...", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
