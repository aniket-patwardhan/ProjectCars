package com.example.demo.mapper;

import com.example.demo.dto.BrandsDTO;
import com.example.demo.dto.MemberInfoDTO;
import com.example.demo.jpa.Brands;
import com.example.demo.jpa.MemberInfo;

public class EntityModelMapper {
	
	public static MemberInfoDTO memberEntityToModel(MemberInfo memberInfo) {
		MemberInfoDTO memberInfoDTO = new MemberInfoDTO();
		
		memberInfoDTO.setAuthKey(memberInfo.getAuthKey());
		memberInfoDTO.setDob(memberInfo.getDob());
		memberInfoDTO.setFirstName(memberInfo.getFirstName());
		memberInfoDTO.setLastName(memberInfo.getLastName());
		memberInfoDTO.setMemberId(memberInfo.getMemberId());
		memberInfoDTO.setSex(memberInfo.getSex());
		return memberInfoDTO;
	}
	
	public static BrandsDTO brandsEntityToModel(Brands brands) {
		BrandsDTO brandsDTO = new BrandsDTO();
		
		brandsDTO.setBrandId(brands.getBrandId());
		brandsDTO.setBrandName(brands.getBrandName());
		brandsDTO.setTwowheeler(brands.getTwowheeler());
		return brandsDTO;
	}

}
