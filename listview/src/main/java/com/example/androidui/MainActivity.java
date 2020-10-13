package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class MainActivity extends AppCompatActivity {

    private List<Map<String,Object>> lists;
    private SimpleAdapter adapter;
    private ListView listView;

    private String[] names= new String[]{"  Lion","  Tiger","  Monkey","  Dog","  Cat","  elephant"};
    private int[] imgIds=new int[]{R.mipmap.lion,R.mipmap.tiger,R.mipmap.monkey,R.mipmap.dog,R.mipmap.cat,R.mipmap.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lv);
        lists = new ArrayList<>();
        for(int i = 0;i < names.length;i++){
            Map<String,Object> map =new HashMap<>();
            map.put("image",imgIds[i]);
            map.put("name",names[i]);
            lists.add(map);
        }
        adapter = new SimpleAdapter(MainActivity.this,lists,R.layout.list_item
                ,new String[]{"image","name"}
                ,new int[]{R.id.img,R.id.tv});
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(MainActivity.this, names[position],Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
