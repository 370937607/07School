package net.dong.a07school.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import net.dong.a07school.R;
import net.dong.a07school.activity.HistoryActivity;
import net.dong.a07school.activity.MusicActivity;
import net.dong.a07school.activity.VedioActivity;
import net.dong.a07school.activity.ViewActivity;
import net.dong.a07school.activity.WeizhiActivity;


public class SchoolFragment extends Fragment implements View.OnClickListener {

    private Context context;


    private Button button;
    private RadioButton rb_jianjie,rb_music,rb_history,rb_weizhi,rb_view;
    // 工厂方法
    public static SchoolFragment newInstance() {
        return new SchoolFragment();
    }

    public SchoolFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_school, container, false);
        context = getContext();//获取上下文
        //加载控件
       initView(view);
//        rd_jianjie = view.findViewById(R.id.rd_jianjie);
        return view;


    }

    private void initView(View view) {
        rb_jianjie= view.findViewById(R.id.rb_jianjie);
        rb_music = view.findViewById(R.id.rb_music);
        rb_weizhi = view.findViewById(R.id.rb_weizhi);
        rb_history = view.findViewById(R.id.rb_history);
        rb_view = view.findViewById(R.id.rb_view);


        //设置按钮监听
        rb_jianjie.setOnClickListener(this);
        rb_view.setOnClickListener(this);
        rb_history.setOnClickListener(this);
        rb_weizhi.setOnClickListener(this);
        rb_music.setOnClickListener(this);
//        rd_jianjie.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), VedioActivity.class);
//                startActivity(intent);
//            }
//        });

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.rb_jianjie:
                 intent = new Intent(getContext(), VedioActivity.class);
                startActivity(intent);
                break;
            case R.id.rb_music:
                intent = new Intent(getContext(), MusicActivity.class);
                startActivity(intent);
                break;
            case R.id.rb_history:
                intent = new Intent(getContext(), HistoryActivity.class);
                startActivity(intent);
                break;
            case R.id.rb_view:
                intent = new Intent(getContext(), ViewActivity.class);
                startActivity(intent);
                break;
            case R.id.rb_weizhi:
                intent = new Intent(getContext(), WeizhiActivity.class);
                startActivity(intent);
                break;

        }
    }
}
