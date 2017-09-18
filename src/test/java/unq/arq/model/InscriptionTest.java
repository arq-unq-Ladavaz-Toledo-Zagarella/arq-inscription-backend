package unq.arq.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import unq.arq.model.exceptions.SubjectAlreadyAddedException;

public class InscriptionTest {
	public Student student= new Student("Juan Perez", 34562);
	public Inscription inscription = new Inscription(student);
	
	@Before
	public void setUp() {
		inscription.setSubjects(new ArrayList<Subject>());
	}
	
	@Test
	public void testNewInscription() {
		assertEquals("Juan Perez", inscription.getStudent().getName());
		assertEquals(0, inscription.getSubjects().size());
	}
	
	@Test
	public void testAddedASubject() throws SubjectAlreadyAddedException {
		Subject aSubject = new Subject("Matematica 1");
		inscription.addSubject(aSubject);
		assertEquals(1, inscription.getSubjects().size());
	}
	
	@Test
	public void testSubjectAlreadyAdded() throws SubjectAlreadyAddedException {
		Subject subject = new Subject("Matematica 1");
		inscription.addSubject(subject);
		assert(inscription.subjectAlreadyAdded(subject));
	}

	@Test(expected = SubjectAlreadyAddedException.class)
	public void testErrorAddingASubject() throws SubjectAlreadyAddedException {
		Subject subject = new Subject("Matematica 1");
		inscription.addSubject(subject);
		inscription.addSubject(subject);
	}
}
		