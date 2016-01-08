package com.example.msalad.juxt;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by msalad on 1/7/2016.
 */
public class UserLoginActivity extends AppCompatActivity{


    private final String id = "admin";
    private final String pass = "password";
    private EditText mUser;
    private EditText mPass;
    private Button mLogin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);


        mUser = (EditText) findViewById(R.id.username);
        mPass = (EditText) findViewById(R.id.password);
        mLogin = (Button) findViewById(R.id.btnlogin);

        mUser.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mUser.getText().toString().equals(id) && mPass.getText().toString().equals(pass))
                {
                    Intent home = new Intent(getApplicationContext(),Home.class);
                    startActivity(home);
                }
                else
                    Toast.makeText(getApplicationContext()," Wrong Username / Password!",Toast.LENGTH_LONG).show();
            }
        });
    }





}
