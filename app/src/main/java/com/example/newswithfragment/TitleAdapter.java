package com.example.newswithfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ray on 2015/5/12.
 */
public class TitleAdapter extends ArrayAdapter<News> {
    private int resourceID;
    public TitleAdapter(Context context, int resource, List<News> objects) {
        super(context, resource, objects);
        resourceID=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news=getItem(position);
        View view;
        if (convertView==null)
        {
            view=LayoutInflater.from(getContext()).inflate(resourceID,null);
        }
        else
        {
            view=convertView;
        }
        TextView textView=(TextView)view.findViewById(R.id.title_item);
        textView.setText(news.getTitle());
        return view;
    }

}

