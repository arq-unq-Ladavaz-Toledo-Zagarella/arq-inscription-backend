package unq.arq.model;

import java.util.ArrayList;

import unq.arq.model.exceptions.SubjectAlreadyAddedException;

public class Inscription {
	private Student student= null;
	private ArrayList<Subject> subjects= new ArrayList<Subject>();
	
	public Inscription(Student student) {
		setStudent(student);
	}
	
	/**
	 * Add a subject to the inscription.
	 * @param subject
	 * @throws SubjectAlreadyAddedException
	 */
	public void addSubject(Subject subject) throws SubjectAlreadyAddedException {
		if(subjectAlreadyAdded(subject))
			throw new SubjectAlreadyAddedException();
		subjects.add(subject);
	}
	
	/**
	 * Returns true if the subject has already been added previously, otherwise returns false.
	 * @param subject
	 * @return boolean
	 */
	public boolean subjectAlreadyAdded(Subject subject) {
		return subjects.stream().anyMatch(s -> s.getName().equals(subject.getName())); 
	}

	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}
}
