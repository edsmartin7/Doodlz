package com.example.emartin.doodlz;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//SKIPS
//p222 adding a menu
//p223 putting DoodleFragment into the relative layout in mainxml / fragment's id
//p224 add a view named colorView to gridlayout (attributes on p 226)
/*
LINKS
http://developer.android.com/guide/topics/ui/menus.html
http://developer.android.com/guide/topics/resources/menu-resource.html
http://developer.android.com/design/patterns/swipe-views.html
http://developer.android.com/guide/topics/sensors/sensors_motion.html
*/


//Parent Activity for the app Fragments
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int screenSize =
                getResources().getConfiguration().screenLayout &
                        Configuration.SCREENLAYOUT_SIZE_MASK;

        if(screenSize == Configuration.SCREENLAYOUT_SIZE_XLARGE)
            setRequestedOrientation(
                    ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        else
            setRequestedOrientation(
                    ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

}
