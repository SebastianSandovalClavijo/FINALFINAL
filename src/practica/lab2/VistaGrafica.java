/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.lab2;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author SANDOVAL
 */
public class VistaGrafica extends javax.swing.JFrame {

    int[] arreglo;
    double[] arreglo1;

    /**
     * Creates new form VistaGrafica
     */
    public VistaGrafica() {

        initComponents();
        //aleatorios

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        BtnVarianza = new javax.swing.JButton();
        Burbuja = new javax.swing.JButton();
        DesviacionEstandar = new javax.swing.JButton();
        Media1 = new javax.swing.JButton();
        Merge = new javax.swing.JButton();
        AleatoriosDouble = new javax.swing.JButton();
        Seleccion = new javax.swing.JButton();
        Insercion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Teclado1 = new javax.swing.JTextField();
        Aleatorios = new javax.swing.JButton();
        GeneradorVarianza = new javax.swing.JTextField();
        GeneradorDesviacionEstandar = new javax.swing.JTextField();
        GeneradorMedia = new javax.swing.JTextField();
        Teclado2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GeneradorSeleccion = new javax.swing.JTextField();
        Generadormerge = new javax.swing.JTextField();
        GeneradorBurbuja = new javax.swing.JTextField();
        GenerarInsercion = new javax.swing.JTextField();
        TiempoSeleccion = new javax.swing.JTextField();
        TiempoMerge = new javax.swing.JTextField();
        TiempoBurbuja = new javax.swing.JTextField();
        TiempoInsercion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Teclado3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Modificacion = new javax.swing.JButton();
        GenerarModificado = new javax.swing.JTextField();
        C = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BtnVarianza.setText("Varianza");
        BtnVarianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVarianzaActionPerformed(evt);
            }
        });

        Burbuja.setText("Burbuja");
        Burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurbujaActionPerformed(evt);
            }
        });

        DesviacionEstandar.setText("D --Estandar");
        DesviacionEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesviacionEstandarActionPerformed(evt);
            }
        });

        Media1.setText("Media");
        Media1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Media1ActionPerformed(evt);
            }
        });

        Merge.setText("Merge");
        Merge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MergeActionPerformed(evt);
            }
        });

        AleatoriosDouble.setText("Aleatorios Double");
        AleatoriosDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AleatoriosDoubleActionPerformed(evt);
            }
        });

        Seleccion.setText("Seleccion");
        Seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionActionPerformed(evt);
            }
        });

        Insercion.setText("Insercion");
        Insercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsercionActionPerformed(evt);
            }
        });

        jLabel1.setText("Escriba el tama??o del arreglo");

        Teclado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teclado1ActionPerformed(evt);
            }
        });

        Aleatorios.setText("Aleatorios Int");
        Aleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AleatoriosActionPerformed(evt);
            }
        });

        GeneradorVarianza.setEditable(false);
        GeneradorVarianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneradorVarianzaActionPerformed(evt);
            }
        });

        GeneradorDesviacionEstandar.setEditable(false);

        GeneradorMedia.setEditable(false);

        Teclado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teclado2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tiempo:");

        jLabel3.setText("Tiempo:");

        jLabel4.setText("Tiempo:");

        jLabel5.setText("Tiempo:");

        GeneradorSeleccion.setEditable(false);

        TiempoSeleccion.setEditable(false);
        TiempoSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoSeleccionActionPerformed(evt);
            }
        });

        TiempoMerge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoMergeActionPerformed(evt);
            }
        });

        jLabel6.setText("Escriba el tama??o del arreglo");

        Teclado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teclado3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Escriba un arreglo de caracteres");

        Modificacion.setText("Modificar");
        Modificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificacionActionPerformed(evt);
            }
        });

        GenerarModificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarModificadoActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(255, 255, 255));
        C.setText("C");
        C.setBorderPainted(false);
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Seleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(GeneradorSeleccion))
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TiempoSeleccion)
                                                .addGap(31, 31, 31)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Generadormerge)
                                                    .addComponent(Merge, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Burbuja, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                                    .addComponent(GeneradorBurbuja)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                                    .addComponent(TiempoMerge))
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TiempoBurbuja)))))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Insercion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TiempoInsercion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GenerarInsercion, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Modificacion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(GenerarModificado))
                                .addComponent(Teclado3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Teclado2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                            .addComponent(Teclado1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(AleatoriosDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnVarianza, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GeneradorVarianza, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(GeneradorDesviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(GeneradorMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DesviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Media1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Aleatorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Aleatorios)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(Teclado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GeneradorVarianza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GeneradorDesviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GeneradorMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnVarianza)
                    .addComponent(DesviacionEstandar)
                    .addComponent(Media1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AleatoriosDouble))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Teclado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seleccion)
                    .addComponent(Merge)
                    .addComponent(Burbuja)
                    .addComponent(Insercion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GenerarInsercion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GeneradorSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Generadormerge, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GeneradorBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TiempoSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiempoMerge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiempoInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiempoBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Teclado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificacion)
                    .addComponent(GenerarModificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MergeActionPerformed
        // TODO add your handling code here:
        MergeSort mergeSort = new MergeSort();

        int n = arreglo1.length;

        System.out.println();
        long inicio4 = System.nanoTime();
        mergeSort.sort(arreglo1, 0, n - 1);
        mergeSort.printArray(arreglo1);
       
        long fin4 = System.nanoTime();
        double dif4 = (double) (fin4 - inicio4) * (1.0e-9);
        TiempoMerge.setText(Double.toString(Math.round((dif4) * 10000.0000) / 10000.0000));


    }//GEN-LAST:event_MergeActionPerformed

    private void BtnVarianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVarianzaActionPerformed

        MetodosSueltos o = new MetodosSueltos();
        double varianza;
        double sumatoria = 0;

        for (int i = 0; i < arreglo.length; i++) {

            sumatoria = sumatoria + Math.pow((arreglo[i] - o.Media(arreglo)), 2);

        }

        varianza = Math.round(sumatoria / arreglo.length);

        GeneradorVarianza.setText(String.valueOf(o.Varianza(arreglo)));

    }//GEN-LAST:event_BtnVarianzaActionPerformed

    private void AleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AleatoriosActionPerformed
        // TODO add your handling code here:

        try {
            int tama??o = Integer.valueOf(Teclado1.getText());
            Random aleatorios = new Random();
            int[] arreglo = new int[tama??o];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = aleatorios.nextInt(25) + 1;
                System.out.println(arreglo[i]);
            }
            this.arreglo = arreglo;
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_AleatoriosActionPerformed

    private void Teclado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Teclado1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_Teclado1ActionPerformed

    private void GeneradorVarianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneradorVarianzaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_GeneradorVarianzaActionPerformed

    private void DesviacionEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesviacionEstandarActionPerformed
        // TODO add your handling code here:

        int varianza = Integer.valueOf(GeneradorVarianza.getText());
        GeneradorDesviacionEstandar.setText(String.valueOf(Math.round(Math.sqrt(varianza))));
    }//GEN-LAST:event_DesviacionEstandarActionPerformed

    private void Media1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Media1ActionPerformed
        // TODO add your handling code here:
        MetodosSueltos o = new MetodosSueltos();
        GeneradorMedia.setText(String.valueOf(o.Media(arreglo)));

    }//GEN-LAST:event_Media1ActionPerformed

    private void Teclado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Teclado2ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_Teclado2ActionPerformed

    private void AleatoriosDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AleatoriosDoubleActionPerformed
        // TODO add your handling code here:

        try {
            int tama??o = Integer.valueOf(Teclado2.getText());
            Random aleatorios = new Random();
            double[] arreglo1 = new double[tama??o];

            for (int i = 0; i < arreglo1.length; i++) {
                arreglo1[i] = aleatorios.nextInt(25) + 1;

            }
            this.arreglo1 = arreglo1;
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_AleatoriosDoubleActionPerformed

    private void SeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionActionPerformed
        // TODO add your handling code here:
        MetodosSueltos o = new MetodosSueltos();
        o.organizadorSeleccion(arreglo1);
        System.out.println();
        long inicio2 = System.nanoTime();
        for (int i = 0; i < arreglo1.length; i++) {

            GeneradorSeleccion.setText(Double.toString((Math.round((arreglo1[i]) * 100.0) / 100.0)));
        }
        long fin2 = System.nanoTime();
        double dif2 = (double) (fin2 - inicio2) * (1.0e-9);
        TiempoSeleccion.setText(Double.toString(Math.round((dif2) * 10000.0000) / 10000.0000));


    }//GEN-LAST:event_SeleccionActionPerformed

    private void TiempoSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoSeleccionActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_TiempoSeleccionActionPerformed

    private void BurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurbujaActionPerformed
        // TODO add your handling code here:
        MetodosSueltos o = new MetodosSueltos();
        o.organizadorBurbuja(arreglo1);
        long inicio3 = System.nanoTime();
        for (int i = 0; i < arreglo1.length; i++) {

            arreglo1[i] = (Math.round((arreglo1[i]) * 100.0) / 100.0);
            GeneradorBurbuja.setText(Double.toString((Math.round((arreglo1[i]) * 100.0) / 100.0)));
        }
        long fin3 = System.nanoTime();
        double dif3 = (double) (fin3 - inicio3) * (1.0e-9);
        TiempoBurbuja.setText(Double.toString(Math.round((dif3) * 10000.0000) / 10000.0000));


    }//GEN-LAST:event_BurbujaActionPerformed

    private void InsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsercionActionPerformed
        // TODO add your handling code here:
        MetodosSueltos o = new MetodosSueltos();
        o.organizadorInsercion(arreglo1);
        long inicio = System.nanoTime();
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = (Math.round((arreglo1[i]) * 100.0) / 100.0);
            GenerarInsercion.setText(Double.toString((Math.round((arreglo1[i]) * 100.0) / 100.0)));

        }
        long fin = System.nanoTime();
        double dif = (double) (fin - inicio) * (1.0e-9);
        TiempoInsercion.setText(Double.toString(Math.round((dif) * 10000.0000) / 10000.0000));
        System.out.println();


    }//GEN-LAST:event_InsercionActionPerformed

    private void ModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificacionActionPerformed
        // TODO add your handling code here:
        String frase = (Teclado3.getText());

        char[] caracteres;
        int repetido = 0;
        char caractermasrepetido = ' ';
        int contador = 0;

        frase = frase.toLowerCase();//Cambiar mayuscula-minuscula
        caracteres = frase.toCharArray();//Convertir el texto a caracteres
        for (int i = 0; i < caracteres.length; i++) {
            char actual = caracteres[i];
            contador = 0;
            for (int j = 0; j < caracteres.length; j++) {
                if (caracteres[j] == actual) {
                    contador++;
                }
            }
            if (repetido < contador) {
                repetido = contador;
                caractermasrepetido = actual;
            }
        }
        for (int i = 0; i < caracteres.length; i++) {
            frase = frase.replace('a', caractermasrepetido).replace('e', caractermasrepetido).replace('i', caractermasrepetido).replace('o', caractermasrepetido).replace('u', caractermasrepetido);

        }
        GenerarModificado.setText(frase);


    }//GEN-LAST:event_ModificacionActionPerformed

    private void GenerarModificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarModificadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerarModificadoActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        String cadena = Teclado1.getText();
        String cadena1 = Teclado2.getText();
        String cadena2 = Teclado3.getText();

        if (cadena.length() > 0) {
            cadena = cadena.substring(0, 0);
            Teclado1.setText(cadena);
            GeneradorVarianza.setText(cadena);
            GeneradorDesviacionEstandar.setText(cadena);
            GeneradorMedia.setText(cadena);
        }
        if (cadena1.length() > 0) {
            cadena1 = cadena1.substring(0, 0);
            Teclado2.setText(cadena1);
            TiempoSeleccion.setText(cadena1);
            TiempoMerge.setText(cadena1);
            TiempoBurbuja.setText(cadena1);
            TiempoInsercion.setText(cadena1);
            GeneradorSeleccion.setText(cadena1);
            Generadormerge.setText(cadena1);
            GeneradorBurbuja.setText(cadena1);
            GenerarInsercion.setText(cadena1);

        }
        if (cadena2.length() > 0) {
            cadena2 = cadena2.substring(0, 0);
            Teclado3.setText(cadena2);
            GenerarModificado.setText(cadena2);
        }


    }//GEN-LAST:event_CActionPerformed

    private void TiempoMergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoMergeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempoMergeActionPerformed

    private void Teclado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Teclado3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Teclado3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGrafica().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aleatorios;
    private javax.swing.JButton AleatoriosDouble;
    private javax.swing.JButton BtnVarianza;
    private javax.swing.JButton Burbuja;
    private javax.swing.JButton C;
    private javax.swing.JButton DesviacionEstandar;
    private javax.swing.JTextField GeneradorBurbuja;
    private javax.swing.JTextField GeneradorDesviacionEstandar;
    private javax.swing.JTextField GeneradorMedia;
    private javax.swing.JTextField GeneradorSeleccion;
    private javax.swing.JTextField GeneradorVarianza;
    private javax.swing.JTextField Generadormerge;
    private javax.swing.JTextField GenerarInsercion;
    private javax.swing.JTextField GenerarModificado;
    private javax.swing.JButton Insercion;
    private javax.swing.JButton Media1;
    private javax.swing.JButton Merge;
    private javax.swing.JButton Modificacion;
    private javax.swing.JButton Seleccion;
    private javax.swing.JTextField Teclado1;
    private javax.swing.JTextField Teclado2;
    private javax.swing.JTextField Teclado3;
    private javax.swing.JTextField TiempoBurbuja;
    private javax.swing.JTextField TiempoInsercion;
    private javax.swing.JTextField TiempoMerge;
    private javax.swing.JTextField TiempoSeleccion;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
