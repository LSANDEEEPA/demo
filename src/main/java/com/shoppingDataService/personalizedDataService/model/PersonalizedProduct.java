package com.shoppingDataService.app.model;

@Entity
@Getter
@Setter
public class PersonalizedProduct {
	@Id
	private String productId;
	private String shopperId;
	private List<ShelfItem> shelf;
}
