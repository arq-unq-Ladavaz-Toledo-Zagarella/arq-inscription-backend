package unq.arq.services;

import javax.ws.rs.core.Response;

import unq.arq.model.Student;

public class StudentService extends GenericService<Student> {

	private static final long serialVersionUID = -2488899467496673690L;

	public Response login(String username, String password) {
		Student student= getRepository().findAll().stream()
				.filter(s -> s.getUsername().equals(username) && s.getPassword().equals(password))
				.findFirst().orElse(null);
		if(student == null)
			return Response.status(Response.Status.BAD_REQUEST).build();
		return Response.ok(student.getId()).build();
	}
}
