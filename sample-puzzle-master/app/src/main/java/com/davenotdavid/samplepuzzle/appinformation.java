package com.davenotdavid.samplepuzzle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class appinformation extends Activity {

    TextView appInformationScroll;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.appinformation);

        appInformationScroll = (TextView) findViewById(R.id.app_info_scroll);

        //loadText();

        String text = "Spend time in this amazing sliding puzzle game. \n" +
                "\n" +
                "How to play\n" +
                "------------------\n" +
                "To solve the puzzle, you must move the blocks and place them in the correct order.\n\n" +
                "To do this, you can move the photos one by one until all the blocks are sorted in the correct order.\n" +
                "\n" +
                "You can move one or more pieces at a time to fill an empty block.\n" +
                "\n" +
                " You may need to move already aligned pieces to be able to \"jump\" one of the following blocks. If you do, remember the route and reorder it back to its original location.\n" +
                "\n" +
                "\n" +
                "This app is powered by PUZZLE_TEAM\n\n\n";
        appInformationScroll.setText(text);
        appInformationScroll.setMovementMethod(new ScrollingMovementMethod());


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.9),(int)(height*.7));
    }

    private void loadText(){


    }
}
