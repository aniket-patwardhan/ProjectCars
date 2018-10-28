package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.example.demo.dto.MemberInfoDTO;
import com.example.demo.jpa.MemberInfo;
import com.example.demo.mapper.EntityModelMapper;
import com.example.demo.repository.MemberInfoRepository;

@Service
public class MemberInfoService {
	
	@Autowired
	private MemberInfoRepository memberInfoRespository;
	
	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	public ResponseEntity<?> getMemberInfo(String authKey) {
		ResponseEntity<List<MemberInfoDTO>> responseEntity;
		try {
			Stream<MemberInfo> memberInfos = memberInfoRespository.streamGetMemberInfo(authKey);
			List<MemberInfoDTO> memberInfoDTOs = memberInfos.map(EntityModelMapper::memberEntityToModel).collect(Collectors.toList());
			responseEntity = ResponseEntity.ok(memberInfoDTOs);
		} catch (Exception ex) {
			responseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(null);
		}
			
		return responseEntity;
		}
	
	
	@Transactional
	public ResponseEntity<?> postMemberInfo(MemberInfoDTO memberInfoDTO) {
		ResponseEntity<?> responseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		MemberInfo memberInfo = new MemberInfo();
		try {
           
			memberInfo.setAuthKey(memberInfoDTO.getAuthKey());
			memberInfo.setMemberId(memberInfoDTO.getMemberId());
			memberInfo.setFirstName(memberInfoDTO.getFirstName());
			memberInfo.setLastName(memberInfoDTO.getLastName());
			memberInfo.setDob(memberInfoDTO.getDob());
			memberInfo.setSex(memberInfoDTO.getSex());
		
            entityManager.persist(memberInfo);  
		
            responseEntity = ResponseEntity.ok(EntityModelMapper.memberEntityToModel(memberInfo));
           }catch (Exception ex) {
        	   responseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
           }
           return responseEntity;
}
}
           

	

	
	



