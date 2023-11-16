package courTD.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

import lombok.*;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Student {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    private String firstname;
    private String lastname;
    private int age;

    @OneToOne(mappedBy = "student")
    private Address address;

    @ManyToMany
    @JoinTable(
            name = "std_sub",
            joinColumns = {@JoinColumn(name = "std_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "sub_id", referencedColumnName = "id")}
    )
    @JsonManagedReference
    private List<Subject> subjects;
}