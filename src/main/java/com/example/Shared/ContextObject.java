package com.example.Shared;

import org.springframework.stereotype.Component;

import com.example.MyPage1.MyPage1Object;

@Component
public class ContextObject {
    
    public MyPage1Object myPage1Object;

    public MyPage1Object getMyPage1Object() {
        return this.myPage1Object;
    }

    public void setMyPage1Object(MyPage1Object myPage1Object) {
        this.myPage1Object = myPage1Object;
    }
    

    

}
