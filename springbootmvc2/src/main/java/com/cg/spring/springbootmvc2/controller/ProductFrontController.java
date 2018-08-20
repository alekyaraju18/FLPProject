package com.cg.spring.springbootmvc2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.spring.springbootmvc2.beans.Merchants;
import com.cg.spring.springbootmvc2.beans.Products;
import com.cg.spring.springbootmvc2.beans.ThirdPartyMerchants;
import com.cg.spring.springbootmvc2.beans.ThirdPartyProducts;

@RestController
public class ProductFrontController {

	@RequestMapping("/DisplayMerchants")
	public Merchants getMerchants(@RequestParam String id) {
		RestTemplate rt = new RestTemplate();
		Merchants p = rt.getForObject("http://localhost:9095/getMerchants?id=" + id, Merchants.class);
		return p;
	}
	@RequestMapping("/ListofAllMerchants")
	public List<Merchants> getMerchants() {
		RestTemplate rt1 = new RestTemplate();
		List<Merchants> p1 = rt1.getForObject("http://localhost:9095/Merchants", ArrayList.class);
		return p1;
	}
	@RequestMapping("/addmerchantsfront")
	public Merchants addMerchant(@RequestParam String id, @RequestParam String name,
			 @RequestParam String type,@RequestParam String organisation) {
		RestTemplate rt2 = new RestTemplate();
		Merchants p = rt2.getForObject(
				"http://localhost:9095/addMerchants?id=" + id + "&name=" + name +"&type=" + type+ "&organisation=" + organisation,
				Merchants.class);
		return p;
	}
	@RequestMapping("/DeleteMerchants")
	public Merchants deleteMerchant(@RequestParam String id) {
		RestTemplate rt3 = new RestTemplate();
		Merchants p = rt3.getForObject("http://localhost:9095/deleteMerchant?id=" + id, Merchants.class);
		return p;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping("/addproductsfront")
	public Products addProduct(@RequestParam String id, @RequestParam String name, @RequestParam String model,
			@RequestParam String price) {
		RestTemplate rt4 = new RestTemplate();
		Products p = rt4.getForObject(
				"http://localhost:9095/addProducts?id=" + id + "&name=" + name + "&model=" + model + "&price=" + price,
				Products.class);
		return p;
	}
	@RequestMapping("/DeleteProducts")

	public Products deleteProduct(@RequestParam String id) {
		RestTemplate rt5 = new RestTemplate();
		Products p = rt5.getForObject("http://localhost:9095/deleteProduct?id=" + id, Products.class);
		return p;
	}
	@RequestMapping("/DisplayProducts")
	public Products getProduct(@RequestParam String id) {
		RestTemplate rt6 = new RestTemplate();
		Products p = rt6.getForObject("http://localhost:9095/getProducts?id=" + id, Products.class);
		return p;
	}
	@RequestMapping("/ListofAllProducts")
	public List<Products> getProduct() {
		System.out.println("sd");
		RestTemplate rt7 = new RestTemplate();
		List<Products> p1 = rt7.getForObject("http://localhost:9095/Products", ArrayList.class);
		return p1;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping("/DisplayThirdPartyMerchants")
	public ThirdPartyMerchants getThirdPartyMerchants(@RequestParam String id) {
		RestTemplate rt8 = new RestTemplate();
		ThirdPartyMerchants m = rt8.getForObject("http://localhost:9095/getThirdPartyMerchants?id="+ id, ThirdPartyMerchants.class);
		return m;
	}
	@RequestMapping("/ListofAllThirdPartyMerchants")
	public List<ThirdPartyMerchants> getThirdPartyMerchants() {
		RestTemplate rt9 = new RestTemplate();
		List<ThirdPartyMerchants> m1 = rt9.getForObject("http://localhost:9095/ThirdPartyMerchants", ArrayList.class);
		return m1;
	}
	@RequestMapping("/addThirdPartyMerchants")
	public ThirdPartyMerchants addThirdPartyMerchant(@RequestParam String id, @RequestParam String name,
			@RequestParam String type,@RequestParam String organisation) {
		RestTemplate rt10 = new RestTemplate();
		ThirdPartyMerchants m = rt10.getForObject(
				"http://localhost:9095/addThirdPartyMerchants?id=" + id + "&name=" + name +"&type=" + type + "&organisation=" + organisation,
				ThirdPartyMerchants.class);
		return m;
	}
	@RequestMapping("/DeleteThirdPartyMerchants")
	public ThirdPartyMerchants deleteThirdPartyMerchant(@RequestParam String id) {
		RestTemplate rt11 = new RestTemplate();
		ThirdPartyMerchants m = rt11.getForObject("http://localhost:9095/deleteThirdPartyMerchant?id=" + id, ThirdPartyMerchants.class);
		return m;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping("/addThirdPartyProductsfront")
	public ThirdPartyProducts addThirdPartyProduct(@RequestParam String id, @RequestParam String name, @RequestParam String model,
			@RequestParam String price) {
		RestTemplate rt12 = new RestTemplate();
		ThirdPartyProducts p = rt12.getForObject(
				"http://localhost:9095/addThirdPartyProducts?id=" + id + "&name=" + name + "&model=" + model + "&price=" + price,
				ThirdPartyProducts.class);
		return p;
	}
	@RequestMapping("/DeleteThirdPartyProducts")

	public ThirdPartyProducts deleteThirdPartyProducts(@RequestParam String id) {
		RestTemplate rt13 = new RestTemplate();
		ThirdPartyProducts p = rt13.getForObject("http://localhost:9095/deleteThirdPartyProduct?id=" + id, ThirdPartyProducts.class);
		return p;
	}
	@RequestMapping("/DisplayThirdPartyProducts")
	public ThirdPartyProducts getThirdPartyProduct(@RequestParam String id) {
		RestTemplate rt14 = new RestTemplate();
		ThirdPartyProducts p = rt14.getForObject("http://localhost:9095/getThirdPartyProducts?id=" + id, ThirdPartyProducts.class);
		return p;
	}
	@RequestMapping("/ListofAllThirdPartyProducts")
	public List<ThirdPartyProducts> getThirdPartyProduct() {
		System.out.println("sd");
		RestTemplate rt7 = new RestTemplate();
		List<ThirdPartyProducts> p1 = rt7.getForObject("http://localhost:9095/ThirdPartyProducts", ArrayList.class);
		return p1;
	}
}