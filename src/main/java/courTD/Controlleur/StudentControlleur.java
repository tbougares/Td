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

import courTD.Request.StudentRequest;
import courTD.Response.StudentResponse;
import courTD.Service.StudentService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentControlleur {
	    private final StudentService studentservice;

	  	
	    public StudentControlleur(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}



		@PostMapping
	    public void save(@RequestBody @Valid StudentRequest student) {
	    studentservice.save(student);
	    
	    }



	    @GetMapping("/{student-id}")
	    public StudentResponse findById(
	            @PathVariable("student-id") Integer studentId
	    ) {
	        return studentservice.findById(studentId);
	    }

	   

	    @GetMapping("/listAll")
	    public List<StudentResponse> findAll() {
	    return studentservice.findAll();
	    }
	    @GetMapping("/search")
	    public List<StudentResponse> findByFirstname(
	            @RequestParam(value = "fname") String firstname
	    ) {
	        return studentservice.findAll();
	    }
	    @DeleteMapping
	    public void deleteById(Integer id) {
	    	studentservice.deleteById(id);
	    }
}
