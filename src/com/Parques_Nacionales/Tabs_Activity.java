package com.Parques_Nacionales;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class Tabs_Activity extends ActionBarActivity {
	private float primerX;

	protected void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_tabs);
        
        TabHost TabHost1 = (TabHost) findViewById(R.id.tabhost);
        TabHost1.setup();
        
        //Pesta–a de Info  
        TabSpec spec1 = TabHost1.newTabSpec("tab_info");
        spec1.setIndicator("", getResources().getDrawable(R.drawable.tabinfo));
        spec1.setContent(R.id.Info);
        TabHost1.addTab(spec1);
               
        //Pesta–a de Fauna  
        TabSpec spec2 = TabHost1.newTabSpec("tab_fauna");
        spec2.setIndicator("", getResources().getDrawable(R.drawable.tabfauna));
        spec2.setContent(R.id.Fauna);
        TabHost1.addTab(spec2);
        
        //Pesta–a de Flora  
        TabSpec spec3 = TabHost1.newTabSpec("tab_flora");
        spec3.setIndicator("", getResources().getDrawable(R.drawable.tabflora));
        spec3.setContent(R.id.Flora);
        TabHost1.addTab(spec3);
                
        //Pesta–a de Otros  
        TabSpec spec4 = TabHost1.newTabSpec("tab_otros");
        spec4.setIndicator("", getResources().getDrawable(R.drawable.tabotros));
        spec4.setContent(R.id.Otros);
        TabHost1.addTab(spec4);
        
	}
	
	public boolean onTouchEvent(MotionEvent touchevent) {
    	
    	switch (touchevent.getAction()) {
    		
    		//Se activa al tocar la pantalla
    		case MotionEvent.ACTION_DOWN: {
    			primerX = touchevent.getX();
            break;
    		}
       
    		//Se activa al dejar de tocar la pantalla
    		case MotionEvent.ACTION_UP: {

    			float actualX = touchevent.getX();
			
    			//Si va de izquierda a derecha
    			if (primerX < actualX) {
    				switchTabs(true);
    			}
           
    			//Si va de derecha a izquierda
    			if (primerX > actualX) {
    				switchTabs(false);
    			}
            break;
    		}
        }
        return false;
    }
    
    public void switchTabs(boolean dir) {
    	
    	TabHost TabHost1 = (TabHost) findViewById(R.id.tabhost);
    	
    	//Mueve hacia la izquierda
    	if (dir) {
            if (TabHost1.getCurrentTab() == 0) {
                TabHost1.setCurrentTab(TabHost1.getTabWidget().getTabCount() - 1);
            }
            else {
            	TabHost1.setCurrentTab(TabHost1.getCurrentTab() - 1);
            }
        }
        //Mueve hacia la derecha
    	else {   
        	if (TabHost1.getCurrentTab() != (TabHost1.getTabWidget().getTabCount() - 1)) {
            	TabHost1.setCurrentTab(TabHost1.getCurrentTab() + 1);
        	}
            else {
            	TabHost1.setCurrentTab(0);
            }
        }
    }
    
}
