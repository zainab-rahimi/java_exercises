package com.phdareys.entity;

public class Note {
	private int id;
	private float value;		// par 18.2
	private Content content;	// appartenance
	
	public Note(int id, float value, Content content) {
		super();
		this.id = id;
		this.value = value;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", value=" + value + ", content=" + content + "]";
	}

	public int getId() {
		return id;
	}

	public float getValue() {
		return value;
	}

	public Content getContent() {
		return content;
	}
	

}
