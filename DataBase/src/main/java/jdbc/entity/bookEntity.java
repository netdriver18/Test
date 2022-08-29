package jdbc.entity;

import lombok.*;
import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "book")
public class bookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String descriptions;
    @Column
    private Integer count_page;

    public bookEntity(String name, String descriptions, Integer count_page) {
        this.name = name;
        this.descriptions = descriptions;
        this.count_page = count_page;
    }
}
