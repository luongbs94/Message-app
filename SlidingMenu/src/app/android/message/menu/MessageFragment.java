package app.android.message.menu;

import java.util.ArrayList;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import app.android.message.adapter.MessageListAdapter;
import app.android.message.message_box.MessageBoxActivity;
import app.android.message.model.MessageItemInList;
public class MessageFragment extends Fragment  {
	private ArrayList<MessageItemInList> data;
	ListView list;
	MessageListAdapter adapter;
	
	public MessageFragment(){}
	
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
        data = new ArrayList<MessageItemInList>();
    	data.add(new MessageItemInList("luong", "good morning", "06:00"));
    	data.add(new MessageItemInList("long", "good afternoon", "12:00"));
    	data.add(new MessageItemInList("hao", "hi", "12:00")); 
           
        adapter = new MessageListAdapter(this.getActivity(), data); 
        list = (ListView) getActivity().findViewById(R.id.list);  
        list.setAdapter(adapter);  
        
        list.setOnItemClickListener(new OnItemClickListener() {  
   
            @Override 
            public void onItemClick(AdapterView<?> parent, View view,  
                    int position, long id) {  
                Intent intent = new Intent(getActivity(), MessageBoxActivity.class);
                TextView tv1 = (TextView) view.findViewById(R.id.content);
                TextView tv2 = (TextView) view.findViewById(R.id.friend_name);
                
                String message = tv1.getText().toString();
                String friend_name = tv2.getText().toString();

                intent.putExtra("message", message);
                intent.putExtra("friend_name", friend_name);
          
                startActivity(intent);
            }  
        });            
    }  
}
