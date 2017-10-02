package unq.arq.model;

import java.util.List;

import unq.arq.model.exceptions.SubjectAlreadyAddedException;

public class Inscription extends Entity {

	private static final long serialVersionUID = -7120114275456480040L;
	private Student student;
	private List<Subject> subjects;
	
	public Inscription() { super(); }
	
	public Inscription(Student student, List<Subject> subjects) {
		setStudent(student);
		setSubjects(subjects);
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
		this.student= student;
	}
	
	public List<Subject> getSubjects() {
		return subjects;
	}
	
	public void setSubjects(List<Subject> subjects) {
		this.subjects= subjects;
	}
}
