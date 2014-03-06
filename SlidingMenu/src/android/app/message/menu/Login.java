package android.app.message.menu;

import android.app.message.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Login extends Activity {

	public static final String USER_NAME="userName";
	public static final String MESSAGE="message";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sendMessage(View view){
		Intent intent =new Intent(this,MainActivity.class);
		startActivity(intent);		
	}
}
