/**
 * Cash-Register
 * Copyright (c) 1995-2018 All Rights Reserved.
 */
package cn.cash.register.service;

import java.util.LinkedHashSet;
import java.util.Set;

import cn.cash.register.dao.domain.GoodsCategory;
import cn.cash.register.dao.domain.GoodsCategoryNode;

/**
 * 商品种类服务接口
 * @author HuHui
 * @version $Id: GoodsCategoryService.java, v 0.1 2018年4月17日 下午5:10:52 HuHui Exp $
 */
public interface GoodsCategoryService {

    /**
     * 增加商品种类
     * <p>传入的GoodsCategory参数没有ID字段,增加成功后返回记录的<strong>主键<strong></p>
     * @param category 商品种类对象
     */
    long add(GoodsCategory category);

    /**
     * 删除商品种类
     * <p>该删除删除会将该结点及其子孙结点都删除</p>
     * @param categoryId
     */
    void delete(Long categoryId);

    /**
     * 修改商品种类
     * @return
     */
    int update(GoodsCategory category);

    /**
     * 查收所有商品种类
     * <p>商品种类将以{@link LinkedHashSet}返回每个结点的子结点,并以创建时间顺序排序 </p>
     * @return
     */
    Set<GoodsCategoryNode> queryAll();

}