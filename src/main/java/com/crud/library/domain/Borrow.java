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
@Table (name = "BORROWS")
public class Borrow {

    @Id
    @GeneratedValue
    private Long borrowId;

    @CreationTimestamp
    private Date date;

    @ManyToOne
    @JoinColumn(name="READER_ID")
    private Reader reader;

    @ManyToOne
    @JoinColumn(name="COPY_ID")
    private Copy copy;

}

