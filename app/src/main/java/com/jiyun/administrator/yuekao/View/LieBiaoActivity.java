package com.jiyun.administrator.yuekao.View;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.jiyun.administrator.yuekao.R;
import com.jiyun.administrator.yuekao.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class LieBiaoActivity extends AppCompatActivity {

    private ViewPager vp;
    private RadioGroup rg;
    private RadioButton rb2;
    private RadioButton rb1;
    private List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lie_biao);

        vp = (ViewPager) findViewById(R.id.mViewPager);
        rg = (RadioGroup) findViewById(R.id.radio);
        rb1 = (RadioButton) findViewById(R.id.rb_liebiao);
        rb2 = (RadioButton) findViewById(R.id.rb_shoucang);

        list = new ArrayList<>();
        list.add(new LieBiaoFragment());
        list.add(new ShouCangFragment());

        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager(), list);
        vp.setAdapter(adapter);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.rb_liebiao:
                        vp.setCurrentItem(0);
                        break;
                    case R.id.rb_shoucang:
                        vp.setCurrentItem(1);
                        break;

                }
            }
        });

    }
}
