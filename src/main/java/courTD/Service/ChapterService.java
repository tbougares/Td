package courTD.Service;

import java.util.List;

import courTD.Entity.Chapter;
import courTD.Entity.Student;

public interface ChapterService {
	void save(Chapter c);
	Chapter findById(Integer id);
    List<Chapter> findAll();
    void deleteById(Integer id);
}
