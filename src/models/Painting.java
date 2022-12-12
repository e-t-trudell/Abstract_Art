package models;

public class Painting extends Art {
	public String paintType;

	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.setPaintType(paintType);
	}
//	getter
	public String getPaintType() {
		return paintType;
	}

//	from Art.java
	public void viewArt() {
		System.out.println("Information about art here");
	}
//	setter
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
}
