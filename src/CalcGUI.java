/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author noor
 */
public class CalcGUI extends javax.swing.JFrame {
    
	
    private Calc c;
    public CalcGUI() {
        initComponents();
        c = new Calc();
    }
                         
    private void initComponents() {

        keypad = new javax.swing.JPanel();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        bminus = new javax.swing.JButton();
        bmult = new javax.swing.JButton();
        beq = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        screen = new javax.swing.JTextField();
        
        //setLayout(new FlowLayout());
        //list = new JList();
        //list.setVisibleRowCount(5);;
        //list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //add(new JScrollPane(list));
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        b7.setText("7");
        
        keypad.add(b7);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        
        b8.setText("8");
           
        keypad.add(b8);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        
        b9.setText("9");
        
        keypad.add(b9);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });

        bc.setText("C");

        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonC(evt);
            }
        });

        
        b4.setText("4");
        
        keypad.add(b4);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        
        b5.setText("5");
        
        keypad.add(b5);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        
        b6.setText("6");
         
        keypad.add(b6);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        
        b1.setText("1");
        
        keypad.add(b1);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        
        
        b2.setText("2");
        
        keypad.add(b2);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        b3.setText("3");
        
        keypad.add(b3);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });

        b0.setText("0");
        
        keypad.add(b0);
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });

        bdot.setText(".");
        
        keypad.add(bdot);
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        
        bplus.setText("+");
        
        keypad.add(bplus);
        bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        
        bminus.setText("-");
        
        keypad.add(bminus);
        bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        
        bmult.setText("*");
        
        keypad.add(bmult);
        bmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });
        
        beq.setText("=");
        
        beq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beqActionPerformed(evt);
            }
        });

        bdiv.setText("/");
        
        keypad.add(bdiv);
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadActions(evt);
            }
        });

        javax.swing.GroupLayout keypadLayout = new javax.swing.GroupLayout(keypad);
        keypad.setLayout(keypadLayout);
        keypadLayout.setHorizontalGroup(
            keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keypadLayout.createSequentialGroup()
                .addGroup(keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bdot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bdiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bmult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        keypadLayout.setVerticalGroup(
            keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keypadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7)
                    .addComponent(b8)
                    .addComponent(b9)
                    .addComponent(bc))
                .addGap(18, 18, 18)
                .addGroup(keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4)
                    .addComponent(b5)
                    .addComponent(b6)
                    .addComponent(bplus))
                .addGap(18, 18, 18)
                .addGroup(keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(bminus))
                .addGap(18, 18, 18)
                .addGroup(keypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b0)
                    .addComponent(bdot)
                    .addComponent(bmult)
                    .addComponent(beq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bdiv))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(keypad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(screen))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(keypad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }                        
       int count = 0;
       private void keypadActions(java.awt.event.ActionEvent evt) {                                             
       String s = screen.getText() + evt.getActionCommand();
       char x = s.charAt(0);  
       int len;
       int numb;
       
       //System.out.println(len);
       //System.out.println(x);
	   if(x == '+' || x == '-' || x == '*' || x == '/') 
	   {
		   
		  screen.setText(""); 
		 // System.out.println(len);
	   }
	   else if(evt.getActionCommand()=="+"||evt.getActionCommand()=="-"||evt.getActionCommand()=="*"||evt.getActionCommand() == "/")
       {
		   len = s.length();
	       numb = len - 1; 
	     //  System.out.println(len);
    	   String st;
    	   count++;
    	//   System.out.println(count);
    	   if(count >= 2)
    	   {		   
    	      StringBuilder back = new StringBuilder(s);
    	      back.deleteCharAt(numb);
              st = back.toString();
              screen.setText(st);
             
    	   }
    	   
    	   else
    	   {
    		   screen.setText(s);   
    	   }
    	   
    		  
    		   
       }
	   else  if(s.contains("/0"))
   	   {
		   
   		JOptionPane.showMessageDialog(null, "Can't divide by 0");
   		screen.setText("");
   		count = 0;
   		
   	   }
	   else
		   screen.setText(s);
	   
    }
    int i = 0;
    private void beqActionPerformed(java.awt.event.ActionEvent evt) {                                    
    	
    	String s = screen.getText();
        screen.setText(String.valueOf(c.solver(s)));
         
        	c.history[i] = s;
        	System.out.println(c.history[i]);
        	i++;
        	if(i == 4)
        	{
        		i = 0;
        	}
        
        
        count = 0;
        //System.out.println(count);
        
    }           
    
    //int j = i;
                                       
    private void buttonC(java.awt.event.ActionEvent evt) {                                    
    	
    	screen.setText("");
        /*
    	screen.setText(c.history[j]);
        j--;
        if(j == 0)
        {
        	j = i;
        }
        */
        count = 0;
    }  
   /* public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcGUI().setVisible(true);
            }
        });
    }
*/
                         
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bc;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bdot;
    private javax.swing.JButton beq;
    private javax.swing.JButton bminus;
    private javax.swing.JButton bmult;
    private javax.swing.JButton bplus;
    private javax.swing.JButton next;
    private javax.swing.JPanel keypad;
    public javax.swing.JTextField screen;
    //private javax.swing.JList list;                   
}
