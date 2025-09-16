package Vistas;

import gestiondeproductos2.Gestora;
import gestiondeproductos2.Producto;
import gestiondeproductos2.Repositorio;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class Administracion extends javax.swing.JInternalFrame {

    private TableRowSorter<DefaultTableModel> sorter;

    /**
     * Creates new form Administracion
     */
    public Administracion() {
        initComponents();
        iniciarTabla();
        comboBox();
        comboRubro();
        Spinner();
        actualizarTabla(Repositorio.listarProductos());

    }

    public void iniciarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tableProductos.getModel();
        sorter = new TableRowSorter<>(modelo);
        tableProductos.setRowSorter(sorter);
    }

    public void Spinner() {

        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 100, 1);
        jSStock.setModel(model);
    }

    public void comboBox() {
        String[] Categorias = {"Todos", "Comestible", "Limpieza", "Perfumería"};
        JComboCat.setModel(new javax.swing.DefaultComboBoxModel<>(Categorias));
    }

    public void comboRubro() {
        String[] rubros = {"Comestible", "Limpieza", "Perfumería"};
        JComboRubro.setModel(new javax.swing.DefaultComboBoxModel<>(rubros));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JComboCat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        bttBuscar = new javax.swing.JButton();
        bttSalir = new javax.swing.JButton();
        bttNuevo = new javax.swing.JButton();
        bttGuardar = new javax.swing.JButton();
        bttActualizar = new javax.swing.JButton();
        bttEliminar = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JComboRubro = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSStock = new javax.swing.JSpinner();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Gestion de Productos");

        jLabel2.setText("Filtrar por Categoria");

        JComboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Categoria", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableProductos);

        bttBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\ULP\\Laboratorio\\iconos netbeans\\search.png")); // NOI18N
        bttBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarActionPerformed(evt);
            }
        });

        bttSalir.setText("Salir");
        bttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalirActionPerformed(evt);
            }
        });

        bttNuevo.setText("Nuevo");
        bttNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNuevoActionPerformed(evt);
            }
        });

        bttGuardar.setText("Guardar");
        bttGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarActionPerformed(evt);
            }
        });

        bttActualizar.setText("Actualizar");

        bttEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\ULP\\Laboratorio\\iconos netbeans\\icons8-eliminar-50.png")); // NOI18N
        bttEliminar.setText("Eliminar");
        bttEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setText("Código");

        jLabel4.setText("Descripción");

        jLabel5.setText("Precio");

        jLabel6.setText("Rubro");

        jLabel7.setText("Stock");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSStock, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JComboRubro, javax.swing.GroupLayout.Alignment.LEADING, 0, 346, Short.MAX_VALUE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JComboCat, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bttNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttGuardar)
                        .addGap(58, 58, 58)
                        .addComponent(bttActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(bttEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JComboCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(bttBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(bttSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttNuevo)
                    .addComponent(bttGuardar)
                    .addComponent(bttActualizar)
                    .addComponent(bttEliminar))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarActionPerformed
        try {
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            String descripcion = txtDesc.getText().trim();
            double precio = Double.parseDouble(txtPrecio.getText().trim());
            int stock = (Integer) jSStock.getValue();
            String rubro = (String) JComboRubro.getSelectedItem();

            Producto nuevo = new Producto(codigo, descripcion, precio, stock, rubro);

            if (!Repositorio.agregarProducto(nuevo)) {
                JOptionPane.showMessageDialog(this, "El código ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            actualizarTabla(Repositorio.listarProductos());
            
            JOptionPane.showMessageDialog(this, "Producto agregado: " + codigo);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código/Precio inválidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bttGuardarActionPerformed

    private void actualizarTabla(Set<Producto> productos) {
        DefaultTableModel modelo = (DefaultTableModel) tableProductos.getModel();
        modelo.setRowCount(0);

        for (Producto p : productos) {
            modelo.addRow(new Object[]{
                p.getCodigo(),
                p.getDescripcion(),
                p.getPrecio(),
                p.getRubro(),
                p.getStock()
            });
        }
    }

   

    private void bttBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarActionPerformed
        String categoria = (String) JComboCat.getSelectedItem();

        if (categoria == null || categoria.equals("Todos")) {
            sorter.setRowFilter(null);
        } else {

            sorter.setRowFilter(new RowFilter<DefaultTableModel, Integer>() {
                @Override
                public boolean include(Entry<? extends DefaultTableModel, ? extends Integer> entry) {
                    String valor = entry.getStringValue(3);
                    return valor.equalsIgnoreCase(categoria);
                }
            });
        }
    }//GEN-LAST:event_bttBuscarActionPerformed

    private void bttEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarActionPerformed
        int filaSeleccionada = tableProductos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int codigo = (int) tableProductos.getValueAt(filaSeleccionada, 0);

            if (Repositorio.eliminarProducto(codigo)) {
                JOptionPane.showMessageDialog(this, "Producto eliminado");
                actualizarTabla(Repositorio.listarProductos());
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar producto");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar");
        }

    }//GEN-LAST:event_bttEliminarActionPerformed

    private void bttNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNuevoActionPerformed
        txtCodigo.setText("");
        txtDesc.setText("");
        txtPrecio.setText("");
        JComboRubro.setSelectedIndex(0);
        jSStock.setValue(1);
    }//GEN-LAST:event_bttNuevoActionPerformed

    private void bttSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_bttSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboCat;
    private javax.swing.JComboBox<String> JComboRubro;
    private javax.swing.JButton bttActualizar;
    private javax.swing.JButton bttBuscar;
    private javax.swing.JButton bttEliminar;
    private javax.swing.JButton bttGuardar;
    private javax.swing.JButton bttNuevo;
    private javax.swing.JButton bttSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jSStock;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
