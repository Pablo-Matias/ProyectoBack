package com.example.portfolioapi.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class ProyectoModel {

    @Entity
    @Table(name = "ProyectoModel")
    public class ProyectoModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        //@Column(unique = true, nullable = false)
        public int idproyecto;

        @Basic
        private String proyecto;
        private String descrip;
        private String url;

        public ProyectoModel(int idproyecto, String descrip, String url) {
            this.idproyecto = idproyecto;
            this.descrip = descrip;
            this.url = url;
        }

        public int getIdproyecto() {
            return idproyecto;
        }

        public void setIdproyecto(int idproyecto) {
            this.idproyecto = idproyecto;
        }

        public String getProyecto() {
            return proyecto;
        }

        public void setProyecto(String proyecto) {
            this.proyecto = proyecto;
        }

        public String getDescrip() {
            return descrip;
        }

        public void setDescrip(String descrip) {
            this.descrip = descrip;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
        
        


        @Override
        public String toString() {
            return "ProyectoModel{" + "idproyecto=" + idproyecto + ", description=" + descrip + ", url=" + url + '}';
        }

    }
}
