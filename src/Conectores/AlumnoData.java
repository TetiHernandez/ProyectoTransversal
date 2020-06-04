/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectores;

//import accesoabasededatos.modelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import universidad.Alumno;
import universidad.Materia;

/**
 *
 * @author ruben
 */
public class AlumnoData {
    private Connection con;

    public AlumnoData(Conexion conexion) {
        try {
            con = conexion.getConexion();
            
            System.out.println("Conecetado a la base de datos");
            
        } catch (SQLException ex) {
            System.out.println("Error sl obtener la conexion");
        }
    }
    
    
    public void guardarAlumno(Alumno alumno){
        try {
            
            String sql = "INSERT INTO alumno (nombre, fecNac, activo) VALUES ( ? , ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setDate(2, Date.valueOf(alumno.getFecNac()));
            ps.setBoolean(3, alumno.getActivo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setId(rs.getInt(1));
                System.out.println("Se ha guardado al alumno/a: "+alumno.getNombre());
                
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al guardar un alumno: " + ex.getMessage());
        }
    }
    
    public List<Alumno> obtenerAlumnos(){
        List<Alumno> alumnos = new ArrayList<Alumno>();
            

        try {
            String sql = "SELECT * FROM alumno;";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet resultSet = ps.executeQuery();
            
            Alumno alumno;
            while(resultSet.next()){
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("id"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                alumnos.add(alumno);
                //System.out.println("Lista de alumnos/a: "+alumno.getNombre());
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return  alumnos;
    }
    
    public void borrarAlumno(int id){
    try {
            
            String sql = "DELETE FROM alumno WHERE id =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
                      
            ps.executeUpdate();
            
            System.out.println("Se ha borrado al alumno ");  
            
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un alumno: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarAlumno(Alumno alumno){
    
        try {
            
            String sql = "UPDATE alumno SET nombre = ?, fecNac = ? , "
                    + "activo =? WHERE id = ?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setDate(2, Date.valueOf(alumno.getFecNac()));
            ps.setBoolean(3, alumno.getActivo());
            ps.setInt(4, alumno.getId());
            ps.executeUpdate();
            
          
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un alumno: " + ex.getMessage());
        }
    
    }
    
    public Alumno buscarAlumno(int id){
    Alumno alumno=null;
   
    try {
            
            String sql = "SELECT * FROM alumno WHERE id =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
           
            
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("id"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                
            }      
            ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar un alumno: " + ex.getMessage());
        }
        
        return alumno;
    }
    
   
    
    
    public  List<Materia> agregarMateria(Materia materia){
         
        List<Materia> mat = new ArrayList<Materia>();
        mat.add(materia);
        
        
        return mat;
        }

    
    
    
    
     
   
    
    
    
}
