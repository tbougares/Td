package courTD.Service;

import java.util.List;

import courTD.Entity.Student;
import courTD.Entity.Subject;
import courTD.Request.SubjectRequest;
import courTD.Response.SubjectResponse;

public interface SubjectService {
	void save(SubjectRequest s);
	SubjectResponse findById(Integer id);
    List<SubjectResponse> findAll();
    void deleteById(Integer id);
}
