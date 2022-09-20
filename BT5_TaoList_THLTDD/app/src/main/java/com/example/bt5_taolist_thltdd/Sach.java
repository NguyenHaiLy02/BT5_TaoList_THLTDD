package com.example.bt5_taolist_thltdd;

public class Sach {
    private String Ten;
    private String TacGia;
    private int Hinh;


    public Sach(String ten, String tacGia, int hinh) {
        Ten = ten;
        TacGia = tacGia;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
