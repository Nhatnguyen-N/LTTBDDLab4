package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    LanguageAdapter la;
    ArrayList<Language> listLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.idlistview);

        listLanguage = new ArrayList<>();
        listLanguage.add(new Language("ga nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listLanguage.add(new Language("1KG khô gà","Shop Devang",R.drawable.ga_bo_toi));
        listLanguage.add(new Language("xe cần cẩu","Shop Devang",R.drawable.xa_can_cau));
        listLanguage.add(new Language("đồ chơi dạng mô hình","Shop Devang",R.drawable.do_choi_dang_mo_hinh));
        listLanguage.add(new Language("Lãnh đạo giản đơn","Shop Devang",R.drawable.lanh_dao_gian_don));

        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_list_view, listLanguage);
        listView.setAdapter(adapter);

    }
}
