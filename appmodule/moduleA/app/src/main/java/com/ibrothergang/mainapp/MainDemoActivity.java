package com.ibrothergang.mainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.ibrothergang.samplelibrary.SampleLibraryDemoActivity;

public class MainDemoActivity extends AppCompatActivity {
    private TextView mTxtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_demo);
        mTxtInfo = findViewById(R.id.text_info);
    }

    public void button01Click(View view) {
        Intent intent = new Intent(this, SampleLibraryDemoActivity.class);
        startActivity(intent);
    }

    public void button02Click(View view) {
        showText("button02Click");
    }

    public void button03Click(View view) {
        showText("button03Click");
    }

    public void ClearClick(View view) {
        mTxtInfo.setText("");
    }

    private void showText(String value) {
        CharSequence oldString = mTxtInfo.getText();
        mTxtInfo.setText(oldString + "\n" + value);
    }
}
