package kr.blogspot.httpcarelesssandbox.a170413np;

/**
 * Created by 윤현하 on 2017-04-13.
 */

public class databox {
    private String name;
    private String tel;

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setImageno(int imageno) {
        this.imageno = imageno;
    }

    private int imageno =0;

    public  databox(String name, String tel, int imgno){
        this.name=name;
        this.tel=tel;
        this.imageno=imgno;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public int getImageno() {
        return imageno;
    }


}


