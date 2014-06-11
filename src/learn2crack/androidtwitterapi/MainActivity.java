package learn2crack.androidtwitterapi;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;

public class MainActivity extends Activity {
	
	SharedPreferences pref;
	   
    private static String CONSUMER_KEY = "Your API Key here";
    private static String CONSUMER_SECRET = "Your API Secret here";
  

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        pref = getPreferences(0);
        SharedPreferences.Editor edit = pref.edit();
        edit.putString("CONSUMER_KEY", CONSUMER_KEY);
        edit.putString("CONSUMER_SECRET", CONSUMER_SECRET);
        edit.commit();  

		Fragment login = new LoginFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();	              
        ft.replace(R.id.content_frame, login);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();
	}


}
