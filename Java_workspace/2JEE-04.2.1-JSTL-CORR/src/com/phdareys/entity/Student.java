package com.phdareys.entity;

import java.util.ArrayList;
import java.util.List;

import com.phdareys.exception.StudentException;

public class Student {
	private int id;	// non traité mais utile car il y aura la BD
	private String name;	// par ex: Paul
	private List<Note> notes=new ArrayList<Note>();	// Toutes ses notes
	
	private float avg = 0.0F;		// sa moyenne	(OUT)
	private int notesNb = 0;		// nbre de notes (OUT)
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student(int id, String name, Note notes[]) {
		super();
		this.id = id;
		this.name = name;
		for (Note n: notes)
			this.notes.add(n);
	}
	
	public void exec() throws StudentException {
		int totCoeff = 0;
		float tot=0F;
		for(Note n: this.notes) {
			// exemple exception: on va dire que si une note > 20 il y a pb
			if (n.getValue() > 20)
				throw new StudentException("Note incorrecte: " + n.getValue() + "!");
			tot += n.getValue()*n.getContent().getCoeff();
			totCoeff += n.getContent().getCoeff();
		}
		this.avg = (float) (tot/totCoeff);
		this.notesNb = this.notes.size();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", notes=" + notes + ", avg=" + avg + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Note> getNotes() {
		return notes;
	}
	public float getAvg() {
		return avg;
	}
	public int getNotesNb() {
		return notesNb;
	}


}
