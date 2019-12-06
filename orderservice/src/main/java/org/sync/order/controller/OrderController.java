package org.sync.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sync.order.service.OrderService;
import org.sync.order.vo.PriceVO;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class OrderController {
	
	@Autowired
	OrderService service;	
	
	/*
	 * @Autowired RestTemplate restTemplate;
	 */
	
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
	@RequestMapping(value = "/getOrders", produces = "application/json")
	@HystrixCommand(fallbackMethod = "fallbackMethod1")
	public List<PriceVO> getOrders() {
	System.out.println("OrderController::getOrders>>>");
		
	return service.getOrderDetails();
	}
	
	@RequestMapping(value = "/getPriceByOrderId", produces = "application/json")
	public List<PriceVO> getPriceByOrderId(@RequestParam String orderId) {
	System.out.println("OrderController::getOrders");
		return service.getPriceByOrderId(orderId);
	}
	
	 public String  getOrders(int employeeid){
	    	
	    	return "Fallback response:: No Pricing details available temporarily";
	    }
	 
	 public List<PriceVO>  fallbackMethod1(){
	    	
		 List<PriceVO> list = new ArrayList<PriceVO>();
		 PriceVO p1 = new PriceVO();
		 p1.setProductName("TRY AFTER..Sometime.................");
		 list.add(p1);
	    	//return "Fallback response:: No Pricing details available temporarily";
	 return list;   
	 }
}
