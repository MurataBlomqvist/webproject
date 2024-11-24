package com.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Shared.ContextObject;
import com.Shared.MyPage1Object;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class MyPage1Controller {

    @Autowired
    ContextObject context;
    
    @GetMapping("/myPage1")
    public String initPage(
        @ModelAttribute MyPage1Object myPage1Object
    ) {
        
        if(Objects.isNull(this.context) && Objects.isNull(this.context.getMyPage1Object())) {
            myPage1Object.init();
        } else {
            myPage1Object = this.context.getMyPage1Object();
        }
        
        this.context.setMyPage1Object(myPage1Object);
        return "MyPage1";
    }

    @GetMapping("/myPage1/fillHeadAndTitle")
    public String fillHeadAndTitle(
        @ModelAttribute MyPage1Object myPage1Object
    ) {

        myPage1Object.setHeadAndTitle(myPage1Object);
        
        return "/MyPage1";
    }

}
