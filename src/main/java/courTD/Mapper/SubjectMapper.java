package courTD.Mapper;

import org.springframework.stereotype.Service;

import courTD.Entity.Subject;
import courTD.Request.SubjectRequest;
import courTD.Response.SubjectResponse;

@Service

public class SubjectMapper {

    public SubjectResponse toSubjecttDto(Subject subject) {
    	return SubjectResponse.builder()
        .name(subject.getName())
        .build();
               
    }

   
    public Subject toSubject(SubjectRequest SubjectRequest) {
    	Subject subject = new Subject();
    	subject.setId(SubjectRequest.getId());
    	subject.setName(SubjectRequest.getName());
      
       
      return subject;
    }
}