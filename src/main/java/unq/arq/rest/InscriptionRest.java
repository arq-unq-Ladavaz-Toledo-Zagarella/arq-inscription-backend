package unq.arq.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import unq.arq.model.Inscription;
import unq.arq.model.Subject;
import unq.arq.services.InscriptionService;
import unq.arq.services.StudentService;

@Path("inscriptions")
public class InscriptionRest {
	
	private InscriptionService inscriptionService;
	private StudentService studentService;
	
	@GET
    @Path("/list")
    @Produces("application/json")
    public List<Inscription> getAllInscriptions() {
		return getInscriptionService().retriveAll();
    }
	
	@POST
	@Path("/create/{studentId}")
	@Produces("application/json")
	@Consumes("application/json")
	public Response createInscription(@PathParam("studentId") final Integer studentId, List<Subject> subjects) {
		Inscription inscription= new Inscription(getStudentService().findBy(studentId), subjects);
		getInscriptionService().save(inscription);
		return Response.ok(inscription).build();
	}
	
	public InscriptionService getInscriptionService() {
		return inscriptionService;
	}
	
	public void setInscriptionService(InscriptionService inscriptionService) {
		this.inscriptionService = inscriptionService;
	}
	
	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
