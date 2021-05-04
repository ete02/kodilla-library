package com.crud.library.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Setter
@Builder
@Entity
@Table(name = "BORROW_PROCESS")
public class BorrowProcess {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long borrowProcessId;

    @ManyToOne
    @JoinColumn(name="READER_ID")
    private Reader reader;

    @Column(name="BOOK_TITLE")
    private String bookTitle;

    @CreationTimestamp
    private Date borrowProcessDate;
}
