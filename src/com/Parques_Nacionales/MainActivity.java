package com.Parques_Nacionales;
import com.Parques_Nacionales.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
//import android.support.v7.app.ActionBar;
//import android.os.Build;

public class MainActivity extends ActionBarActivity {
	
	
	public final static String EXTRA_MESSAGE = "com.HolaMundo.PŽgale una patada en el culo a Felipe";
	/** Called when the user clicks the Send button */
	public void pasaAListado(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, PatadaEnSuCulo.class);
		EditText editText = (EditText) findViewById(R.id.editText1);
	    String message = editText.getText().toString();
	    intent.putExtra(EXTRA_MESSAGE, message);
	    System.out.print("Pasamos a la p‡gina de listados con este mensaje");
	    startActivity(intent);
	    // Main Activity MAnu 
	    System.out.println("Perra vieja");
	} 
	public void pasaAMapa(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, Mapa_Parques.class);
		EditText editText = (EditText) findViewById(R.id.editText1);
	    String message = editText.getText().toString();
	    System.out.println("Cera");
	    intent.putExtra(EXTRA_MESSAGE, message);
	    System.out.print("Pasamos a la p‡gina de mapa con este mensaje");
	    startActivity(intent);
	    System.out.println("Este comentario es muy importante.");
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        System.out.println("Hemos entrado en la actividad primera");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // asunc you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
