package app.android.message.adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import app.android.message.menu.R;
import app.android.message.model.HomeItem;
import app.android.message.model.MessageItem;

public class HomeAdapter extends BaseAdapter{
	private ArrayList<HomeItem> data;
	private Activity activity;
	public HomeAdapter(Activity activity, ArrayList<HomeItem> data){
		this.activity = activity;
		this.data = data;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}
	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}
	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}
	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		if(arg1 == null){
			
			LayoutInflater inflater = (LayoutInflater)activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			arg1 = inflater.inflate(R.layout.home_adapter, null);
		}
		TextView name = (TextView)arg1.findViewById(R.id.tvten);
        TextView content = (TextView)arg1.findViewById(R.id.tvstatus);
        TextView time = (TextView)arg1.findViewById(R.id.tvthoigian);
        HomeItem homeitem = data.get(arg0);
        name.setText(homeitem.getName());
        content.setText(homeitem.getMessage_content());
        time.setText(homeitem.getTime_arrival());
		return arg1;
	}
}