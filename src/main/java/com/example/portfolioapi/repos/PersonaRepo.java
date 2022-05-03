package com.example.portfolioapi.repos;

import com.example.tareasapi.models.PersonaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends CrudRepository<PersonaModel, Integer> {
    
    
}