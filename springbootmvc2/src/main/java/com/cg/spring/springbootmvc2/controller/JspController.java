package com.cg.spring.springbootmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JspController {

	@RequestMapping("/ManageMerchants")
	public String showMerchant() {
		return "ManageMerchants";
	}
	@RequestMapping("/DirectMerchants")
	public String showDirectMerchant() {
		return "DirectMerchants";
	}
	@RequestMapping("/ThirdPartyMerchants2")
	public String showThirdParty() {
		return "ThirdPartyMerchants2";
	}
	////////////////////////////////////
	@RequestMapping("/index")
	public String addMerchants(){
		return "index";
	}
	@RequestMapping("/DisplayAllMerchants")
	public String displayAllMerchants (){
		return "DisplayAllMerchants";
	}

	@RequestMapping("/Delete")
	public String deleteMerchant (){
		return "Delete";
	}

	@RequestMapping("/Display")
	public String displayMerchant (){
		return "Display";
	}

	@RequestMapping("/ManageProducts")
	public String showProduct() {
		return "ManageProducts";
	}
///////////////////////////////////////////////////
	@RequestMapping("/thirdpartyindex")
	public String addthirdpartyMerchants(){
		return "thirdpartyindex";
	}
	

	@RequestMapping("/Deletethirdpartymerchant")
	public String deletethirdpartyMerchant (){
		return "Deletethirdpartymerchant";
	}

	@RequestMapping("/Displaythirdpartymerchants")
	public String displaythirdpartyMerchant (){
		return "Displaythirdpartymerchants";
	}

	@RequestMapping("/managethirdpartyproducts")
	public String showthirdpartyProduct() {
		return "managethirdpartyproducts";
	}
	////////////////////////////////////////////////
	
	@RequestMapping("/index2")
	public String addProducts(){
		return "index2";
	}
	@RequestMapping("/DisplayProduct")
	public String displayProduct(){
		return "DisplayProduct";
	}
	@RequestMapping("/DeleteProduct")
	public String deleteProduct(){
		return "DeleteProduct";
	}

	@RequestMapping("/Products")
	public String Product(){
		return "Products";
	}
	//////////////////////////////////////////////////
	@RequestMapping("/addthirdpartyproducts")
	public String addthirdpartyProducts(){
		return "addthirdpartyproducts";
	}
	@RequestMapping("/displaythirdpartyproduct")
	public String displaythirdpartyProduct(){
		return "displaythirdpartyproduct";
	}
	@RequestMapping("/deletethirdpartyproduct")
	public String deletethirdpartyProduct(){
		return "deletethirdpartyproduct";
	}

	@RequestMapping("/Thirdpartyproducts")
	public String ThirdPartyProduct(){
		return "/Thirdpartyproducts";
	}
	
	
	}


