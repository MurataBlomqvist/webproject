package com.example.web.Shared;

import org.springframework.stereotype.Component;

import com.example.web.MyPage1.MyPage1Form;

@Component
public class ContextObject {
    
    public MyPage1Form page1Form;

    public MyPage1Form getPage1Form() {
        return this.page1Form;
    }

    public void setMyPage1Object(MyPage1Form page1Form) {
        this.page1Form = page1Form;
    }
    

    

}
