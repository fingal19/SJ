package cn.studyjamscn.s1.sj32.huanghuiyun;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout mtab;
    private ViewPager mvp;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_view();
    }

    private void init_view() {
        mvp = (ViewPager) findViewById(R.id.viewpager);
        adapter = new MyAdapter(getSupportFragmentManager());
        mvp.setAdapter(adapter);

        mtab = (TabLayout) findViewById(R.id.tab);
        mtab.setupWithViewPager(mvp);


    }


}
