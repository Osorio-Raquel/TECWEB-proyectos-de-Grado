package com.example.demo1.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ProyectoGrado")
public class ProyectoGrado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProyectoID")
    private Integer proyectoId;

    @Column(name = "Titulo", nullable = false, length = 50)
    private String titulo;

    @Column(name = "Gestion", nullable = false)
    private Short gestion;

    @Column(name = "CIEstudiante", nullable = false)
    private Long ciEstudiante;

    @Column(name = "Estudiante", nullable = false, length = 50)
    private String estudiante;

    @Column(name = "PuntajeCuantitativo")
    private Integer puntajeCuantitativo;

    @ManyToOne
    @JoinColumn(name = "PuntajeCualitativoID", referencedColumnName = "PuntajeCualitativoID")
    private NivelesCualitativo puntajeCualitativo;

    @ManyToOne
    @JoinColumn(name = "TutorID", referencedColumnName = "DocenteId")
    private Docente tutor;

    @ManyToOne
    @JoinColumn(name = "RelatorID", referencedColumnName = "DocenteId")
    private Docente relator;

    @ManyToOne
    @JoinColumn(name = "RepRectoradoID", referencedColumnName = "DocenteId")
    private Docente repRectorado;

    @ManyToOne
    @JoinColumn(name = "ModalidadID", referencedColumnName = "ModalidadID")
    private Modalidad modalidad;

    @ManyToOne
    @JoinColumn(name = "CategoriaID", referencedColumnName = "CategoriaID")
    private Categoria categoria;

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCiEstudiante(Long ciEstudiante) {
        this.ciEstudiante = ciEstudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }
    
    public void setGestion(Short gestion) {
        this.gestion = gestion;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public void setProyectoId(Integer proyectoId) {
        this.proyectoId = proyectoId;
    }

    public void setPuntajeCualitativo(NivelesCualitativo puntajeCualitativo) {
        this.puntajeCualitativo = puntajeCualitativo;
    }

    public void setPuntajeCuantitativo(Integer puntajeCuantitativo) {
        this.puntajeCuantitativo = puntajeCuantitativo;
    }

    public void setRelator(Docente relator) {
        this.relator = relator;
    }

    public void setRepRectorado(Docente repRectorado) {
        this.repRectorado = repRectorado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTutor(Docente tutor) {
        this.tutor = tutor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Long getCiEstudiante() {
        return ciEstudiante;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public Short getGestion() {
        return gestion;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public Integer getProyectoId() {
        return proyectoId;
    }

    public NivelesCualitativo getPuntajeCualitativo() {
        return puntajeCualitativo;
    }

    public Integer getPuntajeCuantitativo() {
        return puntajeCuantitativo;
    }

    public Docente getRelator() {
        return relator;
    }

    public Docente getRepRectorado() {
        return repRectorado;
    }

    public String getTitulo() {
        return titulo;
    }

    public Docente getTutor() {
        return tutor;
    }
}
