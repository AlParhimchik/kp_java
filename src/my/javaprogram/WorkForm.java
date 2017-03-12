/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.javaprogram;

import java.awt.Desktop;
import javax.swing.ButtonGroup;
import java.util.Arrays;
import java.util.*;

import  java.io.*;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;
import  org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Row;



public class WorkForm extends javax.swing.JFrame {
    int [] R=new int[8];
    int [] Tsumi=new int [8];
    double gamma,Tgamma,Treq1, Treq2;
    int n =8;    


    public WorkForm() {
        initComponents();
        groupButton();
        
    }

    private void groupButton( ) {

ButtonGroup bg1 = new ButtonGroup( );

bg1.add(jRadioButton1);
bg1.add(jRadioButton2);
bg1.add(jRadioButton3);

}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box_for_n = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        box_for_y = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        box_for_Ty = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        box_for_Treq1 = new javax.swing.JTextField();
        box_for_Treq2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        box_for_R1 = new javax.swing.JTextField();
        box_for_R2 = new javax.swing.JTextField();
        box_for_R3 = new javax.swing.JTextField();
        box_for_R4 = new javax.swing.JTextField();
        box_for_R5 = new javax.swing.JTextField();
        box_for_R6 = new javax.swing.JTextField();
        box_for_R7 = new javax.swing.JTextField();
        box_for_R8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        box_for_T1 = new javax.swing.JTextField();
        box_for_T2 = new javax.swing.JTextField();
        box_for_T3 = new javax.swing.JTextField();
        box_for_T4 = new javax.swing.JTextField();
        box_for_T5 = new javax.swing.JTextField();
        box_for_T6 = new javax.swing.JTextField();
        box_for_T7 = new javax.swing.JTextField();
        box_for_T8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        input_box_for_m = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        input_box_for_E = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        box_for_Ti1 = new javax.swing.JTextField();
        box_for_Ti2 = new javax.swing.JTextField();
        box_for_Ti3 = new javax.swing.JTextField();
        box_for_Ti4 = new javax.swing.JTextField();
        box_for_Ti5 = new javax.swing.JTextField();
        box_for_Ti6 = new javax.swing.JTextField();
        box_for_Ti7 = new javax.swing.JTextField();
        box_for_Ti8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        box_for_T = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        box_for_Ts = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        box_M_after_ex = new javax.swing.JTextField();
        box_E_after_ex = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        box_for_Ts1_after_ex = new javax.swing.JTextField();
        box_for_Ts2_after_ex = new javax.swing.JTextField();
        box_for_Ts3_after_ex = new javax.swing.JTextField();
        box_for_Ts4_after_ex = new javax.swing.JTextField();
        box_for_Ts5_after_ex = new javax.swing.JTextField();
        box_for_Ts6_after_ex = new javax.swing.JTextField();
        box_for_Ts7_after_ex = new javax.swing.JTextField();
        box_for_Ts8_after_ex = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        box_for_T_after_ex = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        box_for_Tmin = new javax.swing.JTextField();
        box_for_Tmax = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        box_for_Tb = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        box_for_Ttop = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        box_for_gamma1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        box_for_gamma2 = new javax.swing.JTextField();
        btn_execute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Надежность информациооных систем");

        jLabel1.setText("Расчетно-экспериментальный метод оценки показателей надежности изделися по результатам кратковременных испытаний");

        jLabel2.setText("Количество блоков изделия (n)");

        box_for_n.setEditable(false);
        box_for_n.setEnabled(false);

        jLabel3.setText("Вероятность точечной оценки (Y)");

        box_for_y.setEditable(false);
        box_for_y.setEnabled(false);

        jLabel4.setText("Ty");

        box_for_Ty.setEditable(false);
        box_for_Ty.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Выбор задачи", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jRadioButton1.setText("Задание 1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Задание 2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Задание 3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jRadioButton2.getAccessibleContext().setAccessibleDescription("");

        jLabel5.setText("Требуемое значение показателя надежности (Ттреб)");

        box_for_Treq1.setEditable(false);
        box_for_Treq1.setEnabled(false);

        box_for_Treq2.setEditable(false);
        box_for_Treq2.setEnabled(false);

        jLabel6.setText("Число зафиксированных отказов блоков (Ri)");

        box_for_R1.setEditable(false);
        box_for_R1.setEnabled(false);

        box_for_R2.setEditable(false);
        box_for_R2.setEnabled(false);

        box_for_R3.setEditable(false);
        box_for_R3.setEnabled(false);

        box_for_R4.setEditable(false);
        box_for_R4.setEnabled(false);

        box_for_R5.setEditable(false);
        box_for_R5.setEnabled(false);

        box_for_R6.setEditable(false);
        box_for_R6.setEnabled(false);

        box_for_R7.setEditable(false);
        box_for_R7.setEnabled(false);

        box_for_R8.setEditable(false);
        box_for_R8.setEnabled(false);

        jLabel7.setText("Наработка блоков за период испытания (Tsi) j=0");

        box_for_T1.setEditable(false);
        box_for_T1.setEnabled(false);

        box_for_T2.setEditable(false);
        box_for_T2.setEnabled(false);

        box_for_T3.setEditable(false);
        box_for_T3.setEnabled(false);

        box_for_T4.setEditable(false);
        box_for_T4.setEnabled(false);

        box_for_T5.setEditable(false);
        box_for_T5.setEnabled(false);

        box_for_T6.setEditable(false);
        box_for_T6.setEnabled(false);

        box_for_T7.setEditable(false);
        box_for_T7.setEnabled(false);

        box_for_T8.setEditable(false);
        box_for_T8.setEnabled(false);

        jLabel8.setText("Максимально допустимое число проведенных статистических экспериментов (m max)");

        input_box_for_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_box_for_mKeyPressed(evt);
            }
        });

        jLabel9.setText("Требуемая точность оценки (E задан)");

        input_box_for_E.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_box_for_EKeyPressed(evt);
            }
        });

        jLabel10.setText("Средняя наработка блоков на отказ (Ti)");

        box_for_Ti1.setEditable(false);
        box_for_Ti1.setEnabled(false);

        box_for_Ti2.setEditable(false);
        box_for_Ti2.setEnabled(false);

        box_for_Ti3.setEditable(false);
        box_for_Ti3.setEnabled(false);

        box_for_Ti4.setEditable(false);
        box_for_Ti4.setEnabled(false);

        box_for_Ti5.setEditable(false);
        box_for_Ti5.setEnabled(false);

        box_for_Ti6.setEditable(false);
        box_for_Ti6.setEnabled(false);

        box_for_Ti7.setEditable(false);
        box_for_Ti7.setEnabled(false);

        box_for_Ti8.setEditable(false);
        box_for_Ti8.setEnabled(false);

        jLabel11.setText("Cредняя наработка на отказ всего изделия (T) j=0");

        box_for_T.setEditable(false);
        box_for_T.setEnabled(false);

        jLabel12.setText("Общая наработка изделия (Ts)");

        jLabel13.setText("Число проведенных статистических экспериментов (m)");

        box_for_Ts.setEditable(false);
        box_for_Ts.setEnabled(false);

        jLabel14.setText("Точность оценки (E)");

        box_M_after_ex.setEditable(false);
        box_M_after_ex.setEnabled(false);

        box_E_after_ex.setEditable(false);
        box_E_after_ex.setEnabled(false);

        jLabel15.setText("Наработка блоков за период испытания (Tsi) j=m");

        box_for_Ts1_after_ex.setEditable(false);
        box_for_Ts1_after_ex.setEnabled(false);

        box_for_Ts2_after_ex.setEditable(false);
        box_for_Ts2_after_ex.setEnabled(false);
        box_for_Ts2_after_ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_for_Ts2_after_exActionPerformed(evt);
            }
        });

        box_for_Ts3_after_ex.setEditable(false);
        box_for_Ts3_after_ex.setEnabled(false);

        box_for_Ts4_after_ex.setEditable(false);
        box_for_Ts4_after_ex.setEnabled(false);

        box_for_Ts5_after_ex.setEditable(false);
        box_for_Ts5_after_ex.setEnabled(false);

        box_for_Ts6_after_ex.setEditable(false);
        box_for_Ts6_after_ex.setEnabled(false);

        box_for_Ts7_after_ex.setEditable(false);
        box_for_Ts7_after_ex.setEnabled(false);

        box_for_Ts8_after_ex.setEditable(false);
        box_for_Ts8_after_ex.setEnabled(false);

        jLabel16.setText("Средняя наработка на отказ всего изделия (T) j=m");

        box_for_T_after_ex.setEditable(false);
        box_for_T_after_ex.setEnabled(false);

        jLabel17.setText("Смоделированные значения наработки на отказ");

        jLabel18.setText("Tsmin");

        jLabel19.setText("Tsmax");

        box_for_Tmin.setEditable(false);
        box_for_Tmin.setEnabled(false);

        box_for_Tmax.setEditable(false);
        box_for_Tmax.setEnabled(false);

        jLabel20.setText("Границы доверительного интервала");

        jLabel21.setText("ТН");

        box_for_Tb.setEditable(false);
        box_for_Tb.setEnabled(false);

        jLabel22.setText("ТВ");

        box_for_Ttop.setEditable(false);
        box_for_Ttop.setEnabled(false);

        jLabel23.setText("Вероятность определения верхней и нижней границы интервальной оценки");

        jLabel24.setText("Y1");

        box_for_gamma1.setEditable(false);
        box_for_gamma1.setEnabled(false);

        jLabel25.setText("Y2");

        box_for_gamma2.setEditable(false);
        box_for_gamma2.setEnabled(false);

        btn_execute.setText("Вычислить");
        btn_execute.setEnabled(false);
        btn_execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_executeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Treq1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Treq2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_R1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_R2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_R3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_R4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_R5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_R6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_R7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_R8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_T1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_T2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_T3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_T4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_T5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_T6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_T7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_T8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_n, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_y, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Ty, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_for_T, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_M_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_E_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_for_Ts, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(32, 32, 32)
                                .addComponent(box_for_Tb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)
                                .addGap(5, 5, 5)
                                .addComponent(box_for_Ttop, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Tmin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Tmax, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_box_for_m, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_box_for_E, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Ti1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Ti2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Ti3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Ti4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Ti5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Ti6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Ti7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box_for_Ti8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(box_for_Ts1_after_ex, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(box_for_T_after_ex))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(box_for_gamma1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(box_for_gamma2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(box_for_Ts2_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_execute)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(box_for_Ts3_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(box_for_Ts4_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(box_for_Ts5_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(box_for_Ts6_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(box_for_Ts7_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(box_for_Ts8_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(110, 110, 110)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(box_for_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(box_for_Ty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_n))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(box_for_Treq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_Treq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(box_for_R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_R8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(box_for_T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(input_box_for_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(input_box_for_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(box_for_Ti1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_for_Ti2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_for_Ti3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_for_Ti4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_for_Ti5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_for_Ti6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_for_Ti7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_for_Ti8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(box_for_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(box_for_Ts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(box_M_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_E_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(box_for_Ts1_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(box_for_Ts2_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(box_for_Ts3_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(box_for_Ts4_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(box_for_Ts5_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(box_for_Ts6_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(box_for_Ts7_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(box_for_Ts8_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(box_for_T_after_ex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(box_for_gamma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25)
                                .addComponent(box_for_gamma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(box_for_Tmax, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for_Tmin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(box_for_Tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(box_for_Ttop, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_execute)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_for_Ts2_after_exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_for_Ts2_after_exActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_for_Ts2_after_exActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // Начальна инициализация при выборе варианта(аналогично для 3 вариантов)
        R[0] = 3;
        R[1] = 4;
        R[2] = 0;
        R[3] = 0;
        R[4] = 2;
        R[5] = 3;
        R[6] = 2;
        R[7] = 4;

        Tsumi[0] = 285;
        Tsumi[1] = 286;
        Tsumi[2] = 286;
        Tsumi[3] = 333;
        Tsumi[4] = 290;
        Tsumi[5] = 345;
        Tsumi[6] = 336;
        Tsumi[7] = 301;
        if (!input_box_for_E.getText().isEmpty() || !input_box_for_m.getText().isEmpty()) {   //провееряем , введены ли значения для m или E 
            btn_execute.setEnabled(true);                                                     //чтобы сделать кнопку Выполнить доступной
        }
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        R[0] = 3;
        R[1] = 4;
        R[2] = 0;
        R[3] = 0;
        R[4] = 2;
        R[5] = 3;
        R[6] = 2;
        R[7] = 4;

        Tsumi[0] = 285;
        Tsumi[1] = 286;
        Tsumi[2] = 286;
        Tsumi[3] = 333;
        Tsumi[4] = 290;
        Tsumi[5] = 345;
        Tsumi[6] = 336;
        Tsumi[7] = 301;

        if (!input_box_for_E.getText().isEmpty() || !input_box_for_m.getText().isEmpty()) {
            btn_execute.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        R[0] = 3;
        R[1] = 4;
        R[2] = 0;
        R[3] = 0;
        R[4] = 2;
        R[5] = 3;
        R[6] = 2;
        R[7] = 4;

        Tsumi[0] = 285;
        Tsumi[1] = 286;
        Tsumi[2] = 286;
        Tsumi[3] = 333;
        Tsumi[4] = 290;
        Tsumi[5] = 345;
        Tsumi[6] = 336;
        Tsumi[7] = 301;

        if (!input_box_for_E.getText().isEmpty() || !input_box_for_m.getText().isEmpty()) {
            btn_execute.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void input_box_for_EKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_box_for_EKeyPressed
        // действие  при введении данных в поля n и E
        if (jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected()) {  // проверяем или выбран вариант
        
             if (input_box_for_E.getText().toString()=="" || input_box_for_m.getText().toString()==""){  //проверяем не пусты ли  поля   m и E
                btn_execute.setEnabled(true) ;                                                           //и делаем кнопку доступной
             }
             else btn_execute.setEnabled(false);
        }
    }//GEN-LAST:event_input_box_for_EKeyPressed

    
    
    private void btn_executeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_executeActionPerformed
       
        //действия при нажатии кнопки Выполнить
        double Eps=0, F, Ez,T;   
       int i, j, s, m, m_max;
       j=0;  // номер эксперемента . фиксируем 0 
       double [] Tsum,Ti,Tlast_sumi;   // 
       Tsum=new double[8];
       Ti=new double[8];
       Tlast_sumi=new double[8];
       List<Double> Tsumj=new ArrayList<Double>();
       //Double []Tsumj=new Double[50001];
       if (!input_box_for_E.getText().isEmpty()){
           Ez=Double.parseDouble(input_box_for_E.getText());  // читаем из поля ввода значение для E
       }
       else {
           Ez=1;
       }
       if (Ez==0){
           Ez=1;
       }
       if (!input_box_for_m.getText().isEmpty()){
           m_max=Integer.parseInt(input_box_for_m.getText());  // читаем из поля ввода значение для m
       }
       else{
           m_max=50000;
       }
       T = 0;
       gamma = 0.9;
       Tgamma = 1.645;
       Treq1 = 150;
       Treq2 = 400;
       fill_initial_forms();    // вставляем в поля начальные значения
       for (i=0;i<n;i++){     // Вычисляем значения  для массива T(i)  по формуле (1)
           if (R[i]>0){
               Ti[i]= Tsumi[i] / R[i];
           }
           else{
              Ti[i] = Tsumi[i] * 1.44;       
           }
           T = T + 1 / Ti[i];     // формула (1)
       }
        T = 1 / T;  // формула (1)
        //Tsumj[0] = T;
        Tsumj.add(0, T);   // добавляем  значение   в массив Tsum(i) 
        fill_forms_after_first_interation(Ti, T);   // записываем значения T(i) и T в поля формы
        do{   // теперь выполняется условие из пункта (2) , начинаем цикл , пока не достигнем одного из показателей
             j += 1;   //пункт (14)
             for (i=0;i<n;i++){  // пункт (4)  
                 if (R[i]==0){
                     Tlast_sumi[i] = Ti[i];   // чтобы не создавать двойной массив T(i,j)  создаём одномерный массив T(i) для текущего j
                 }
                 else{
                     s = 1;    // пункт 5
                     F = 0;
                     do {
                         F += Math.log((Math.random())); //пункт 6 
                         s = s + 1;
                     }while (s<R[i]);  //пункт 7
                     Tlast_sumi[i] = (-1) * Ti[i] / F;  // пункт 8 
                 }
                     
             }
             Tsumj.add(0.); // доваляем новый элемент в массив для j
             for (i=0;i<n;i++){
                  Double b=1/Tlast_sumi[i]+Tsumj.get(j);  // формула(3) пункт (10) 
                     Tsumj.set(j, b);                     // присваиваем созданному элементу значение 
             }
             Tsumj.set(j, 1 / Tsumj.get(j));    // переводим в -1 степень  в формуле (3)
             if (j%100==0){                       //пункт (12)
                 Double Temp1, Temp2;
                  Temp1 = Temp2 = 0.;
                  for (i=1;i<=j;i++){
                      Temp1 = Tsumj.get(i)+Temp1;   //  из  формулы (4)  вычисляем первую сумму
                      Temp2 += Tsumj.get(j) * Tsumj.get(i);    // из (4) вычисляем сумму квадратов 
                  }
                  Eps = Tgamma * Math.sqrt((Math.pow(Temp1, -2) * Temp2 - 1 / j) * (j / (j - 1)));   // формула (4)
             }
        } while (Eps <= Ez && j < m_max);     // условие выхода из цикла   пункт 13
        m = j;   //пункт  14
        T = 0;
        for (s=0;s<n;s++){
            T += 1 / Tlast_sumi[s];   // формула (1)  для последнего j 
        }
        T = 1 / T;   // формула (1)
        fill_forms_after_last_iteration(Tlast_sumi, T);   // заполняем поля в форме для последнего  T(i) и T
        Collections.sort(Tsumj);   // пункт 16 , сортируем массив 
 //       Arrays.sort(Tsumj, 0, m);
        double  gamma1, gamma2;    // вероятности определения верхней(gamma2) и нижней(gamma1) границы  интервальной оценки 
        Double Tb,Tt;
        gamma1 = (1 - gamma) / 2;  //формула 5  пункт  17
        gamma2 = (1 + gamma) / 2;   //формула 5  пункт  17
        int bottom = ((Double)(m * gamma1)).intValue();   //верхняя и нижняя  границы доверительного интервала  пункт 18  
        int top = ((Double)(m * gamma2)).intValue();
        Tb = Tsumj.get(bottom);              // значения  верхней и нижней границ интервала 
        Tt = Tsumj.get(top);                    
        box_for_gamma1.setText(String.valueOf(gamma1));    // заполняем поля соответсвующие значениям 
        box_for_gamma2.setText(String.valueOf(gamma2));    // заполняем поля соответсвующие значениям 
        box_for_Tmin.setText(String.valueOf(Tsumj.get(0)));        // заполняем поля соответсвующие значениям 
        Double max =Collections.max(Tsumj);    // находим максимальный элемент массива 
        box_for_Tmax.setText(String.valueOf(max));    // заполняем поля соответсвующие значениям 
        box_for_Tb.setText(String.valueOf(Tb));       // заполняем поля соответсвующие значениям 
        box_for_Ttop.setText (String.valueOf(Tt));      // заполняем поля соответсвующие значениям 
        box_M_after_ex.setText(String.valueOf(m));     // заполняем поля соответсвующие значениям 
        box_E_after_ex.setText (String.valueOf(Eps));    // заполняем поля соответсвующие значениям 
        Double stepT=(max - Tsumj.get(0)) / 20;         //   находим разницу между max i min элементами массива и делим на 20 чтобы   
                                                         // найти шаг прохода по  вариационному ряду ,чтобы получить равные значения интервалов
        double [] T_diagram=new double[20];             // границы интервалов из вариационного ряда 
        T_diagram[0] = Tsumj.get(0) + stepT;             //  граница первого интервала
        for (i=1;i<20;i++){
            T_diagram[i] = T_diagram[i - 1] + stepT;     // заполняем массив интервалами         
        }
         int [] count=new int[20];                      //   массив для записей  чисел  реализаций статистических испытаний, в которых было получено 
                                                        // время из  одного интервала
         j = 0;
         int j1=Tsumj.size()-1;                          // размер массива
         for (i=0;i<j1;i++){
           if (Tsumj.get(i)>T_diagram[j]){                // проверяем , не выходят ли значения за интервал            
               j+=1;
           }  
           count[j]+=1;
         }
         insert_to_Excel(T_diagram, count);    // передаём значения  двух столбцов   для последующей  передачи в Excel 
        
    }//GEN-LAST:event_btn_executeActionPerformed

    private void input_box_for_mKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_box_for_mKeyPressed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected()) {  // проверяем или выбран вариант
        
             if (!input_box_for_E.getText().isEmpty() || !input_box_for_m.getText().isEmpty()){  //проверяем не пусты ли  поля  У n и E
                btn_execute.setEnabled(true) ;
             }
             else btn_execute.setEnabled(false);
        }
        
    }//GEN-LAST:event_input_box_for_mKeyPressed

  
    private void fill_forms_after_last_iteration(double [] Tlast,double T){
        box_for_Ts1_after_ex.setText(String.valueOf(Tlast[0]));
        box_for_Ts2_after_ex.setText(String.valueOf(Tlast[1]));
        box_for_Ts3_after_ex.setText(String.valueOf(Tlast[2]));
        box_for_Ts4_after_ex.setText(String.valueOf(Tlast[3]));
        box_for_Ts5_after_ex.setText(String.valueOf(Tlast[4]));
        box_for_Ts6_after_ex.setText(String.valueOf(Tlast[5]));
        box_for_Ts7_after_ex.setText(String.valueOf(Tlast[6]));
        box_for_Ts8_after_ex.setText(String.valueOf(Tlast[7]));
        box_for_T_after_ex.setText(String.valueOf(T));
    }    
   
    private void fill_forms_after_first_interation(double[] Ti, double T){
        box_for_Ti1.setText(String.valueOf(Ti[0]));
        box_for_Ti2.setText(String.valueOf(Ti[1]));
        box_for_Ti3.setText(String.valueOf(Ti[2]));
        box_for_Ti4.setText(String.valueOf(Ti[3]));
        box_for_Ti5.setText(String.valueOf(Ti[4]));
        box_for_Ti6.setText(String.valueOf(Ti[5]));
        box_for_Ti7.setText(String.valueOf(Ti[6]));
        box_for_Ti8.setText(String.valueOf(Ti[7]));

        box_for_T.setText(String.valueOf(T));
        Double Ts=0.;
        for (int i=0;i<8;i++){
            Ts+=Ti[i];
        }
        box_for_Ts.setText(String.valueOf(Ts / 8)) ;
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
            java.util.logging.Logger.getLogger(WorkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField box_E_after_ex;
    private javax.swing.JTextField box_M_after_ex;
    private javax.swing.JTextField box_for_R1;
    private javax.swing.JTextField box_for_R2;
    private javax.swing.JTextField box_for_R3;
    private javax.swing.JTextField box_for_R4;
    private javax.swing.JTextField box_for_R5;
    private javax.swing.JTextField box_for_R6;
    private javax.swing.JTextField box_for_R7;
    private javax.swing.JTextField box_for_R8;
    private javax.swing.JTextField box_for_T;
    private javax.swing.JTextField box_for_T1;
    private javax.swing.JTextField box_for_T2;
    private javax.swing.JTextField box_for_T3;
    private javax.swing.JTextField box_for_T4;
    private javax.swing.JTextField box_for_T5;
    private javax.swing.JTextField box_for_T6;
    private javax.swing.JTextField box_for_T7;
    private javax.swing.JTextField box_for_T8;
    private javax.swing.JTextField box_for_T_after_ex;
    private javax.swing.JTextField box_for_Tb;
    private javax.swing.JTextField box_for_Ti1;
    private javax.swing.JTextField box_for_Ti2;
    private javax.swing.JTextField box_for_Ti3;
    private javax.swing.JTextField box_for_Ti4;
    private javax.swing.JTextField box_for_Ti5;
    private javax.swing.JTextField box_for_Ti6;
    private javax.swing.JTextField box_for_Ti7;
    private javax.swing.JTextField box_for_Ti8;
    private javax.swing.JTextField box_for_Tmax;
    private javax.swing.JTextField box_for_Tmin;
    private javax.swing.JTextField box_for_Treq1;
    private javax.swing.JTextField box_for_Treq2;
    private javax.swing.JTextField box_for_Ts;
    private javax.swing.JTextField box_for_Ts1_after_ex;
    private javax.swing.JTextField box_for_Ts2_after_ex;
    private javax.swing.JTextField box_for_Ts3_after_ex;
    private javax.swing.JTextField box_for_Ts4_after_ex;
    private javax.swing.JTextField box_for_Ts5_after_ex;
    private javax.swing.JTextField box_for_Ts6_after_ex;
    private javax.swing.JTextField box_for_Ts7_after_ex;
    private javax.swing.JTextField box_for_Ts8_after_ex;
    private javax.swing.JTextField box_for_Ttop;
    private javax.swing.JTextField box_for_Ty;
    private javax.swing.JTextField box_for_gamma1;
    private javax.swing.JTextField box_for_gamma2;
    private javax.swing.JTextField box_for_n;
    private javax.swing.JTextField box_for_y;
    private javax.swing.JButton btn_execute;
    private javax.swing.JTextField input_box_for_E;
    private javax.swing.JTextField input_box_for_m;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables

    private void fill_initial_forms() {
        box_for_n.setText("8");
        box_for_Treq1.setText(String.valueOf(Treq1));
        box_for_Treq2.setText(String.valueOf(Treq2));
        box_for_y.setText(String.valueOf(gamma));
        box_for_Ty.setText(String.valueOf(Tgamma));

        box_for_R1.setText(String.valueOf(R[0]));
        box_for_R2.setText(String.valueOf(R[1]));
        box_for_R3.setText(String.valueOf(R[2]));
        box_for_R4.setText(String.valueOf(R[3]));
        box_for_R5.setText(String.valueOf(R[4]));
        box_for_R6.setText(String.valueOf(R[5]));
        box_for_R7.setText(String.valueOf(R[6]));
        box_for_R8.setText(String.valueOf(R[7]));

        box_for_T1.setText(String.valueOf(Tsumi[0]));
        box_for_T2.setText(String.valueOf(Tsumi[1]));
        box_for_T3.setText(String.valueOf(Tsumi[2]));
        box_for_T4.setText(String.valueOf(Tsumi[3]));
        box_for_T5.setText(String.valueOf(Tsumi[4]));
        box_for_T6.setText(String.valueOf(Tsumi[5]));
        box_for_T7.setText(String.valueOf(Tsumi[6]));
        box_for_T8.setText(String.valueOf(Tsumi[7])); //To change body of generated methods, choose Tools | Templates.
    }

    private void insert_to_Excel(double mas1[],int mas2[])
    {
         // создание самого excel файла в памяти
        HSSFWorkbook workbook = new HSSFWorkbook();
        // создание листа с названием "Просто лист"
        HSSFSheet sheet = workbook.createSheet("Просто лист");
        int rowNum=0;
        Row row = sheet.createRow(rowNum);
        
        row.createCell(0).setCellValue("Mas1");
        row.createCell(1).setCellValue("Mas2");
        
        for (rowNum=1;rowNum<21;rowNum++){
            row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(mas1[rowNum-1]);
            row.createCell(1).setCellValue(mas2[rowNum-1]);            
        }  
        
        String path=  new File(".").getAbsolutePath()+"Answer.xls";
        
        if (!(new File(path).exists())) {
            new File(path).delete();
        }
        
         // записываем созданный в памяти Excel документ в файл
        try (FileOutputStream out = new FileOutputStream(new File(path))) {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Desktop desktop = Desktop.getDesktop();
        try {
        desktop.edit(new File(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
