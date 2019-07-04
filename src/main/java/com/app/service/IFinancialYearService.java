package com.app.service;


import java.util.List;

import com.app.model.FinancialYear;

public interface IFinancialYearService {

	public Integer saveFinancialYear(FinancialYear f);
	public List<FinancialYear> getYear();
}
