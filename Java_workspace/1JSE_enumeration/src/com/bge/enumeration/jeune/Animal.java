package com.bge.enumeration.jeune;

public enum Animal {
	CAT("cat", "😼"),
	TIGER("tiger", "🐯"),
	BEAR("bear", "🐻");
	

	String name;
	String emoji;
	
	public String getName() {
		return name;
	}

	public String getEmoji() {
		return emoji;
	}

	Animal(String name, String emoji) {
		this.name = name;
		this.emoji = emoji;
	}
	
}
