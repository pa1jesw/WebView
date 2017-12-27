package com.pa1.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv=findViewById(R.id.wv);
        wv.loadUrl("http://www.vogella.com/tutorials/AndroidServices/article.html");
        

        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);

        ws.setLoadWithOverviewMode(true);


        wv.setWebViewClient(new WebViewClient());


    }
}
