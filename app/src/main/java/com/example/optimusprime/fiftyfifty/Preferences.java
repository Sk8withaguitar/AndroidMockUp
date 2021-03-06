package com.example.optimusprime.fiftyfifty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Preferences extends ActionBarActivity {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        ScrollView sv = new ScrollView(this);
        final LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        sv.addView(ll);

        // Creating The Buttons.
        Button b = new Button(this);
        Button backButton = new Button(this);

       // LinearLayout.LayoutParams OBJ = new LinearLayout.LayoutParams(120,60);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.FILL_PARENT);
        params.weight = (int) 1.0f;
        params.gravity= Gravity.RIGHT;
        backButton.setLayoutParams(params);


        backButton.setText("Back");
        b.setText("Choose your list of preferences");
        ll.addView(backButton);
        ll.addView(b);

        ///// CREATING THE YELP LOGO ///////

        ImageView image = new ImageView(this);
        LinearLayout.LayoutParams vp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);
        image.setLayoutParams(vp);
        image.setMaxHeight(50);
        image.setMaxWidth(50);
// other image settings
        image.setImageDrawable(getResources().getDrawable(R.drawable.yelplogo));
        ll.addView(image);
        ////////



                    // This is Creating the CheckBoxes Should Extract From the YELP API
        String [] arr = new String[5];
        arr[0] = "Bars";arr[1] = "Strip Clubs";arr[2] = "Restaurants"; arr[3] = "SuperMarkets";arr[4] = "Vegan Places";
        for(int i = 0; i < arr.length; i++)
        {
        CheckBox cb = new CheckBox(getApplicationContext());
        cb.setText(arr[i]);
        ll.addView(cb);
        }


        // This is the Code that will send the Activity back to the main Activity "Listener"
        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Intent goBackToMode1 = new Intent(this, MainActivity.class);
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        this.setContentView(sv);

    }
}