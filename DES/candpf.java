
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akram
 */
public class candpf extends JFrame {
    public candpf() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plainf = new javax.swing.JTextField();
        cipherf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        keyf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Encryption = new javax.swing.JButton();
        decryption = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plainf.setName("plainf"); // NOI18N

        cipherf.setName("cipherf"); // NOI18N
        cipherf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cipherfActionPerformed(evt);
            }
        });

        jLabel1.setText("  plain text");

        jLabel2.setText(" cipher text");

        keyf.setName("keyf"); // NOI18N

        jLabel3.setText(" key");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ceaser", "playfair", "DES" }));

        Encryption.setLabel("Encryption");
        Encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptionActionPerformed(evt);
            }
        });

        decryption.setText("decryption");
        decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptionActionPerformed(evt);
            }
        });

        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cipherf, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(plainf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(clear)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(keyf, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Encryption)
                .addGap(39, 39, 39)
                .addComponent(decryption)
                .addGap(0, 172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plainf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cipherf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encryption)
                    .addComponent(decryption)
                    .addComponent(clear))
                .addGap(36, 36, 36))
        );

        plainf.getAccessibleContext().setAccessibleName("plainf");
        cipherf.getAccessibleContext().setAccessibleName("cipherf");
        keyf.getAccessibleContext().setAccessibleName("keyf");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cipherfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cipherfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cipherfActionPerformed
  //error window
  static  void  wind (String message){
       error_message err = new error_message("Error");
        JLabel lab4 = new JLabel("  "+message);
    //JButton btn = new JButton(btn_name);
           
  
        BorderLayout x = new BorderLayout(10, 10);
        err.add(lab4,BorderLayout.CENTER);
         
      //err.add(btn, BorderLayout.SOUTH);
       
      err.setSize(350, 100);
      err.setVisible(true); 
     
    }
  
   public boolean ischar(String messString) {

        char[] mess_chr = messString.toCharArray();
        for (int i = 0; i < mess_chr.length; i++) {
            if (!(mess_chr[i] >= 97 && mess_chr[i] <= 123)) {
                return false;
            }
        }
        for (char c : mess_chr) {
            System.out.println(c);
        }
       return true; 
    }
  
   public boolean isint(String messString){
        char[] mess_chr = messString.toCharArray();
        for (int i = 0; i < mess_chr.length; i++) {
            if (!(mess_chr[i] >= 48 && mess_chr[i] <= 57)) {
                return false;
            }
        }
        return true;
   }
   
   
    private void EncryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptionActionPerformed
        // TODO add your handling code here:
        int key ;
        String result="";
      String plain = plainf.getText();
       String keys = keyf.getText();
        if ( keys.isEmpty())
         {
             wind("please ensure you enter the input txt");
             return;}
       if ( plain.isEmpty())
         {
             wind("please ensure you enter the input txt");
             return;}
      if(jComboBox1.getSelectedItem()=="ceaser"){
         
        
             if(!isint(keys))
             {
                 wind("please ensure you enter a integer");
                 return;}
             
          key = Integer.parseInt(keys);
          result = ceaser_en(plain, key);
           cipherf.setText(result);
    
      }
        else if(jComboBox1.getSelectedItem()=="playfair"){
         if(!ischar(keys))
             {
                 wind("please ensure you enter a string");
                 return;}
             
          
          plain =format(plain);
            String pairs[] = div2pairs(plain);
            char[][] matr= adjust(keys);
           result = enc_play(pairs, matr);
           cipherf.setText(result);}
       else if(jComboBox1.getSelectedItem()=="DES"){
          if(keys.length()<8)
             {
                 wind("please, key must be 8 char");
                 return;}
             
          
         result=DES.encryption(plain, keys);
           cipherf.setText(result);}
    }//GEN-LAST:event_EncryptionActionPerformed

    private void decryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptionActionPerformed
        // TODO add your handling code here:
        int key ;
        String result="";
      String plain = cipherf.getText();
       String keys = keyf.getText();
        if ( keys.isEmpty())
         {
             wind("please ensure you enter the input txt");
             return;}
       if ( plain.isEmpty())
         {
             wind("please ensure you enter the input txt");
             return;}
      if(jComboBox1.getSelectedItem()=="ceaser"){
         
        
             if(!isint(keys))
             {
                 wind("please ensure you enter a integer");
                 return;}
             
          key = Integer.parseInt(keys);
          result = ceaser_de(plain, key);
           plainf.setText(result);
    
      }
        else if(jComboBox1.getSelectedItem()=="DES"){
             if(keys.length()<8)
             {
                 wind("please, key must be 8 char");
                 return;}
             
          
        
           result = DES.decryption(plain, keys);
           plainf.setText(result);}
      else if(jComboBox1.getSelectedItem()=="playfair"){
         if(!ischar(keys))
             {
                 wind("please ensure you enter a string");
                 return;}
             
          
          plain =format(plain);
            String pairs[] = div2pairs(plain);
            char[][] matr= adjust(keys);
           result = de_play(pairs, matr);
           plainf.setText(result);}
        
        
        
    }//GEN-LAST:event_decryptionActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        plainf.setText("");
        cipherf.setText("");
        keyf.setText("");
    }//GEN-LAST:event_clearActionPerformed
  
    
    
    
    
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
            java.util.logging.Logger.getLogger(candpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(candpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(candpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(candpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new candpf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Encryption;
    private javax.swing.JTextField cipherf;
    private javax.swing.JButton clear;
    private javax.swing.JButton decryption;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField keyf;
    public javax.swing.JTextField plainf;
    // End of variables declaration//GEN-END:variables
//JFrame frame = new JFrame("Error message");
    


    @Override
    protected void frameInit() {
        super.frameInit(); //To change body of generated methods, choose Tools | Templates.
    }

     public static String ceaser_en(String plain, int key) {

        String cipher = "";
        for (int i = 0; i < plain.length(); i++) {
            int x = (((((int) plain.charAt(i)) - 97) + key) % 26) + 97;
            cipher += (char) x;
        }
        return cipher;
    }
     
      //ceaser decryption
    public static String ceaser_de(String plain, int key) {

        String plan = "";
        for (int i = 0; i < plain.length(); i++) {
            int x = (((((int) plain.charAt(i)) - 97) - key) % 26) + 97;
            if (x < 0) {
                x += 26;
            }
            plan += (char) x;
        }
        return plan;
    }
    
  String format (String plain){
      String plainn = "";
       StringBuilder temp = new StringBuilder();
       // remove j
        for (int i = 0; i < plain.length(); i++) {
            if(plain.charAt(i)=='j')
                temp.append('i');
            temp.append(plain.charAt(i));
             
        }
        //compare each two 
          for (int j = 0; j < temp.length(); j+=2) {
              if(j+1==temp.length())
                  break;
                if(temp.charAt(j)==temp.charAt(j+1))
                    temp.insert(j+1, 'x'); //add x if the same char
            }
        plainn = temp.toString();
        if(plainn.length()%2 !=0)//add x if odd
            plainn +='x';
        return plainn;
  }
  
  String[] div2pairs(String plain){
      String[] pair = new String[plain.length()/2];
      int c=0;
      for (int i = 0; i < pair.length; i++) {
          pair[i]= plain.substring(c, c+2);
          c+=2;
          
      }
      return pair;
      
      
  }
  
  int  [] pos(char mat[][], char ch){
      int post[]= new int[2];
      for (int i = 0; i < mat.length; i++) {
          for (int j = 0; j < mat[i].length; j++) {
              if(mat[i][j]==ch){
                  post[0]=i;
                  post[1]=j; 
                    break;    }
          }
      }
    return post;  
  }
  
  char[][] adjust (String key){
        
        String alpha ="abcdefghiklmnopqrstuvwxyz" ;
        String keyalph= key+alpha;
        char ch []= keyalph.toCharArray();
        ArrayList <Character> adjusted = new ArrayList<>();
        for (char d : ch) 
            if(! adjusted.contains(d))
                adjusted.add(d);
    char matrix [][]= new char[5][5];
     int c=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix [i][j]= adjusted.get(c);
                c++;
            }
        }
        
        return matrix;
        }
    
  String  enc_play(String [] pair , char [][] matrix){
      int arr [] =new int[2];
      int i1,j1,i2,j2;
      String cipher ="";
       for (int i = 0; i < pair.length; i++) {
           arr= pos(matrix,pair[i].charAt(0));
           i1= arr[0];
           j1=arr[1];
           arr= pos(matrix,pair[i].charAt(1));
            i2= arr[0];
           j2=arr[1];
           if(i1==i2){
               if(j1==4)
                   j1=-1;
               if(j2==4)
                   j2=-1;
               cipher+= matrix[i1][j1+1];
               cipher+= matrix[i2][j2+1];
               
           }
           else if(j1==j2){
               if(i1==4)
                   i1=-1;
               if(i2==4)
                   i2=-1;
                cipher+= matrix[i1+1][j1];
               cipher+= matrix[i2+1][j2];
           }
           else{
                cipher+= matrix[i1][j2];
               cipher+= matrix[i2][j1];
               
           }
       }
       return cipher;
      
       
       
       
   }
   
  String de_play(String [] pair , char [][] matrix){
    
    int arr [] =new int[2];
      int i1,j1,i2,j2;
      String plain ="";
       for (int i = 0; i < pair.length; i++) {
           arr= pos(matrix,pair[i].charAt(0));
           i1= arr[0];
           j1=arr[1];
           arr= pos(matrix,pair[i].charAt(1));
            i2= arr[0];
           j2=arr[1];
           if(i1==i2){
               if(j1==0)
                   j1=5;
               if(j2==0)
                   j2=5;
               plain+= matrix[i1][j1-1];
               plain+= matrix[i2][j2-1];
               
           }
           else if(j1==j2){
               if(i1==0)
                   i1=5;
               if(i2==0)
                   i2=5;
                plain+= matrix[i1+1][j1];
               plain+= matrix[i2+1][j2];
           }
           else{
                plain+= matrix[i1][j2];
               plain+= matrix[i2][j1];
               
           }
       }
       return plain;

    
   }

}