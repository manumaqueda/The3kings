package com.Parques_Nacionales;

import com.Parques_Nacionales.Tabs_Activity.TabsListener;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTabs extends Fragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		switch (TabsListener.pos){
			case 0:
				View tabcontent=inflater.inflate(R.layout.fragment_info, container, false);
				return tabcontent;
			case 1:
				tabcontent=inflater.inflate(R.layout.fragment_fauna, container, false);
				System.out.println(TabsListener.pos);
				return tabcontent;
			case 2:
				tabcontent=inflater.inflate(R.layout.fragment_flora, container, false);
				return tabcontent;
			case 3:
				tabcontent=inflater.inflate(R.layout.fragment_otros, container, false);
				return tabcontent;
			default:
				tabcontent=inflater.inflate(R.layout.fragment_info, container, false);
				System.out.println(TabsListener.pos);
				return tabcontent;
		} 
	}
	
}