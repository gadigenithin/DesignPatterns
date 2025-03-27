package com.designpatterns.creational.builder;

public class StoreItem {

	private final String name;
	private final Double price;
	private final String shortDescription;
	private final String longDescription;
	private final Integer stockAvailable;
	private final String packagingType;

	public StoreItem(StoreItemBuilder builder) {
		this.name = builder.name;
		this.price = builder.price;
		this.shortDescription = builder.shortDescription;
		this.longDescription = builder.longDescription;
		this.stockAvailable = builder.stockAvailable;
		this.packagingType = builder.packagingType;
	}

	public static class StoreItemBuilder {

		private String name;
		private Double price;
		private String shortDescription;
		private String longDescription;
		private Integer stockAvailable;
		private String packagingType;

		public StoreItemBuilder(String name, Double price) {
			this.name = name;
			this.price = price;
		}

		public StoreItemBuilder setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
			return this;
		}

		public StoreItemBuilder setLongDescription(String longDescription) {
			this.longDescription = longDescription;
			return this;
		}

		public StoreItemBuilder setStockAvailable(Integer stockAvailable) {
			this.stockAvailable = stockAvailable;
			return this;
		}

		public StoreItemBuilder setPackgingType(String packagingType) {
			this.packagingType = packagingType;
			return this;
		}

		public StoreItem build() {
			return new StoreItem(this);
		}

	}

	@Override
	public String toString() {
		return "StoreItem [name=" + name + ", price=" + price + ", shortDescription=" + shortDescription
				+ ", longDescription=" + longDescription + ", stockAvailable=" + stockAvailable + ", packagingType="
				+ packagingType + "]";
	}

}
