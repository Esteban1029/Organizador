/*//GEN-FIRST:event_jButton1ActionPerformed
 * To change this license header, choose License Headers in Project Properties.//GEN-LAST:event_jButton1ActionPerformed
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Data.Alarm;
import Data.Event;
import java.util.ArrayList;

/**
 *
 * @author Ivan Solano
 */
public class Alarmas extends javax.swing.JFrame {

    private Event event;
    private ArrayList<Alarm> listAlarms;
    private Alarm alarm;
    /**
     * Creates new form Alarmas
     */
    public Alarmas() {
        initComponents();
        listAlarms=new ArrayList();
        event=null;
        alarm=null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Crear Invitados");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Crear Alarma");

        jCheckBox1.setText("Sonido");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Correo");
        jCheckBox2.setToolTipText("");

        jLabel3.setText("Tipo");

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {"0:00", "0:01", "0:02", "0:03", "0:04", "0:05", "0:06", "0:07", "0:08", "0:09", "0:10", "0:11", "0:12", "0:13", "0:14", "0:15", "0:16", "0:17", "0:18", "0:19", "0:20", "0:21", "0:22", "0:23", "0:24", "0:25", "0:26", "0:27", "0:28", "0:29", "0:30", "0:31", "0:32", "0:33", "0:34", "0:35", "0:36", "0:37", "0:38", "0:39", "0:40", "0:41", "0:42", "0:43", "0:44", "0:45", "0:46", "0:47", "0:48", "0:49", "0:50", "0:51", "0:52", "0:53", "0:54", "0:55", "0:56", "0:57", "0:58", "0:59", "1:00", "1:01", "1:02", "1:03", "1:04", "1:05", "1:06", "1:07", "1:08", "1:09", "1:10", "1:11", "1:12", "1:13", "1:14", "1:15", "1:16", "1:17", "1:18", "1:19", "1:20", "1:21", "1:22", "1:23", "1:24", "1:25", "1:26", "1:27", "1:28", "1:29", "1:30", "1:31", "1:32", "1:33", "1:34", "1:35", "1:36", "1:37", "1:38", "1:39", "1:40", "1:41", "1:42", "1:43", "1:44", "1:45", "1:46", "1:47", "1:48", "1:49", "1:50", "1:51", "1:52", "1:53", "1:54", "1:55", "1:56", "1:57", "1:58", "1:59", "2:00", "2:01", "2:02", "2:03", "2:04", "2:05", "2:06", "2:07", "2:08", "2:09", "2:10", "2:11", "2:12", "2:13", "2:14", "2:15", "2:16", "2:17", "2:18", "2:19", "2:20", "2:21", "2:22", "2:23", "2:24", "2:25", "2:26", "2:27", "2:28", "2:29", "2:30", "2:31", "2:32", "2:33", "2:34", "2:35", "2:36", "2:37", "2:38", "2:39", "2:40", "2:41", "2:42", "2:43", "2:44", "2:45", "2:46", "2:47", "2:48", "2:49", "2:50", "2:51", "2:52", "2:53", "2:54", "2:55", "2:56", "2:57", "2:58", "2:59", "3:00", "3:01", "3:02", "3:03", "3:04", "3:05", "3:06", "3:07", "3:08", "3:09", "3:10", "3:11", "3:12", "3:13", "3:14", "3:15", "3:16", "3:17", "3:18", "3:19", "3:20", "3:21", "3:22", "3:23", "3:24", "3:25", "3:26", "3:27", "3:28", "3:29", "3:30", "3:31", "3:32", "3:33", "3:34", "3:35", "3:36", "3:37", "3:38", "3:39", "3:40", "3:41", "3:42", "3:43", "3:44", "3:45", "3:46", "3:47", "3:48", "3:49", "3:50", "3:51", "3:52", "3:53", "3:54", "3:55", "3:56", "3:57", "3:58", "3:59", "4:00", "4:01", "4:02", "4:03", "4:04", "4:05", "4:06", "4:07", "4:08", "4:09", "4:10", "4:11", "4:12", "4:13", "4:14", "4:15", "4:16", "4:17", "4:18", "4:19", "4:20", "4:21", "4:22", "4:23", "4:24", "4:25", "4:26", "4:27", "4:28", "4:29", "4:30", "4:31", "4:32", "4:33", "4:34", "4:35", "4:36", "4:37", "4:38", "4:39", "4:40", "4:41", "4:42", "4:43", "4:44", "4:45", "4:46", "4:47", "4:48", "4:49", "4:50", "4:51", "4:52", "4:53", "4:54", "4:55", "4:56", "4:57", "4:58", "4:59", "5:00", "5:01", "5:02", "5:03", "5:04", "5:05", "5:06", "5:07", "5:08", "5:09", "5:10", "5:11", "5:12", "5:13", "5:14", "5:15", "5:16", "5:17", "5:18", "5:19", "5:20", "5:21", "5:22", "5:23", "5:24", "5:25", "5:26", "5:27", "5:28", "5:29", "5:30", "5:31", "5:32", "5:33", "5:34", "5:35", "5:36", "5:37", "5:38", "5:39", "5:40", "5:41", "5:42", "5:43", "5:44", "5:45", "5:46", "5:47", "5:48", "5:49", "5:50", "5:51", "5:52", "5:53", "5:54", "5:55", "5:56", "5:57", "5:58", "5:59", "6:00", "6:01", "6:02", "6:03", "6:04", "6:05", "6:06", "6:07", "6:08", "6:09", "6:10", "6:11", "6:12", "6:13", "6:14", "6:15", "6:16", "6:17", "6:18", "6:19", "6:20", "6:21", "6:22", "6:23", "6:24", "6:25", "6:26", "6:27", "6:28", "6:29", "6:30", "6:31", "6:32", "6:33", "6:34", "6:35", "6:36", "6:37", "6:38", "6:39", "6:40", "6:41", "6:42", "6:43", "6:44", "6:45", "6:46", "6:47", "6:48", "6:49", "6:50", "6:51", "6:52", "6:53", "6:54", "6:55", "6:56", "6:57", "6:58", "6:59", "7:00", "7:01", "7:02", "7:03", "7:04", "7:05", "7:06", "7:07", "7:08", "7:09", "7:10", "7:11", "7:12", "7:13", "7:14", "7:15", "7:16", "7:17", "7:18", "7:19", "7:20", "7:21", "7:22", "7:23", "7:24", "7:25", "7:26", "7:27", "7:28", "7:29", "7:30", "7:31", "7:32", "7:33", "7:34", "7:35", "7:36", "7:37", "7:38", "7:39", "7:40", "7:41", "7:42", "7:43", "7:44", "7:45", "7:46", "7:47", "7:48", "7:49", "7:50", "7:51", "7:52", "7:53", "7:54", "7:55", "7:56", "7:57", "7:58", "7:59", "8:00", "8:01", "8:02", "8:03", "8:04", "8:05", "8:06", "8:07", "8:08", "8:09", "8:10", "8:11", "8:12", "8:13", "8:14", "8:15", "8:16", "8:17", "8:18", "8:19", "8:20", "8:21", "8:22", "8:23", "8:24", "8:25", "8:26", "8:27", "8:28", "8:29", "8:30", "8:31", "8:32", "8:33", "8:34", "8:35", "8:36", "8:37", "8:38", "8:39", "8:40", "8:41", "8:42", "8:43", "8:44", "8:45", "8:46", "8:47", "8:48", "8:49", "8:50", "8:51", "8:52", "8:53", "8:54", "8:55", "8:56", "8:57", "8:58", "8:59", "9:00", "9:01", "9:02", "9:03", "9:04", "9:05", "9:06", "9:07", "9:08", "9:09", "9:10", "9:11", "9:12", "9:13", "9:14", "9:15", "9:16", "9:17", "9:18", "9:19", "9:20", "9:21", "9:22", "9:23", "9:24", "9:25", "9:26", "9:27", "9:28", "9:29", "9:30", "9:31", "9:32", "9:33", "9:34", "9:35", "9:36", "9:37", "9:38", "9:39", "9:40", "9:41", "9:42", "9:43", "9:44", "9:45", "9:46", "9:47", "9:48", "9:49", "9:50", "9:51", "9:52", "9:53", "9:54", "9:55", "9:56", "9:57", "9:58", "9:59", "10:00", "10:01", "10:02", "10:03", "10:04", "10:05", "10:06", "10:07", "10:08", "10:09", "10:10", "10:11", "10:12", "10:13", "10:14", "10:15", "10:16", "10:17", "10:18", "10:19", "10:20", "10:21", "10:22", "10:23", "10:24", "10:25", "10:26", "10:27", "10:28", "10:29", "10:30", "10:31", "10:32", "10:33", "10:34", "10:35", "10:36", "10:37", "10:38", "10:39", "10:40", "10:41", "10:42", "10:43", "10:44", "10:45", "10:46", "10:47", "10:48", "10:49", "10:50", "10:51", "10:52", "10:53", "10:54", "10:55", "10:56", "10:57", "10:58", "10:59", "11:00", "11:01", "11:02", "11:03", "11:04", "11:05", "11:06", "11:07", "11:08", "11:09", "11:10", "11:11", "11:12", "11:13", "11:14", "11:15", "11:16", "11:17", "11:18", "11:19", "11:20", "11:21", "11:22", "11:23", "11:24", "11:25", "11:26", "11:27", "11:28", "11:29", "11:30", "11:31", "11:32", "11:33", "11:34", "11:35", "11:36", "11:37", "11:38", "11:39", "11:40", "11:41", "11:42", "11:43", "11:44", "11:45", "11:46", "11:47", "11:48", "11:49", "11:50", "11:51", "11:52", "11:53", "11:54", "11:55", "11:56", "11:57", "11:58", "11:59", "12:00", "12:01", "12:02", "12:03", "12:04", "12:05", "12:06", "12:07", "12:08", "12:09", "12:10", "12:11", "12:12", "12:13", "12:14", "12:15", "12:16", "12:17", "12:18", "12:19", "12:20", "12:21", "12:22", "12:23", "12:24", "12:25", "12:26", "12:27", "12:28", "12:29", "12:30", "12:31", "12:32", "12:33", "12:34", "12:35", "12:36", "12:37", "12:38", "12:39", "12:40", "12:41", "12:42", "12:43", "12:44", "12:45", "12:46", "12:47", "12:48", "12:49", "12:50", "12:51", "12:52", "12:53", "12:54", "12:55", "12:56", "12:57", "12:58", "12:59", "13:00", "13:01", "13:02", "13:03", "13:04", "13:05", "13:06", "13:07", "13:08", "13:09", "13:10", "13:11", "13:12", "13:13", "13:14", "13:15", "13:16", "13:17", "13:18", "13:19", "13:20", "13:21", "13:22", "13:23", "13:24", "13:25", "13:26", "13:27", "13:28", "13:29", "13:30", "13:31", "13:32", "13:33", "13:34", "13:35", "13:36", "13:37", "13:38", "13:39", "13:40", "13:41", "13:42", "13:43", "13:44", "13:45", "13:46", "13:47", "13:48", "13:49", "13:50", "13:51", "13:52", "13:53", "13:54", "13:55", "13:56", "13:57", "13:58", "13:59", "14:00", "14:01", "14:02", "14:03", "14:04", "14:05", "14:06", "14:07", "14:08", "14:09", "14:10", "14:11", "14:12", "14:13", "14:14", "14:15", "14:16", "14:17", "14:18", "14:19", "14:20", "14:21", "14:22", "14:23", "14:24", "14:25", "14:26", "14:27", "14:28", "14:29", "14:30", "14:31", "14:32", "14:33", "14:34", "14:35", "14:36", "14:37", "14:38", "14:39", "14:40", "14:41", "14:42", "14:43", "14:44", "14:45", "14:46", "14:47", "14:48", "14:49", "14:50", "14:51", "14:52", "14:53", "14:54", "14:55", "14:56", "14:57", "14:58", "14:59", "15:00", "15:01", "15:02", "15:03", "15:04", "15:05", "15:06", "15:07", "15:08", "15:09", "15:10", "15:11", "15:12", "15:13", "15:14", "15:15", "15:16", "15:17", "15:18", "15:19", "15:20", "15:21", "15:22", "15:23", "15:24", "15:25", "15:26", "15:27", "15:28", "15:29", "15:30", "15:31", "15:32", "15:33", "15:34", "15:35", "15:36", "15:37", "15:38", "15:39", "15:40", "15:41", "15:42", "15:43", "15:44", "15:45", "15:46", "15:47", "15:48", "15:49", "15:50", "15:51", "15:52", "15:53", "15:54", "15:55", "15:56", "15:57", "15:58", "15:59", "16:00", "16:01", "16:02", "16:03", "16:04", "16:05", "16:06", "16:07", "16:08", "16:09", "16:10", "16:11", "16:12", "16:13", "16:14", "16:15", "16:16", "16:17", "16:18", "16:19", "16:20", "16:21", "16:22", "16:23", "16:24", "16:25", "16:26", "16:27", "16:28", "16:29", "16:30", "16:31", "16:32", "16:33", "16:34", "16:35", "16:36", "16:37", "16:38", "16:39", "16:40", "16:41", "16:42", "16:43", "16:44", "16:45", "16:46", "16:47", "16:48", "16:49", "16:50", "16:51", "16:52", "16:53", "16:54", "16:55", "16:56", "16:57", "16:58", "16:59", "17:00", "17:01", "17:02", "17:03", "17:04", "17:05", "17:06", "17:07", "17:08", "17:09", "17:10", "17:11", "17:12", "17:13", "17:14", "17:15", "17:16", "17:17", "17:18", "17:19", "17:20", "17:21", "17:22", "17:23", "17:24", "17:25", "17:26", "17:27", "17:28", "17:29", "17:30", "17:31", "17:32", "17:33", "17:34", "17:35", "17:36", "17:37", "17:38", "17:39", "17:40", "17:41", "17:42", "17:43", "17:44", "17:45", "17:46", "17:47", "17:48", "17:49", "17:50", "17:51", "17:52", "17:53", "17:54", "17:55", "17:56", "17:57", "17:58", "17:59", "18:00", "18:01", "18:02", "18:03", "18:04", "18:05", "18:06", "18:07", "18:08", "18:09", "18:10", "18:11", "18:12", "18:13", "18:14", "18:15", "18:16", "18:17", "18:18", "18:19", "18:20", "18:21", "18:22", "18:23", "18:24", "18:25", "18:26", "18:27", "18:28", "18:29", "18:30", "18:31", "18:32", "18:33", "18:34", "18:35", "18:36", "18:37", "18:38", "18:39", "18:40", "18:41", "18:42", "18:43", "18:44", "18:45", "18:46", "18:47", "18:48", "18:49", "18:50", "18:51", "18:52", "18:53", "18:54", "18:55", "18:56", "18:57", "18:58", "18:59", "19:00", "19:01", "19:02", "19:03", "19:04", "19:05", "19:06", "19:07", "19:08", "19:09", "19:10", "19:11", "19:12", "19:13", "19:14", "19:15", "19:16", "19:17", "19:18", "19:19", "19:20", "19:21", "19:22", "19:23", "19:24", "19:25", "19:26", "19:27", "19:28", "19:29", "19:30", "19:31", "19:32", "19:33", "19:34", "19:35", "19:36", "19:37", "19:38", "19:39", "19:40", "19:41", "19:42", "19:43", "19:44", "19:45", "19:46", "19:47", "19:48", "19:49", "19:50", "19:51", "19:52", "19:53", "19:54", "19:55", "19:56", "19:57", "19:58", "19:59", "20:00", "20:01", "20:02", "20:03", "20:04", "20:05", "20:06", "20:07", "20:08", "20:09", "20:10", "20:11", "20:12", "20:13", "20:14", "20:15", "20:16", "20:17", "20:18", "20:19", "20:20", "20:21", "20:22", "20:23", "20:24", "20:25", "20:26", "20:27", "20:28", "20:29", "20:30", "20:31", "20:32", "20:33", "20:34", "20:35", "20:36", "20:37", "20:38", "20:39", "20:40", "20:41", "20:42", "20:43", "20:44", "20:45", "20:46", "20:47", "20:48", "20:49", "20:50", "20:51", "20:52", "20:53", "20:54", "20:55", "20:56", "20:57", "20:58", "20:59", "21:00", "21:01", "21:02", "21:03", "21:04", "21:05", "21:06", "21:07", "21:08", "21:09", "21:10", "21:11", "21:12", "21:13", "21:14", "21:15", "21:16", "21:17", "21:18", "21:19", "21:20", "21:21", "21:22", "21:23", "21:24", "21:25", "21:26", "21:27", "21:28", "21:29", "21:30", "21:31", "21:32", "21:33", "21:34", "21:35", "21:36", "21:37", "21:38", "21:39", "21:40", "21:41", "21:42", "21:43", "21:44", "21:45", "21:46", "21:47", "21:48", "21:49", "21:50", "21:51", "21:52", "21:53", "21:54", "21:55", "21:56", "21:57", "21:58", "21:59", "22:00", "22:01", "22:02", "22:03", "22:04", "22:05", "22:06", "22:07", "22:08", "22:09", "22:10", "22:11", "22:12", "22:13", "22:14", "22:15", "22:16", "22:17", "22:18", "22:19", "22:20", "22:21", "22:22", "22:23", "22:24", "22:25", "22:26", "22:27", "22:28", "22:29", "22:30", "22:31", "22:32", "22:33", "22:34", "22:35", "22:36", "22:37", "22:38", "22:39", "22:40", "22:41", "22:42", "22:43", "22:44", "22:45", "22:46", "22:47", "22:48", "22:49", "22:50", "22:51", "22:52", "22:53", "22:54", "22:55", "22:56", "22:57", "22:58", "22:59", "23:00", "23:01", "23:02", "23:03", "23:04", "23:05", "23:06", "23:07", "23:08", "23:09", "23:10", "23:11", "23:12", "23:13", "23:14", "23:15", "23:16", "23:17", "23:18", "23:19", "23:20", "23:21", "23:22", "23:23", "23:24", "23:25", "23:26", "23:27", "23:28", "23:29", "23:30", "23:31", "23:32", "23:33", "23:34", "23:35", "23:36", "23:37", "23:38", "23:39", "23:40", "23:41", "23:42", "23:43", "23:44", "23:45", "23:46", "23:47", "23:48", "23:49", "23:50", "23:51", "23:52", "23:53", "23:54", "23:55", "23:56", "23:57", "23:58", "23:59"}));
        jSpinner1.setToolTipText("");

        jLabel4.setText("Fecha");

        jLabel5.setText("Hora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
        event=Events.eventChoose;
        System.out.println(Events.eventChoose);
        alarm= new Alarm(jCheckBox1.isSelected()?jCheckBox1.getName():
                jCheckBox2.getName(),jDateChooser1.getDate());
        System.out.println(jDateChooser1.getDate());
        listAlarms=event.getAlarm();
        listAlarms.add(alarm);
        event.setAlarm(listAlarms);
        this.setVisible(false);
        
       
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       this.dispose(); // TODO add your handling code here:
    }                                        

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
            java.util.logging.Logger.getLogger(Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alarmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alarmas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration                   
}