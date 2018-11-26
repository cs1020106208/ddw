package com.baizhi.service;
import java.util.List;
import java.util.Map;

import com.baizhi.entity.Product;
public interface ProductService{
	/**
	 * 获得Product数据的总行数
	 * @return
	 */
	//------------------
    int getProductRowCount();
	Map getBookByPage(int page, int rows);

	public void deleteMoney(int[] ids);

}