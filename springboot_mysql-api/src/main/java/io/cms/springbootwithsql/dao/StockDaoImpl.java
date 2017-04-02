package io.cms.springbootwithsql.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.cms.springbootwithmysql.util.CustomHibernateDaoSupport;
import io.cms.springbootwithsql.model.Stock;

import org.hibernate.SessionFactory;

@Repository("stockDao")
public class StockDaoImpl extends CustomHibernateDaoSupport implements StockDao{

	@Override
	public void save(Stock stock) {
		getHibernateTemplate().save(stock);
		
	}

	@Override
	public void update(Stock stock) {
		getHibernateTemplate().update(stock);
		
	}

	@Override
	public void delete(Stock stock) {
		//getHibernateTemplate().delete(stock);
		
	}

	@Override
	public Stock findByStockCode(String stockCode) {
		List list = getHibernateTemplate().find(
                "from Stock where stockCode=?",stockCode
           );
	return (Stock)list.get(0);
	}

}
