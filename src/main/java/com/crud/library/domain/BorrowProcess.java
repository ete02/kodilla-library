package com.crud.library.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Setter
@Builder
@Entity
@Table(name = "BORROW_PROCESS")
public class BorrowProcess {
}
