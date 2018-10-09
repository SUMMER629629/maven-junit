package edu.zju.cst.w3.service;

import java.util.Date;
import java.util.List;

import edu.zju.cst.w3.dao.IStockDAO;

public class StockService implements IStockService {

    private IStockDAO stockDao;

    public StockService(IStockDAO stockDao) {
        this.stockDao = stockDao;
    }

    @Override
    public double getStockClosingPrice(String stockId, Date date) {
        return stockDao.getStockClosingPrice(stockId, date);
    }

    @Override
    public void insertStockClosingPrice(String stockId, Date date, double closingPrice) {
        if(stockId.length() == 6 && closingPrice > 0) {
            stockDao.insertStockClosingPrice(stockId, date, closingPrice);
        }
//        else {
//             throw new RuntimeException("数据格式错误");
//        }
       
    }

    @Override
    public String getStockName(String id) {
        // 由于没有插入股票名称 这里都是 null
        return stockDao.getStockName(id);
    }

    @Override
    public List<String> getStockIdList() {
        return stockDao.getStockIdList();
    }

    @Override
    public String getBestStock(Date startDate, Date endDate) {
        return null;
    }
}
