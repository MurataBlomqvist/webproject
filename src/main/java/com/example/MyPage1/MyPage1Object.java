package com.example.MyPage1;

import org.springframework.boot.autoconfigure.AutoConfiguration;

@AutoConfiguration
public class MyPage1Object {
    
    public MyPage1Object init() {
        MyPage1Object myPage1Object = new MyPage1Object();

        myPage1Object.setToShowHead("");
        myPage1Object.setToShowTitle("");
        myPage1Object.setToShowHeadUserIn("");
        myPage1Object.setToShowTitleUserIn("");

        return myPage1Object;
    }
  
    private String toShowHead;
    private String toShowTitle;
    private String toShowTitleUserIn;
    private String toShowHeadUserIn;


    public String getToShowTitleUserIn() {
        return toShowTitleUserIn;
    }
    public void setToShowTitleUserIn(String toShowTitleUserIn) {
        this.toShowTitleUserIn = toShowTitleUserIn;
    }

    public String getToShowHeadUserIn() {
        return toShowHeadUserIn;
    }
    public void setToShowHeadUserIn(String toShowHeadUserIn) {
        this.toShowHeadUserIn = toShowHeadUserIn;
    }

    public String getToShowHead() {
        return toShowHead;
    }
    public void setToShowHead(String toShowHead) {
        this.toShowHead = toShowHead;
    }

    public String getToShowTitle() {
        return toShowTitle;
    }
    public void setToShowTitle(String toShowTitle) {
        this.toShowTitle = toShowTitle;
    }

}
