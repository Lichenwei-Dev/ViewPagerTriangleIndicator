package com.lcw.viewpagertriangleindicator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 简单用来展示ViewPager里内容的Fragment
 * Create by: chenwei.li
 * Date: 2017/7/16
 * Time: 下午1:54
 * Email: lichenwei.me@foxmail.com
 */

public class SimpleFragmet extends Fragment {

    public static final String TITLE = "title";

    public static SimpleFragmet newInstance(String title) {

        Bundle args = new Bundle();
        args.putString(TITLE, title);
        SimpleFragmet fragment = new SimpleFragmet();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if (bundle != null) {
            String title = bundle.getString(TITLE);
            if (!TextUtils.isEmpty(title)) {
                TextView textView = new TextView(getContext());
                textView.setText(title);
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
