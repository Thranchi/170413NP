package kr.blogspot.httpcarelesssandbox.a170413np;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main2Activity extends AppCompatActivity {

    ArrayList<databox> data=new ArrayList<databox>();
    ListView listView;
    restadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        data.add(new databox("BBQ","01044446666",0));
        data.add(new databox("PIZZA","01077779999",1));
        data.add(new databox("TOSL","01012345678",2));

        adapter=new restadapter(this,data);

        listView=(ListView)findViewById(R.id.list1);

    }

    public void onClick(View v){
        if(v.getId()==R.id.button) {
            adapter.setSort();
        }
        else if(v.getId()==R.id.button2) {

        }
    }
}
