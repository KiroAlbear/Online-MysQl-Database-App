package com.example.admin2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText UserName, Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName = (EditText) findViewById(R.id.UserName);
        Password = (EditText) findViewById(R.id.Password);
       // Login = (Button) findViewById(R.id.LoginButton);


    }
public void  Onlogin(View view ) {


    String usernamestr = UserName.getText().toString();
    String passwordstr = Password.getText().toString();

    String type = "Login";

    Background background = new Background(this);
    background.execute(type, usernamestr, passwordstr);

}

}
