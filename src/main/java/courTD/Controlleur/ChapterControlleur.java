package courTD.Controlleur;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import courTD.Entity.Chapter;
import courTD.Entity.Subject;
import courTD.Service.ChapterService;

@RestController
@RequestMapping("/Chapter")
public class ChapterControlleur {
	private final ChapterService chapterservice;

	public ChapterControlleur(ChapterService chapterservice) {
		super();
		this.chapterservice = chapterservice;
	}
	

    @PostMapping
    public void save(
            @RequestBody Chapter chapter
    ) {
    	chapterservice.save(chapter);
    
    }



    @GetMapping("/{chapter-id}")
    public Chapter findById(
            @PathVariable("chapter-id") Integer chapterId
    ) {
        return chapterservice.findById(chapterId);
    }

   

    @GetMapping
    public List<Chapter> findAll() {
    return chapterservice.findAll();
    }
 
    @DeleteMapping
    public void deleteById(Integer id) {
    	chapterservice.deleteById(id);
    }
}
