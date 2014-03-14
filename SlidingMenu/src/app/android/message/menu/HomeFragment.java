package app.android.message.menu;

import java.util.ArrayList;

import app.android.message.adapter.HomeAdapter;
import app.android.message.adapter.MessageListAdapter;
import app.android.message.menu.R;
import app.android.message.model.HomeItem;
import app.android.message.model.MessageItem;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class HomeFragment extends Fragment {	
	private ArrayList<HomeItem> data;
	private ListView list ;
	private HomeAdapter adap;
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
	           
	        //add data to ListView  
	        data = new ArrayList<HomeItem>();
	        data.add(new HomeItem("luong", "good morning", "06:00"));
	    	data.add(new HomeItem("long", "good afternoon", "12:00"));
	    	data.add(new HomeItem("hao", "hi", "12:00")); 
	    	adap = new HomeAdapter(this.getActivity(), data);
	    	list = (ListView) getActivity().findViewById(R.id.lvpost);
	    	list.setAdapter(adap);
	    }  
}
