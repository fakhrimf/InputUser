package com.pwpb.inputuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnSubmit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitClick();
            }
        });
    }

    public void submitClick(){
        EditText edt = findViewById(R.id.editText);
        String username = edt.getText().toString();
        Intent intent = new Intent(getBaseContext(), inputUserDLL.class);
        intent.putExtra("username", username);
        startActivity(intent);
    }
}
