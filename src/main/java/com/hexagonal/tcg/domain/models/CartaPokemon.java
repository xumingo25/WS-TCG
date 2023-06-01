package com.hexagonal.tcg.domain.models;

public class CartaPokemon {
    private Long id;
    private String nombre;
    private String codigo;
    private String rareza;

    private String imagen;

    private int expansion_id;
    private int estado_id;

    public CartaPokemon(Long id, String nombre, String codigo, String rareza, String imagen, int expansion_id, int estado_id) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.rareza = rareza;
        this.imagen = imagen;
        this.expansion_id = expansion_id;
        this.estado_id = estado_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getExpansion_id() {
        return expansion_id;
    }

    public void setExpansion_id(int expansion_id) {
        this.expansion_id = expansion_id;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }
}
