package net.dong.a07school.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.dong.a07school.R;


public class StudentFragment extends Fragment {


    // 工厂方法
    public static StudentFragment newInstance() {
        return new StudentFragment();
    }

    public StudentFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_student, container, false);
        return view;
    }



}
