package com.bajaj.javaoops;

// First
class Mobile {
	private String manufacturer;
	private String model;
	private String processor;
	private int ram;
	private int storage;
	
//	Constructor
	public Mobile(String manufacturer, String model, String processor, int ram, int storage) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
	}
	
//	Setter
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void setStorage(int storage) {
		this.storage = storage;
	}
	
//	Getter
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public int getRam() {
		return ram;
	}
	
	public int getStorage() {
		return storage;
	}
	
//	toString
	@Override
	public String toString() {
		return "Mobile [manufacturer=" + manufacturer + ", model=" + model + ", processor=" 
	+ processor + ", ram=" + ram + ", storage=" + storage +"]";
	}
}

//Second
class Laptop {
	private String manufacturer;
	private String model;
	private String processor;
	private int ram;
	private int hdd;
	private int ssd;
	
//	Constructor
	public Laptop(String manufacturer, String model, String processor, int ram, int hdd, int ssd) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.hdd = hdd;
		this.ssd = ssd;
	}
	
//	Setter
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	
//	Getter
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public int getRam() {
		return ram;
	}
	
	public int getHdd() {
		return hdd;
	}
	
	public int getSsd() {
		return ssd;
	}
	
//	toString
	@Override
	public String toString() {
		return "Laptop [manufacturer=" + manufacturer + ", model=" + model + ", processor=" 
	+ processor + ", RAM=" + ram + ", HDD=" + hdd +", SSD=" + ssd + "]";
	}
}

//Third
class Notebook {
	private String company;
	private int noOfPages;
	private int price;
	
//	Constructor
	public Notebook(String company, int noOfPages, int price) {
		this.company = company;
		this.noOfPages = noOfPages;
		this.price = price;
	}
	
//	Setter
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
//	Getter
	public String getCompany() {
		return company;
	}
	
	public int getNoOfPages() {
		return noOfPages;
	}
	
	public int getPrice() {
		return price;
	}
	
//	toString
	@Override
	public String toString() {
		return "Notebook [company=" + company + ", noOfPages=" + noOfPages + ", price=" + price + "]";
	}
}

//Fourth
class Eraser {
	private String company;
	private int price;
	
//	Constructor
	public Eraser(String company, int price) {
		this.company = company;
		this.price = price;
	}
	
//	Setter
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
//	Getter
	public String getCompany() {
		return company;
	}
	
	public int getPrice() {
		return price;
	}
	
//	toString
	@Override
	public String toString() {
		return "Eraser [company=" + company + ", price=" + price + "]";
	}
}

//Fifth
class Sanitizer {
	private String manufacturer;
	private int quantity;
	private int price;
	
//	Constructor
	public Sanitizer(String manufacturer, int quantity, int price) {
		this.manufacturer = manufacturer;
		this.quantity = quantity;
		this.price = price;
	}
	
//	Setter
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
//	Getter
	public String getManufacturer() {
		return manufacturer;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public int getPrice() {
		return price;
	}
	
//	toString
	@Override
	public String toString() {
		return "Sanitizer [manufacturer=" + manufacturer + ", quantity=" + quantity + ", price=" 
	+ price + "]";
	}
}

public class FiveClasses {
	public static void main(String[] args) {
		Mobile m51 = new Mobile("Samsung", "M51", "SoC 730G", 6, 128);
		System.out.println(m51.toString());
		
		Laptop nitro = new Laptop("Acer", "Nitro 5", "i5-8300H", 8, 1, 256);
		System.out.println(nitro.toString());
		
		Notebook today = new Notebook("Today", 150, 45);
		System.out.println(today.toString());
		
		Eraser apsara = new Eraser("Apsara", 3);
		System.out.println(apsara.toString());
		
		Sanitizer lifebuoy = new Sanitizer("Lifebuoy", 500, 250);
		System.out.println(lifebuoy.toString());
	}
}
