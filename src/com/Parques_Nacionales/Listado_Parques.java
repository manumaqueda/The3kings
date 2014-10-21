package com.Parques_Nacionales;

import com.Parques_Nacionales.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;


//import android.os.Build;

public class Listado_Parques extends ListActivity{

	TextView content;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patada_en_su_culo);
        
         
        content = (TextView)findViewById(R.id.output);
        
        //listView = (ListView) findViewById(R.id.list);
        String[] values = new String[] { "AigüesTortes i Estany de Sant Maurice", "Archipielago de la Cabrera", "Cabañeros",
          "Doñana", "Garajonay", "Islas Atlánticas", "Montfragüe", "Ordesa y Monte Perdido", "Picos de Europa", "Sierra de Guadarrama", 
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
       
           Intent intent = new Intent(this, Tabs_Activity.class);
   		   String message = itemValue;
   		   String EXTRA_MESSAGE = "Este es un mensaje extra";
   		   intent.putExtra(EXTRA_MESSAGE, message);
   		   startActivity(intent);

           
  }
}