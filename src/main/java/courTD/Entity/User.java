package courTD.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Inheritance
@DiscriminatorColumn(name = "type")
public class User extends BaseClass {

    private String firstname;
    private String lastname;
    private String mail;

    @OneToOne
    @JoinColumn(name = "adr_id")
    private Address address;

}