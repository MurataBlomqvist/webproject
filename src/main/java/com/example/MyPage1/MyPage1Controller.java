package com.example.MyPage1;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Shared.ContextObject;




@Controller
@RequestMapping("/myPage1")
public class MyPage1Controller {

    @Autowired
    ContextObject context;
    
    @GetMapping
    public String initPage(
        Model model
    ) {
        MyPage1Object page1Object = new MyPage1Object();
        page1Object = page1Object.init();
        model.addAttribute(page1Object);

        return "MyPage1";
    }

    @PostMapping
    public String fillHeadAndTitle(
        MyPage1Object page1Object
    ) {

        if (Objects.nonNull(page1Object)) {

            page1Object.setToShowHead(page1Object.getToShowHeadUserIn());
            page1Object.setToShowTitle(page1Object.getToShowTitleUserIn());

        } else {
            page1Object.setToShowHead("");
            page1Object.setToShowTitle("");
        }
        
        page1Object.setToShowHeadUserIn("");
        page1Object.setToShowTitleUserIn("");

        return "MyPage1";
    }

}
