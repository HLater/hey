package com.example.administrator.zuoye0801;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 姓名：洪翠影
 * 时间：2017/8/1.20:21
 * 类作用：
 * 思路：
 */

public class MyFragment02 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment02,container,false);
        return view;
    }
}
