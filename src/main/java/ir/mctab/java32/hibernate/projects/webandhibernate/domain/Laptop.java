package ir.mctab.java32.hibernate.projects.webandhibernate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String partNumber;

    @ManyToMany( cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();
}
