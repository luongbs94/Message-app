package app.android.message.menu;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import app.android.message.adapter.MessageListAdapter;
import app.android.message.model.MessageItem;

public class MessageTabFragment extends Fragment  {
	private ArrayList<MessageItem> data;
	ListView list;
	MessageListAdapter adapter;
	
	public MessageTabFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_message_tab, container, false);        
        return rootView;
    }
    @Override 
    public void onActivityCreated(Bundle savedInstanceState) {  
        super.onActivityCreated(savedInstanceState);  
           
        //add data to ListView  
        data = new ArrayList<MessageItem>();
    	data.add(new MessageItem("luong", "good morning", "06:00"));
    	data.add(new MessageItem("long", "good afternoon", "12:00"));
    	data.add(new MessageItem("hao", "hi", "12:00")); 
           
        adapter = new MessageListAdapter(this.getActivity(), data); 
        list = (ListView) getActivity().findViewById(R.id.list);  
        list.setAdapter(adapter);  
        
        list.setOnItemClickListener(new OnItemClickListener() {  
   
            @Override 
            public void onItemClick(AdapterView<?> parent, View view,  
                    int position, long id) {  
            	//do some things
            }  
        });            
    }  
}
