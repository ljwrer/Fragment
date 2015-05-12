package com.example.newswithfragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Ray on 2015/5/12.
 */
public class ContentActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_layout);
        TextView title=(TextView)findViewById(R.id.content_title);
        TextView content=(TextView)findViewById(R.id.content_content);
        title.setText(getIntent().getStringExtra("title"));
        content.setText(getIntent().getStringExtra("content"));
        Log.d("ddd",getIntent().getStringExtra("title"));

    }
    public static void onActionStart(Context context,String title,String content){
        Intent intent=new Intent(context,ContentActivity.class);
        intent.putExtra("title",title);
        intent.putExtra("content",content);
        context.startActivity(intent);
    }
}
