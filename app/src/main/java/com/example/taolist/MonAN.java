package com.example.taolist;

public class MonAN {
    private String tenmon;
    private String mota;
    private int hinh;
    private String gia;

    public  MonAN(){

    }
    public MonAN(String tenmon,String mota,int hinh,String gia ) {
        this.tenmon = tenmon;
        this.mota = mota;
        this.hinh = hinh;
        this.gia = gia;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getGia(){
        return gia;
    }

    public void setGia(String tenmon) {
        this.gia = gia;
    }

}
