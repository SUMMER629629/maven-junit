package edu.zju.cst.w3.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.zju.cst.w3.modol.Stock;

public class Cache {

    private volatile static Map<String, Stock> map = new HashMap<>();

    private Cache() { }

    private volatile static Cache cacheManager = null;

    public static Cache getInstance() {
        if (null == cacheManager) {
            synchronized (Cache.class) {
                if (null == cacheManager) {
                    cacheManager = new Cache();
                }
            }
        }

        return cacheManager;
    }

//    public Map<String, Stock> getMap() {
//        return map;
//    }

    /**
     * 根据股票id查找股票信息
     */
    public Stock get(String id) {
        return map.get(id);
    }

    /**
     * 插入缓存数据
     */
    public Stock put(String id, Stock stock) {
        return map.put(id, stock);
    }

    /**
     * 获取map的key 即股票的id
     */
    public List<String> getKey() {
        List<String> list = new ArrayList<>();
        list.addAll(map.keySet());
        return list;
    }

}
