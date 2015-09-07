package com.example.pharmeasy;

import java.util.ArrayList;

import com.json.item.Result;
import com.pharmeasy.database.DataBaseManager;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private ViewPager viewPager;
	private DataBaseManager mDbManager;
	private LayoutInflater mInflater;
	private Context mContext;
	private ArrayList<Result> mResultList = new ArrayList<Result>();
	private int PageCount = 0;
	ArrayList<Drawable> mDummyImageList = new ArrayList<Drawable>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mContext = this;
		init();
		
	}
	
	public void init() {
		
		mInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		//Initiate DataBaseManager Instance
		mDbManager = new DataBaseManager(mContext);
		
		//Fetch all the medicines from DB
		mResultList = mDbManager.getAllResult();
		
		//Number of medicines
		PageCount = mResultList.size();
		
		//Dummy Images
		collectImage();
		
		//View Pager
		viewPager = (ViewPager) findViewById(R.id.viewPager);
		viewPager.setAdapter(new MyPageAdapter());
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
		
		return super.onOptionsItemSelected(item);
	}
	
	class MyPageAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			
			//Number of medicines
			return PageCount;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			// TODO Auto-generated method stub
			
			//Inflate the Slide show view
			View page = mInflater.inflate(R.layout.page, null);
			
			//Medicnies details views
			TextView tv_label = (TextView) page.findViewById(R.id.label);
			tv_label.setText("Label : "+mResultList.get(position).getLabel());
			
			TextView tv_type = (TextView) page.findViewById(R.id.type);
			tv_type.setText("Type : "+mResultList.get(position).getType());
			
			TextView tv_manufacturer = (TextView) page.findViewById(R.id.manufacturer);
			tv_manufacturer.setText("Manufacturer : "+mResultList.get(position).getManufacturer());
			
			TextView tv_mrp = (TextView) page.findViewById(R.id.mrp);
			tv_mrp.setText("MRP : "+mResultList.get(position).getMrp());
			
			TextView tv_available = (TextView) page.findViewById(R.id.available);
			tv_available.setText("Available : "+mResultList.get(position).getAvailable());
			
			ImageView img = (ImageView) page.findViewById(R.id.imageView1);
			
			img.setImageDrawable(mDummyImageList.get(position%4));
			
			((ViewPager) container).addView(page, 0);
			return page;
		}
		
		@Override
	    public void destroyItem(ViewGroup container, int position, Object object) {
	      ((ViewPager) container).removeView((View) object);
	      object=null;
	    }

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// TODO Auto-generated method stub
			
			//See if object from instantiateItem is related to the given view
			//required by API
			return arg0==(View)arg1;
		}
		
	}
	
	@SuppressWarnings("deprecation")
	private void collectImage() {
		mDummyImageList.add(mContext.getResources().getDrawable(R.drawable.dummy1));
		mDummyImageList.add(mContext.getResources().getDrawable(R.drawable.dummy2));
		mDummyImageList.add(mContext.getResources().getDrawable(R.drawable.dummy3));
		mDummyImageList.add(mContext.getResources().getDrawable(R.drawable.dummy4));
	}
}
