package edu.zju.cst.w3.service;

import java.util.Date;
import java.util.List;

public interface IStockService {

    /**
     * 获取股票收盘价
     */
    double getStockClosingPrice(String stockId, Date date);

    /**
     * 插入某一天的收盘价格
     */
    void insertStockClosingPrice(String stockId, Date date, double closingPrice);

    /**
     * 根据股票id 查找股票名称
     */
    String getStockName(String id);

    /**
     * 查找所有股票id
     */
    List<String> getStockIdList();

    /**
     * 获取指定时间内涨幅最高的股票，包括首尾两天，返回该股票代码
     */
    String getBestStock(Date startDate, Date endDate);
}