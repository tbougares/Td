package courTD.Service;

import java.util.List;

import courTD.Entity.Student;

public interface StudentService {
	   void save(Student s);
	    Student findById(Integer id);
	    List<Student> findAll();
	    void deleteById(Integer id);

}
