package com.jcodecraeer.gossipview;

public class GossipItem  {	
	private String title;
	private int index;
	public GossipItem (String title,int index){
		this.title =title;
		this.index = index;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
}
