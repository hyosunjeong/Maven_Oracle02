package com.biz.oracle.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.biz.oracle.dao.ScoreDao;
import com.biz.oracle.dao.StdDao;

public class OracleSqlFactory {

	SqlSessionFactory sessionFactory;
	

	public SqlSessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		return sessionFactory;
	}
	
	
	public OracleSqlFactory() {
		
		Properties props = new Properties();
		
		props.put("DRVIER", DBContract.ORACLE_PRO.Driver);
		props.put("URL",DBContract.ORACLE_PRO.url);
		props.put("USER",DBContract.ORACLE_PRO.user);
		props.put("PASSWORD",DBContract.ORACLE_PRO.password);
		
		DataSourceFactory dataSourceFactory = new StdDataSourceFactory();
		dataSourceFactory.setProperties(props);
		
		DataSource dataSource = dataSourceFactory.getDataSource();
		
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		
		Environment environment = new Environment("GradeENV",transactionFactory,dataSource);
		
		Configuration config = new Configuration(environment);
		config.addMapper(StdDao.class);
		config.addMapper(ScoreDao.class);
		
		this.sessionFactory = new SqlSessionFactoryBuilder().build(config);
	}
}
	
	
	


