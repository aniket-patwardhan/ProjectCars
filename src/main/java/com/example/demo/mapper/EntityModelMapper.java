package com.example.demo.mapper;

import com.example.demo.dto.MemberInfoDTO;
import com.example.demo.jpa.MemberInfo;

public class EntityModelMapper {
	
	public static MemberInfoDTO memberEntityToModel (MemberInfo memberInfo) {
		MemberInfoDTO memberInfoDTO = new MemberInfoDTO();
		
		memberInfoDTO.setAuthKey(memberInfo.getAuthKey());
		memberInfoDTO.setDob(memberInfo.getDob());
		memberInfoDTO.setFirstName(memberInfo.getFirstName());
		memberInfoDTO.setLastName(memberInfo.getLastName());
		memberInfoDTO.setMemberId(memberInfo.getMemberId());
		memberInfoDTO.setSex(memberInfo.getSex());
		return memberInfoDTO;
	}

}
