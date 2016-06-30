
package Negocio;

import AccesoDato.Conexion;

public class Libro {
        
    Conexion con;
    int libro_id;
    String nombre;
    int cantidad_paginas;
    int autor_id;
    String estado;
    
    public Libro(){
        con=new Conexion();
    }
    
    public int getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(int libro_id) {
        this.libro_id = libro_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_paginas() {
        return cantidad_paginas;
    }

    public void setCantidad_paginas(int cantidad_paginas) {
        this.cantidad_paginas = cantidad_paginas;
    }
    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public void save(){
        con.setInsertar("insert into libros(nombre,cantidad_paginas,autor_id,estado) values('"+this.getNombre()+"','"+this.getCantidad_paginas()+"','"+this.getAutor_id()+"','activo')");
    }
    public void delete(){
        con.setInsertar("update libros set estado='pasivo' where libro_id='"+this.getLibro_id()+"'");
    }
    public void update(){
        con.setInsertar("update libros set nombre='"+this.getNombre()+"',cantidad_paginas='"+this.getCantidad_paginas()+
                "',autor_id='"+this.getAutor_id()+"', estado='" + this.getEstado() + "'");
    }
    
    
}
