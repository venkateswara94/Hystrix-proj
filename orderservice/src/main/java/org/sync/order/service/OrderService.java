package org.sync.order.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.sync.order.vo.PriceVO;

@Component
public class OrderService {
	
	
	
	/**
	 * getOrderDetails
	 * @return List<PriceVO>
	 */
	@SuppressWarnings("unchecked")
	public List<PriceVO> getOrderDetails() {
		    final String uri = "http://localhost:1981/price/getPrices";
		    RestTemplate restTemplate = new RestTemplate();
		    List<PriceVO> result = restTemplate.getForObject(uri, List.class);
		    System.out.println(">>OrderController::getOrder::restClient");
		    System.out.println(result);
		    return result;
	}
	
	/**
	 * method getPriceByOrderId
	 * @param orderId
	 * @return List<PriceVO>
	 */
	@SuppressWarnings("unchecked")
	public List<PriceVO> getPriceByOrderId(String orderId) {
		final String uri = "http://localhost:1981/price/getPriceByOrder?orderId="+orderId;
	    RestTemplate restTemplate = new RestTemplate();
	    List<PriceVO> result = restTemplate.getForObject(uri, List.class);
	    System.out.println(">>OrderController::getOrder::restClient");
	    System.out.println(result);
	    return result;
	}
	

}
