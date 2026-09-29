package com.everyday.math;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.startapp.sdk.adsbase.StartAppSDK;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        StartAppSDK.init(this, "208213531", false);
        
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/index.html");
        
        setContentView(webView);
    }
}
