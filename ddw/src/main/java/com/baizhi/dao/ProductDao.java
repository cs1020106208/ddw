package com.baizhi.dao;
import com.baizhi.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;
public interface ProductDao{
	/**
	 * 获得Product数据的总行数
	 * @return
	 */
    int getProductRowCount();

    public List<Product> getBookByPage(@Param("start")int start, @Param("end")int end);
	public void deleteMoney(int[] ids);
	public void insertProduct(Product product);
   /* public Product selectOneProduct(int id);
    public void upadateProduct(Product product);
    public void insertProduct(Product product);*/
}