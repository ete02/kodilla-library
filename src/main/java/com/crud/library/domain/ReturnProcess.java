package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RETURN_PROCESS")
public class ReturnProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long returnId;
}
