package com.example.administrator.zuoye0801;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends FragmentActivity {
    private MyFragment01 manhua;
    private MyFragment02 faxian;
    private MyFragment03 shequ;
    private MyFragment04 wode;
    private RadioButton b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (RadioButton)findViewById(R.id.manhua);
        b2 = (RadioButton)findViewById(R.id.faxian);
        b3 = (RadioButton)findViewById(R.id.shequ);
        b4 = (RadioButton)findViewById(R.id.wode);

        manhua = new MyFragment01();
        faxian = new MyFragment02();
        shequ = new MyFragment03();
        wode = new MyFragment04();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frament,manhua)
                .commit();

    }
    public void one(View v){
        //展示fragment页
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frament,manhua)
                .commit();
        //切换字体颜色
        b1.setTextColor(getResources().getColor(R.color.cheng));
        b2.setTextColor(getResources().getColor(R.color.hei));
        b3.setTextColor(getResources().getColor(R.color.hei));
        b4.setTextColor(getResources().getColor(R.color.hei));

    }
    public void two(View v){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frament,faxian)
                .commit();
        b1.setTextColor(getResources().getColor(R.color.hei));
        b2.setTextColor(getResources().getColor(R.color.cheng));
        b3.setTextColor(getResources().getColor(R.color.hei));
        b4.setTextColor(getResources().getColor(R.color.hei));
    }
    public void Sq(View v){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frament,shequ)
                .commit();
        b1.setTextColor(getResources().getColor(R.color.hei));
        b2.setTextColor(getResources().getColor(R.color.hei));
        b3.setTextColor(getResources().getColor(R.color.cheng));
        b4.setTextColor(getResources().getColor(R.color.hei));
    }
    public void Wd(View v){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frament,wode)
                .commit();
        b3.setTextColor(getResources().getColor(R.color.hei));
        b2.setTextColor(getResources().getColor(R.color.hei));
        b1.setTextColor(getResources().getColor(R.color.hei));
        b4.setTextColor(getResources().getColor(R.color.cheng));
    }
}
