package com.example.demo.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.jpa.Brands;
import com.example.demo.jpa.MemberInfo;


public interface MemberInfoRepository extends CrudRepository<MemberInfo, String> {
	
	
	@Query("select mem from memberInfo mem "  
	     + "where mem.authKey = ?1")
	    public Stream<MemberInfo> streamGetMemberInfo(String authKey);
	
	@Query("select br from brandInfo br ")
	public Stream<Brands> streamGetbrandsInfo();

}
