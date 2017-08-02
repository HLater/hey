package com.example.administrator.zuoye0801;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * 姓名：洪翠影
 * 时间：2017/8/1.20:21
 * 类作用：
 * 思路：
 */
@ContentView(R.layout.fragment01)
public class MyFragment01 extends Fragment{
    @ViewInject(R.id.tablayout)
    private TabLayout tabLayout;
    @ViewInject(R.id.listview)
    private ListView listView;
//    private MyAdapter adapter;
    private List<Data.DataBean.CategoriesBean> list=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = x.view().inject(this,inflater,container);
//        loadData();
        return view;
    }

//    private void loadData() {
//        RequestParams params=new RequestParams("http://api.eleteam.com/v1/category/list-with-product");
//        x.http().get(params, new Callback.CommonCallback<String>() {
//            @Override
//            public void onSuccess(String result) {
//                Data data = new Gson().fromJson(result,Data.class);
//
//            }
//
//            @Override
//            public void onError(Throwable ex, boolean isOnCallback) {
//
//            }
//
//            @Override
//            public void onCancelled(CancelledException cex) {
//
//            }
//
//            @Override
//            public void onFinished() {
//
//            }
//        });
//    }
//    class MyAdapter extends BaseAdapter{
//
//        @Override
//        public int getCount() {
//            return list.size();
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return list.get(position);
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            ViewHolder viewholder;
//            if (convertView==null){
//
//            }
//            return convertView;
//        }
//        class ViewHolder{
//            TextView text;
//            ImageView image;
//        }
//    }
}
