/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demospringboots3.model.vm;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Juann Inga
 */
@Data
@AllArgsConstructor
public class Asset {
    
    private byte[] content;
    private String contentType;
    
}
