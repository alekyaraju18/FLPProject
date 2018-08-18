package com.capg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.bean.ThirdPartyProducts;

@Repository
public interface ThirdPartyProductRepo extends CrudRepository<ThirdPartyProducts, Integer> {

}
