package com.crud.library.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Setter
@Builder
@Entity
@Table (name = "BORROWS")
public class Borrow {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long borrowId;

    @Column(name="BORROW_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate borrowDate;

    @Column(name="RETURN_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name="READER_ID")
    private Reader reader;

    @ManyToOne
    @JoinColumn(name="COPY_ID")
    private Copy copy;

}

