package br.com.marmitasrv.marmitasrv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "restaurant")
public class Restaurant {
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String address;
	private String phone;
	private String photo;

	private boolean open;

	// private LocalDate createdAt;
	//
	// private BigDecimal minimumPrice;
	//
	// private Integer minimumDeliveryTime;
	// private Integer maximumDeliveryTime;

	public Restaurant() {

	}

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

}
