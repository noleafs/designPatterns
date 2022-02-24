package com.designpatterns.pattern.iterator;

/**
 * @author tanyun
 * @Description 抽象迭代器角色接口
 * @date 2022/2/23 20:30
 */
public interface StudentIterator {

    /**
     * 判断是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     * @return
     */
    Student next();
}
