package com.phdareys.dao;

import com.phdareys.entity.Note;
import com.phdareys.entity.Student;
import com.phdareys.entity.Content;

public class StudentDAO {
	public Student[] get () {	// simu de la BD!
		/*
		 * Commande SQL:
SELECT n.value, c.name, s.name FROM `note` n
INNER JOIN `content` c
ON n.id_c=c.id
INNER JOIN `student` s
ON n.id_s=s.id

		 */
		Student students[]= {
				new Student(1, "Paul", new Note[]{
					new Note(1, 14, 		// 14 en maths coeff 3
							new Content(1, "Maths", 3)),
					new Note(2, 10, 
							new Content(2, "Histoire", 1)),
				}),
				new Student(2, "Elsa", new Note[]{
					new Note(3, 10, 
							new Content(1, "Maths", 3)),
					new Note(4, 20, 
							new Content(3, "Info", 1)),
					new Note(5, 14, 
							new Content(4, "Géo", 1)),						
				}),
						
		};
		// simulation d'une erreur
		
		return students;
		
	}


}
