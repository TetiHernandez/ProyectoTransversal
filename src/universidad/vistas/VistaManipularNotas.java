/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.vistas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.controlador.AlumnoData;
import universidad.controlador.Conexion;
import universidad.controlador.CursadaData;
import universidad.controlador.MateriaData;
import universidad.modelo.Alumno;
import universidad.modelo.Cursada;
import universidad.modelo.Materia;

/**
 *
 * @author tetid
 */
public class VistaManipularNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private List<Cursada> listaCursadas;
    private List<Materia> listaMaterias;
    private CursadaData cd;
    private MateriaData md;
    private AlumnoData ad;
    private List<Alumno> listaAlumnos;
    private Conexion conexion;
    /**
     * Creates new form VistaManipularNotas
     */
    public VistaManipularNotas() {
        initComponents();
        
        try {
            conexion = new Conexion();
//            connection = conexion.getConexion();


            modelo = new DefaultTableModel();
        
            cd = new CursadaData(conexion);
            md = new MateriaData(conexion);
            ad = new AlumnoData(conexion);
            
//            listaCursadas = cd.obtenerCursadas();
//            listaMaterias = md.obtenerMaterias();
            listaAlumnos = ad.obtenerAlumnos();
            
            cargarAlumnos();
            armarCabeceraTabla();
//            cargarDatos();
            
        } 
//        catch (SQLException ex) {
//            System.out.println("Error al obtener la conexion");
//            Logger.getLogger(vistaAlumnoMaterias.class.getName()).log(Level.SEVERE, null, ex);
//        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaAlumnosMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNotas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tNota = new javax.swing.JTextField();
        btActualizarNota = new javax.swing.JButton();

        jLabel1.setText("Manipular notas");

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel2.setText("Alumno:");

        listaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(listaNotas);

        jLabel3.setText("Nota:");

        btActualizarNota.setText("Actualizar Nota");
        btActualizarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tNota, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btActualizarNota)))
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btActualizarNota))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        // TODO add your handling code here:
        
        cargarDatosInscriptas();
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void btActualizarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarNotaActionPerformed
        // TODO add your handling code here:
        try{
            int notaParaActualizar = Integer.parseInt(tNota.getText());            
            int filaSeleccionada = listaNotas.getSelectedRow();      
            
            if(filaSeleccionada != -1){
                Alumno a = (Alumno)cbAlumnos.getSelectedItem();

                int idMateria = (int)modelo.getValueAt(filaSeleccionada, 0);
                
                
                
                Materia m = cd.buscarMateria(idMateria);
                                
                cd.actualizarNotaCursada(a.getId(), m.getId(), notaParaActualizar);
                
                borrarFilasTabla();

            }
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un numero");
            tNota.setText("");
            tNota.requestFocus();
        }

    }//GEN-LAST:event_btActualizarNotaActionPerformed


    public void cargarAlumnos(){
        for(Alumno a : listaAlumnos){
            cbAlumnos.addItem(a);
        }
    }
    
    public void armarCabeceraTabla(){
        List<Object> columnas = new ArrayList<Object>();
                
        columnas.add("id Materia");
        columnas.add("Materia");
        columnas.add("Nota");
        
        for(Object columna : columnas){
            modelo.addColumn(columna);
        }
        
        listaNotas.setModel(modelo);
    }
    
    public void borrarFilasTabla(){
        int nFilas = modelo.getRowCount() - 1;
        
        for(int i = nFilas; i >= 0; i--){
            modelo.removeRow(i);
        }
        
    }
    
    public void cargarDatosInscriptas(){
        borrarFilasTabla();
        
        Alumno seleccionado = (Alumno)cbAlumnos.getSelectedItem();
//        listaMaterias = cd.obtenerMateriasCursadas(seleccionado.getId());
        listaCursadas = cd.obtenerCursadasXAlumno(seleccionado.getId());
        
        
        for(Cursada c : listaCursadas){
            
            modelo.addRow(new Object[]{c.getMateria().getId() ,c.getMateria().getNombre(), c.getNota()});
            
        }
    }
    
//    public void cargarDatos(){
//        borrarFilasTabla();
//        
//        Materia materia = (Materia)cbMaterias.getSelectedItem();
//        
//        for(Cursada cur : listaCursadas){
//            if(cur.getMateria().getId() == materia.getId()){
//                modelo.addRow(new Object[]{cur.getAlumno().getId(), cur.getAlumno().getNombre(),
//                    cur.getNota()});
//            }
//        }
//    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizarNota;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaNotas;
    private javax.swing.JTextField tNota;
    // End of variables declaration//GEN-END:variables
}