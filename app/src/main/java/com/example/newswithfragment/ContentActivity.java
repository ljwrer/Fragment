package com.example.newswithfragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Ray on 2015/5/12.
 */
public class ContentActivity extends Activity {
    public static void onActionStart(Context context,String title,String content){
        Intent intent=new Intent(context,ContentActivity.class);
        intent.putExtra("title",title);
        intent.putExtra("content",content);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_content);
        String title=getIntent().getStringExtra("title");
        String content=getIntent().getStringExtra("content");
//        TextView newsTitle=(TextView)findViewById(R.id.content_title);
//        TextView newsContent=(TextView)findViewById(R.id.content_content);
//        newsTitle.setText(title);
//        newsContent.setText(content);
        ContentFragment contentFragment=(ContentFragment)getFragmentManager().findFragmentById(R.id.content_fragment);
        contentFragment.refresh(title,content);
    }

}
