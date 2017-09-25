package unq.arq.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import unq.arq.model.Inscription;
import unq.arq.model.exceptions.SubjectAlreadyAddedException;
import unq.arq.services.InscriptionService;

@Path("inscriptions")
public class InscriptionRest {
	
	private InscriptionService inscriptionService;
	
	@GET
    @Path("/list")
    @Produces("application/json")
    public List<Inscription> getInscription() throws SubjectAlreadyAddedException {
		return getInscriptionService().retriveAll();
    }
	
	public InscriptionService getInscriptionService() {
		return inscriptionService;
	}
	
	public void setInscriptionService(InscriptionService inscriptionService) throws SubjectAlreadyAddedException {
		this.inscriptionService = inscriptionService;
	}
}
