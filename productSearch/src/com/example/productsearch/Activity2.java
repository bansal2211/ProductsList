package com.example.productsearch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends Activity implements OnClickListener {
	Button click;
	TextView hello;
	EditText editBox;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act2);
		click = (Button) findViewById(R.id.click);
		hello = (TextView) findViewById(R.id.helloTextView);
		editBox = (EditText) findViewById(R.id.editBox);
		click.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();
		switch(id){
		case R.id.click:
			String text = editBox.getText().toString();
			Intent i = new Intent(this, Activity1.class);
			i.putExtra(CommonConstants.Key_Name, text);
			startActivityForResult(i, 1);
			break;
		}
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent i) {
		// TODO Auto-generated method stub
		if(resultCode == Activity.RESULT_OK){
			String value = i.getStringExtra("KEY");
			hello.setText(value);
		}
	}
	
	
}
