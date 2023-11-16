package courTD.Entity;
import java.util.List;


import jakarta.persistence.*;
import lombok.*;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@DiscriminatorValue("TEACHER")
public class Chapter {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "sub_id")
    private Subject subject;
}