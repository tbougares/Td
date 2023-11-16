package courTD.Service.ServiceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import courTD.Entity.Student;
import courTD.Service.StudentService;
import courTD.repository.StudentRepository;

@Service
public class StudentServiceImplements implements StudentService {

	private final StudentRepository studentRepository;

   

    public StudentServiceImplements(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public void save(Student s) {
		// TODO Auto-generated method stub
		this.studentRepository.save(s);
	}



	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return  this.studentRepository.findById(id)
                .orElse(null);
	}



	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return this.studentRepository.findAll();
	}



	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

}
