package cn.studyjamscn.s1.sj32.huanghuiyun;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by FX50J on 2016/4/22.
 */
public class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }
    private String[] mtittle = new String[]{
            "东方式插花","西方式插花"
    };

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new East();
            case 1:
                return new West();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mtittle[position];
    }
}
