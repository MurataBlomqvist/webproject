package com.example.web.MyPage1;

import org.springframework.stereotype.Component;

@Component
public class MyPage1Form {
    
    public MyPage1Form() {
        userInput1 = "";
        userInput2 = "";
        toShowHead = "";
        toShowTitle = "";
    }

    private String userInput1;
    public String getUserInput1() {
        return userInput1;
    }
    public void setUserInput1(String userInput1) {
        this.userInput1 = userInput1;
    }

    private String userInput2;
    public String getUserInput2() {
        return userInput2;
    }
    public void setUserInput2(String userInput2) {
        this.userInput2 = userInput2;
    }

    private String toShowHead;
    public String getToShowHead() {
        return toShowHead;
    }
    public void setToShowHead(String toShowHead) {
        this.toShowHead = toShowHead;
    }

    private String toShowTitle;
    public String getToShowTitle() {
        return toShowTitle;
    }
    public void setToShowTitle(String toShowTitle) {
        this.toShowTitle = toShowTitle;
    }

}
