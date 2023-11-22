package courTD.Mapper;

import org.springframework.stereotype.Service;

import courTD.Entity.Address;
import courTD.Entity.Student;
import courTD.Request.AddressRequest;
import courTD.Response.AddressResponse;

@Service

public class AddressMapper {

    public AddressResponse toAressDto(Address address) {
    	return AddressResponse.builder()
        .homeAddress(address.getHomeAddress())
        .build();
               
    }

   
    public Address toAdress(AddressRequest addressRequest) {
       Address address = new Address();
       address.setId(addressRequest.getId());
       address.setHomeAddress(addressRequest.getHomeAddress());
       
       Student student = new Student();
       student.setId(addressRequest.getStudent_id());
       
       address.setStudent(student);
      
       
      return address;
    }
}