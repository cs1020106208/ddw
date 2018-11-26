package com.baizhi.service.Impl;
import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baizhi.dao.Dao;
import com.baizhi.dao.ProductDao;
import com.baizhi.entity.Product;
import com.baizhi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;

    @Override
    public int getProductRowCount() {
        return 0;
    }

    @Override
    public Map getBookByPage(int page, int rows) {

        Map map =new HashMap();


        //获取记录数
        int total=productDao.getProductRowCount();

        int start=(page-1)*rows;
        int end=page*rows;

        List<Product> productList=productDao.getBookByPage(start,end);
        map.put("total", total);
        map.put("rows",productList);
        return map;
    }

    @Override
    public void deleteMoney(int[] ids) {

        productDao.deleteMoney(ids);
    }
/*
    @Override
    public Product selectOneProduct(int id){

        return productDao.selectOneProduct(id);
    }



    @Override
    public void updateProduct(Product product){
        productDao.upadateProduct(product);
    }




    @Override
    public void insertProduct(Product product) {

        productDao.insertProduct(product);
    }
*/


}