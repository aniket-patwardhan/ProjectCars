package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MemberInfoService;


@RestController
@RequestMapping
public class MemberInfoController {
	
	@Autowired
	private MemberInfoService memberInfoService;
	
	@RequestMapping(value = "getInfo/{authKey}", method = RequestMethod.GET)
	public ResponseEntity<?> getMemberInfo(@PathVariable("authKey") String authKey) {
		return memberInfoService.getMemberInfo(authKey);
	}

}
