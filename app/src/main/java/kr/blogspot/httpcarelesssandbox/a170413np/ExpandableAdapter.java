package kr.blogspot.httpcarelesssandbox.a170413np;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.util.ArrayList;

/**
 * Created by 윤현하 on 2017-04-13.
 */

public class ExpandableAdapter extends BaseExpandableListAdapter {
    ArrayList<GroupData> groupdata;

    @Override
    public int getGroupCount() {
        return groupdata.size();
    }//그룹개수

    @Override
    public int getChildrenCount(int groupPosition) {
        return groupdata.get(groupPosition).childlist.size();
    }//그 그룹의 자식

    @Override
    public Object getGroup(int groupPosition) {
        return groupdata.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return groupdata.get(groupPosition).childlist.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {


        return null;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
