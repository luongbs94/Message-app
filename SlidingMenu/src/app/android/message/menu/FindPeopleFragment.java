package app.android.message.menu;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FindPeopleFragment extends ListActivity {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_message_tab, container, false);
         
        return rootView;
	}
	
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    String URL = "content://list.friend.provider/students";
    Uri students = Uri.parse(URL);
    Cursor c = managedQuery(students, null, null, null, "name");
    
    ArrayList<String> list = new ArrayList<String>();
    list.add("ADD");
    if (c.moveToFirst()) {
       do{
    	 if (c.getString(c.getColumnIndex( FriendProvider.NAME)).length()!=0)
    
    		 list.add(c.getString(c.getColumnIndex( FriendProvider.NAME)));
    	 
       } while (c.moveToNext());
    }
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        R.layout.fragment_find_people, R.id.label, list);
    
    setListAdapter(adapter);
  }

  @Override
  protected void onListItemClick(ListView l, View v, int position, long id) {
	if (position == 0) 
	{
		Intent intent =new Intent(this,AddFriend.class);
		startActivity(intent);	
		this.finish();
	}
	else
	{
		   String item = (String) getListAdapter().getItem(position);
		    Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	}
  }
} 
