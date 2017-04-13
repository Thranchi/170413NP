package kr.blogspot.httpcarelesssandbox.a170413np;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by 윤현하 on 2017-04-13.
 */

public class restadapter extends BaseAdapter{
    ArrayList<databox> data=new ArrayList<databox>();
    Context context;

    public restadapter(Context context, ArrayList<databox> data){
        this.context=context;
        this.data=data;
    }

    @Override
    public int getCount() {
        return data.size();
    }//데이터 개수

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewholder=new ViewHolder();
        if(convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list, null);
        }
        TextView t1=(TextView)convertView.findViewById(R.id.t1);
        TextView t2=(TextView)convertView.findViewById(R.id.t2);

        databox one = data.get(position);
        t1.setText(one.getName());
        t1.setText(one.getTel());
        return null;
    }//현재 이 번호의 아이템을 구성하는 메소드
    Comparator<databox> nameAsc=new Comparator<databox>() {
        @Override
        public int compare(databox o1, databox o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    };

    public void setSort(){
        Collections.sort(data,nameAsc);
        this.notifyDataSetChanged();
    }

}

class ViewHolder{
    TextView title;
    TextView tel;
}