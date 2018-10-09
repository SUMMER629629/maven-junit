package edu.zju.cst.w3.service;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.zju.cst.w3.dao.IStockDAO;
import edu.zju.cst.w3.dao.StockDao;
import edu.zju.cst.w3.modol.Stock;
import edu.zju.cst.w3.util.Cache;

public class StockServiceTest {
    
    private IStockDAO stockDao;
    private IStockService stockService;
    private Stock stock;

    private Cache cache;

    @Before
    public void setUp() {
        stockDao = new StockDao();
        stockService = new StockService(stockDao);
        stock = new Stock("111111", "22222", 1.0, new Date());
        cache = Cache.getInstance();
        cache.put("111111", stock);
    }
    
    @Test
    public void getStockClosingPriceTest() {
        double actual =stockService.getStockClosingPrice("111111", new Date());
        double expected = 1.0;
        Assert.assertEquals(expected, actual,0.001);
    }
    
    @Test
    public void insertStockClosingPriceTest() {
        try {
            Date date = new Date();
            stockService.insertStockClosingPrice("222222", date, 12.0);
            double actual = stockService.getStockClosingPrice("222222", date);
            double expected = 12.0;
            Assert.assertEquals(expected, actual,0.001);
        } catch(Exception e) {
            Assert.assertEquals("数据格式错误", e.getCause().getMessage());
        }
    }
    
    @Test
    public void getStockNameTest() {
        String actual = stockService.getStockName("111111");
        String expected = "22222";
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testGetStockIdList() throws Exception {
        List<String> stockIdList = stockService.getStockIdList();
        System.out.println("Stock ids:");
        for (String stockId : stockIdList) {
            System.out.print(stockId + " ");
        }
        System.out.println();
    }
    
    @Test
    public void getBestStockTest() {
        
    }

    @After
    public void tearDown() {

    }
}
