package io.cms.springbootwithsql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.cms.springbootwithsql.dao.StockDao;
import io.cms.springbootwithsql.model.Stock;
import io.cms.springbootwithsql.service.bo.StockBo;

@Service("stockBo")
public class StockBoImpl implements StockBo{
	
	@Autowired
	StockDao stockDao;
	
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	@Override
	public void save(Stock stock) {
		stockDao.save(stock);	
	}

	@Override
	public void update(Stock stock) {
		stockDao.update(stock);
	}

	@Override
	public void delete(Stock stock) {
		stockDao.delete(stock);
	}

	@Override
	public Stock findByStockCode(String stockCode) {
		return stockDao.findByStockCode(stockCode);
	}

}
