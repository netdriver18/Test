package entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "readers")

public class Readers {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id_reade;
   @Column
   private String name_reader;


}
