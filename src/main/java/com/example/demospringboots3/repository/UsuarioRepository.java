/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demospringboots3.repository;

import com.example.demospringboots3.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Juann Inga
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
