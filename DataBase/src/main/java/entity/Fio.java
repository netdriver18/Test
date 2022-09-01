package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "fio")
public class Fio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_author;
    @Column
    private String name_author;
    @Column
    private String famly_author;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Book> books;

    public void setBooks(){
        this.books = books;
    }



}
