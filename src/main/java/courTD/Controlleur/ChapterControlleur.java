package courTD.Controlleur;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import courTD.Request.ChapterRequest;
import courTD.Response.ChapterResponse;
import courTD.Service.ChapterService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Chapters")
public class ChapterControlleur {
	private final ChapterService chapterservice;

	public ChapterControlleur(ChapterService chapterservice) {
		super();
		this.chapterservice = chapterservice;
	}
	

    @PostMapping
    public void save (@RequestBody @Valid ChapterRequest chapter
    ) {
    	chapterservice.save(chapter);
    
    }



    @GetMapping("/{chapter-id}")
    public ChapterResponse findById(
            @PathVariable("chapter-id") Integer chapterId
    ) {
        return chapterservice.findById(chapterId);
    }

   

    @GetMapping
    public List<ChapterResponse> findAll() {
    return chapterservice.findAll();
    }
 
    @DeleteMapping
    public void deleteById(Integer id) {
    	chapterservice.deleteById(id);
    }
}
