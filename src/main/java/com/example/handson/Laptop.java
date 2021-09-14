package com.example.handson;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
    private int lid;
    private String brand;

	public int getLid() {
		return this.lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

    @Override
    public String toString() {
        return "Laptop [lid=" + lid + ", brand=" + brand + "]";
    }

    public void compile() {
        System.out.println("Compiling");
    }

}
