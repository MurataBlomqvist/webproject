package com.example.web.MyPage1;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myPage1")
public class MyPage1Controller {
    
    @Autowired
    MyPage1Form page1Form;

    @GetMapping
    public String initPage(
        Model model
    ) {

        this.page1Form = new MyPage1Form();

        model.addAttribute("page1Form", page1Form);
        return "MyPage1";
    }

    @PostMapping
    public String fillHeadAndTitle(
        @ModelAttribute MyPage1Form page1Form
        , Model model
    ) {

        if (Objects.nonNull(page1Form)) {

            page1Form.setToShowHead(page1Form.getUserInput2());
            page1Form.setToShowTitle(page1Form.getUserInput1());
            page1Form.setUserInput1("");
            page1Form.setUserInput2("");

        }

        model.addAttribute("page1Form",page1Form);
        return "MyPage1";
    }

}
