/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.modelo;

/**
 *
 * @author Usuario
 */
public class Materia {

private int id=-1;
private String nombre;

    public Materia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
  public Materia( String nombre) {
        
        this.nombre = nombre;
    }
    
    public Materia(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@Override
    public String toString(){
    
        return id+"-"+nombre;
    }


}
