package com.tomi.tfs_safe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button btnNext;
    private TextView tvNom;
    private TextView tvPrenom;
    private TextView tvTel;
    private TextView tvEmail;
    private RadioGroup rdoGroup;
    private RadioButton rbVisiteur;
    private RadioButton rbStaff;
    private RadioButton rbEleve;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext=findViewById(R.id.btnNext);
        tvNom=findViewById(R.id.tvNom);
        tvPrenom=findViewById(R.id.tvPrenom);
        tvTel=findViewById(R.id.tvTel);
        tvEmail=findViewById(R.id.tvEmail);
        rdoGroup=findViewById(R.id.rdoGroup);
        rbVisiteur=findViewById(R.id.rbVisiteur);
        rbStaff=findViewById(R.id.rbStaff);
        rbEleve=findViewById(R.id.rbEleve);


        btnNext.setOnClickListener(new View.OnClickListener() // go to next page
        {
            @Override
            public void onClick(View v)
            {
                String name = (tvPrenom.getText().toString() +" "+ tvNom.getText().toString());
                String phone = (tvTel.getText().toString());
                String email = (tvEmail.getText().toString());
                String role = "null";

                if (rbVisiteur.isChecked())
                {
                    role = "Visiteur";
                }
                else
                if (rbStaff.isChecked())
                {
                    role = "Staff";
                }
                else
                if (rbEleve.isChecked())
                {
                    role = "Élève";
                }


                Intent intent = new Intent(MainActivity.this, Main2Activity.class);  // takes screen to second activity
                intent.putExtra("Name", name);
                intent.putExtra("Phone", phone);
                intent.putExtra("Email", email);
                intent.putExtra("Role", role);
                startActivity(intent);
            }
        });
    }
}