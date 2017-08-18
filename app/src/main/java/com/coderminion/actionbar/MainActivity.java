package com.coderminion.actionbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    Button drawer,backbutton,menuitem,searchview,fadingactionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.drawer).setOnClickListener(this);
        findViewById(R.id.homeback).setOnClickListener(this);
        findViewById(R.id.menuitems).setOnClickListener(this);
        findViewById(R.id.searchview).setOnClickListener(this);
        findViewById(R.id.fadingactionbar).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id)
        {

            case R.id.drawer:
                startActivity(new Intent(getApplicationContext(),NavigationDrawerActivity.class));
                break;

            case R.id.homeback:
                startActivity(new Intent(getApplicationContext(),HomeBackActivity.class));
                break;

            case R.id.menuitems:
                startActivity(new Intent(getApplicationContext(),MenuItems.class));
                break;

            case R.id.searchview:
                startActivity(new Intent(getApplicationContext(),SearchViewActivity.class));
                break;

            case R.id.fadingactionbar:
                startActivity(new Intent(getApplicationContext(),ObservableScrollViewActivity.class));
                break;

        }
    }
}
