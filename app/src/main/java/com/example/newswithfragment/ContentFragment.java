package com.example.newswithfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ray on 2015/5/12.
 */
public class ContentFragment extends Fragment {
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.content_layout,container,false);

        return view;
    }
    public void refresh(String title,String content){
        TextView titleText = (TextView) view.findViewById(R.id.content_title);
        TextView contentText = (TextView) view.findViewById(R.id.content_content);
        titleText.setText(title);
        contentText.setText(content);
    }
}
