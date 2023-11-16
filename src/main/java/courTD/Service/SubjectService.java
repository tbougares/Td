package courTD.Service;

import java.util.List;

import courTD.Entity.Student;
import courTD.Entity.Subject;

public interface SubjectService {
	void save(Subject s);
	Subject findById(Integer id);
    List<Subject> findAll();
    void deleteById(Integer id);
}
