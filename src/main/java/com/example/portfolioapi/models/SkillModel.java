package com.example.portfolioapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "skill")
public class SkillModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(unique = true, nullable = false)
    public int idskill;
    
    private String titulo;
    
    private int dominio; 
    private int persona;
    
    public SkillModel(){}

    
    public SkillModel(String titulo, int dominio, int persona)
    {        
        this.titulo = titulo;
        this.dominio = dominio;
        this.persona = persona;
    }

    public SkillModel(int idskill, String titulo, int dominio, int persona)
    {
        this.idskill = idskill;
        this.titulo = titulo;
        this.dominio = dominio;
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "SkillModel{" + "idskill=" + idskill + ", titulo=" + titulo + ", dominio=" + dominio + ", persona=" + persona + '}';
    }


}
