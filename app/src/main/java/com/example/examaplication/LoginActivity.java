package com.example.examaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.examaplication.beans.User;
import com.example.examaplication.busness.DefaultServices;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView emailInput = findViewById(R.id.emailInput);
        TextView pwd = findViewById(R.id.pwdInput);
        Button loginbtn = findViewById(R.id.buttonLogin);
        loginbtn.setOnClickListener(view -> {
           User u = DefaultServices.getInstance().getUser(emailInput+"");
           if(u.getEmail() != null){
               if(u.getPwd().equals(pwd)){

               }
           }
        });
        setContentView(R.layout.activity_login);
    }

}