package com.cerenerdem.webviewproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.anasayfa_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (item.getItemId() == R.id.diger) {

            Intent IntentMaps = new Intent(getApplicationContext(), ActivityDiger.class);
            startActivity(IntentMaps);

        }


        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.uygulama_logosu);


        setContentView(R.layout.activity_main);

        WebView webview = (WebView) findViewById(R.id.WebView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(getString(R.string.WebAdresi));
    }
}
