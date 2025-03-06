package com.pom.testing;

import com.pom.master.application.PomMasterApplication;

public class MainTesting {

    // 使用<dependency>依赖中引入的类型
    public void test() {
       PomMasterApplication application = new PomMasterApplication();
       application.testPomMasterApplication();
    }
}
