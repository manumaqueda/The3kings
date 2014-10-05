package com.example.holamundo;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.os.Build;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
//import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;/*
import java.it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouch.OnImageViewTouchDoubleTapListener;
import it.sephiroth.android.library.imagezoom.ImageViewTouch.OnImageViewTouchSingleTapListener;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase.DisplayType;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase.OnDrawableChangeListener;
import it.sephiroth.android.library.imagezoom.test.utils.DecodeUtils;*/
import android.app.Activity;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore.Images;
import android.util.Log;

import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Mapa_Parques extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mapa__parques);
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Buenos dias
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mapa__parques, menu);
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

	public void rotaMapa(View view) {
		ImageView image = (ImageView) findViewById(R.id.mapaParques);
		Bitmap bMap =  BitmapFactory.decodeResource(getResources(), R.drawable.parques_ministerio);
		Matrix mat = new Matrix();
		mat.postRotate(90);
		Bitmap bMapRotate = Bitmap.createBitmap(bMap, 0, 0,bMap.getWidth(),bMap.getHeight(), mat, true);
		image.setImageBitmap(bMapRotate);

	}
	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		public ImageView image;
		public Bitmap bMap;
		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_mapa__parques,
					container, false);
			image = (ImageView)rootView.findViewById(R.id.mapaParques);
	        bMap = BitmapFactory.decodeResource(getResources(), R.drawable.parques_ministerio);
	        Bitmap bMapScaled = Bitmap.createScaledBitmap(bMap,  bMap.getWidth(), bMap.getHeight(),true);
	        System.out.println(image);
	        image.setImageBitmap(bMapScaled);
			return rootView;
		}
		
	}
	
	

}
