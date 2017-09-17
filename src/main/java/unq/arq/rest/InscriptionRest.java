package unq.arq.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import unq.arq.model.Inscription;
import unq.arq.model.Student;
import unq.arq.model.Subject;
import unq.arq.model.exceptions.SubjectAlreadyAddedException;

@Path("inscriptions")
public class InscriptionRest {

	@GET
    @Path("/example")
    @Produces("application/json")
    public Inscription getInscription() throws SubjectAlreadyAddedException {
		Inscription inscription= new Inscription(new Student("Juan Perez"));
		inscription.addSubject(new Subject("Matematica 1"));
        return inscription;
    }
}
