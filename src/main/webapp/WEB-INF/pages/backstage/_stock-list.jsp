<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>库存查询</title>
</head>

<body>
    <div id="goodsListDiv" v-cloak>
        <!-- 分页表格 -->
        <div>
            <div class="grid-btn">
                <div class="form-group col-xs-2">
                    <select class="form-control" v-model="q.goodsStatus" data-live-search="true">
                        <option value="">全部状态</option>
                        <option value="true">启用</option>
                        <option value="false">禁用</option>
                    </select>
                </div>
                <div class="form-group col-xs-2">
                    <select class="form-control" v-model="q.goodsBrand" data-live-search="true">
                        <option value="">全部品牌</option>
                        <option v-for="brand in goods_brands" :value="brand.brandName">{{brand.brandName}}</option>
                    </select>
                </div>
                <div class="form-group col-xs-2">
                    <select class="form-control" v-model="q.categoryName" data-live-search="true">
                        <option value="">全部分类</option>
                        <option v-for="category in goods_categorys" :value="category.name">{{category.prefix+category.name}}</option>
                    </select>
                </div>
                <div class="form-group col-xs-2">
                    <select class="form-control" v-model="q.goodsTag" data-live-search="true">
                        <option value="">全部标签</option>
                        <option v-for="tag in goods_tags" :value="tag.tagName">{{tag.tagName}}</option>
                    </select>
                </div>
                <div class="form-group col-xs-2">
                    <select class="form-control" v-model="q.supplierName" data-live-search="true">
                        <option value="">全部供货商</option>
                        <option v-for="supplier in goods_suppliers" :value="supplier">{{supplier}}</option>
                    </select>
                </div>
                <div class="clearfix"></div>
                <div class="form-group col-xs-3">
                    <input type="text" class="form-control" v-model="q.keyword" @keyup.enter="search" placeholder="条码/拼音码/商品名">
                </div>
                <div class="form-group col-xs-4">
                    <a class="btn btn-default" @click="search"><i class="fa fa-search"></i>&nbsp;搜索</a>
                    <a class="btn btn-default" @click="resetSearch"><i class="fa fa-undo"></i>&nbsp;刷新</a>
                </div>
                <div class="clearfix"></div>
            </div>
            <table id="jqGrid"></table>
            <div id="jqGridPager" style="height: 50px;"></div>
        </div>
        <!-- /.分页表格 -->
    </div>
    
    <script src="${ctx}/static/js/backstage/_goods-list/var-jqGrid-option.js"></script>
    <script src="${ctx}/static/js/backstage/_stock-list.js"></script>
    
</body>

</html>