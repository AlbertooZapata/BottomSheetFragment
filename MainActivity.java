package com.materiales.recursos.bottonsheets;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private BottomSheetBehavior mBottomSheetBehavior;
    boolean isClick = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //View bottomSheet = findViewById( R.id.bottom_sheet );
        Button button1 = findViewById( R.id.button_1 );
        //Button button2 = findViewById( R.id.button_2 );

        button1.setOnClickListener(this);
        //button2.setOnClickListener(this);

        //mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        //mBottomSheetBehavior.setPeekHeight(0);


    }

    @Override
    public void onClick(View v) {
        switch( v.getId() ) {
            case R.id.button_1: {
                //BottomDialogFragment bottomSheetDialogFragment = new BottomDialogFragment();
                //bottomSheetDialogFragment.show(getSupportFragmentManager(), bottomSheetDialogFragment.getTag());

                BottomDialogFragment bottomSheetDialog = new BottomDialogFragment();
                bottomSheetDialog.show(getSupportFragmentManager(), "Custom Bottom Sheet");


                //BottomDialogFragment fragment = new BottomDialogFragment();
                //fragment.show(getSupportFragmentManager(), "TAG");

                //mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                break;
            }
            //case R.id.button_2: {
            //    //mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            //    break;
            //}
        }
    }
}
