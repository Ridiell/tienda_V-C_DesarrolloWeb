
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{
    //Version de serializacion 
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    private String descrepcion;
    private String rutaImagen;
    private boolean activo; 

    public Categoria(){
    
    }
    
    public Categoria(String descrepcion, String rutaImagen, boolean activo) {
        this.descrepcion = descrepcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
    
    
}
