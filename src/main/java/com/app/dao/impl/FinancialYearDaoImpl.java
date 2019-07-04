package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.FinancialYear;
import com.app.repo.FinancialYearRepository;
import com.app.service.IFinancialYearService;

@Repository
public class FinancialYearDaoImpl implements IFinancialYearService{

	@Autowired
	private FinancialYearRepository repo;
	@Transactional
	public Integer saveFinancialYear(FinancialYear f) {
		f=repo.save(f);
		return f.getfId();
	}
	@Transactional
	public List<FinancialYear> getYear(){
		return repo.findAll();
	}

}
