package br.edu.ifpr.cars.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Passenger {

    @Id
    @GeneratedValue
    Long id;

    String name;

    String email;
}
