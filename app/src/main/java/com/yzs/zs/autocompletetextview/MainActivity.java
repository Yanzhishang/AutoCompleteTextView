package com.yzs.zs.autocompletetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoctv;
    // 定义提示文本
    String[] sport = new String[]{"a", "aab", "bb", "abb"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 创建ArrayAdapter，封装数组
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, sport);
        // 获取控件
        autoctv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        // 设置Adapter
        autoctv.setAdapter(aa);
    }
}
