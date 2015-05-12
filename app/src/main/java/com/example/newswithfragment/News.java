package com.example.newswithfragment;

/**
 * Created by Ray on 2015/5/12.
 */
public class News {
    private String title;
    private String content;

    public News(String content, String title) {
        this.content = content;
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
