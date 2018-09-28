package com.zycus.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zycus.entity.AuditLog;
import com.zycus.services.Services;

@RestController
public class AuditController {

	@Autowired
	Services ser;
	
	@RequestMapping(value = "/update/log", method = RequestMethod.POST)
	public AuditLog updateAuditShow(@RequestBody AuditLog log) {
		log.setDate(new Date());
		System.out.println("i am in audit controller");
		ser.updateLog(log);
		
		return log;
	}
}
