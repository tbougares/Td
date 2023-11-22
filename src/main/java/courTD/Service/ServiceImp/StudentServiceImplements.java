package courTD.Service.ServiceImp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import courTD.Entity.Student;
import courTD.Mapper.StudentMapper;
import courTD.Request.StudentRequest;
import courTD.Response.StudentResponse;
import courTD.Service.StudentService;
import courTD.repository.StudentRepository;

@Service
public class StudentServiceImplements implements StudentService {

	private final StudentRepository studentRepository;
	private final StudentMapper mapper;
   




	public StudentServiceImplements(StudentRepository studentRepository, StudentMapper mapper) {
		super();
		this.studentRepository = studentRepository;
		this.mapper = mapper;
	}




	@Override
	public void save(StudentRequest s) {
		// TODO Auto-generated method stub
		Student student = mapper.toStudent(s);
		this.studentRepository.save(student);
	}
	



	@Override
	public StudentResponse findById(Integer id) {
        return this.studentRepository.findById(id)
                .map(mapper::toStudentDto)
                .orElse(new StudentResponse());
    }



	@Override
	public List<StudentResponse> findAll() {
        return this.studentRepository.findAll()
                .stream()
                .map(mapper::toStudentDto)
                .collect(Collectors.toList());
    }



	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
        if(id!=null) {
			
			System.out.println(" ID is null");
			return ;
		}
        if(studentRepository.findById(id)!=null) {
        	studentRepository.deleteById(id);
        	
        }
        else
            	return;
	}

}
