package com.capg.service;

import java.util.Optional;

import com.capg.bean.Merchants;
import com.capg.bean.ThirdPartyMerchants;

public interface ThirdPartyMerchantService {

	public Optional<ThirdPartyMerchants> getThirdPartyMerchantById(int id);

	public Iterable<ThirdPartyMerchants> findAll();

	public void addThirdPartyMerchant(int id, String name, String organization);

	public void deleteThirdPartyMerchantById(int id);


	

}
