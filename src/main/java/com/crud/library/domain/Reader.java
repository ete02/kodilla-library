package com.crud.library.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Setter
@Builder
@Entity
@Table (name = "READERS")
public class Reader {

    @Id
    @GeneratedValue
    private Long readerId;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @CreationTimestamp
    private Date accountCreatingDate;

    @OneToMany(
            targetEntity=Borrow.class,
            mappedBy="reader",
            cascade=CascadeType.ALL,
            fetch=FetchType.LAZY
    )
    private List<Borrow> loans = new ArrayList<>();

    @OneToMany(
            targetEntity=BorrowProcess.class,
            mappedBy="user",
            cascade=CascadeType.ALL,
            fetch=FetchType.EAGER
    )
    private List<BorrowProcess> borrowProcesses = new ArrayList<>();

}
