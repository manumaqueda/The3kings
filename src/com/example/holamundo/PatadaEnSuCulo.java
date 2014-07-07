package com.example.holamundo;

import android.app.ListActivity;

import android.widget.*;

//import android.support.v7.app.ActionBar;

import android.os.Bundle;

import android.view.View;

//import android.os.Build;

public class PatadaEnSuCulo extends ListActivity{

	TextView content;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patada_en_su_culo);
        
        
        content = (TextView)findViewById(R.id.output);
        
        //listView = (ListView) findViewById(R.id.list);
        String[] values = new String[] { "Aig�esTortes i Estany de Sant Maurice", "Archipielago de la Cabrera", "Caba�eros",
          "Do�ana", "Garajonay", "Islas Atl�nticas", "Montfrag�e", "Ordesa y Monte Perdido", "Picos de Europa", "Sierra de Guadarrama", 
          "Sierra Nevada", "Tablas de Daimiel", "Teide", "Timanfaya"};

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);


        // Assign adapter to List
        setListAdapter(adapter); 
   }

    
  @Override
  protected void onListItemClick(ListView l, View v, int position, long id) {
        
        super.onListItemClick(l, v, position, id);

           // ListView Clicked item index
           int itemPosition     = position;
           
           // ListView Clicked item value
           String  itemValue    = (String) l.getItemAtPosition(position);
              
           content.setText("Click : \n  Position :"+itemPosition+"  \n  ListItem : " +itemValue);
           
  }
}

	


