/**
 * Cash-Register
 * Copyright (c) 1995-2018 All Rights Reserved.
 */
package cn.cash.register.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cn.cash.register.dao.GoodsBrandMapper;
import cn.cash.register.dao.domain.GoodsBrand;
import cn.cash.register.service.GoodsBrandService;
import cn.cash.register.util.LogUtil;

/**
 * 商品品牌服务接口实现类
 * <p>实现商品品牌的增、删、改、查</p>
 * @author HuHui
 * @version $Id: GoodsBrandServiceImpl.java, v 0.1 2018年4月17日 下午4:24:29 HuHui Exp $
 */
@Service
public class GoodsBrandServiceImpl implements GoodsBrandService {

    private static final Logger logger = LoggerFactory.getLogger(GoodsBrandServiceImpl.class);

    @Resource
    private GoodsBrandMapper    brandMapper;

    @Override
    public Long addBrand(String brandName) {
        LogUtil.info(logger, "收到增加商品品牌请求");
        GoodsBrand brand = new GoodsBrand();
        brand.setBrandName(brandName);
        brand.setGmtCreate(new Date());

        return brandMapper.insertSelective(brand);
    }

    @Override
    public List<GoodsBrand> queryAll() {
        LogUtil.info(logger, "收到查询所有商品品牌请求");

        List<GoodsBrand> brands = new ArrayList<>();
        brands.addAll(brandMapper.selectAll());

        LogUtil.info(logger, "商品品牌查询结果,数量:{0}", brands.size());

        return brands;
    }

    @Override
    public int update(GoodsBrand brand) {
        if (brand == null) {
            return 0;
        }

        LogUtil.info(logger, "收到商品品牌修改请求,brandId={0}", brand.getId());

        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int delete(Long brandId) {
        LogUtil.info(logger, "收到商品品牌删除请求,brandId={0}", brandId);

        return brandMapper.deleteByPrimaryKey(brandId);
    }

}
