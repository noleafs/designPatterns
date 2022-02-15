package com.designpatterns.pattern.template;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2022/2/14 21:52
 */
public class Client {

    @Test
    void testTemplate() {
        // 炒包菜
        ConcreateClass_BaoCai concreateClassBaoCai = new ConcreateClass_BaoCai();
        concreateClassBaoCai.cookProcess();
        System.out.println("---------------");
        ConcreateClass_CaiXin concreateClass_caiXin = new ConcreateClass_CaiXin();
        concreateClass_caiXin.cookProcess();
    }
}
