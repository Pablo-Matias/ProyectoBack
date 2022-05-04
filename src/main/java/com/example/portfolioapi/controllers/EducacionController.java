package com.example.portfolioapi.controllers;

import java.util.List;

import com.example.portfolioapi.models.EducacionModel;
import com.example.portfolioapi.services.EducacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/educacion")
public class PersonaController {

    @Autowired
    private EducacionService  educacionService;

    @GetMapping
    public List<EducacionModel> getAll() {
        return educacionService.getAll();
    }        

    @GetMapping("/{id}")
    public ResponseEntity<EducacionModel> getById(@PathVariable(value = "id") int id) {
        return educacionService.getById(id);
    } 
    
    @PostMapping
    public EducacionModel save(@Validated @RequestBody EducacionModel educacion) {
        return educacionService.save(educacion);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<EducacionModel> update(@PathVariable(value = "id") int id, @Validated @RequestBody EducacionModel educacion) {
        if (id == educacion.id) {
            EducacionModel taskNew = educacionService.save(educacion);
            return ResponseEntity.ok().body(taskNew);
        } else {
            return ResponseEntity.badRequest().build();
        }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarPorId(@PathVariable Integer id){
        ResponseEntity response = null;
        if(EducacionService.getById(id) == null){
            response = new ResponseEntity(HttpStatus.NOT_FOUND); // 404 not found se podria cambiar por un mensaje personalizado?
        }
        else{
            EducacionService.delete(id);
            response= ResponseEntity.ok("SE ELIMINÓ LA EDUCACIÓN CON ID " + id);
        }
        return response;
    }

}