package courTD.Service;

import java.util.List;

import courTD.Entity.Address;
import courTD.Entity.Chapter;

public interface AddressService {
	void save(Address a);
	Address findById(Integer id);
    List<Address> findAll();
    void deleteById(Integer id);
    Address findByHomeAddress(String homeAddress);
    
}
