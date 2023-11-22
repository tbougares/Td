package courTD.Service.ServiceImp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import courTD.Entity.Chapter;
import courTD.Mapper.ChapterMapper;
import courTD.Request.ChapterRequest;
import courTD.Response.ChapterResponse;
import courTD.Service.ChapterService;
import courTD.repository.ChapterRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ChapterServiceImplement implements ChapterService {

	private final ChapterRepository chapiterRepository;
	private final ChapterMapper mapper;
	
	
	

	@Override
	public void save(ChapterRequest c) {
		// TODO Auto-generated method stub
		Chapter chapter = mapper.toChapter(c);
		chapiterRepository.save(chapter);
	}

	@Override
	public ChapterResponse findById(Integer id) {
		// TODO Auto-generated method stub
		return chapiterRepository.findById(id)
				.map(mapper::toChaptertDto)
				.orElse(new ChapterResponse());
	}

	@Override
	public List<ChapterResponse> findAll() {
		// TODO Auto-generated method stub
		return chapiterRepository.findAll()
				.stream()
				.map(mapper::toChaptertDto)
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
        if(id!=null) {
			
			System.out.println(" ID is null");
			return ;
		}
        if(chapiterRepository.findById(id)!=null) {
		chapiterRepository.deleteById(id);
		}
        else
        	return;
	}
}
