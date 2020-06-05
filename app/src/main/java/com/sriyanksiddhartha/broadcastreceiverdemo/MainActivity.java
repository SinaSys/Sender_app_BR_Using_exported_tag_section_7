package com.sriyanksiddhartha.broadcastreceiverdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 		Author: Sriyank Siddhartha
 *
 * 		Module 6: Enhancing App Security with BroadcastReceiver
 *
 * 			"AFTER" project
 * */
public class MainActivity extends AppCompatActivity {

	private static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void sendBroadcast(View view) {

		Intent intent = new Intent("my.custom.action.name");
		sendBroadcast(intent);
	}
}
