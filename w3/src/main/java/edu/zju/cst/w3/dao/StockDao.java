package edu.zju.cst.w3.dao;

import java.util.Date;
import java.util.List;
import edu.zju.cst.w3.modol.Stock;
import edu.zju.cst.w3.util.Cache;


public class StockDao implements IStockDAO {

    private Cache cache = Cache.getInstance();

    @Override
    public double getStockClosingPrice(String stockId, Date date) {
        // 根据股票id查找
        Stock stock = cache.get(stockId);
        // 对比日期
        if (date.equals(stock.getDate())) {
            return stock.getClosingPrice();
        }

        throw new RuntimeException("can not find this stock.");
    }

    @Override
    public void insertStockClosingPrice(String stockId, Date date, double closingPrice) {
        Stock stock = new Stock();
        stock.setId(stockId);
        stock.setDate(date);
        stock.setClosingPrice(closingPrice);

        // 插入缓存数据
        cache.put(stockId, stock);
    }

    @Override
    public String getStockName(String stockId) {
        Stock stock = cache.get(stockId);
        // 由于没有插入股票名称 这里都是 null
        return stock.getName();
    }

    @Override
    public List<String> getStockIdList() {
        return cache.getKey();
    }
}
