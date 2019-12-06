package org.sync.orderservice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.sync.order.service.OrderService;
import org.sync.order.vo.PriceVO;

@RunWith(SpringJUnit4ClassRunner.class)
public class OrderControllerTest {

	/*
	 * @Mock private ToDoRepository toDoRepository;
	 * 
	 * @InjectMocks private ToDoServiceImpl toDoService;
	 */
	
	@Mock
	private OrderService service;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAllOrders(){
		
		List<PriceVO> result = new ArrayList();
		result.add(new PriceVO());
		result.add(new PriceVO());
		result.add(new PriceVO());
		when(service.getOrderDetails()).thenReturn(result);
		assertEquals(3, result.size());
	}
	
}
