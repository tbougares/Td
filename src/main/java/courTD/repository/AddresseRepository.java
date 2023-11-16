package courTD.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import courTD.Entity.Address;
import courTD.Entity.Student;

public interface AddresseRepository extends JpaRepository<Address, Integer> {
	Address findByHomeAddress(String homeAddress);
}
