package courTD.Response;

import java.util.List;

import courTD.Entity.Chapter;
import courTD.Entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubjectResponse {
	private String name;
    private List<Student> students;

    private List<Chapter> chapters;

}
