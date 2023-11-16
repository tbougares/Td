package courTD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import courTD.Entity.Student;
import courTD.Entity.Subject;

public interface SubjectReposotory extends JpaRepository<Subject, Integer> {

}
