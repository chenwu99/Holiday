package com.example.holiday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //WebView 加载网页
        WebView myWebView = findViewById(R.id.web_view);
        //webview支持JavaScript脚本
        myWebView.getSettings().setJavaScriptEnabled(true);
        //网页跳转不打开系统浏览器
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.baidu.com/");
//        myWebView.loadUrl("https://www.bilibili.com/");
    }

}
