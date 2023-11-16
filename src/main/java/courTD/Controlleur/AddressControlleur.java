package courTD.Controlleur;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import courTD.Entity.Address;
import courTD.Entity.Student;
import courTD.Service.AddressService;

@RestController
@RequestMapping("/Address")
public class AddressControlleur {
	
	private final AddressService addresseService;

	
	public AddressControlleur(AddressService addresseService) {
		super();
		this.addresseService = addresseService;
	}

	@GetMapping

	    public List<Address> findAll() {
	    return addresseService.findAll();
	    }
	
	@PostMapping
    public void save(
            @RequestBody Address address
    ) {
		addresseService.save(address);;
    
    }



    @GetMapping("/{Adress-id}")
    public Address findById(
            @PathVariable("Adress-id") Integer AdressId
    ) {
        return addresseService.findById(AdressId);
    }
    @DeleteMapping
    public void deleteById(Integer id) {
    	addresseService.deleteById(id);
    }

   


    @GetMapping("/search")
    public Address findByHomeAddress(
            @RequestParam String homeAddress
    ) {
        return addresseService.findByHomeAddress(homeAddress);
    }
}
