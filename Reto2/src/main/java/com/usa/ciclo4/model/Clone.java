package com.usa.ciclo4.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Alejandro Giraldo
 * Clase clone, en ella se guarda la información de los productos
 * Usa mongoDB como motor para la base de datos
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Document(collection="clone")
public class Clone {
    /**
     * Entidad para MongoDB
     * ID coloca la llave principal
     */
    @Id
    private Integer id;
    private String brand;
    private String procesor;
    private String os;
    private String description;
    private String memory;
    private String hardDrive;
    private Boolean availability = true;
    private Double price;
    private Integer quantity;
    private String photography;
}
