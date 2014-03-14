package app.android.message.model;

public class HomeItem {
	private String name;
	private String status;
	private String time_arrival;
	
	public HomeItem(String name, String content, String time){
		this.name = name;
		status = content;
		time_arrival = time;
	}

	public String getName() {
		return name;
	}

	public void setFriend_name(String friend_name) {
		this.name = friend_name;
	}

	public String getMessage_content() {
		return status;
	}

	public void setMessage_content(String message_content) {
		this.status = message_content;
	}

	public String getTime_arrival() {
		return time_arrival;
	}

	public void setTime_arrival(String time_arrival) {
		this.time_arrival = time_arrival;
	}
	
	
}
