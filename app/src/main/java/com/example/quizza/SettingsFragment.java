package com.example.quizza;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.auth.FirebaseAuth;
import android.widget.Button;


public class SettingsFragment extends Fragment {

    Button logoutButton;

    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        logoutButton = (Button)view.findViewById(R.id.logout_button);

        //TO DO : figure out a way to make the log out button work

        return view;
    }

}