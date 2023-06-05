package com.hexagonal.tcg.infraestructure.entities;

import com.hexagonal.tcg.domain.models.CartaPokemon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String codigo;

    private String rareza;

    private String imagen;

    private Long expansion_id;

    private Long estado_id;

    public Carta(){

    }

    public Carta(Long id, String nombre, String codigo, String rareza, String imagen, Long expansion_id, Long estado_id) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.rareza = rareza;
        this.imagen = imagen;
        this.expansion_id = expansion_id;
        this.estado_id = estado_id;
    }

    public static Carta fromDomainModel(CartaPokemon carta){
        return new Carta(carta.getId(),carta.getNombre(),carta.getCodigo(),
                carta.getRareza(),carta.getImagen(),carta.getExpansion_id(),carta.getEstado_id());
    }

    public CartaPokemon toDomainModel(){
        return new CartaPokemon(id,nombre,codigo,rareza,imagen,expansion_id,estado_id);
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

    public Long getExpansion_id() {
        return expansion_id;
    }

    public void setExpansion_id(Long expansion_id) {
        this.expansion_id = expansion_id;
    }

    public Long getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(Long estado_id) {
        this.estado_id = estado_id;
    }
}
