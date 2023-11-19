package courTD.Service;

import java.util.List;

import courTD.Entity.Student;
import courTD.Request.StudentRequest;
import courTD.Response.StudentResponse;
import jakarta.validation.Valid;

public interface StudentService {
	   void save(StudentRequest student);
	    StudentResponse findById(Integer id);
	    List<StudentResponse> findAll();
	    void deleteById(Integer id);

}
