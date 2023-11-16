package courTD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import courTD.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
