package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.impl.FinancialYearDaoImpl;
import com.app.model.FinancialYear;
import com.app.service.IFinancialYearService;

@Service
public class FinancialYearServiceImpl implements IFinancialYearService{

	@Autowired
	private FinancialYearDaoImpl dao;
	public Integer saveFinancialYear(FinancialYear f) {
		return dao.saveFinancialYear(f);
	}
	
	public List<FinancialYear> getYear(){
		return dao.getYear();
	}
}
