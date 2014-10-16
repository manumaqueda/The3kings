package com.Parques_Nacionales;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOtros extends Fragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	       
		View tabcontent=inflater.inflate(R.layout.fragment_otros, container, false);
		return tabcontent;
		
	    }
	
}