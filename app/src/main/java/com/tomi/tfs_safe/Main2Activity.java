package com.tomi.tfs_safe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    private TextView txtName;
    private TextView txtTel;
    private TextView txtEmail;
    private TextView txtRole;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName=findViewById(R.id.txtName);
        txtTel=findViewById(R.id.txtTel);
        txtEmail=findViewById(R.id.txtEmail);
        txtRole=findViewById(R.id.txtRole);
        btnBack=findViewById(R.id.btnBack);
        Bundle extras = getIntent().getExtras();

        String NAME= extras.getString("Name");
        txtName.setText(NAME);

        String NUM= extras.getString("Phone");
        txtTel.setText(NUM);

        String EMAIL=extras.getString("Email");
        txtEmail.setText(EMAIL);

        String ROLE=extras.getString("Role");
        txtRole.setText(ROLE);

        btnBack.setOnClickListener(new View.OnClickListener() // go to next page
        {
            @Override
            public void onClick(View v)
            {
                Intent intent2 = new Intent(Main2Activity.this, MainActivity.class);  // takes screen to second activity
                startActivity(intent2);
            }
        });
    }
}