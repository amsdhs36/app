package com.spring.app.food.form;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
public class ItemForm {
    @Min(value = 1)
    private Integer quantity;
    @NotEmpty
    private String productId;
    public ItemForm() {
		//TODO Auto-generated constructor stub
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public ItemForm(Integer quantity, String productId) {
		super();
		this.quantity = quantity;
		this.productId = productId;
	}
    
}
