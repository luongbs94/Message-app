package app.android.message.adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import app.android.message.menu.R;
import app.android.message.model.MessageItemInList;

public class HomeListAdapter extends BaseAdapter {
	
	private ArrayList<MessageItemInList> data;
	private Activity activity;
	
	public HomeListAdapter(Activity activity, ArrayList<MessageItemInList> data){
		this.activity = activity;
		this.data = data ;
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		if(view ==null){
			LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.home_status, null);
		}
		
		TextView name = (TextView) view.findViewById(R.id.friend_name1);
	    TextView content = (TextView) view.findViewById(R.id.content1);
	    TextView time = (TextView) view.findViewById(R.id.time_arrival1);
	
        MessageItemInList mess = data.get(position);
 
        // Setting all values in list view
        name.setText(mess.getFriend_name());
        content.setText(mess.getMessage_content());
        time.setText(mess.getTime_arrival());
        return view;
	}
	

}
