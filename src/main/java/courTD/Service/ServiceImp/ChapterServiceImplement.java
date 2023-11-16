package courTD.Service.ServiceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import courTD.Entity.Chapter;
import courTD.Service.ChapterService;
import courTD.repository.ChapterRepository;
@Service
public class ChapterServiceImplement implements ChapterService {

	private final ChapterRepository chapiterRepository;
	
	
	public ChapterServiceImplement(ChapterRepository chapiterRepository) {
		super();
		this.chapiterRepository = chapiterRepository;
	}

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

}
