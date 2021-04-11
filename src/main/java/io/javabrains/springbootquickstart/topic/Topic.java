package io.javabrains.springbootquickstart.topic;

public class Topic {

	private String id;
	private String name;
	private String descriptin;

	public Topic() {
		
	}
	
	public Topic(String id, String name, String descriptin) {
		super();
		this.id = id;
		this.name = name;
		this.descriptin = descriptin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptin() {
		return descriptin;
	}

	public void setDescriptin(String descriptin) {
		this.descriptin = descriptin;
	}
}
