package courTD.Service.ServiceImp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import courTD.Entity.Subject;
import courTD.Mapper.SubjectMapper;
import courTD.Request.SubjectRequest;
import courTD.Response.SubjectResponse;
import courTD.Service.SubjectService;
import courTD.repository.SubjectReposotory;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Service
@RequiredArgsConstructor
public class SubjectServiceImplements implements SubjectService {

	
	private final SubjectReposotory subjectRepository;
	private final SubjectMapper mapper;
	
	


 	@Override
	public List<SubjectResponse> findAll() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll()
				.stream()
                .map(mapper::toSubjecttDto)
                .collect(Collectors.toList());
	}
	@Override
    public void save(SubjectRequest suubject) {
        Subject subject = mapper.toSubject(suubject);
        this.subjectRepository.save(subject);
    }

    @Override
    public SubjectResponse findById(Integer id) {
        return this.subjectRepository.findById(id)
                .map(mapper::toSubjecttDto)
                .orElse(new SubjectResponse());
    }
	

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		if(id!=null) {
			
			System.out.println(" ID is null");
			return ;
		}
		if(subjectRepository.findById(id)!=null) {
			subjectRepository.deleteById(id);}
	        else
	        	return;
	}


}
