package courTD.Service;

import java.util.List;

import courTD.Entity.Address;
import courTD.Entity.Chapter;
import courTD.Request.AddressRequest;
import courTD.Response.AddressResponse;

public interface AddressService {
	void save(AddressRequest a);
	AddressResponse findById(Integer id);
    List<AddressResponse> findAll();
    void deleteById(Integer id);
    AddressResponse findByHomeAddress(String homeAddress);
    
}
