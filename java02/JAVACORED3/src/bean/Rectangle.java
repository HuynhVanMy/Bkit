package bean;


public class Rectangle {// class chính - có public. is alway public
	private float width;
	private float height;
	private float deep;


	public Rectangle() {
		
	}
	
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	public float getDeep() {
		return deep;
	}
	
	public void setDeep(float deep) {
		this.deep = deep;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float area(float width, float height) {
		return width * height;
	}

}
/*
 * Mỗi chương trình chỉ có 1 class chính và chỉ có class chính có public Các
 * class còn lại chỉ đc khai báo với class ...
 * 
 */