package models;

public abstract class Art {
	public String title;
	public String author;
	public String description;
	
	public Art(String title, String author, String description) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setDescription(description);
		
	}
	public abstract void viewArt();

//	getters
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getDescription() {
		return description;
	}
//	setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	

	public void setDescription(String description) {
		this.description = description;
	}
	
}
