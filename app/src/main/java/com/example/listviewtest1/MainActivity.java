package com.example.listviewtest1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = (ListView) findViewById(R.id.ListView);

        SingerAdapter adapter = new SingerAdapter(); // 객체 //어댑터 객체 설정
        adapter.addItem(new SingerItem("소녀시대", "010-1000-1000"));
        adapter.addItem(new SingerItem("빅뱅", "010-2000-2000"));
        adapter.addItem(new SingerItem("승리", "010-3000-3000"));
        adapter.addItem(new SingerItem("태양", "010-4000-4000"));
        adapter.addItem(new SingerItem("대성", "010-5000-5000"));
        adapter.addItem(new SingerItem("쥐디", "010-6000-6000"));
        adapter.addItem(new SingerItem("탑", "010-7000-7000"));
        adapter.addItem(new SingerItem("걸스데이", "010-8000-8000"));

        listview.setAdapter(adapter);

    }

    class SingerAdapter extends BaseAdapter{

        ArrayList<SingerItem> items = new ArrayList<SingerItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(SingerItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            SingerItemView view = new SingerItemView(getApplicationContext());

            SingerItem item = items.get(position);
            view.setName(item.getName());
            view.setMobile(item.getMoblie());

            return view;
        }
    }

}
