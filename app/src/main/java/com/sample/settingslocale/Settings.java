/*
 * Copyright (c) 2018, Deepak Goyal under Apache License.
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 */

package com.sample.settingslocale;

import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.sample.settingslocale.databinding.ActivitySettingsBinding;

public class Settings extends BaseActivity implements SharedPreferences.OnSharedPreferenceChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySettingsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_settings);
        inflateToolbar(binding.toolbarLayout.toolbar);

        // show preferences
        getFragmentManager().beginTransaction().replace(R.id.container, new SettingsPreference()).commit();
    }
}
