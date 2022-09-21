package com.example.bt5_taolist_thltdd;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvSach;
    ArrayList<Sach> arraySach;
    SachAdapter adapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new SachAdapter(this,R.layout.dong_sach,arraySach);
        lvSach.setAdapter(adapter);

        lvSach.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                showInforSach(i);
                return false;
            }
        });

        lvSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                deleteSach(i);
            }
        });
    }
    private void AnhXa() {
        lvSach = (ListView) findViewById(R.id.listview_Sach);
        arraySach = new ArrayList<>();

        arraySach.add(new Sach("Đắc nhân tâm","Dale Carnegie",R.drawable.dacnhantam));
        arraySach.add(new Sach("Cách nghĩ để thành công","Napoleon Hill",R.drawable.cachnghidethanhcong));
        arraySach.add(new Sach("Cuộc sống không giới hạn","Nick Vujic",R.drawable.cuocsongkhonggioihan));
        arraySach.add(new Sach("Hạt giống tâm hồn","Nhiều tác giả",R.drawable.hatgiongtamhon));
        arraySach.add(new Sach("Tốc độ của niềm tin","Stephen R.Covey",R.drawable.tocdocuaniemtin));


    }


    private void showInforSach(int position){
        Sach s = arraySach.get(position);

        Intent i = new Intent(this, Activity2.class);

        i.putExtra("Ten", s.getTen());
        i.putExtra("TacGia", s.getTacGia());
        i.putExtra("Hinh",s.getHinh());
        startActivity(i);
    }

    private void deleteSach(final int position){
        new AlertDialog.Builder(this)
                .setTitle("XÓA SÁCH")
                .setMessage("Bạn có chắc chắc muốn xóa?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        arraySach.remove(position);
                        adapter.notifyDataSetChanged();
                    }
                }).setNegativeButton("Cancel", null)
                .show();
    }

}
