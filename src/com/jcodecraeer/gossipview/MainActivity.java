package com.jcodecraeer.gossipview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GossipView gossipView = (GossipView)findViewById(R.id.gossipview);
		String [] strs = {"安卓","微软","苹果","谷歌","百度","腾讯"} ;
				 
		final List<GossipItem> items =new ArrayList<GossipItem>();
		for(int i = 0; i < strs.length; i++) { 
			GossipItem item = new GossipItem(strs[i],3);
			items.add(item);
		}
		gossipView.setItems(items);
		gossipView.setNumber(3);
		gossipView.setOnPieceClickListener( new GossipView.OnPieceClickListener(){
			@Override
			public void onPieceClick(int index) {
			  if(index != -1 &&  index != -2) {
				  Toast.makeText(MainActivity.this, "你选择了" + items.get(index).getTitle(), 300).show();
			  }
		    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
