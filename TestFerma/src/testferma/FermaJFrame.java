package testferma;

import java.math.*;
import javax.swing.*;
/**
 *
 * @author MozEvil
 */

public class FermaJFrame extends javax.swing.JFrame {
        public FermaJFrame() {  
     
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        list2 = new java.awt.List();
        list3 = new java.awt.List();
        list4 = new java.awt.List();
        jButton1 = new javax.swing.JButton();
        list1 = new java.awt.List();
        label1 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label2 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        jButton2 = new javax.swing.JButton();
        textField3 = new java.awt.TextField();
        label4 = new java.awt.Label();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();

        jFrame1.setTitle("Info");
        jFrame1.setMinimumSize(new java.awt.Dimension(500, 300));

        jTabbedPane1.addTab("2", list2);
        jTabbedPane1.addTab("10", list3);
        jTabbedPane1.addTab("A", list4);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Тест Ферма by [ MozEvil ] v2.2.1");

        jButton1.setText("GO");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        label1.setText("Кол-во проверок :");

        textField1.setText("50");

        label2.setText("Кол-во чисел :");

        textField2.setText("10");

        jButton2.setText("Info");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        textField3.setText("128");

        label4.setText("Кол-во бит :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(list1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    if (t1)
        new Aut1();
    }//GEN-LAST:event_jButton1MouseClicked
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       jFrame1.setVisible(true); 

    }//GEN-LAST:event_jButton2MouseClicked

class Aut1 extends Thread{

public Aut1() {
    super("Aut1");
    t1 = false;
    start();
}

@Override
public void run(){
    try {   
            list1.removeAll();
            list2.removeAll();
            list3.removeAll();
            list4.removeAll();
            nomer = 0;
            if (Integer.parseInt(textField3.getText()) < 3)
                textField3.setText("3");
            bit = Integer.parseInt(textField3.getText());

            min = (BigDecimal.valueOf(2).pow(bit-1)).add(BigDecimal.valueOf(1));    // min = (2^(bit-1))+1
            int t = Integer.parseInt(textField1.getText());
            int n = Integer.parseInt(textField2.getText());
            int count = 1;
            do {
                String out = test(getRand128(),t);
                if (out.length() != 0){
                    list1.add(bit +" #" + count + " :    " + out +
                          "        " + time + " попытка", count);
                    count++;
                    time = 0;
                }
            }
            while (count <= n);
            t1 = true;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
            t1 = true;
        }
   }
 }
   BigInteger getRand128(){ //получаем рандомное 128-битное НЕ ЧЕТНОЕ число
        String num128;                 
        BigInteger sum;       
        nomer++;
        time++;
        num128 = "1";   // записываем 1 в начало строки
        sum = BigInteger.valueOf(0);
        for( int i=1; i<(bit-1); i++){  // заполняем сроку нулями и единицами
            num128 = num128.substring(0,i) + (int)Math.round(Math.random());            
        }
        num128 = num128.substring(0) + "1"; // записываем 1 в конец строки 
        list2.add(nomer +")  "+ num128);        
        for(int i=0; i<bit; i++)    // переводим из 2 в 10
            sum = sum.add(BigInteger.valueOf(Integer.parseInt("" + 
                    num128.charAt(i))).multiply(BigInteger.valueOf(2).pow(bit-i-1)));// sum = sum + (0|1)*2^(127-i);     
        list3.add(nomer +")  "+ sum +"      ["+sum.bitLength()+"]");                
        return sum;              
    }
    
    BigInteger getRandA(BigDecimal n){
        n = n.subtract(BigDecimal.valueOf(4)); // n-4
        n = n.multiply(BigDecimal.valueOf(Math.random())); // n = n*[0,1)
        if (bit >= 3000) // для очень больших чисел беретса маленькое А
            n = BigDecimal.valueOf(bit).multiply(BigDecimal.valueOf(Math.random()));
        return n.add(BigDecimal.valueOf(2)).toBigInteger();
    }
    
    String test(BigInteger n, int t){
        for (int i=1; i<=t; i++){  
            BigInteger a = getRandA(min);
            if(a.modPow(n.subtract(BigInteger.valueOf(1)),n).equals(BigInteger.valueOf(1))){
                list4.add(nomer+")  true ("+i+")    ["+a.bitLength()+"]     "+a);
                continue;
            }
            else{
                list4.add(nomer+")  false ("+i+")    ["+a.bitLength()+"]     "+a);
                return "";           
            }
        }
        return "" + n;
    }    
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FermaJFrame().setVisible(true);
                
            }
        });         
    }
    boolean t1 = true;
    private int nomer, time, bit;
    private BigDecimal min;

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.List list1;
    private java.awt.List list2;
    private java.awt.List list3;
    private java.awt.List list4;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;

}
