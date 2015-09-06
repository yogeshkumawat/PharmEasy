package com.example.pharmeasy;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.json.item.MainItem;
import com.json.item.Result;
import com.pharmeasy.Utils.Utils;
import com.pharmeasy.database.DataBaseManager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class SplashScreen extends Activity {

	private Context mContext;
	private ArrayList<Result> mResultList = new ArrayList<Result>();
	private DataBaseManager mDbManager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		mContext = this;
		
		// getDbInstance
		mDbManager = new DataBaseManager(mContext);
		
		new FetchDataTask().execute();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		return super.onOptionsItemSelected(item);
	}
	
	class FetchDataTask extends AsyncTask<Void, Void, Void> {

		@Override
		protected Void doInBackground(Void... arg0) {
			// TODO Auto-generated method stub
			ArrayList<MainItem> tmp = new ArrayList<MainItem>();
			String jsonString = null;
			try {
				if (Utils.isOnline(mContext)) {
					ByteArrayOutputStream baos = Utils.readBytes(Utils.BASE_URL);
					jsonString = baos.toString();
					Log.v("yogesh", "Json is: "+jsonString);
				}
				try {
					JSONObject root = new JSONObject(jsonString);
					JSONArray resultArray = root.getJSONArray("result");
					Log.v("yogesh", "Length of result array is: "+resultArray.length());
					for (int i = 0; i < resultArray.length(); i++) {
						JSONObject item = resultArray.getJSONObject(i);
						Result result = new Result();
						
						String label = item.getString("label");
						String id = item.getString("id");
						String type = item.getString("type");
						String manufacturer = item.getString("manufacturer");
						String mrp = item.getString("mrp");
						String available = item.getString("available");
						
						result.setLabel(label);
						result.setId(Integer.parseInt(id));
						result.setType(type);
						result.setManufacturer(manufacturer);
						result.setMrp(Double.parseDouble(mrp));
						result.setAvailable(Boolean.parseBoolean(available));
						
						mResultList.add(result);
						
						
					}
					if(mResultList.size() > 0)
						mDbManager.clearAll();
					
					mDbManager.insertResults(mResultList);
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (NullPointerException nue) {
				nue.printStackTrace();
			}
			return null;
		}
		
		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			
			//Start the main Activity
			Intent intent  = new Intent(mContext, MainActivity.class);
			startActivity(intent);
			
			//Finish Splash Screen
			finish();
		}
		
	}
}
