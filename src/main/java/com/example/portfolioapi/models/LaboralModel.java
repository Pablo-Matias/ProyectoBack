package com.example.portfolioapi.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "laboral")
public class LaboralModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(unique = true, nullable = false)
    public int idlaboral;
    
    private String puesto;
    private String descripcion; 
    private String empresa; 
    private LocalDate inicio;
    private LocalDate fin;
    private String fotourl;        
    private int persona;

    public LaboralModel() {
        
    }

    public LaboralModel(int idlaboral, String puesto, String descripcion, String empresa, LocalDate inicio, LocalDate fin, String fotourl, int persona ) {
        this.idlaboral = idlaboral;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.fotourl = fotourl;
        this.persona = persona;
    }

    public LaboralModel(String puesto, String descripcion, String empresa, LocalDate inicio, LocalDate fin, String fotourl, int persona ) {
        
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.fotourl = fotourl;
        this.persona = persona;
    }
    
    @Override
    public String toString() {
        return "LaboralModel{" + "idlaboral=" + idlaboral + ", puesto=" + puesto + ", descripcion=" + descripcion + ", empresa=" + empresa + ", inicio=" + inicio + ", fin=" + fin + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }


}