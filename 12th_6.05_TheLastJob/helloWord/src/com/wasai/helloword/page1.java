package com.wasai.helloword;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page1 extends Activity {
	
	private Button btnClose;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page1);
		
		btnClose = (Button) findViewById(R.id.btnClose);
		btnClose.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
	
	
	
}
