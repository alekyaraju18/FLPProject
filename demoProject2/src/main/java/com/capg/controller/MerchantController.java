package com.capg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.bean.Merchants;
import com.capg.bean.Products;
import com.capg.bean.ThirdPartyMerchants;
import com.capg.bean.ThirdPartyProducts;
import com.capg.service.MerchantService;
import com.capg.service.ProductService;
import com.capg.service.ThirdPartyMerchantService;
import com.capg.service.ThirdPartyProductService;

@RestController
public class MerchantController {

	@Autowired
	MerchantService service;
	@Autowired
	ProductService service1;
	@Autowired
	ThirdPartyMerchantService service2;
	@Autowired
	ThirdPartyProductService service3;
	///////////////////////////////////////////////////////////////////////////////////
	@RequestMapping("/getMerchants")
	public Optional<Merchants> getMerchantById(@RequestParam String id) {
		return service.getMerchantById(Integer.parseInt(id));
	}

	@RequestMapping(value = "/Merchants")
	public List<Merchants> getMerchants() {

		Iterable<Merchants> merchants = service.findAll();
		return (List<Merchants>) merchants;

	}

	@RequestMapping(value = "/addMerchants{id}{name}{type}{organisation}")
	void addMerchant(@RequestParam String id, @RequestParam String name,@RequestParam String type, @RequestParam String organisation) {

		service.addMerchant(Integer.parseInt(id), name,type, organisation);
		System.out.println("Added Successfully");
	}

	@RequestMapping("/deleteMerchant")
	public void deleteMerchantById(@RequestParam String id) {
		service.deleteMerchantById(Integer.parseInt(id));
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////

	@RequestMapping(value = "/addProducts{id}{name}{model}{price}")
	void addProduct(@RequestParam String id, @RequestParam String name, @RequestParam String model,@RequestParam String price) {

		service1.addProduct(Integer.parseInt(id), name, model,price);
		System.out.println("Added Successfully");
	}
	@RequestMapping("/deleteProduct")
	public void deleteProductById(@RequestParam String id) {
		service1.deleteProductById(Integer.parseInt(id));
	}
	@RequestMapping("/getProducts")
	public Optional<Products> getProductById(@RequestParam String id) {
		return service1.getProductsById(Integer.parseInt(id));
	}
	
	@RequestMapping(value ="/Products")
	public List<Products> getProducts() {

		Iterable<Products> products = service1.findAll();
		return (List<Products>) products;

	}
	//////////////////////////////////////////////////////////////////////////////////

	@RequestMapping("/getThirdPartyMerchants")
	public Optional<ThirdPartyMerchants> getThirdPartyMerchantById(@RequestParam String id) {
		return service2.getThirdPartyMerchantById(Integer.parseInt(id));
	}

	@RequestMapping(value = "/ThirdPartyMerchants")
	public List<ThirdPartyMerchants> getThirdPartyMerchants() {

		Iterable<ThirdPartyMerchants> thirdmerchants = service2.findAll();
		return (List<ThirdPartyMerchants>) thirdmerchants;

	}

	@RequestMapping(value = "/addThirdPartyMerchants{id}{name}{type}{organisation}")
	void addThirdPartyMerchant(@RequestParam String id, @RequestParam String name,@RequestParam String type, @RequestParam String organisation) {

		service2.addThirdPartyMerchant(Integer.parseInt(id), name,type,organisation);
		System.out.println("Added Successfully");
	}

	@RequestMapping("/deleteThirdPartyMerchant")
	public void deleteThirdPartyMerchantById(@RequestParam String id) {
		service2.deleteThirdPartyMerchantById(Integer.parseInt(id));
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/addThirdPartyProducts{id}{name}{model}{price}")
	void addThirdPartyProduct(@RequestParam String id, @RequestParam String name, @RequestParam String model,@RequestParam String price) {

		service3.addThirdPartyProduct(Integer.parseInt(id), name, model,price);
		System.out.println("Added Successfully");
	}
	@RequestMapping("/deleteThirdPartyProduct")
	public void deleteThirdPartyProductById(@RequestParam String id) {
		service3.deleteThirdPartyProductById(Integer.parseInt(id));
	}
	@RequestMapping("/getThirdPartyProducts")
	public Optional<ThirdPartyProducts> getThirdPartyProductById(@RequestParam String id) {
		return service3.getThirdPartyProductsById(Integer.parseInt(id));
	}
	
	@RequestMapping(value ="/ThirdPartyProducts")
	public List<ThirdPartyProducts> getThirdPartyProducts() {

		Iterable<ThirdPartyProducts> thirdproducts = service3.findAll();
		return (List<ThirdPartyProducts>) thirdproducts;

	}
}
