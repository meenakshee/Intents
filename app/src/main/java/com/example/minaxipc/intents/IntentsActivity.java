package com.example.minaxipc.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntentsActivity extends AppCompatActivity {
    int request_code=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);
    }
    public void onclickmakebrowser() {
        Intent i = new
                Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http:www.liveteckservices.net"));
        startActivity(i);
    }
    public void onclickmakecall() {
        Intent i = new
                Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:+9679150467"));
        startActivity(i);
    }
    public void onclickmap(){
        Intent i=new
                Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:37.827500,-122.481670"));
        startActivity(i);
    }
}
