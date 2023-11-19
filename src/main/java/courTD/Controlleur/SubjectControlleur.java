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
import courTD.Entity.Subject;
import courTD.Request.SubjectRequest;
import courTD.Response.SubjectResponse;
import courTD.Service.SubjectService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Subjects")
public class SubjectControlleur {
	
	private final SubjectService subjectservice;

	public SubjectControlleur(SubjectService subjectservice) {
		super();
		this.subjectservice = subjectservice;
	}
	

    @PostMapping
    public void save(
            @RequestBody @Valid SubjectRequest subject
    ) {
    	subjectservice.save(subject);
    
    }



    @GetMapping("/{subject-id}")
    public SubjectResponse findById(
            @PathVariable("subject-id") Integer subjectId
    ) {
        return subjectservice.findById(subjectId);
    }

   

    @GetMapping
    public List<SubjectResponse> findAll() {
    return subjectservice.findAll();
    }
 
    @DeleteMapping
    public void deleteById(Integer id) {
    	subjectservice.deleteById(id);
    }
}
