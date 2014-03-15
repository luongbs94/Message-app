package app.android.message.menu;

import java.util.ArrayList;

import app.android.message.adapter.HomeListAdapter;
import app.android.message.menu.R;
import app.android.message.model.MessageItem;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class HomeFragment extends Fragment {	
	
	private ListView list;
	private ArrayList<MessageItem> data;
	private HomeListAdapter adapter;
	
	

	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        return rootView;
    }

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		data = new ArrayList<MessageItem>();
		data.add(new MessageItem("luong", "Hello. Today I am happy", "12:00"));
		data.add(new MessageItem("long", "good afternoon. Today I am worry", "12:00"));
    	data.add(new MessageItem("hao", "hi. Have a sweet dream ", "12:00")); 
		
		adapter = new HomeListAdapter(this.getActivity(), data);
		list = (ListView) getActivity().findViewById(R.id.listview1);
		list.setAdapter(adapter);
		
	}
}
