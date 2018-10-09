package edu.zju.cst.w3.dao;

import java.util.Date;
import java.util.List;

public interface IStockDAO {

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
    String getStockName(String stockId);

    /**
     * 查找所有股票id
     */
    List<String> getStockIdList();
}
