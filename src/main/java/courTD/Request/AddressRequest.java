package courTD.Request;

import courTD.Entity.Student;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AddressRequest {

    private Integer id;
    @NotNull(message = "home of Address must not be null")
    @NotEmpty
    private String homeAddress;
    @NotNull(message = "id of student must not be null")
    @NotEmpty
    private Integer student_id;
}