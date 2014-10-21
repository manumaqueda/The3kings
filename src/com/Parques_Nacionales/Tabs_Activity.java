package com.Parques_Nacionales;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Tabs_Activity extends ActionBarActivity {
    //Manu Guapo 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabs_activity);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		//Crear la Pesta–a de Info
		Tab tab1=actionBar.newTab();
        tab1.setText("Info");
        tab1.setTabListener(new TabsListener(this, Fragment.class));
        actionBar.addTab(tab1);
        
        //Crear la Pesta–a de Fauna
      	Tab tab2=actionBar.newTab();
        tab2.setText("Fauna");
        tab2.setTabListener(new TabsListener(this, FragmentFauna.class));
        actionBar.addTab(tab2);
              
        //Crear la Pesta–a de Flora
        Tab tab3=actionBar.newTab();
        tab3.setText("Flora");
        tab3.setTabListener(new TabsListener(this, FragmentFlora.class));
        actionBar.addTab(tab3);
              
        //Crear la Pesta–a de Otros
        Tab tab4=actionBar.newTab();
        tab4.setText("Otros");
        tab4.setTabListener(new TabsListener(this, FragmentOtros.class));
        actionBar.addTab(tab4);
	}

	protected class TabsListener implements ActionBar.TabListener{
		
		private Fragment fragment;
		
		public <T> TabsListener (Activity activity, Class<T> cls){
			fragment= Fragment.instantiate(activity, cls.getName());
		}
		
		@Override
		public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
			arg1.replace(android.R.id.content, fragment);	
		}

		@Override
		public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
			arg1.replace(android.R.id.content, fragment);	
		}

		@Override
		public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
			arg1.remove(fragment);
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tabs_, menu);
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
