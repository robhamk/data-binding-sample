package com.sys1yagi.databindingsample.activities;

import com.sys1yagi.databindingsample.R;
import com.sys1yagi.databindingsample.databinding.ActivitySimpleBinding;
import com.sys1yagi.databindingsample.models.User;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SimpleBindingActivity extends AppCompatActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, SimpleBindingActivity.class);
    }

    ActivitySimpleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil
                .setContentView(this, R.layout.activity_simple);
        User user = new User();
        user.setName("taro");
        user.setDescription("Yes. I don't have a I/O ticket.");

        binding.setUser(user);
    }

}
