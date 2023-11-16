package courTD.Service.ServiceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import courTD.Entity.Address;
import courTD.Service.AddressService;
import courTD.repository.AddresseRepository;

@Service
public class AddressServiceImpluments implements AddressService {
	
	
	private final AddresseRepository adreessRepository;
	
	public AddressServiceImpluments(AddresseRepository adreessRepository) {
		super();
		this.adreessRepository = adreessRepository;
	}

	@Override
	public void save(Address a) {
		// TODO Auto-generated method stub
		adreessRepository.save(a);
		
	}

	@Override
	public Address findById(Integer id) {
		// TODO Auto-generated method stub
		return adreessRepository.findById(id).orElse(null);
	}

	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return adreessRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		if(adreessRepository.findById(id)!=null)
		{
		adreessRepository.deleteById(id);
		}		
	}

	@Override
	public Address findByHomeAddress(String homeAddress) {
		// TODO Auto-generated method stub
		return adreessRepository.findByHomeAddress(homeAddress);
	}

}
