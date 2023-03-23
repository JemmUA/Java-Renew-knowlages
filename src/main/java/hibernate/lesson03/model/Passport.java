package hibernate.lesson03.model;

import hibernate.lesson03.model.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "passports")
@Setter
@Getter
@ToString
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(mappedBy = "passport")
    private User user; // mapped by "passport" in user
}
