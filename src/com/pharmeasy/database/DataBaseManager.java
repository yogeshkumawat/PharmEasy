package com.pharmeasy.database;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.json.item.Result;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap.CompressFormat;
import android.util.Log;

public class DataBaseManager extends SQLiteOpenHelper{

	private static final int DATABASE_VERSION = 3;
	
    // Database Name
    private static final String DATABASE_NAME = "Pharmdb";
 
    // tables name
    private static final String TABLE_MEDICINE = "medicine";
 
    // Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_LABEL = "label";
    private static final String KEY_TYPE = "type";
    private static final String KEY_MANUFACTURER = "manufacturer";
    private static final String KEY_MRP= "mrp";
    private static final String KEY_AVAILABLE = "available";
    
	
	public DataBaseManager(Context context) {
		// TODO Auto-generated constructor stub
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
		//Create tables query
		String CREATE_TABLE = "CREATE TABLE " + TABLE_MEDICINE + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_LABEL + " TEXT,"
                + KEY_TYPE + " TEXT," + KEY_MANUFACTURER +" TEXT,"
                + KEY_MRP + " DOUBLE," + KEY_AVAILABLE + " TEXT)";
		
        db.execSQL(CREATE_TABLE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEDICINE);        // Create tables again
        onCreate(db);
		
	}
	
	public void insertResults(ArrayList<Result> mResult) {
		SQLiteDatabase db = this.getWritableDatabase();
		for (Result result : mResult) {
			ContentValues values = new ContentValues();
			values.put(KEY_ID, result.getId());
			values.put(KEY_LABEL, result.getLabel());
			values.put(KEY_TYPE, result.getType());
			values.put(KEY_MANUFACTURER, result.getManufacturer());
			values.put(KEY_MRP, result.getMrp());
			values.put(KEY_AVAILABLE, result.getAvailable().toString());

			// Inserting Rown
			long insert = db.insert(TABLE_MEDICINE, null, values);
		}
	}
	public void clearAll() {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_MEDICINE, null, null);
	}
	
	public ArrayList<Result> getAllResult() {
		ArrayList<Result> mResultList = new ArrayList<Result>();
		String selectQuery = "SELECT  * FROM " + TABLE_MEDICINE;
		 
	    Cursor cursor = null;
	    SQLiteDatabase db = null;
		try {
			db = this.getWritableDatabase();
			cursor = db.rawQuery(selectQuery, null);
 
			// looping through all rows and adding to list
			if (cursor.moveToFirst() && cursor.getCount() > 0) {
			    do {
			        Result result = new Result();
			        result.setId(cursor.getInt(cursor.getColumnIndex(KEY_ID)));
			        result.setLabel(cursor.getString(cursor.getColumnIndex(KEY_LABEL)));
			        result.setType(cursor.getString(cursor.getColumnIndex(KEY_TYPE)));
			        result.setManufacturer(cursor.getString(cursor.getColumnIndex(KEY_MANUFACTURER)));
			        result.setMrp(cursor.getDouble(cursor.getColumnIndex(KEY_MRP)));
			        result.setAvailable(Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex(KEY_AVAILABLE))));
			        mResultList.add(result);
			    } while (cursor.moveToNext());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(cursor != null)
				cursor.close();
			
		}
	 
	    return mResultList;
	}
	

}
