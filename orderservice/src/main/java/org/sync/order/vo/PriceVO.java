package org.sync.order.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pricedetails")
public class PriceVO {
	
	@Id
	String priceId;
	String productId;
	String orderId;
	String productName;
	String productPrice;
	
	
	public String getPriceId() {
		return priceId;
	}
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "PriceVO [priceId=" + priceId + ", productId=" + productId + ", orderId=" + orderId + ", productName="
				+ productName + ", productPrice=" + productPrice + "]";
	}
	
	
}
