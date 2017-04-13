package kr.blogspot.httpcarelesssandbox.a170413np;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> data=new ArrayList<String>();
    ArrayAdapter<String> adapter;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice,data);
        listView =(ListView)findViewById(R.id.listview1);
        et1=(EditText)findViewById(R.id.e1);
        et2=(EditText)findViewById(R.id.e2);

        data.add("사과");
        data.add("배");
        data.add("귤");
        adapter.insert("이렇게도 된다", data.size());
        //얜 notify안해도 잘 들어간다

        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setAdapter(adapter);

        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String search = s.toString();
                if(search.length() > 0)
                    listView.setFilterText(search);
                else
                    listView.clearTextFilter();
                //데이터는 변동사항이 없고 현재 리스트뷰에서만 필터를 걸겠다는 소리

            }//에딧텍스트에 글씨를 치자마자 검색이 되는것
        });
    }



    Comparator<String> nameAsc= new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
            //오름차 내림차 바꾸려면 o1 o2만 바꾸면 돼
        }
    };//이름순

    public void onClick(View v){
        if(v.getId()==R.id.b1) {
            data.add(et1.getText().toString());
            adapter.notifyDataSetChanged();
        }
        else if(v.getId()==R.id.b2) {
            Collections.sort(data,nameAsc);
            adapter.notifyDataSetChanged();
        }
        else if(v.getId()==R.id.b3) {

        }
    }
}
