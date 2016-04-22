package cn.studyjamscn.s1.sj32.huanghuiyun;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by FX50J on 2016/4/22.
 */
public class East extends Fragment {
    private Button mbtn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.east,container,false);
        mbtn = (Button) view.findViewById(R.id.btn);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),East_intent.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
