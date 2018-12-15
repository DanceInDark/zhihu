package com.example.lenovo.zh_v3;

/**
 * Created by lenovo on 2018/12/15.
 */


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Tab1Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);
        final String[] title=new String[]{"江苏苏州电信","广东揭阳移动","江苏无锡移动",
                "山东青岛移动","安徽合肥移动","江苏苏州移动","山东烟台联通","广东珠海电信",
                "河北石家庄电信","山东东营移动"};
        final String[] attend_num=new String[]{"87 人关注","154 人关注","59 人关注","68 人关注","298 人关注","365 人关注",
                "541 人关注","215 人关注","98 人关注","158 人关注"};
        final String[] answer_num=new String[]{"25 个回答","48 个回答","17 个回答","65 个回答","54 个回答","96 个回答",
                "110 个回答","32 个回答","146 个回答","73 个回答"};

        final List<ContentItem> data=new ArrayList<>();
        final ListView contacts_list=(ListView) view.findViewById(R.id.list_view);
        for(int i=0;i<10;i++){
            ContentItem tmp=new ContentItem(title[i],attend_num[i],answer_num[i]);
            data.add(tmp);
        }

        final MyAdapter content_adapter=new MyAdapter(getActivity(),data);
        contacts_list.setAdapter(content_adapter);
//        return inflater.inflate(R.layout.fragment_one, container, false);
        return view;
    }
}