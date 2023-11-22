package courTD.Service.ServiceImp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import courTD.Entity.Address;
import courTD.Mapper.AddressMapper;
import courTD.Request.AddressRequest;
import courTD.Response.AddressResponse;
import courTD.Service.AddressService;
import courTD.repository.AddresseRepository;

@Service
public class AddressServiceImpluments implements AddressService {
	
	
	private final AddresseRepository adreessRepository;
	private final AddressMapper mapper;
	
	
public AddressServiceImpluments(AddresseRepository adreessRepository, AddressMapper mapper) {
		super();
		this.adreessRepository = adreessRepository;
		this.mapper = mapper;
	}

	@Override
	public void save(AddressRequest addressRequest) {
		Address address=mapper.toAdress(addressRequest);
		adreessRepository.save(address);
		
	}

	@Override
	public AddressResponse findById(Integer id) {
		// TODO Auto-generated method stub
		return adreessRepository.findById(id)
				.map(mapper::toAressDto)
				.orElse(new AddressResponse());
	}

	@Override
	public List<AddressResponse> findAll() {
		// TODO Auto-generated method stub
		return adreessRepository.findAll()
				.stream()
				.map(mapper::toAressDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
       if(id!=null) {
			
			System.out.println(" ID is null");
			return ;
		}
		if(adreessRepository.findById(id)!=null)
		{
		adreessRepository.deleteById(id);
		}
		else
			return;
	}

	@Override
	public AddressResponse findByHomeAddress(String homeAddress) {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override
	public AddressResponse findByHomeAddress(String homeAddress) {
		// TODO Auto-generated method stub
		return adreessRepository.findByHomeAddress(homeAddress)
				.map(mapper::toAressDto)
				.ore;
	}*/
}
