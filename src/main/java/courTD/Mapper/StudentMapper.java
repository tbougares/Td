package courTD.Mapper;

import org.springframework.stereotype.Service;

import courTD.Entity.Student;
import courTD.Request.StudentRequest;
import courTD.Response.StudentResponse;


@Service

public class StudentMapper {

    public StudentResponse toStudentDto(Student std) {
    	return StudentResponse.builder()
        .firstname(std.getFirstname())
        .lastname(std.getLastname())
        .age(std.getAge())
        .nbrSubjects(std.getSubjects().size())
       
        .build();
               
    }

   
    public Student toStudent(StudentRequest studentRequest) {
       Student student = new Student();
      student.setId(studentRequest.getId());
      student.setFirstname(studentRequest.getFirstname());
      student.setLastname(studentRequest.getLastname());
      student.setAge(studentRequest.getAge());
       
      return student;
    }
}