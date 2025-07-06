package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "Produto")
public class Producto implements Serializable {

    //Version de serializacion 
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto;")
    private Long idProducto;

    //private Long idCategoria;
    private String descripcion;
    private String precio;
    private String detalle;
    private String existencias;
    private String rutaImagen;
    private boolean activo;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;
    
    public Producto() {

    }

    public Producto(String descripcion, String precio, String detalle, String existencias, String rutaImagen, boolean activo) {
        
        this.descripcion = descripcion;
        this.precio = precio;
        this.detalle = detalle;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }

}
