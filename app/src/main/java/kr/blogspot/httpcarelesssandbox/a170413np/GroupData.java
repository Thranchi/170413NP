package kr.blogspot.httpcarelesssandbox.a170413np;

import java.util.ArrayList;

/**
 * Created by 윤현하 on 2017-04-13.
 */

public class GroupData {
    String groupname;
    ArrayList<String> childlist;

    public GroupData( String groupname, ArrayList<String> datalist){
        this.groupname=groupname;
        this.childlist=new ArrayList<String>();
    }
}
