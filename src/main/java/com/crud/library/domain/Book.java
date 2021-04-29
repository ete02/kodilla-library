package com.crud.library.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Setter
@Builder
@Entity
@Table (name = "BOOKS")
public class Book {

    @Id
    @GeneratedValue
    private Long booksId;

    @NotNull
    private String title;

    @NotNull
    private String author;

    @NotNull
    private String published;

    @ManyToOne
    private Copy copy;
}
