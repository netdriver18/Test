package jdbc.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "fio")
public class fioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_book;
    @Column
    private String name_author;
    @Column
    private String famly_author;

}
