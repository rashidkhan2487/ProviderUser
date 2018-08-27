package com.example.rashid_test_user;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	 TextView resultView=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		resultView= (TextView) findViewById(R.id.res);

	}

	public void onClickDisplayNames(View view) {
		//
		ContentValues values = new ContentValues();
		values.put("name", "Name from second app");
		Uri uri = getContentResolver().insert(Uri.parse("content://com.rashid.example.myprovider/comments"), values);
		Toast.makeText(getBaseContext(), "New record inserted", Toast.LENGTH_LONG)
				.show();

	}



}
