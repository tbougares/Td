package courTD.Service.ServiceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import courTD.Entity.Chapter;
import courTD.Request.ChapterRequest;
import courTD.Response.ChapterResponse;
import courTD.Service.ChapterService;
import courTD.repository.ChapterRepository;
@Service
public class ChapterServiceImplement implements ChapterService {

	private final ChapterRepository chapiterRepository;
	
	
	public ChapterServiceImplement(ChapterRepository chapiterRepository) {
		super();
		this.chapiterRepository = chapiterRepository;
	}
/*
	@Override
	public void save(Chapter c) {
		// TODO Auto-generated method stub
		chapiterRepository.save(c);
	}

	@Override
	public Chapter findById(Integer id) {
		// TODO Auto-generated method stub
		return chapiterRepository.findById(id).orElse(null);
	}

	@Override
	public List<Chapter> findAll() {
		// TODO Auto-generated method stub
		return chapiterRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		chapiterRepository.deleteById(id);
	}
*/


	@Override
	public void save(ChapterRequest chapter) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ChapterResponse findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ChapterResponse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
