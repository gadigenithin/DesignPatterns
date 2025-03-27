package com.designpatterns.creational.prototype;

public abstract class Graphics {
    private int heightInPixels;

	public Graphics(int heightInPixels) {
		this.setHeightInPixels(heightInPixels);
	}

	public int getHeightInPixels() {
		return heightInPixels;
	}

	public void setHeightInPixels(int heightInPixels) {
		this.heightInPixels = heightInPixels;
	}

	public abstract Graphics clone();

	@Override
	public String toString() {
		return "Graphics [heightInPixels=" + heightInPixels + "]";
	}

}
