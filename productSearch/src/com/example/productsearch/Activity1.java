package com.example.productsearch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act1);
		TextView tv = (TextView) findViewById(R.id.act1TextView);
		Intent receivedIntent = getIntent();
		String text = receivedIntent.getStringExtra(CommonConstants.Key_Name);
		tv.setText(text);
		Button submit = (Button) findViewById(R.id.submit);
		submit.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.submit:
			EditText editBox = (EditText) findViewById(R.id.act1EditBox);
			String text = editBox.getText().toString();
			Intent i = new Intent();
			i.putExtra("KEY", text);
			setResult(RESULT_OK, i);
			finish();
			break;
		}
		
	}

}
