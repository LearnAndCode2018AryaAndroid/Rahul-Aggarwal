package com.example.computer.eshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText e1,e2;
    Button submt;
    public static String email,password;
    TextView signup,goog,frgot1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        e1 = (EditText) findViewById(R.id.email);
        e2 = (EditText) findViewById(R.id.editText2);
        frgot1=(TextView)findViewById(R.id.frgt);
        submt=(Button)findViewById(R.id.button);
        signup=(TextView)findViewById(R.id.sign);
        submt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=e1.getText().toString();
                password=e2.getText().toString();
            if (email.isEmpty())
                Toast.makeText(Login.this, "Enter Valid Email ", Toast.LENGTH_SHORT).show();
               else if (password.isEmpty())
                    Toast.makeText(Login.this, "Enter Password ", Toast.LENGTH_SHORT).show();
               else
            {
                Intent intent=new Intent(Login.this,MainActivity.class);
                startActivity(intent);
            }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,Signup.class);
                startActivity(intent);
            }
        });
    }
}
