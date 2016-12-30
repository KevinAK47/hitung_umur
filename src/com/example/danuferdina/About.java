package com.example.danuferdina;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class About extends Activity {
Button a;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
	setContentView(R.layout.main2);
	a = (Button)findViewById(R.id.btnback);
	a.setOnClickListener(new View.OnClickListener() {
	
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent panggil = new Intent(getApplicationContext(), HitungUmurActivity.class);
			startActivity(panggil);
			finish();
		}
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}

}
