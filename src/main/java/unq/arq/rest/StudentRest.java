package unq.arq.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import unq.arq.model.Student;
import unq.arq.services.StudentService;

@Path("/students")
public class StudentRest {
	
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GET
	@Path("/list")
	@Produces("application/json")
	public List<Student> allStudents() {
		return getStudentService().retriveAll();
	}
	
	@GET
	@Path("/login/{username}/{password}")
	@Produces("application/json")
	@Consumes("application/json")
	public Response login(@PathParam("username") final String username, @PathParam("password") final String password) {
		return getStudentService().login(username, password);
	}
}
