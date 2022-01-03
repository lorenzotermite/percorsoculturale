package com.example.sms1;


import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {

private BottomSheetDialog bottomSheetDialog;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.home);







    }



    public void bottom_sheet(MenuItem item){

       bottomSheetDialog=new BottomSheetDialog(HomeActivity.this,R.style.BottomSheetTheme );
       View sheetview= LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottom_sheet,null);

      bottomSheetDialog.setContentView(sheetview);
      bottomSheetDialog.show();
    }

}
