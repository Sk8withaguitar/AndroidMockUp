package com.example.optimusprime.fiftyfifty;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {
    FlyOutContainer root;

   // MenuItem menuButtons;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(0xfff00000);
       this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.activity_main,null);
        this.setContentView(root);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

    public void setActivityBackgroundColor(int color){
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

    public void toggleMenu (View v)
    {
        this.root.toggleMenu();
        if( (this.root.menuCurrentState == this.root.menuCurrentState.OPEN) || (this.root.menuCurrentState == root.menuCurrentState.OPENING) )
        {
           View b = findViewById(R.id.MenuButton); // THIS DID NOT FUCKING WORK ===^__^=====
           b.setVisibility(View.GONE);
        }

        else
        {
            setVisible(true);
            View b = findViewById(R.id.MenuButton);
            b.setVisibility(View.VISIBLE);

        }
    }
}