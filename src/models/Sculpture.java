package models;

public class Sculpture extends Art{

	public String material;

	public Sculpture( String title,String author, 
			String description,String material) {
		super(author, title, description);
		this.setMaterial(material);
	}
	
//	getter
	public String getMaterial() {
		return material;
	}

//	methods
	public void viewArt() {
		System.out.println("Information about art here");
	}
//	setter
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
