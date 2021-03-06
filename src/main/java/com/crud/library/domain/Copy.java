package com.crud.library.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Setter
@Builder
@Entity
@Table(name = "COPIES")
public class Copy {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long copiesId;

    @NotNull
    private String status;

    @ManyToOne
    private Book book;

    @OneToMany
    private Borrow borrow;


    private final List<Borrow> borrows = new ArrayList<>();
}
