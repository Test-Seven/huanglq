package com.wasai.helloword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
	
	private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
        	@Override
        	public void onClick(View v){
        		//Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。
        		Intent i = new Intent(MainActivity.this , page1.class);
        		//启动
        		startActivity(i);
        	}
        });
        
        System.out.println("onCreate");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public void onStart(){
    	super.onStart();
    	System.out.println("onStart");
    }
    
    @Override
    public void onResume(){
    	super.onResume();
    	System.out.println("onResume");
    }
    
    @Override
    public void onPause(){
    	super.onPause();
    	System.out.println("onPause");
    }
    
    @Override
    public void onStop(){
    	super.onStop();
    	System.out.println("onStop");
    }
    
    @Override
    public void onRestart(){
    	super.onRestart();
    	System.out.println("onRestart");
    }
    
    @Override
    public void onDestroy(){
    	super.onDestroy();
    	System.out.println("onDestroy");
    }

}
