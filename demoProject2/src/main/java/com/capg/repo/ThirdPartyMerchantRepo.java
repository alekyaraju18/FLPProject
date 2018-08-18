package com.capg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.bean.ThirdPartyMerchants;

@Repository
public interface ThirdPartyMerchantRepo extends CrudRepository<ThirdPartyMerchants, Integer>{

}
