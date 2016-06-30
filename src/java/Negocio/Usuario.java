
package Negocio;

import AccesoDato.Conexion;

public class Usuario {
    
    Conexion con;
    int usuario_id;
    String usuario;
    String clave;
    String fecha_nacimiento;
    String estado;

     public Usuario() {
        con=new Conexion();
    }
   
    
    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void save(){
        con.setInsertar("insert into Usuarios(usuario,clave,fecha_nacimiento,estado) values('"+this.getUsuario()+"','"+this.getClave()+"','"+this.getFecha_nacimiento()+"','activo')");
    }
    public void delete(){
        con.setInsertar("update Usuarios set estado='pasivo' where usuario_id='"+this.getUsuario_id()+"'");
    }
    public void update(){
        con.setInsertar("update Usuarios set usuario='"+this.getUsuario()+"',clave='"+this.getClave()+"',fecha_nacimiento='"+this.getFecha_nacimiento()+"' where usuario_id='"+this.getUsuario_id()+"'");
    }
    
    
}

