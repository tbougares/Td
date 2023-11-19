package courTD.Service.ServiceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import courTD.Entity.Address;
import courTD.Request.AddressRequest;
import courTD.Response.AddressResponse;
import courTD.Service.AddressService;
import courTD.repository.AddresseRepository;

@Service
public class AddressServiceImpluments implements AddressService {
	
	
	private final AddresseRepository adreessRepository;
	
	public AddressServiceImpluments(AddresseRepository adreessRepository) {
		super();
		this.adreessRepository = adreessRepository;
	}
/*
	@Override
	public void save(AddressRequest a) {
		// TODO Auto-generated method stub
		adreessRepository.save(a);
		
	}

	@Override
	public AddressResponse findById(Integer id) {
		// TODO Auto-generated method stub
		return adreessRepository.findById(id).orElse(null);
	}

	@Override
	public List<AddressResponse> findAll() {
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
	public AddressResponse findByHomeAddress(String homeAddress) {
		// TODO Auto-generated method stub
		return adreessRepository.findByHomeAddress(homeAddress);
	}
*/

	@Override
	public void save(AddressRequest a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AddressResponse findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AddressResponse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AddressResponse findByHomeAddress(String homeAddress) {
		// TODO Auto-generated method stub
		return null;
	}
}
