package com.herokuapp.tastyapp.tasty;

import android.content.Context;
import android.net.Uri;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseObject;


public class MainActivity
        extends
        AppCompatActivity
        implements
        ContainerFragment.OnContainerFragmentInteractionListener,
        FlavorListFragment.OnFlavorListInteractionListener {

    private boolean allowGlobalData;
    private boolean showGlobalData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        //TODO Configure the search info and add any event listeners

        MenuItem dataSwitch = menu.findItem(R.id.data_switch);
        dataSwitch.setActionView(R.layout.switch_layout);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Context mContext = getApplicationContext();
        CharSequence mText = "onContainerInteraction called from main activity";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(mContext, mText, duration);
        toast.show();
    }

    @Override
    public void onFlavorListInteraction(String id) {
        Context mContext = getApplicationContext();
        CharSequence mText = "onFlavorListInteraction called from main activity";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(mContext, mText, duration);
        toast.show();
    }
}
