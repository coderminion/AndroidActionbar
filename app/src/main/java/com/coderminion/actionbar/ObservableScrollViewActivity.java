package com.coderminion.actionbar;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;


import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;

import java.util.ArrayList;


public class ObservableScrollViewActivity extends AppCompatActivity  implements ObservableScrollViewCallbacks {

    ImageView selena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observable_scroll_view);

        ObservableListView listView = (ObservableListView) findViewById(R.id.list);
        listView.setScrollViewCallbacks(this);


        // Add these codes after ListView initialization
        ArrayList<String> items = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            items.add("Item " + i);
        }
        listView.setAdapter(new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, items));
    }

    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {

    }

    @Override
    public void onDownMotionEvent() {

    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {
        ActionBar ab = getSupportActionBar();

        if (scrollState == ScrollState.UP) {
            if (ab.isShowing()) {
                ab.hide();
            }
        } else if (scrollState == ScrollState.DOWN) {
            if (!ab.isShowing()) {
                ab.show();
            }
        }
    }
}
