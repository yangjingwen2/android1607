package com.androidxx.yangjw.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * android1607的Git的基本使用
 */
public class MainActivity extends AppCompatActivity {

    private TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = (TextView) findViewById(R.id.main_show_txt);
    }
}
