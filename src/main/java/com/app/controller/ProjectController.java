package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Billing;
import com.app.model.FinancialYear;
import com.app.model.Location;
import com.app.model.PerformaInvoice;
import com.app.model.Product;
import com.app.model.ProjectDetails;
import com.app.model.ProjectStatus;
import com.app.service.ProductService;
import com.app.service.impl.FinancialYearServiceImpl;
import com.app.service.impl.LocationServiceImpl;
import com.app.service.impl.ProjectStatusServiceImpl;

@Controller
@RequestMapping("/product")
public class ProjectController {
	@Autowired
	private ProductService service;

	@Autowired
	private ProjectStatusServiceImpl ser1;
	@Autowired
	private LocationServiceImpl ser2;
	@Autowired
	private FinancialYearServiceImpl ser3;

	//1. Show Product Form with Backing Object
	@RequestMapping("/reg")
	public String showReg(ModelMap map) {
		
		//Read Status from DB
		List<ProjectStatus> status=ser1.getStatus();
		
		//send to UI
		map.addAttribute("status", status);

		//Read All Location from DB
		List<Location> loc = ser2.getLocation();
		map.addAttribute("loc", loc);
		
		//Read Financial Year
		List<FinancialYear> finYear = ser3.getYear();
		map.addAttribute("finYear", finYear);
		//Form Backing Object
		map.addAttribute("projectDetails", new ProjectDetails());
		map.addAttribute("performaInvoice", new PerformaInvoice());
		map.addAttribute("billing", new Billing());
		return "Register";
	}

	//2. Read Form Data on click submit
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute ProjectDetails pd,ModelMap map)
	{
		System.out.println(pd);
		/*
		 * //call service layer //Integer id=service.saveProduct(product);
		 * map.addAttribute("message", "Product '"+id+"' created!!"); //clean Form
		 * Backing Object map.addAttribute("product", new Product());
		 */
		return "Register";
	}


	//3. Fetch all Rows from DB to UI
	@RequestMapping("/all")
	public String showAll(Model map) {
		//fetch all rows from DB
		List<Product> obs=service.getAllProducts();
		//send to UI
		map.addAttribute("list", obs);
		return "Data";
	}
	
	@RequestMapping(value="/display")
	public String diplay()
	{
	
		return "index";
	}


}



