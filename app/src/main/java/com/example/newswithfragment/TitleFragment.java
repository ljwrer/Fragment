package com.example.newswithfragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ray on 2015/5/12.
 */
public class TitleFragment extends Fragment {
    TitleAdapter titleAdapter;
    ListView listView;
    List<News> list=new ArrayList<News>();
    boolean isSingle;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.title_layout, container, false);
        Log.d("ddd",view.toString());
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        initNews();
        titleAdapter=new TitleAdapter(activity,R.layout.title_item,list);
    }

    public void initNews(){
        News n1=new News("新华网明斯克5月11日电(记者刘华 柳丝)国家主席习近平11日同白俄罗斯总统卢卡申科在明斯克卫国战争历史博物馆会见了15名白俄罗斯第二次世界大战老战士代表。\n" +
                "\n" +
                "　　15名老战士中年龄最大的已95岁，最小的也已88岁。他们中有11人曾在中国东北参加中国军民对日本作战，为中国人民抗日战争胜利作出了积极贡献。\n" +
                "\n" +
                "　　当习近平和卢卡申科步入会见大厅时，全体老战士代表起立鼓掌欢迎。现场奏中白两国国歌。习近平同老战士们一一握手，并颁发了纪念奖章。\n" +
                "\n" +
                "　　颁奖结束后，习近平发表讲话，代表中国政府和人民向老战士们致以崇高敬意和诚挚问候。习近平指出，第二次世界大战期间，白俄罗斯人民打响了卫国战争的第一枪，表现出百折不挠的英雄主义精神，赢得了世界各国人民的广泛赞誉和尊重。今年也是中国人民抗日战争胜利70周年。中国人民抗日战争开始时间最早，持续时间最长，付出的牺牲也最大，为世界反法西斯战争胜利作出了不可磨灭的重要贡献。当年在共同抗击法西斯主义和军国主义侵略的战争中，白俄罗斯人民同中国人民并肩作战，用鲜血结下了牢固友谊。我们深切怀念那些为夺取抗战最终胜利、保卫世界和平而献身的两国英烈，中白两国人民将永远铭记他们的丰功伟绩。卢卡申科总统在卫国战争历史博物馆新馆开馆时曾说过，对篡改第二次世界大战历史、美化侵略的企图，白俄罗斯人民绝不会答应。我对此深表赞同。我们愿同包括白俄罗斯人民在内的世界人民一道，共同维护第二次世界大战胜利成果和国际公平正义。\n" +
                "\n" +
                "\n" +
                "　　卢卡申科表示，在纪念世界反法西斯战争胜利70周年之际，习近平主席对白俄罗斯的访问具有重要意义。在第二次世界大战中白中两国人民建立了兄弟般的情谊。当前，我们两国必须增进彼此互信，更加紧密团结。今年中国将举办纪念中国人民抗日战争暨世界反法西斯战争胜利70周年纪念活动，白俄罗斯对此坚决支持。这是为了铭记历史，缅怀先烈，警示后人历史不容篡改。\n" +
                "\n" +
                "　　会见前，习近平同卢卡申科共同参观了卫国战争历史博物馆。当习近平来到博物馆时，卢卡申科亲自来到博物馆门口迎接。中白两国青年学生在博物馆前挥舞两国国旗，欢迎习近平。博物馆陈设超过14万件藏品，按照从卫国战争之前到战后重建的时间顺序，集中反映了白俄罗斯军民同仇敌忾、保家卫国、抗击法西斯侵略者的英勇历史。博物馆内还设有“白俄罗斯与中国——战火中结下的兄弟情谊”特别展区，通过大量照片和实物，集中展示了日本法西斯侵略者的野蛮和中国军民抗日战争的英勇事迹。习近平认真听取讲解，并在纪念簿上题词“铭记历史，维护和平”。\n" +
                "\n" +
                "　　当天，习近平还向白俄罗斯胜利纪念碑敬献花圈。\n" +
                "\n" +
                "　　王沪宁、栗战书、杨洁篪等参加上述活动。","习近平会见白俄罗斯二战老战士代表");
        News n2=new News("新华社北京5月11日电 外交部发言人华春莹11日宣布：应巴西联邦共和国总统罗塞夫、哥伦比亚共和国总统桑托斯、秘鲁共和国总统乌马拉、智利共和国总统巴切莱特邀请，国务院总理李克强将于5月18日至26日对上述四国进行正式访问。(完)\n" +
                "\n" +
                "编辑：SN117","李克强将访问巴西哥伦比亚秘鲁智利等南美四国");
        list.add(n1);
        list.add(n2);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("ddd", view.toString());
        if(view.findViewById(R.id.content_fragment)==null)
        {
            isSingle=true;
        }
        else
        {
            isSingle=false;
        }

        listView=(ListView)view.findViewById(R.id.title_list_view);
        listView.setAdapter(titleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                News news=list.get(position);
                String title=news.getTitle();
                String content=news.getContent();
                Log.d("ddd",isSingle+"");
                if (isSingle)
                {
                    ContentActivity.onActionStart(getActivity(),title,content);
                }
                else
                {
                    ContentFragment contentFragment=(ContentFragment)getFragmentManager().findFragmentById(R.id.content_content);
                    TextView titleText=(TextView)view.findViewById(R.id.content_title);
                    TextView contentText=(TextView)view.findViewById(R.id.content_content);


                    titleText.setText(title);
                    contentText.setText(content);



                }
            }
        });
    }

}
