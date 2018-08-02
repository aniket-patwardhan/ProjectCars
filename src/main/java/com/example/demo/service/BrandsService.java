package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.dto.BrandsDTO;
import com.example.demo.jpa.Brands;
import com.example.demo.mapper.EntityModelMapper;
import com.example.demo.repository.MemberInfoRepository;

@Service
public class BrandsService {
	
	@Autowired
	private MemberInfoRepository memberInfoRespository;
	
	@Transactional
	public ResponseEntity<?> getBrands() {
		ResponseEntity<List<BrandsDTO>> responseEntity;
		try {
			Stream<Brands> brandsInfos = memberInfoRespository.streamGetbrandsInfo();
			List<BrandsDTO> brandsInfoDTOs = brandsInfos.map(EntityModelMapper::brandsEntityToModel).collect(Collectors.toList());
			responseEntity = ResponseEntity.ok(brandsInfoDTOs);
		} catch (Exception ex) {
			responseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(null);
		}
			
		return responseEntity;
		}

}
