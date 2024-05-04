package docker.springbootdocker.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;

    @Column(unique = true,nullable = false)
    private long publicId;

    private String name;

    private String address;

    private double salary;

    @Column(columnDefinition = "TINYINT")
    private boolean activeState;



}
