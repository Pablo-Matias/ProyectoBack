package com.example.portfolioapi.controllers;

import java.util.List;

import com.example.portfolioapi.models.LaboralModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/laboral")
public class LaboralController {
    
    @Autowired
    private LaboralService laboralService;

    @GetMapping
    public List<LaboralModel> getAll() {
        return laboralService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LaboralModel> getById(@PathVariable(value = "id") int id) {
        return laboralService.getById(id);
    }

    @PostMapping
    public LaboralModel save(@Validated @RequestBody LaboralModel laboral) {
        return laboralService.save(laboral);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LaboralModel> update(@PathVariable(value = "id") int id, @Validated @RequestBody LaboralModel laboral) {
        if (id == laboral.idlaboral) {
            LaboralModel laboralNew = laboralService.save(laboral);
            return ResponseEntity.ok().body(laboralNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        ResponseEntity response = null;
        if(laboralService.getById(id) == null) {
            response = new ResponseEntity(HttpStatus.NOT_FOUND); // 404 not found se podria cambiar por un mensaje personalizado?
        }
        else{
            laboralService.delete(id);
            response= ResponseEntity.ok("Se eliminó la persona con Id " + id);
        }
        return response;
    }


}
