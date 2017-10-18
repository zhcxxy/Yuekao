package com.jiyun.administrator.yuekao.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.jiyun.administrator.yuekao.R;
import com.jiyun.administrator.yuekao.bean.Bean;
import com.jiyun.administrator.yuekao.http.OkhttpUtils;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class LieBiaoFragment extends Fragment {


    private View inflate;
    String url="http://192.168.43.79:8080/string/data.json";

    public LieBiaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        inflate = inflater.inflate(R.layout.fragment_lie_biao, container, false);

        RecyclerView mRecyclerview=inflate.findViewById(R.id.mRecyclerView);

        OkhttpUtils.getInstance(((LieBiaoActivity)getActivity())).getData(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String data=response.body().string();
                Gson gson=new Gson();
//               List<Bean> list=gson.fromJson(data, Bean.class);

            }
        });
        return inflate;
    }

}
