package com.designpatterns.creational.builder;

public class BuilderDemo {

    
	public static void main(String[] args) {

		var item1 = new StoreItem.StoreItemBuilder("Pretzel", 2.0).setShortDescription("Tasty Snack")
				.setStockAvailable(2).setPackgingType("paper").build();

		var item2 = new StoreItem.StoreItemBuilder("Soup", 15.0)
				.setLongDescription("A meal that you can warm it up at home").setStockAvailable(20)
				.setPackgingType("can").build();
		
		addToItemRegistry(item1);
		addToItemRegistry(item2);

	}
	
	private static void addToItemRegistry(StoreItem storeItem) {
		System.out.println("A new Item was added to the Registry: \n" + storeItem);
	}


}
