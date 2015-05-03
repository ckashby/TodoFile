package com.meteoru.cka.todofile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private ArrayList<String> items;
    private ArrayAdapter<String> aItems;
    private ListView lvItems;
    private EditText etAddTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Cast EditText etAddTodo
        etAddTodo = (EditText) findViewById(R.id.etAddTodo);
        // Cast ListView lvItems
        lvItems = (ListView) findViewById(R.id.lvItems);
        items = new ArrayList<String>();
        // populateArrayItems();
        // Create ArrayAdapter
        aItems = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(aItems);
    }

    public void onAddItem(View view) {
        String itemText = etAddTodo.getText().toString();
        aItems.add(itemText);
        etAddTodo.setText("");
    }

    private void populateArrayItems() {
        // Create sample data
        items = new ArrayList<String>();
        items.add("First Item");
        items.add("2nd Item");
        items.add("Third Sample");
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
