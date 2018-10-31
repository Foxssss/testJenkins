package com.example.fox.testjenkins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.apache.commons.lang3.StringUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(StringUtils.capitalize("hello world!"));
        setContentView(R.layout.activity_main);
    }
}
