package com.example.MyPage1;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Shared.ContextObject;


@Controller
public class MyPage1Controller {

    @Autowired
    ContextObject context;
    
    @GetMapping("/myPage1")
    public String initPage(
        @ModelAttribute ContextObject context
    ) {
        
        if(Objects.isNull(this.context) || Objects.isNull(this.context.getMyPage1Object())) {
            MyPage1Object page1Object = new MyPage1Object();
            context.setMyPage1Object(page1Object.init());
        } else {
            context.myPage1Object = this.context.getMyPage1Object();
        }
        
        this.context.setMyPage1Object(context.myPage1Object);
        return "MyPage1";
    }

    @PostMapping("/myPage1")
    public String fillHeadAndTitle(
        MyPage1Object myPage1Object
    ) {

        context.myPage1Object.setToShowHead(context.myPage1Object.getToShowHeadUserIn());
        context.myPage1Object.setToShowTitle(context.myPage1Object.getToShowTitleUserIn());

        context.myPage1Object.setToShowHeadUserIn("");
        context.myPage1Object.setToShowTitleUserIn("");
        
        this.context.setMyPage1Object(context.myPage1Object);
        return "MyPage1";
    }

}
