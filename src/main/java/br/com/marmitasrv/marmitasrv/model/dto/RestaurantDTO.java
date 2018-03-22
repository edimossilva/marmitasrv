package br.com.marmitasrv.marmitasrv.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RestaurantDTO {

	private Long id;

	private String name;
	private String address;
	private String phone;
	private String photo;

	private boolean open;

//	private LocalDate createdAt;
//
//	private BigDecimal minimumPrice;
//
//	private Integer minimumDeliveryTime;
//	private Integer maximumDeliveryTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
//
//	public LocalDate getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(LocalDate createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public BigDecimal getMinimumPrice() {
//		return minimumPrice;
//	}
//
//	public void setMinimumPrice(BigDecimal minimumPrice) {
//		this.minimumPrice = minimumPrice;
//	}
//
//	public Integer getMinimumDeliveryTime() {
//		return minimumDeliveryTime;
//	}
//
//	public void setMinimumDeliveryTime(Integer minimumDeliveryTime) {
//		this.minimumDeliveryTime = minimumDeliveryTime;
//	}
//
//	public Integer getMaximumDeliveryTime() {
//		return maximumDeliveryTime;
//	}
//
//	public void setMaximumDeliveryTime(Integer maximumDeliveryTime) {
//		this.maximumDeliveryTime = maximumDeliveryTime;
//	}

}
