package com.sample.settingslocale;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.sample.settingslocale.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        inflateToolbar(binding.toolbarLayout.toolbar);
        binding.toolbarLayout.toolbar.inflateMenu(R.menu.menu);
        binding.toolbarLayout.toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.settings:
                        startActivity(new Intent(MainActivity.this, Settings.class));
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
