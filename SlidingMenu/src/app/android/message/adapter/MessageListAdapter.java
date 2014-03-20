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

public class MessageListAdapter extends BaseAdapter {
	private ArrayList<MessageItemInList> data;
	private Activity activity;

	public MessageListAdapter(Activity activity, ArrayList<MessageItemInList> data){
		this.activity = activity;
		this.data = data;
	}
	
    public int getCount() {
        return data.size();
    }
 
    public Object getItem(int position) {
        return position;
    }
 
    public long getItemId(int position) {
        return position;
    }
 
    public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.list_row_message, null);
        }
 
        TextView name = (TextView)convertView.findViewById(R.id.friend_name);
        TextView content = (TextView)convertView.findViewById(R.id.content);
        TextView time = (TextView)convertView.findViewById(R.id.time_arrival);
 
        MessageItemInList mess = data.get(position);
 
        // Setting all values in list view
        name.setText(mess.getFriend_name());
        content.setText(mess.getMessage_content());
        time.setText(mess.getTime_arrival());
        return convertView;
    }
}	
