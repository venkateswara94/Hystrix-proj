package org.sync.price.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.sync.price.dao.PriceDAO;
import org.sync.price.vo.PriceVO;

@Component
public class PriceService {
	
	//@Autowired
	//PriceRepository repository;
	
	private final PriceDAO priceRepository;

	public PriceService(PriceDAO priceRepository) {
		this.priceRepository = priceRepository;
	}
	
	
	/*
	 * public PriceVO getPriceData() {
	 * System.out.println("----SERVICE::GET PRICE ----------"); PriceVO priceVO =
	 * new PriceVO(); priceVO.setPriceId("P-100"); priceVO.setProductName("CPU");
	 * priceVO.setProductId("Dell020"); priceVO.setProductPrice("9400");
	 * 
	 * return priceVO; }
	 */
	
	public List<PriceVO> getPriceData() {
		System.out.println("----SERVICE::GET PRICE ----------");
		List<PriceVO> priceList = priceRepository.findAll();
		System.out.println("<<<<<"+priceList+">>>>");
		return priceList;
	}

	public List<PriceVO> getPriceByOrderId(String orderId) {
		System.out.println("getPriceByProductId....."+orderId);
		//return priceRepository.findById(productId);
		return priceRepository.findByOrderId(orderId);
	}
}
