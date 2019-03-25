package com.example.chmarax.logregform;

import androidx.annotation.NonNull;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chmarax.logregform.Cultural.CulturalEvents;
import com.example.chmarax.logregform.Technical.TechnicalEvents;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.ramotion.circlemenu.CircleMenuView;

public class MainActivity extends AppCompatActivity {


    private Button btnLogout;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseAuth = FirebaseAuth.getInstance();

        FirebaseUser user = firebaseAuth.getCurrentUser();


        final CircleMenuView menu = findViewById(R.id.circle_menu);
        menu.setEventListener(new CircleMenuView.EventListener() {
            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuOpenAnimationStart");
            }

            @Override
            public void onMenuOpenAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuOpenAnimationEnd");
            }

            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuCloseAnimationStart");
            }

            @Override
            public void onMenuCloseAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuCloseAnimationEnd");
            }

            @Override
            public void onButtonClickAnimationStart(@NonNull CircleMenuView view, int index) {
                Log.d("D", "onButtonClickAnimationStart| index: " + index);
            }

            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {
                Log.d("D", "onButtonClickAnimationEnd| index: " + index);
                switch (index){
                    case 0 :
                        Intent intent = new Intent(getApplicationContext(), TechnicalEvents.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),"Technical Events",Toast.LENGTH_LONG).show();
                        break;

                    case 1 :
                        startActivity(new Intent(MainActivity.this, CulturalEvents.class));
                        Toast.makeText(getApplicationContext(),"Cultural Events",Toast.LENGTH_LONG).show();
                        break;

                    case 2 : firebaseAuth.signOut();
                        finish();
                        startActivity(new Intent(MainActivity.this,LoginActivity.class));
                        Toast.makeText(getApplicationContext(),"Logged out",Toast.LENGTH_LONG).show();
                        break;

                    case 3 : break;

                    case 4 : break;
                }
            }
        });

    }

    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }
}