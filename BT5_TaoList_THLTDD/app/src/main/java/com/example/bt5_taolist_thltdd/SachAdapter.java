package com.example.bt5_taolist_thltdd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class SachAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Sach> sachList;

    public SachAdapter(Context context, int layout, List<Sach> sachList) {
        this.context = context;
        this.layout = layout;
        this.sachList = sachList;
    }

    @Override
    public int getCount() {
        return sachList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen,txtTacGia;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if(view == null ){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout ,null);
            holder = new ViewHolder();
            // ánh xạ view
            holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
            holder.txtTacGia = (TextView) view.findViewById(R.id.textviewTacGia);
            holder.imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }


        //gán giá trị
        Sach sach = sachList.get(i);
        holder.txtTen.setText(sach.getTen());
        holder.txtTacGia.setText(sach.getTacGia());
        holder.imgHinh.setImageResource(sach.getHinh());
        return view;
    }
}
