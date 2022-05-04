package com.example.portfolioapi.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Proyecto")
public class ProyectoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(unique = true, nullable = false)
    public int idproyecto;
    
    @Basic
    private String titulo;
    private String descripcion;
    private String url;

    public ProyectoModel() {
    }

    public ProyectoModel(int idproyecto, String titulo, String descripcion, String url) {
        this.idproyecto = idproyecto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }

    public int getIdproyecto() {
        return idproyecto;
    }
    
    public void setIdproyecto(int idproyecto) {
        this.idproyecto = idproyecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    
    
    
    @Override
    public String toString() {
        return "ProyectoModel{" + "idproyecto=" + idproyecto + ", titulo=" + titulo + ", descripcion=" + descripcion + ", url=" + url + '}';
    }
    
}

