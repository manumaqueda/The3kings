package com.Parques_Nacionales;

import com.Parques_Nacionales.Tabs_Activity.TabsListener;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentInfo extends Fragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View tabcontent=inflater.inflate(R.layout.fragment_info, container, false); 
		
		switch (TabsListener.pos){
			case '0':
				tabcontent=inflater.inflate(R.layout.fragment_info, container, false);
			case '1':
				tabcontent=inflater.inflate(R.layout.fragment_fauna, container, false);
			case '2':
				tabcontent=inflater.inflate(R.layout.fragment_flora, container, false);
			case '3':
				tabcontent=inflater.inflate(R.layout.fragment_otros, container, false);
		} 
		return tabcontent;
	}
	
}