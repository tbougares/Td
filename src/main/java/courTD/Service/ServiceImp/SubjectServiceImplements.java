package courTD.Service.ServiceImp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import courTD.Entity.Subject;
import courTD.Request.SubjectRequest;
import courTD.Response.SubjectResponse;
import courTD.Service.SubjectService;
import courTD.repository.SubjectReposotory;

@Service
public class SubjectServiceImplements implements SubjectService {

	
	private final SubjectReposotory subjectRepository;
	
	public SubjectServiceImplements(SubjectReposotory subjectRepository) {
		super();
		this.subjectRepository = subjectRepository;
	}

/*	@Override
	public void save(Subject s) {
		// TODO Auto-generated method stub
		subjectRepository.save(s);
		
	}

	@Override
	public Subject findById(Integer id) {
		// TODO Auto-generated method stub
		return subjectRepository.findById(id).orElse(null);
	}

	/*	@Override
	public List<SubjectResponse> findAll() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll().stream()
                .map(mapper::toStudentDto)
                .collect(Collectors.toList());
	}
	@Override
    public void save(StudentRequest s) {
        Student student = mapper.toStudent(s);
        this.studentRepository.save(student);
    }

    @Override
    public StudentResponse findById(Integer id) {
        return this.studentRepository.findById(id)
                .map(mapper::toStudentDto)
                .orElse(new StudentResponse());
    }
	*/

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		subjectRepository.deleteById(id);
	}

	@Override
	public void save(SubjectRequest s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SubjectResponse findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubjectResponse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
