package com.example.portfolioapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "educacion")
public class EducacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(unique = true, nullable = false)
    public int ideducacion;
    
    private String titulo;
    private LocalDate fechafin;
    private String institucion; 
    private String institucionurl;
    private String fotourl;
    private PersonaModel persona;
  

    public EducacionModel( int ideducacion, String titulo, LocalDate fechafin, String institucion, String institucionurl, String fotourl, PersonaModel persona)
     {
        this.ideducacion = ideducacion;
        this.titulo = titulo;
        this.fechafin = fechafin;
        this.institucion = institucion;
        this.institucionurl = institucionurl;
        this.fotourl = fotourl;
        this.persona = persona;
    }
        
    public EducacionModel() {
               
    }

    public EducacionModel( String titulo, LocalDate fechafin, String institucion, String institucionurl, String fotourl, PersonaModel persona)
    {
       this.titulo = titulo;
       this.fechafin = fechafin;
       this.institucion = institucion;
       this.institucionurl = institucionurl;
       this.fotourl = fotourl;
       this.persona = persona;
   }

    public int getidEducacion() {
        return ideducacion;
    }

    public void setIdEducacion(int ideducacion) {
        this.ideducacion = ideducacion;        
    }

    public String getTitulo() {
        return titulo;        
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;      
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getInstitucionurl() {
        return institucionurl;
    }

    public void setInstitucionurl(String institucionurl) {
        this.institucionurl = institucionurl;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }

    public PersonaModel getPersona() {
        return persona;
    }

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "EducacionModel{" + "ideducacion=" + ideducacion + ", titulo=" + titulo + ", fechafin=" + fechafin + ", institucion=" + institucion + ", institucionurl=" + institucionurl + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }

}