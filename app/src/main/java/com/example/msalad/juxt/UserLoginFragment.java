package com.example.msalad.juxt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by msalad on 1/7/2016.
 */
public class UserLoginFragment extends Fragment {

    private final String id = "admin";
    private final String pass = "password";
    private EditText mUser;
    private EditText mPass;
    private Button mLogin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v  = inflater.inflate(R.layout.user_login,container,false);
        mUser = (EditText) v.findViewById(R.id.username);
        mPass = (EditText) v.findViewById(R.id.password);
        mLogin = (Button) v.findViewById(R.id.btnlogin);




        return v;
    }
}
