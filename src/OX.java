// Bot lavel 2 *****

import javax.swing.JOptionPane;
public class OX extends javax.swing.JFrame {

    
    public OX() {
        initComponents();
    }
    //Start New code------------------------------------------------------//
    
    public static int r[][] = new int[3][3];  
    public static int c1[][] = new int[3][3];
    public static int c2[][] = new int[3][3];
    public static int c11[][] = new int[3][3];
    public static int c22[][] = new int[3][3];
   
    public static void reset()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                r[i][j] = 0;
            }
        }
    }    
    public static void print()
    {
        System.out.print("print\n");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 3; j++)
            {
                if( r[i][j] == 1 )
                {
                    System.out.print("O|");
                }
                else if(r[i][j] == 2)
                {
                    System.out.print("X|");
                }
                else
                {
                    System.out.print(" |");
                }
            }
            System.out.print("\n");
        }
        System.out.print("--------------------\n");
    }
    public static void printc1()
    {
        System.out.print("print1\n");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 3; j++)
            {
                if( c1[i][j] == 1 )
                {
                    System.out.print("O|");
                }
                else if(c1[i][j] == 2)
                {
                    System.out.print("X|");
                }
                else
                {
                    System.out.print(" |");
                }
            }
            System.out.print("\n");
        }
        System.out.print("-------------------- P1\n");
    }    
    public static void printc2()
    {
        System.out.print("print2\n");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 3; j++)
            {
                if( c2[i][j] == 1 )
                {
                    System.out.print("O|");
                }
                else if(c2[i][j] == 2)
                {
                    System.out.print("X|");
                }
                else
                {
                    System.out.print(" |");
                }
            }
            System.out.print("\n");
        }
        System.out.print("-------------------- P2\n");
    }
    
    
    public static void printc11()
    {
        System.out.print("print11\n");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 3; j++)
            {
                if( c11[i][j] == 1 )
                {
                    System.out.print("O|");
                }
                else if(c11[i][j] == 2)
                {
                    System.out.print("X|");
                }
                else
                {
                    System.out.print(" |");
                }
            }
            System.out.print("\n");
        }
        System.out.print("-------------------- P11\n");
    }       
    
    public static void printc22()
    {
        System.out.print("print22\n");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 3; j++)
            {
                if( c22[i][j] == 1 )
                {
                    System.out.print("O|");
                }
                else if(c22[i][j] == 2)
                {
                    System.out.print("X|");
                }
                else
                {
                    System.out.print(" |");
                }
            }
            System.out.print("\n");
        }
        System.out.print("-------------------- P22\n");
    }       
    
    
    
    public static int evauate()
    {
        System.out.print("evauate\n");
        if  (   r[0][0] == 1 && r[0][1] == 1 && r[0][2] == 1  ||
                r[1][0] == 1 && r[1][1] == 1 && r[1][2] == 1  ||
                r[2][0] == 1 && r[2][1] == 1 && r[2][2] == 1  ||
                r[0][0] == 1 && r[1][0] == 1 && r[2][0] == 1  ||
                r[0][1] == 1 && r[1][1] == 1 && r[2][1] == 1  ||
                r[0][2] == 1 && r[1][2] == 1 && r[2][2] == 1  ||  
                r[0][0] == 1 && r[1][1] == 1 && r[2][2] == 1  ||
                r[0][2] == 1 && r[1][1] == 1 && r[2][0] == 1        )
        {
            
            System.out.println("O WIN (BOT)");
            return 100;
        }
        else if  (  r[0][0] == 2 && r[0][1] == 2 && r[0][2] == 2  ||
                    r[1][0] == 2 && r[1][1] == 2 && r[1][2] == 2  ||
                    r[2][0] == 2 && r[2][1] == 2 && r[2][2] == 2  ||
                    r[0][0] == 2 && r[1][0] == 2 && r[2][0] == 2  ||
                    r[0][1] == 2 && r[1][1] == 2 && r[2][1] == 2  ||
                    r[0][2] == 2 && r[1][2] == 2 && r[2][2] == 2  ||  
                    r[0][0] == 2 && r[1][1] == 2 && r[2][2] == 2  ||
                    r[0][2] == 2 && r[1][1] == 2 && r[2][0] == 2        )
        {
            System.out.println("X WIN (PLAYER)");
            return -50;
        }
        else
        {
            return 0;
        }
    }
    public static int evauatec1()
    {
        System.out.print("evauate1\n");
        if  (   c1[0][0] == 1 && c1[0][1] == 1 && c1[0][2] == 1  ||
                c1[1][0] == 1 && c1[1][1] == 1 && c1[1][2] == 1  ||
                c1[2][0] == 1 && c1[2][1] == 1 && c1[2][2] == 1  ||
                c1[0][0] == 1 && c1[1][0] == 1 && c1[2][0] == 1  ||
                c1[0][1] == 1 && c1[1][1] == 1 && c1[2][1] == 1  ||
                c1[0][2] == 1 && c1[1][2] == 1 && c1[2][2] == 1  ||  
                c1[0][0] == 1 && c1[1][1] == 1 && c1[2][2] == 1  ||
                c1[0][2] == 1 && c1[1][1] == 1 && c1[2][0] == 1        )
        {
            return 100;
        }
        else if  (  c1[0][0] == 2 && c1[0][1] == 2 && c1[0][2] == 2  ||
                    c1[1][0] == 2 && c1[1][1] == 2 && c1[1][2] == 2  ||
                    c1[2][0] == 2 && c1[2][1] == 2 && c1[2][2] == 2  ||
                    c1[0][0] == 2 && c1[1][0] == 2 && c1[2][0] == 2  ||
                    c1[0][1] == 2 && c1[1][1] == 2 && c1[2][1] == 2  ||
                    c1[0][2] == 2 && c1[1][2] == 2 && c1[2][2] == 2  ||  
                    c1[0][0] == 2 && c1[1][1] == 2 && c1[2][2] == 2  ||
                    c1[0][2] == 2 && c1[1][1] == 2 && c1[2][0] == 2        )
        {
            return -50;
        }
        else
        {
            return 0;
        }
    }
    public static int evauatec2()
    {
        System.out.print("evauate2\n");
        if  (   c2[0][0] == 1 && c2[0][1] == 1 && c2[0][2] == 1  ||
                c2[1][0] == 1 && c2[1][1] == 1 && c2[1][2] == 1  ||
                c2[2][0] == 1 && c2[2][1] == 1 && c2[2][2] == 1  ||
                c2[0][0] == 1 && c2[1][0] == 1 && c2[2][0] == 1  ||
                c2[0][1] == 1 && c2[1][1] == 1 && c2[2][1] == 1  ||
                c2[0][2] == 1 && c2[1][2] == 1 && c2[2][2] == 1  ||  
                c2[0][0] == 1 && c2[1][1] == 1 && c2[2][2] == 1  ||
                c2[0][2] == 1 && c2[1][1] == 1 && c2[2][0] == 1        )
        {
            return 100;
        }
        else if  (  c2[0][0] == 2 && c2[0][1] == 2 && c2[0][2] == 2  ||
                    c2[1][0] == 2 && c2[1][1] == 2 && c2[1][2] == 2  ||
                    c2[2][0] == 2 && c2[2][1] == 2 && c2[2][2] == 2  ||
                    c2[0][0] == 2 && c2[1][0] == 2 && c2[2][0] == 2  ||
                    c2[0][1] == 2 && c2[1][1] == 2 && c2[2][1] == 2  ||
                    c2[0][2] == 2 && c2[1][2] == 2 && c2[2][2] == 2  ||  
                    c2[0][0] == 2 && c2[1][1] == 2 && c2[2][2] == 2  ||
                    c2[0][2] == 2 && c2[1][1] == 2 && c2[2][0] == 2        )
        {
            return -50;
        }
        else
        {
            return 0;
        }
    }
    
        public static int evauatec22()
    {
        System.out.print("evauate22\n");
        if  (   c22[0][0] == 1 && c22[0][1] == 1 && c22[0][2] == 1  ||
                c22[1][0] == 1 && c22[1][1] == 1 && c22[1][2] == 1  ||
                c22[2][0] == 1 && c22[2][1] == 1 && c22[2][2] == 1  ||
                c22[0][0] == 1 && c22[1][0] == 1 && c22[2][0] == 1  ||
                c22[0][1] == 1 && c22[1][1] == 1 && c22[2][1] == 1  ||
                c22[0][2] == 1 && c22[1][2] == 1 && c22[2][2] == 1  ||  
                c22[0][0] == 1 && c22[1][1] == 1 && c22[2][2] == 1  ||
                c22[0][2] == 1 && c22[1][1] == 1 && c22[2][0] == 1        )
        {
            return 1;
        }
        else if  (  c22[0][0] == 2 && c22[0][1] == 2 && c22[0][2] == 2  ||
                    c22[1][0] == 2 && c22[1][1] == 2 && c22[1][2] == 2  ||
                    c22[2][0] == 2 && c22[2][1] == 2 && c22[2][2] == 2  ||
                    c22[0][0] == 2 && c22[1][0] == 2 && c22[2][0] == 2  ||
                    c22[0][1] == 2 && c22[1][1] == 2 && c22[2][1] == 2  ||
                    c22[0][2] == 2 && c22[1][2] == 2 && c22[2][2] == 2  ||  
                    c22[0][0] == 2 && c22[1][1] == 2 && c22[2][2] == 2  ||
                    c22[0][2] == 2 && c22[1][1] == 2 && c22[2][0] == 2        )
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
        
    public static int evauatec11()
    {
        System.out.print("evauate11\n");
        if  (   c11[0][0] == 1 && c11[0][1] == 1 && c11[0][2] == 1  ||
                c11[1][0] == 1 && c11[1][1] == 1 && c11[1][2] == 1  ||
                c11[2][0] == 1 && c11[2][1] == 1 && c11[2][2] == 1  ||
                c11[0][0] == 1 && c11[1][0] == 1 && c11[2][0] == 1  ||
                c11[0][1] == 1 && c11[1][1] == 1 && c11[2][1] == 1  ||
                c11[0][2] == 1 && c11[1][2] == 1 && c11[2][2] == 1  ||  
                c11[0][0] == 1 && c11[1][1] == 1 && c11[2][2] == 1  ||
                c11[0][2] == 1 && c11[1][1] == 1 && c11[2][0] == 1        )
        {
            return 1;
        }
        else if  (  c2[0][0] == 2 && c2[0][1] == 2 && c2[0][2] == 2  ||
                    c2[1][0] == 2 && c2[1][1] == 2 && c2[1][2] == 2  ||
                    c2[2][0] == 2 && c2[2][1] == 2 && c2[2][2] == 2  ||
                    c2[0][0] == 2 && c2[1][0] == 2 && c2[2][0] == 2  ||
                    c2[0][1] == 2 && c2[1][1] == 2 && c2[2][1] == 2  ||
                    c2[0][2] == 2 && c2[1][2] == 2 && c2[2][2] == 2  ||  
                    c2[0][0] == 2 && c2[1][1] == 2 && c2[2][2] == 2  ||
                    c2[0][2] == 2 && c2[1][1] == 2 && c2[2][0] == 2        )
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }        
        
    
    public static void check( )
    {
        System.out.print("check\n");
       //--------------------------
       boolean pass_condition = true;
       for(int i=0 ; i < 3 ; i++)
       {
            for(int j=0 ; j < 3 ; j++)
            {
                if( r[i][j] == 0)
                {
                    pass_condition = false;
                    break;
                }
            }  
            if(!pass_condition){ break; }
       }
       if( pass_condition ){ return; }
       //--------------------------
       int max = -999;
       int select_i = -1;
       int select_j = -1;
       
       for(int i=0 ; i < 3 ; i++)   //--------------------------- turn O bot
       {
            for(int j=0 ; j < 3 ; j++)
            {
                //copy table
                for(int ii=0 ; ii < 3 ; ii++)
                {
                    for(int jj=0 ; jj < 3 ; jj++)
                    {
                        c1[ii][jj] = r[ii][jj];
                    }
                }          
                // insert turn O bot
                if( c1[i][j] == 0 )
                {
                    int sum = 0;
                    c1[i][j] = 1;
                    printc1();
                    sum = sum + evauatec1();
                                       
                   
                    for(int x=0 ; x < 3 ; x++) //----------------------- turn X player
                    {
                        for(int y=0 ; y < 3 ; y++)
                        {
                            //copy table
                            for(int ii=0 ; ii < 3 ; ii++)
                            {
                                for(int jj=0 ; jj < 3 ; jj++)
                                {
                                    c2[ii][jj] = c1[ii][jj];
                                }
                            }
                            // insert turn X bot
                            if( c2[x][y] == 0 )
                            {
                                c2[x][y] = 2;
                                printc2();
                                sum = sum + evauatec2();
                                
                                //NAW ADD BY NAMO---------------------------------------
                                
                                for(int io=0 ; io < 3 ; io++)   //--------------------------- turn O bot
                                {
                                     for(int jo=0 ; jo < 3 ; jo++)
                                     {
                                         //copy table
                                         for(int ii=0 ; ii < 3 ; ii++)
                                         {
                                             for(int jj=0 ; jj < 3 ; jj++)
                                             {
                                                 c11[ii][jj] = c2[ii][jj];
                                             }
                                         }          
                                         // insert turn O bot
                                         if( c11[io][jo] == 0 )
                                         {
                                             c11[io][jo] = 1;
                                             printc11();///********************************
                                             sum = sum + evauatec11();//*********************


                                             for(int xx=0 ; xx < 3 ; xx++) //----------------------- turn X player
                                             {
                                                 for(int yx=0 ; yx < 3 ; yx++)
                                                 {
                                                     //copy table
                                                     for(int ii=0 ; ii < 3 ; ii++)
                                                     {
                                                         for(int jj=0 ; jj < 3 ; jj++)
                                                         {
                                                             c22[ii][jj] = c11[ii][jj];
                                                         }
                                                     }
                                                     // insert turn X bot
                                                     if( c22[xx][yx] == 0 )
                                                     {
                                                         c22[xx][yx] = 2;
                                                         printc22();//**********************
                                                         sum = sum + evauatec22();//****************

                                                     }                            
                                                 }
                                             }
                                         }
                                     }
                                 }
                                
                                
                                //END ADD BY NAMO---------------------------------------
                            }                            
                        }
                    }
                   
                    System.out.println("SUM : "+sum);
                    if( sum > max )
                    {
                        max = sum;
                        select_i = i;
                        select_j = j;
                    }
                }
            }
        }
        r[select_i][select_j] = 1;//เลือก
    }
    
    //End New code------------------------------------------------------//
        //XO
    int xoTurn=0;
    int buttonused[]={0,0,0,0,0,0,0,0,0};
    int Xwin[]={0,0,0,0,0,0,0,0,0};
    int Owin[]={0,0,0,0,0,0,0,0,0};
    
    int Xwin(){   
        if(Xwin[0]==1&&Xwin[1]==1&&Xwin[2]==1){return 1;}
        if(Xwin[3]==1&&Xwin[4]==1&&Xwin[5]==1){return 1;}
        if(Xwin[6]==1&&Xwin[7]==1&&Xwin[8]==1){return 1;}
        if(Xwin[0]==1&&Xwin[3]==1&&Xwin[6]==1){return 1;}
        if(Xwin[1]==1&&Xwin[4]==1&&Xwin[7]==1){return 1;}
        if(Xwin[2]==1&&Xwin[5]==1&&Xwin[8]==1){return 1;}
        if(Xwin[2]==1&&Xwin[4]==1&&Xwin[6]==1){return 1;}
        if(Xwin[0]==1&&Xwin[4]==1&&Xwin[8]==1){return 1;}
        return 0;
    }
    
    int Owin(){   
        if(Owin[0]==1&&Owin[1]==1&&Owin[2]==1){return 1;}
        if(Owin[3]==1&&Owin[4]==1&&Owin[5]==1){return 1;}
        if(Owin[6]==1&&Owin[7]==1&&Owin[8]==1){return 1;}
        if(Owin[0]==1&&Owin[3]==1&&Owin[6]==1){return 1;}
        if(Owin[1]==1&&Owin[4]==1&&Owin[7]==1){return 1;}
        if(Owin[2]==1&&Owin[5]==1&&Owin[8]==1){return 1;}
        if(Owin[2]==1&&Owin[4]==1&&Owin[6]==1){return 1;}
        if(Owin[0]==1&&Owin[4]==1&&Owin[8]==1){return 1;}   
        return 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Game OX");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Play again");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(buttonused[0]==0){   
                jButton1.setText("X");
                r[0][0] = 2; // ไปตารางอาจาร
                evauate();check(); // ตรวจสอบ
                buttonused[0]=1;
                Xwin[0]=1;
                int result1=Xwin();
                if(result1==1){
                    JOptionPane.showMessageDialog(rootPane, " X WIN !!!");
                }
                else{
                    if(r[0][0] == 1){jButton1.setText("O"); Owin[0]=1;}
                    if(r[0][1] == 1){jButton2.setText("O"); Owin[1]=1;}
                    if(r[0][2] == 1){jButton3.setText("O"); Owin[2]=1;}
                    if(r[1][0] == 1){jButton4.setText("O"); Owin[3]=1;}
                    if(r[1][1] == 1){jButton5.setText("O"); Owin[4]=1;}
                    if(r[1][2] == 1){jButton6.setText("O"); Owin[5]=1;}
                    if(r[2][0] == 1){jButton7.setText("O"); Owin[6]=1;}
                    if(r[2][1] == 1){jButton8.setText("O"); Owin[7]=1;}
                    if(r[2][2] == 1){jButton9.setText("O"); Owin[8]=1;}

                    int result2=Owin();
                    if(result2==1){
                        JOptionPane.showMessageDialog(rootPane, " O WIN !!!");
                    }
                }
         }
        else{
                    JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED!!!");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(buttonused[1]==0){
                jButton2.setText("X");
                buttonused[1]=1;
                Xwin[1]=1;
                int result1=Xwin();
            
                if(result1==1){
                    JOptionPane.showMessageDialog(rootPane, " X WIN !!!");
                }
                else{
                    r[0][1] = 2; // ไปตารางอาจาร
                    evauate();check(); // ตรวจสอบ
                    if(r[0][0] == 1){jButton1.setText("O"); Owin[0]=1;}
                    if(r[0][1] == 1){jButton2.setText("O"); Owin[1]=1;}
                    if(r[0][2] == 1){jButton3.setText("O"); Owin[2]=1;}
                    if(r[1][0] == 1){jButton4.setText("O"); Owin[3]=1;}
                    if(r[1][1] == 1){jButton5.setText("O"); Owin[4]=1;}
                    if(r[1][2] == 1){jButton6.setText("O"); Owin[5]=1;}
                    if(r[2][0] == 1){jButton7.setText("O"); Owin[6]=1;}
                    if(r[2][1] == 1){jButton8.setText("O"); Owin[7]=1;}
                    if(r[2][2] == 1){jButton9.setText("O"); Owin[8]=1;}

                    int result2=Owin();
                    if(result2==1){
                        JOptionPane.showMessageDialog(rootPane, " O WIN !!!");
                    }
                }
         }
        else{
                    JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED!!!");
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(buttonused[2]==0){
                jButton3.setText("X");
                buttonused[2]=1;
                Xwin[2]=1;
            
                int result1=Xwin();
                if(result1==1){
                    JOptionPane.showMessageDialog(rootPane, " X WIN !!!");
                }
                else{
                    r[0][2] = 2; // ไปตารางอาจาร
                    evauate();check(); // ตรวจสอบ
                    if(r[0][0] == 1){jButton1.setText("O"); Owin[0]=1;}
                    if(r[0][1] == 1){jButton2.setText("O"); Owin[1]=1;}
                    if(r[0][2] == 1){jButton3.setText("O"); Owin[2]=1;}
                    if(r[1][0] == 1){jButton4.setText("O"); Owin[3]=1;}
                    if(r[1][1] == 1){jButton5.setText("O"); Owin[4]=1;}
                    if(r[1][2] == 1){jButton6.setText("O"); Owin[5]=1;}
                    if(r[2][0] == 1){jButton7.setText("O"); Owin[6]=1;}
                    if(r[2][1] == 1){jButton8.setText("O"); Owin[7]=1;}
                    if(r[2][2] == 1){jButton9.setText("O"); Owin[8]=1;}

                    int result2=Owin();
                    if(result2==1){
                        JOptionPane.showMessageDialog(rootPane, " O WIN !!!");
                    }
                }
        }
            
        else{
            JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED!!!");
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(buttonused[3]==0){
                jButton4.setText("X");
                buttonused[3]=1;
                Xwin[3]=1;
                int result1=Xwin();
                if(result1==1){
                    JOptionPane.showMessageDialog(rootPane, " X WIN !!!");
                }
                else{
                r[1][0] = 2; // ไปตารางอาจาร
                    evauate();check(); // ตรวจสอบ
                    if(r[0][0] == 1){jButton1.setText("O"); Owin[0]=1;}
                    if(r[0][1] == 1){jButton2.setText("O"); Owin[1]=1;}
                    if(r[0][2] == 1){jButton3.setText("O"); Owin[2]=1;}
                    if(r[1][0] == 1){jButton4.setText("O"); Owin[3]=1;}
                    if(r[1][1] == 1){jButton5.setText("O"); Owin[4]=1;}
                    if(r[1][2] == 1){jButton6.setText("O"); Owin[5]=1;}
                    if(r[2][0] == 1){jButton7.setText("O"); Owin[6]=1;}
                    if(r[2][1] == 1){jButton8.setText("O"); Owin[7]=1;}
                    if(r[2][2] == 1){jButton9.setText("O"); Owin[8]=1;}
                    int result2=Owin();

                    if(result2==1){
                        JOptionPane.showMessageDialog(rootPane, " O WIN !!!");
                    }
                }
        }
        else{
                    JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED!!!");
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(buttonused[4]==0){
                jButton5.setText("X");
                buttonused[4]=1;
                Xwin[4]=1;
                int result1=Xwin();
                if(result1==1){
                    JOptionPane.showMessageDialog(rootPane, " X WIN !!!");
                }
                else{
                    r[1][1] = 2; // ไปตารางอาจาร
                    evauate();check(); // ตรวจสอบ
                    if(r[0][0] == 1){jButton1.setText("O"); Owin[0]=1;}
                    if(r[0][1] == 1){jButton2.setText("O"); Owin[1]=1;}
                    if(r[0][2] == 1){jButton3.setText("O"); Owin[2]=1;}
                    if(r[1][0] == 1){jButton4.setText("O"); Owin[3]=1;}
                    if(r[1][1] == 1){jButton5.setText("O"); Owin[4]=1;}
                    if(r[1][2] == 1){jButton6.setText("O"); Owin[5]=1;}
                    if(r[2][0] == 1){jButton7.setText("O"); Owin[6]=1;}
                    if(r[2][1] == 1){jButton8.setText("O"); Owin[7]=1;}
                    if(r[2][2] == 1){jButton9.setText("O"); Owin[8]=1;}

                    int result2=Owin();

                    if(result2==1){
                        JOptionPane.showMessageDialog(rootPane, " O WIN !!!");
                    }
                }

         }
        else{
                    JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED!!!");
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(buttonused[5]==0){
                jButton6.setText("X");
                buttonused[5]=1;
                Xwin[5]=1;
                int result1=Xwin();
                if(result1==1){
                    JOptionPane.showMessageDialog(rootPane, " X WIN !!!");
                }
                else{
                    r[1][2] = 2; // ไปตารางอาจาร
                    evauate();check(); // ตรวจสอบ
                    if(r[0][0] == 1){jButton1.setText("O"); Owin[0]=1;}
                    if(r[0][1] == 1){jButton2.setText("O"); Owin[1]=1;}
                    if(r[0][2] == 1){jButton3.setText("O"); Owin[2]=1;}
                    if(r[1][0] == 1){jButton4.setText("O"); Owin[3]=1;}
                    if(r[1][1] == 1){jButton5.setText("O"); Owin[4]=1;}
                    if(r[1][2] == 1){jButton6.setText("O"); Owin[5]=1;}
                    if(r[2][0] == 1){jButton7.setText("O"); Owin[6]=1;}
                    if(r[2][1] == 1){jButton8.setText("O"); Owin[7]=1;}
                    if(r[2][2] == 1){jButton9.setText("O"); Owin[8]=1;}
                    int result2=Owin();
                    if(result2==1){
                        JOptionPane.showMessageDialog(rootPane, " O WIN !!!");
                    }
                }
         }
        else{
                    JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED!!!");
            }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(buttonused[6]==0){
                jButton7.setText("X");
                buttonused[6]=1;
                Xwin[6]=1;
                int result1=Xwin();
                if(result1==1){
                    JOptionPane.showMessageDialog(rootPane, " X WIN !!!");
                }
                else{
                    r[2][0] = 2; // ไปตารางอาจาร
                    evauate();check(); // ตรวจสอบ
                    if(r[0][0] == 1){jButton1.setText("O"); Owin[0]=1;}
                    if(r[0][1] == 1){jButton2.setText("O"); Owin[1]=1;}
                    if(r[0][2] == 1){jButton3.setText("O"); Owin[2]=1;}
                    if(r[1][0] == 1){jButton4.setText("O"); Owin[3]=1;}
                    if(r[1][1] == 1){jButton5.setText("O"); Owin[4]=1;}
                    if(r[1][2] == 1){jButton6.setText("O"); Owin[5]=1;}
                    if(r[2][0] == 1){jButton7.setText("O"); Owin[6]=1;}
                    if(r[2][1] == 1){jButton8.setText("O"); Owin[7]=1;}
                    if(r[2][2] == 1){jButton9.setText("O"); Owin[8]=1;}

                    int result2=Owin();
                    if(result2==1){
                        JOptionPane.showMessageDialog(rootPane, " O WIN !!!");
                    }
                }
         }
        else{
                    JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED!!!");
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(buttonused[7]==0){
                jButton8.setText("X");
                buttonused[7]=1;
                Xwin[7]=1;
                int result1=Xwin();
                if(result1==1){
                    JOptionPane.showMessageDialog(rootPane, " X WIN !!!");
                }
                else{
                    r[2][1] = 2; // ไปตารางอาจาร
                    evauate();check(); // ตรวจสอบ
                    if(r[0][0] == 1){jButton1.setText("O"); Owin[0]=1;}
                    if(r[0][1] == 1){jButton2.setText("O"); Owin[1]=1;}
                    if(r[0][2] == 1){jButton3.setText("O"); Owin[2]=1;}
                    if(r[1][0] == 1){jButton4.setText("O"); Owin[3]=1;}
                    if(r[1][1] == 1){jButton5.setText("O"); Owin[4]=1;}
                    if(r[1][2] == 1){jButton6.setText("O"); Owin[5]=1;}
                    if(r[2][0] == 1){jButton7.setText("O"); Owin[6]=1;}
                    if(r[2][1] == 1){jButton8.setText("O"); Owin[7]=1;}
                    if(r[2][2] == 1){jButton9.setText("O"); Owin[8]=1;}
                    int result2=Owin();
                    if(result2==1){
                        JOptionPane.showMessageDialog(rootPane, " O WIN !!!");
                    }
                }
         }
        else{
                    JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED!!!");
            }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(buttonused[8]==0){
                jButton9.setText("X");
                buttonused[8]=1;
                Xwin[8]=1;
                int result1=Xwin();
                if(result1==1){
                    JOptionPane.showMessageDialog(rootPane, " X WIN !!!");
                }
                else{
                    r[2][2] = 2; // ไปตารางอาจาร
                    evauate();check(); // ตรวจสอบ
                   if(r[0][0] == 1){jButton1.setText("O"); Owin[0]=1;}
                    if(r[0][1] == 1){jButton2.setText("O"); Owin[1]=1;}
                    if(r[0][2] == 1){jButton3.setText("O"); Owin[2]=1;}
                    if(r[1][0] == 1){jButton4.setText("O"); Owin[3]=1;}
                    if(r[1][1] == 1){jButton5.setText("O"); Owin[4]=1;}
                    if(r[1][2] == 1){jButton6.setText("O"); Owin[5]=1;}
                    if(r[2][0] == 1){jButton7.setText("O"); Owin[6]=1;}
                    if(r[2][1] == 1){jButton8.setText("O"); Owin[7]=1;}
                    if(r[2][2] == 1){jButton9.setText("O"); Owin[8]=1;}
                    int result2=Owin();
                    if(result2==1){
                        JOptionPane.showMessageDialog(rootPane, " O WIN !!!");
                    }
                }
         }
        else{
                    JOptionPane.showMessageDialog(rootPane, "THIS BUTTON IS USED!!!");
            }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                r[i][j] = 0;
            }
        }
        
        xoTurn=2;
        for(int i=0;i<9;i++){buttonused[i]=0;}
        for(int i=0;i<9;i++){Xwin[i]=0;}
        for(int i=0;i<9;i++){Owin[i]=0;}
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(OX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}


