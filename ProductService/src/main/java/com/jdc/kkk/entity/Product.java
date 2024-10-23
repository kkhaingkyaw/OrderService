package com.jdc.kkk.entity;



import lombok.Data;

@Data
public class Product {
	private Long id;
	
	private String name;
	
	public Product(Long id, String name){
		this.id=id;
		this.name=name;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder{
		private Long id;
		
		private String name;
		
		public Builder setId(Long id) {
			this.id=id;
			return this;
		}
		
		public Builder setName(String name) {
			this.name=name;
			return this;
			
		}
		
		public Product build() {
			return new Product(id,name);
		}
		
	}

}
