package app.android.message.message_box;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import app.android.message.adapter.ChatArrayAdapter;
import app.android.message.menu.R;
import app.android.message.model.MessageItemInMessageBox;

public class MessageBoxActivity extends Activity {
	private ChatArrayAdapter adapter;
	private ListView lv;
	private EditText editText;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_message_box);

		lv = (ListView) findViewById(R.id.list_message_box);

		adapter = new ChatArrayAdapter(getApplicationContext(), R.layout.list_item_message_box);

		

		//editText = (EditText) findViewById(R.id.edit_message);
		addItems();
		lv.setAdapter(adapter);
	}

	private void addItems() {
	    Intent intent = getIntent();
	    String message = intent.getStringExtra("message");
	    adapter.add(new MessageItemInMessageBox(true, message));
	    getActionBar().setTitle(intent.getStringExtra("friend_name")); 
	}
	
	/** Called when the user clicks the Send button */
	public void sendMessage(View view) {
		EditText editText = (EditText) findViewById(R.id.edit_message);
		adapter.add(new MessageItemInMessageBox(false, editText.getText().toString()));
		editText.setText("");
	}
}
