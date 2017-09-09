package com.example.sam.banpatito;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CustomerAdapter oCustomerAdapter;
    CustomerModel oCustomer;
    public ArrayList<CustomerModel> customerList = new ArrayList<CustomerModel>();
    ListView oListView;
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        Button btn_addCustomer = (Button) findViewById(R.id.btnAddCustomer);
        oListView=(ListView) findViewById(R.id.lv_CustomerList);
        oCustomerAdapter=new CustomerAdapter(this);
        oListView.setAdapter(oCustomerAdapter);

        btn_addCustomer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                number++;
                EditText CustomerName = (EditText) findViewById(R.id.txtCustomerName);
                EditText CustomerOps = (EditText) findViewById(R.id.txtOps);

                Toast.makeText(getApplicationContext(), "Cool", Toast.LENGTH_LONG).show();

                oCustomer = new CustomerModel(number, CustomerName.getText().toString(), 2);
                oCustomerAdapter.add(oCustomer);
                oCustomerAdapter.notifyDataSetChanged();

            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
