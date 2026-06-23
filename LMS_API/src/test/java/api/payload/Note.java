package api.payload;

public class Note {
	
	public String title;
	public String content;
	public String color;
	public String[] tags;
	public Boolean isPlanned;

	public Note() {

	}

	public Note(String title, String content, String color, String[] tags, Boolean isPlanned) {
		super();
		this.title = title;
		this.content = content;
		this.color = color;
		this.tags = tags;
		this.isPlanned = isPlanned;
	}

}
