package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.SupportMenuInflater;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);//tahrna==inflate
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
       switch (item.getItemId())
           
       {
           case R.id.menu_bookmark:
               startActivity(new Intent(Settings.ACTION_SETTINGS));
               Toast.makeText(MainActivity.this, "Save is Selected", Toast.LENGTH_SHORT).show();
                return  true;

           case R.id.menu_setting:
               AlertDialog.Builder builder = new AlertDialog.Builder(this);
               builder.setTitle("Setting is Done");
               builder.setMessage("Keep Smiling");
               builder.setCancelable(true);
               builder.show();
//
//               Toast.makeText(MainActivity.this, "Setting is Selected", Toast.LENGTH_SHORT).show();
//            return true;

           case R.id.menu_waiting:
               Toast.makeText(MainActivity.this, "Waiting is selected", Toast.LENGTH_SHORT).show();
               return true;

           default:
               return super.onOptionsItemSelected(item);

       }
    }
}
