package unq.arq.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import unq.arq.model.Subject;
import unq.arq.services.SubjectService;

@Path("/subjects")
public class SubjectRest {
	
	private SubjectService subjectService;

	public SubjectService getSubjectService() {
		return subjectService;
	}

	public void setSubjectService(SubjectService subjectService) {
		this.subjectService = subjectService;
		Subject matematicaUno = new Subject("Matematica 1");
		Subject matematicaDos = new Subject("Matematica 2");
		Subject objetosTres = new Subject("Objetos 3");
		Subject orga = new Subject("Orga");
		subjectService.save(matematicaUno);
		subjectService.save(matematicaDos);
		subjectService.save(objetosTres);
		subjectService.save(orga);
	}
	
	@GET
	@Path("/list")
	@Produces("application/json")
	public List<Subject> allSubjects() {
		return getSubjectService().retriveAll();
	}
}
