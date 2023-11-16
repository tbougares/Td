package courTD.Controlleur;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import courTD.Entity.Student;
import courTD.Service.StudentService;

@RestController
@RequestMapping("/Students")
public class StudentControlleur {
	 private final StudentService studentservice;

	  	
	    public StudentControlleur(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}



		@PostMapping
	    public void save(
	            @RequestBody Student student
	    ) {
	    studentservice.save(student);
	    
	    }



	    @GetMapping("/{student-id}")
	    public Student findById(
	            @PathVariable("student-id") Integer studentId
	    ) {
	        return studentservice.findById(studentId);
	    }

	   

	    @GetMapping("")
	    public List<Student> findAll() {
	    return studentservice.findAll();
	    }
	    @GetMapping("/search")
	    public List<Student> findByFirstname(
	            @RequestParam(value = "fname") String firstname
	    ) {
	        return studentservice.findAll();
	    }
	    @DeleteMapping
	    public void deleteById(Integer id) {
	    	studentservice.deleteById(id);
	    }
}
