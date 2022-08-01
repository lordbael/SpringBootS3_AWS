/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demospringboots3.web.api;

import com.example.demospringboots3.model.Curso;
import com.example.demospringboots3.repository.CursoRepository;
import com.example.demospringboots3.service.S3Service;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juann Inga
 */
@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    
    @Autowired
    private CursoRepository cursoRepository;
    
    @Autowired
    private S3Service s3Service;
            
    @GetMapping
    List<Curso> getAll(){
        return cursoRepository.findAll()
                .stream()
                .peek(curso -> curso.setImageUrl(s3Service.getObjectUrl(curso.getImagenPath())))
                .collect(Collectors.toList()); 
    }
    
    @PostMapping
    Curso create(@RequestBody Curso curso){
        cursoRepository.save(curso);
        curso.setImageUrl(s3Service.getObjectUrl(curso.getImagenPath()));
        return curso;
    }
}
