package com.medicare.model;

import java.util.Date;   
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore; 

@Entity
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String name;
	private int price;
	private String category;
	private int quantity;
	private String imageName;
	private String seller;
	private String descr;
	private Boolean active=true;
	@Transient
	private byte[] image;
	private Date date=new Date();
	@ManyToMany(mappedBy = "products",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Cart> carts;
	
	@ManyToMany(mappedBy = "products",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<OrderDetails> orderDetails;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Cart> getCarts() {
		return carts;
	}
	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, int price, String category, int quantity, String imageName, String seller,
			String descr, Boolean active, byte[] image, Date date, List<Cart> carts, List<OrderDetails> orderDetails) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.imageName = imageName;
		this.seller = seller;
		this.descr = descr;
		this.active = active;
		this.image = image;
		this.date = date;
		this.carts = carts;
		this.orderDetails = orderDetails;
	}
	 
}
