package com.example.computer.eshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {
    EditText namee,email_id,contact_no,password1,cpassord;
   public static String name,email,contact,password,cpassword;
Button b1;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        namee=(EditText)findViewById(R.id.name);
        email_id=(EditText)findViewById(R.id.email);
        contact_no=(EditText)findViewById(R.id.contact);
        password1=(EditText)findViewById(R.id.password);
        cpassord=(EditText)findViewById(R.id.cpassword);
        b1=(Button) findViewById(R.id.subm);
        t1=(TextView)findViewById(R.id.logm);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=namee.getText().toString();
                email=email_id.getText().toString();
                contact=contact_no.getText().toString();
                password=password1.getText().toString();
                cpassword=cpassord.getText().toString();
                Intent intent=new Intent(Signup.this,Login.class);
                startActivity(intent);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signup.this,Login.class);
                startActivity(intent);
            }
        });


    }
}
