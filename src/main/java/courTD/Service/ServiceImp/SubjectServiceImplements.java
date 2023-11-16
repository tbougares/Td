package courTD.Service.ServiceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import courTD.Entity.Subject;
import courTD.Service.SubjectService;
import courTD.repository.SubjectReposotory;

@Service
public class SubjectServiceImplements implements SubjectService {

	
	private final SubjectReposotory subjectRepository;
	
	public SubjectServiceImplements(SubjectReposotory subjectRepository) {
		super();
		this.subjectRepository = subjectRepository;
	}

	@Override
	public void save(Subject s) {
		// TODO Auto-generated method stub
		subjectRepository.save(s);
		
	}

	@Override
	public Subject findById(Integer id) {
		// TODO Auto-generated method stub
		return subjectRepository.findById(id).orElse(null);
	}

	@Override
	public List<Subject> findAll() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		subjectRepository.deleteById(id);
	}

}
