package org.sync.price.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.sync.price.vo.PriceVO;

@Repository
public interface PriceDAO extends MongoRepository<PriceVO, String>{

	@Query("{ 'orderId' : ?0 }")
	List<PriceVO> findByOrderId(String priceId);

}
