package org.sync.price.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sync.price.service.PriceService;
import org.sync.price.vo.PriceVO;

@RestController
public class PriceController {
	
	@Autowired
	PriceService service;
	
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
	@RequestMapping(value="/getPrices", method=RequestMethod.GET)
	public List<PriceVO> getPrice() {
		System.out.println("----getPrice::Controller ----------");
		return service.getPriceData();
	}
	
	@RequestMapping(value="/getPriceByOrder", method=RequestMethod.GET, produces = "application/json")
	public List<PriceVO> getPriceByOrderId(@RequestParam(name = "orderId",defaultValue = "AC433") String orderId) {
		System.out.println("----getPrice::Controller ----------");
		return service.getPriceByOrderId(orderId);
	}

}
