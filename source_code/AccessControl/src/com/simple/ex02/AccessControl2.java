package com.simple.ex02;

import com.simple.ex01.AccessControlEx01;

public class AccessControl2 extends AccessControlEx01 {

    int myMoney;

    public void test(){
        myMoney = shareMoney;
    }
}
