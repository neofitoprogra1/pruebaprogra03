package Negocio;

/**
 *
 * @author Toshiba
 */
import AccesoDato.Conexion;

public class Sesion {
    Conexion con;
    int sesion_id;
    String sesion;
    String clave;

    public Sesion(){
        con=new Conexion();
    }

    public void setSesion_id(int sesion_id) {
        this.sesion_id = sesion_id;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getSesion_id() {
        return sesion_id;
    }

    public String getSesion() {
        return sesion;
    }

    public String getClave() {
        return clave;
    }
    public void save(){
        con.setInsertar("insert into Sesiones(sesion,clave,) values('"+this.getSesion()+"','"+this.getClave()+"')");
    }
       public void update(){
        con.setInsertar("update Sesiones set sesion='"+this.getSesion()+"',clave='"+this.getClave()+"' where sesion_id='"+this.getSesion_id()+"'");
    }
     public void Logear(){
     con.setConsulta("select * from Sesiones where sesion=='"+this.getSesion()+"' and clave=='"+this.getClave()+"'");
          
     }
}
