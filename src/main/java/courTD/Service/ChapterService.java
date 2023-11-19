package courTD.Service;

import java.util.List;

import courTD.Entity.Chapter;
import courTD.Entity.Student;
import courTD.Request.ChapterRequest;
import courTD.Response.ChapterResponse;
import jakarta.validation.Valid;

public interface ChapterService {
	void save(ChapterRequest chapter);
	ChapterResponse findById(Integer id);
    List<ChapterResponse> findAll();
    void deleteById(Integer id);
}
