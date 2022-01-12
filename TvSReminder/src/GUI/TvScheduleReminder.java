package GUI;

import BD.conexao;
import BD.ListaProgramas;
import TVSR.Eventos;
import TVSR.Ficheiros;
import TVSR.User;
import TVSR.User4save;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class TvScheduleReminder extends javax.swing.JFrame {

    private static Thread t = null;
    conexao con_BD;
    static User user = new User();

    public TvScheduleReminder() {
        initComponents();
        update();
        //cenas da net -----------------------------------------------------  
        // -----------------------------------------------------
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Eliminaevento = new javax.swing.JButton();
        btSuspendPC = new javax.swing.JButton();
        bt_listarprog = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeventos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Neventos = new javax.swing.JTextField();
        btNewEvent3 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton45 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        supende = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuNewEvent = new javax.swing.JMenuItem();
        MenuDeleteEvent = new javax.swing.JMenuItem();
        options = new javax.swing.JMenu();
        MenuAlarm = new javax.swing.JMenuItem();
        MenuAbout = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TvSReminder");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(850, 440));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(744, 341));

        Eliminaevento.setText("Eliminar Evento");
        Eliminaevento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Eliminaevento.setEnabled(false);
        Eliminaevento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminaeventoActionPerformed(evt);
            }
        });

        btSuspendPC.setText("Suspender PC");
        btSuspendPC.setPreferredSize(new java.awt.Dimension(125, 25));
        btSuspendPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btSuspendPCMouseReleased(evt);
            }
        });

        bt_listarprog.setText("Listar Programas");
        bt_listarprog.setPreferredSize(new java.awt.Dimension(125, 25));
        bt_listarprog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt_listarprogMouseReleased(evt);
            }
        });
        bt_listarprog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_listarprogActionPerformed(evt);
            }
        });

        tabeventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Programa", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabeventos.setToolTipText("");
        tabeventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeventosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeventos);
        tabeventos.getColumnModel().getColumn(0).setResizable(false);

        jLabel9.setText("Nº de eventos:");

        Neventos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Neventos.setText("0");
        Neventos.setBorder(null);
        Neventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeventosActionPerformed(evt);
            }
        });

        btNewEvent3.setText("Lista completa");
        btNewEvent3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btNewEvent3.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Neventos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNewEvent3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Eliminaevento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSuspendPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_listarprog, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_listarprog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(Neventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btNewEvent3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btSuspendPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Eliminaevento))
                                .addGap(13, 13, 13)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButton45.setText("Opções das notificações");
        jButton45.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("PC vai suspender ás:");
        jLabel10.setEnabled(false);

        supende.setPreferredSize(new java.awt.Dimension(35, 14));

        MenuFile.setText("Eventos");
        MenuFile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MenuNewEvent.setText("Adicionar evento");
        MenuNewEvent.setActionCommand("Adicionar Evento");
        MenuNewEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuNewEventMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuNewEventMouseClicked(evt);
            }
        });
        MenuFile.add(MenuNewEvent);

        MenuDeleteEvent.setText("Sair");
        MenuDeleteEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuDeleteEventMouseReleased(evt);
            }
        });
        MenuFile.add(MenuDeleteEvent);

        jMenuBar1.add(MenuFile);

        options.setText("Opções");

        MenuAlarm.setText("Notificações");
        MenuAlarm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuAlarmMouseReleased(evt);
            }
        });
        options.add(MenuAlarm);

        jMenuBar1.add(options);

        MenuAbout.setText("Sobre");

        menuAbout.setText("Sobre");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        MenuAbout.add(menuAbout);

        jMenuBar1.add(MenuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton45)
                .addGap(38, 38, 38))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton45)
                    .addComponent(jLabel10)
                    .addComponent(supende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void NeventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NeventosActionPerformed

    private void bt_listarprogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_listarprogActionPerformed
    }//GEN-LAST:event_bt_listarprogActionPerformed

    private void bt_listarprogMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listarprogMouseReleased

        new ListaProgramas(user.getEventos()).setVisible(true);
        update();

    }//GEN-LAST:event_bt_listarprogMouseReleased

    private void btSuspendPCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuspendPCMouseReleased

        new SuspendPC(user).setVisible(true);
        update();
    }//GEN-LAST:event_btSuspendPCMouseReleased

    private void EliminaeventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminaeventoActionPerformed
        if (tabeventos.getSelectedRow() != -1) {

            int n = JOptionPane.showConfirmDialog(
                    null, "Tem a certeza que deseja eliminar o\n Evento seleccionado??\n", "Eliminar evento?",
                    JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                user.getEventos().remove(tabeventos.getSelectedRow());
            }
            Eliminaevento.setEnabled(false);
        }
        update();
    }//GEN-LAST:event_EliminaeventoActionPerformed

    private void tabeventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeventosMouseClicked
        if (tabeventos.getSelectedRow() != -1) {
            Eliminaevento.setEnabled(true);
        }
    }//GEN-LAST:event_tabeventosMouseClicked

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        new OpcoesNotificacao(user).setVisible(true);
        update();
    }//GEN-LAST:event_jButton45ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
    }//GEN-LAST:event_formMouseMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        update();
    }//GEN-LAST:event_formMouseClicked

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
    }//GEN-LAST:event_menuAboutActionPerformed

    private void MenuNewEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuNewEventMouseClicked
    }//GEN-LAST:event_MenuNewEventMouseClicked

    private void MenuNewEventMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuNewEventMouseReleased
        new ListaProgramas(user.getEventos()).setVisible(true);
        update();
    }//GEN-LAST:event_MenuNewEventMouseReleased

    private void MenuAlarmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAlarmMouseReleased
        new OpcoesNotificacao(user).setVisible(true);
        update();
    }//GEN-LAST:event_MenuAlarmMouseReleased

    private void MenuDeleteEventMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDeleteEventMouseReleased
        dispose();
    }//GEN-LAST:event_MenuDeleteEventMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TvScheduleReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TvScheduleReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TvScheduleReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TvScheduleReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                open();

                new TvScheduleReminder().setVisible(true);
                gravar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminaevento;
    private javax.swing.JMenu MenuAbout;
    private javax.swing.JMenuItem MenuAlarm;
    private javax.swing.JMenuItem MenuDeleteEvent;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JMenuItem MenuNewEvent;
    private javax.swing.JTextField Neventos;
    private javax.swing.JButton btNewEvent3;
    private javax.swing.JButton btSuspendPC;
    private javax.swing.JButton bt_listarprog;
    private javax.swing.JButton jButton45;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenu options;
    private javax.swing.JLabel supende;
    private javax.swing.JTable tabeventos;
    // End of variables declaration//GEN-END:variables

    public static void checkthread() throws InterruptedException {
        user.launchtremind();
    }

    public void update() {
        try {
            checkthread();
        } catch (InterruptedException ex) {
            Logger.getLogger(TvScheduleReminder.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ordena();
        } catch (ParseException ex) {
            Logger.getLogger(TvScheduleReminder.class.getName()).log(Level.SEVERE, null, ex);
        }
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tabeventos.getModel();
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        for (int i = 0; i < user.getEventos().size(); i++) {

            Object[] obj = new Object[]{user.getEventos().get(i).getNome(), user.getEventos().get(i).getData(), user.getEventos().get(i).getHora()};
            dtm.addRow(obj);
        }
        Neventos.setText(Integer.toString(user.getEventos().size()));
        if (user.tshutalive()) {
            supende.setText(user.getHora() + ":" + user.getMin());
        } else {
            supende.setText("");
        }
        gravar();
    }

    public static void open() {
        File file = new File("datafile");
        if (file.exists()) {
            User4save lido = Ficheiros.ler(file);
            if (lido != null) {
                System.out.println("lido: " + lido.getEventos().size());
                user.setEventos(lido.getEventos());
                user.setPop(lido.isPop());
                user.setSom(lido.isSom());
            }
        } else {
            user = new User();
        }
    }

    public static void gravar() {
        File file = new File("datafile");
        Ficheiros f = new Ficheiros();
        User4save grava = new User4save();
        grava.setPop(user.isPop());
        grava.setSom(user.isSom());
        grava.setEventos(user.getEventos());
        System.out.println("gravar: " + grava.getEventos().size());
        f.gravar(grava, file);
    }

    public void ordena() throws ParseException {
        ArrayList<Eventos> ev = new ArrayList<Eventos>();
        ArrayList<Eventos> aux = user.getEventos();
        int i, ind = 0;
        while (!aux.isEmpty()) {
            Eventos e = aux.get(0);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date data1 = df.parse(e.getData());

            for (i = 1; i < aux.size(); i++) {
                Date data2 = df.parse(aux.get(i).getData());
                if (data1.after(data2)) {
                    e = aux.get(i);
                    ind = i;
                } else if (data1.equals(data2)) {
                    SimpleDateFormat hf = new SimpleDateFormat("HH:mm:ss");
                    Date dh1 = hf.parse(e.getHora());
                    Date dh2 = hf.parse(aux.get(i).getHora());
                    if (dh1.after(dh2)) {
                        e = aux.get(i);
                        ind = i;
                    }
                }
            }
            ev.add(e);
            aux.remove(ind);
            ind = 0;
        }
        user.setEventos(ev);
        retira();
    }

    public void retira() throws ParseException {
        ArrayList<Eventos> aux = user.getEventos();
        int i;

        Calendar cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date data1 = df.parse(df.format(cal.getTime()));

        for (i = 0; i < aux.size(); i++) {

            Date data2 = df.parse(aux.get(i).getData());
            if (data1.before(data2)) {
                aux.remove(i);
                i--;
                JOptionPane.showMessageDialog(null, "Evento já passou!!!!");
            } else if (data1.equals(data2)) {
                SimpleDateFormat hf = new SimpleDateFormat("HH:mm:ss");

                Date dh1 = hf.parse(aux.get(i).getHora());
                Date dh2 = hf.parse(hf.format(cal.getTime()));
                if (dh1.before(dh2)) {
                    aux.remove(i);
                    i--;
                    JOptionPane.showMessageDialog(null, "Evento já passou!!!!");
                }
            }
        }
        user.setEventos(aux);

    }
}