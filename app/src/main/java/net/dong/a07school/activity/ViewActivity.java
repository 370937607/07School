package net.dong.a07school.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import net.dong.a07school.R;
import net.dong.a07school.empity.Resours;
import net.dong.a07school.empity.ResoursAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewActivity extends AppCompatActivity {
    private List<Resours> fruitList = new ArrayList<>();
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);


        view = findViewById(R.id.back);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //隐藏自带标题栏
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();




        //加载图片资源
        initResours();
        ResoursAdapter adapter = new ResoursAdapter(ViewActivity.this,R.layout.item_resours,fruitList);
        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Resours resours = fruitList.get(position);
                Toast.makeText(ViewActivity.this,resours.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initResours() {
        Resours a = new Resours("教学楼",R.mipmap.view1);
        fruitList.add(a);
        Resours b = new Resours("凉亭",R.mipmap.view2);
        fruitList.add(b);
        Resours c = new Resours("校徽",R.mipmap.view3);
        fruitList.add(c);
        Resours d = new Resours("全景",R.mipmap.view4);
        fruitList.add(d);
        Resours e = new Resours("教学楼2",R.mipmap.view5);
        fruitList.add(e);
        Resours f = new Resours("校内风景",R.mipmap.view6);
        fruitList.add(f);
        Resours g = new Resours("教学楼4",R.mipmap.view7);
        fruitList.add(g);



    }
}
