/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demospringboots3.model;

import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 *
 * @author Juann Inga
 */
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Usuario {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @NonNull
    private String cedula;
    
    private String imagenPath;
    
    @Transient
    private String imageUrl;
    
}
