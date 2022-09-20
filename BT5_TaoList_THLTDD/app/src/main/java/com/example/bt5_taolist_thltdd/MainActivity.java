package com.example.bt5_taolist_thltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
}