package com.Shared;

import org.springframework.stereotype.Component;

@Component
public class ContextObject {
    
    private MyPage1Object myPage1Object;

    public MyPage1Object getMyPage1Object() {
        return this.myPage1Object;
    }

    public void setMyPage1Object(MyPage1Object myPage1Object) {
        this.myPage1Object = myPage1Object;
    }
    

    

}
