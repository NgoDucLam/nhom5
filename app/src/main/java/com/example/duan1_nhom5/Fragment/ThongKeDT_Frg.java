package com.example.duan1_nhom5.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.duan1_nhom5.R;


public class ThongKeDT_Frg extends Fragment {


    public ThongKeDT_Frg() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_thong_ke_d_t__frg, container, false);
    }
}