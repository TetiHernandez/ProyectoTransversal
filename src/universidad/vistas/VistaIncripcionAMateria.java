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
public class VistaIncripcionAMateria extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private List<Cursada> listaCursadas;
    private List<Materia> listaMaterias;
    private CursadaData cd;
    private MateriaData md;
    private AlumnoData ad;
    private List<Alumno> listaAlumnos;
    private Conexion conexion;
    /**
     * Creates new form VistaIncripcionAMateria
     */
    public VistaIncripcionAMateria() {
        initComponents();
        
        try {
            conexion = new Conexion();
//            connection = conexion.getConexion();


            modelo = new DefaultTableModel();
        
            cd = new CursadaData(conexion);
            md = new MateriaData(conexion);
            ad = new AlumnoData(conexion);
            
            listaCursadas = cd.obtenerCursadas();
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

        bgCondicion = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMaterias = new javax.swing.JTable();
        btInscribir = new javax.swing.JButton();
        btAnular = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        rbInscriptas = new javax.swing.JRadioButton();
        rbNoInscriptas = new javax.swing.JRadioButton();

        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Alumno:");

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setText("Listado de Materias");

        tMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tMaterias);

        btInscribir.setText("Inscribir");
        btInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscribirActionPerformed(evt);
            }
        });

        btAnular.setText("Anular Inscripcion");
        btAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnularActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        bgCondicion.add(rbInscriptas);
        rbInscriptas.setText("Inscriptas");
        rbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInscriptasActionPerformed(evt);
            }
        });

        bgCondicion.add(rbNoInscriptas);
        rbNoInscriptas.setText("No Inscriptas");
        rbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoInscriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btInscribir)
                        .addGap(42, 42, 42)
                        .addComponent(btAnular)
                        .addGap(43, 43, 43)
                        .addComponent(btSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(rbInscriptas)
                        .addGap(29, 29, 29)
                        .addComponent(rbNoInscriptas)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInscriptas)
                    .addComponent(rbNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInscribir)
                    .addComponent(btAnular)
                    .addComponent(btSalir))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tMaterias.getSelectedRow();
        System.out.println("Fila seleccionada " + filaSeleccionada);
        if(filaSeleccionada != -1){
            Alumno a = (Alumno)cbAlumnos.getSelectedItem();
            
            int idMateria = (int)modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String)modelo.getValueAt(filaSeleccionada, 1);
            
            Materia m = new Materia(idMateria, nombreMateria);
            Cursada c = new Cursada(a, m, 0);
            cd.guardarCursada(c);
            borrarFilasTabla();
            
        }
    }//GEN-LAST:event_btInscribirActionPerformed

    private void rbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInscriptasActionPerformed
        // TODO add your handling code here:
//        rbNoInscriptas.setSelected(false);
        cargarDatosInscriptas();
        btInscribir.setEnabled(false);
        btAnular.setEnabled(true);
    }//GEN-LAST:event_rbInscriptasActionPerformed

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        // TODO add your handling code here:
        borrarFilasTabla();
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnularActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tMaterias.getSelectedRow();
        
        if(filaSeleccionada != -1){
            Alumno a = (Alumno)cbAlumnos.getSelectedItem();
            
            int idMateria = (int)modelo.getValueAt(filaSeleccionada, 0);
            cd.borrarCursadaDeUnaMateriaDeunAlumno(a.getId(), idMateria);
            borrarFilasTabla();
        }
    }//GEN-LAST:event_btAnularActionPerformed

    private void rbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoInscriptasActionPerformed
        // TODO add your handling code here:
        
//        rbInscriptas.setSelected(false);
        cargarDatosNoInscriptas();
        btAnular.setEnabled(false);
        btInscribir.setEnabled(true);
    }//GEN-LAST:event_rbNoInscriptasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCondicion;
    private javax.swing.JButton btAnular;
    private javax.swing.JButton btInscribir;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbInscriptas;
    private javax.swing.JRadioButton rbNoInscriptas;
    private javax.swing.JTable tMaterias;
    // End of variables declaration//GEN-END:variables

    

    private void armarCabeceraTabla() {
        List<Object> columnas = new ArrayList<Object>();
        
        columnas.add("Id");
        columnas.add("Nombre");
        
        for(Object columna : columnas){
            modelo.addColumn(columna);
        }
        
        tMaterias.setModel(modelo);
    }

    private void cargarAlumnos() {
         for(Alumno a : listaAlumnos){
            cbAlumnos.addItem(a); //?
        }
    }
    
    public void borrarFilasTabla(){
        int nFilas = modelo.getRowCount() - 1;
        
        for(int i = nFilas; i >= 0; i--){
            modelo.removeRow(i);
        }
        
    }
    
    public void cargarDatosNoInscriptas(){
        borrarFilasTabla();
        
        Alumno seleccionado = (Alumno)cbAlumnos.getSelectedItem();
        listaMaterias = cd.obtenerMateriasNOCursadas(seleccionado.getId());
        
        for(Materia m : listaMaterias){
            
            modelo.addRow(new Object[]{m.getId(), m.getNombre()});
            
        }
    }
    
    public void cargarDatosInscriptas(){
        borrarFilasTabla();
        
        Alumno seleccionado = (Alumno)cbAlumnos.getSelectedItem();
        listaMaterias = cd.obtenerMateriasCursadas(seleccionado.getId());
        
        for(Materia m : listaMaterias){
            
            modelo.addRow(new Object[]{m.getId(), m.getNombre()});
            
        }
    }
}