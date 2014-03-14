package app.android.message.menu;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class AddFriend extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.add_friend);
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }

   public void onClickAddName(View view) {
      // Add a new student record
      ContentValues values = new ContentValues();

      values.put(FriendProvider.NAME, 
      ((EditText)findViewById(R.id.txtName)).getText().toString());
      
      values.put(FriendProvider.GRADE, 
      ((EditText)findViewById(R.id.txtGrade)).getText().toString());

      Uri uri = getContentResolver().insert(
      FriendProvider.CONTENT_URI, values);
      
      Intent intent =new Intent(this,FindPeopleFragment.class);
		startActivity(intent);	
		this.finish();
   }

} 


