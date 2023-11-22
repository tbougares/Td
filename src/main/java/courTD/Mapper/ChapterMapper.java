package courTD.Mapper;

import org.springframework.stereotype.Service;

import courTD.Entity.Chapter;
import courTD.Request.ChapterRequest;
import courTD.Response.ChapterResponse;

@Service

public class ChapterMapper {

    public ChapterResponse toChaptertDto(Chapter cpt) {
    	return ChapterResponse.builder()
        .name(cpt.getName())
        .build();
               
    }

   
    public Chapter toChapter(ChapterRequest chapterRequest) {
       Chapter chapter = new Chapter();
       chapter.setId(chapterRequest.getId());
       chapter.setName(chapterRequest.getName());
      
       
      return chapter;
    }
}
