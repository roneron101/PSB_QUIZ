package com.example.psb_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class ShowCorrectActivity extends AppCompatActivity {
    String UID = FirebaseAuth.getInstance().getUid();
    ArrayList<String> S = new ArrayList<String>();

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_correct);
    }
}
