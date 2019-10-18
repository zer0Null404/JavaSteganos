/*     */ package steganos;
/*     */ 
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFileChooser;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextField;
          import javax.swing.LayoutStyle;
/*     */ import javax.swing.LayoutStyle.ComponentPlacement;
          import javax.swing.UIManager;
          import javax.swing.UIManager.LookAndFeelInfo;
          import javax.swing.JFrame;
          
/*     */ 
/*     */ public class Stegano_view extends javax.swing.JFrame
/*     */ {
/*     */   private String stat_name;
/*     */   private String stat_path;
/*     */   private String ext;
/*     */   private String stat_name2;
/*     */   private String stat_path2;
/*     */   private String ext2;
/*  32 */   private Steganography model = new Steganography();
/*  33 */   private VigenereCipher vc = new VigenereCipher();
/*     */   private String stat_name3;
/*     */   private String stat_path3;
/*     */   private String ext3;
/*     */   
/*     */   public Stegano_view()
/*     */   {
/*  40 */     initComponents();
/*  41 */     setLocationRelativeTo(null);
/*     */   }
/*     */   
/*     */   private String isi_file;
/*     */   private JButton btnImage;
/*     */   private JButton btnMessage;
/*     */   
/*  48 */   private void initComponents() { this.jFileChooser1 = new JFileChooser();
/*  49 */     this.jFileChooser2 = new JFileChooser();
/*  50 */     this.jFileChooser3 = new JFileChooser();
/*  51 */     this.jPanel1 = new JPanel();
/*  52 */     this.jTabbedPane1 = new javax.swing.JTabbedPane();
/*  53 */     this.jPanel3 = new JPanel();
/*  54 */     this.jPanel7 = new JPanel();
/*  55 */     this.jLabel9 = new JLabel();
/*  56 */     this.jLabel10 = new JLabel();
/*  57 */     this.jLabel11 = new JLabel();
/*  58 */     this.txtImageName = new JTextField();
/*  59 */     this.txtMessage = new JTextField();
/*  60 */     this.txtKey = new JTextField();
/*  61 */     this.btnImage = new JButton();
/*  62 */     this.btnMessage = new JButton();
/*  63 */     this.jButton4 = new JButton();
/*  64 */     this.jButton2 = new JButton();
/*  65 */     this.jPanel8 = new JPanel();
/*  66 */     this.image_input = new JLabel();
/*  67 */     this.image_input2 = new JLabel();
/*  68 */     this.label_asli = new JLabel();
/*  69 */     this.label_hasil = new JLabel();
/*  70 */     this.jPanel4 = new JPanel();
/*  71 */     this.jPanel9 = new JPanel();
/*  72 */     this.jLabel12 = new JLabel();
/*  73 */     this.jLabel13 = new JLabel();
/*  74 */     this.txtImageDecode = new JTextField();
/*  75 */     this.txtKeyDecode = new JTextField();
/*  76 */     this.jButton5 = new JButton();
/*  77 */     this.jButton6 = new JButton();
/*  78 */     this.btnNew = new JButton();
/*  79 */     this.jPanel10 = new JPanel();
/*  80 */     this.label_decode = new JLabel();
/*  81 */     this.label_decode_name = new JLabel();
/*  82 */     this.jPanel11 = new JPanel();
/*  83 */     this.jLabel16 = new JLabel();
/*  84 */     this.jScrollPane1 = new JScrollPane();
/*  85 */     this.txtHasilEncrypt = new JTextArea();
/*  86 */     this.jLabel17 = new JLabel();
/*  87 */     this.jScrollPane2 = new JScrollPane();
/*  88 */     this.txtHasilDecrypt = new JTextArea();
/*  89 */     this.jButton3 = new JButton();
/*  90 */     this.jPanel5 = new JPanel();
/*  91 */     this.jPanel6 = new JPanel();
/*  92 */     this.jLabel2 = new JLabel();
/*  93 */     this.jLabel3 = new JLabel();
/*  94 */     this.jLabel4 = new JLabel();
/*  95 */     this.jLabel5 = new JLabel();
/*  96 */     this.jLabel6 = new JLabel();
/*  97 */     this.jLabel7 = new JLabel();
/*  98 */     this.jLabel8 = new JLabel();
/*  99 */     this.jPanel12 = new JPanel();
/* 100 */     this.jScrollPane3 = new JScrollPane();
/* 101 */     this.jTextArea1 = new JTextArea();
/* 102 */     this.jPanel2 = new JPanel();
/* 103 */     this.jLabel1 = new JLabel();
/* 104 */     this.jButton1 = new JButton();
/*     */     
/* 106 */     setDefaultCloseOperation(3);
/* 107 */     setTitle("Steganos V 1.0");
/*     */     
/* 109 */     this.jPanel3.setBackground(new java.awt.Color(153, 204, 255));
/*     */     
/* 111 */     this.jLabel9.setText("Cover Image ");
/*     */     
/* 113 */     this.jLabel10.setText("File Message");
/*     */     
/* 115 */     this.jLabel11.setText("Steganography Key");
/*     */     
/* 117 */     this.txtImageName.setEditable(false);
/* 118 */     this.txtImageName.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/* 120 */         Stegano_view.this.txtImageNameMouseClicked(evt);
/*     */       }
/*     */       
/* 123 */     });
/* 124 */     this.txtMessage.setEditable(false);
/*     */     
/* 126 */     this.btnImage.setText("Browse");
/* 127 */     this.btnImage.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 129 */         Stegano_view.this.btnImageActionPerformed(evt);
/*     */       }
/*     */       
/* 132 */     });
/* 133 */     this.btnMessage.setText("Browse");
/* 134 */     this.btnMessage.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 136 */         Stegano_view.this.btnMessageActionPerformed(evt);
/*     */       }
/*     */       
/* 139 */     });
/* 140 */     this.jButton4.setText("Encrypt");
/* 141 */     this.jButton4.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 143 */         Stegano_view.this.jButton4ActionPerformed(evt);
/*     */       }
/*     */       
/* 146 */     });
/* 147 */     this.jButton2.setText("New");
/* 148 */     this.jButton2.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 150 */         Stegano_view.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/* 153 */     });
/* 154 */     GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
/* 155 */     this.jPanel7.setLayout(jPanel7Layout);
/* 156 */     jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.jLabel9).addComponent(this.jLabel10).addComponent(this.jLabel11)).addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.txtKey, -2, 179, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton4, -1, 155, 32767))
                .addComponent(this.txtMessage, -1, 344, 32767).addComponent(this.txtImageName, -1, 344, 32767))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.btnMessage, -1, 124, 32767).addComponent(this.btnImage, -1, 124, 32767)
                .addComponent(this.jButton2, -1, 124, 32767)).addContainerGap()));


/* 179 */     jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jLabel9).addGap(18, 18, 18)
                .addComponent(this.jLabel10)).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.txtImageName, -2, -1, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(this.txtMessage, -2, -1, -2).addComponent(this.btnMessage))).addComponent(this.btnImage))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 13, 32767)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel11)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.txtKey, -2, -1, -2)
                .addComponent(this.jButton4).addComponent(this.jButton2))).addContainerGap()));


/*     */ 
/* 205 */     this.jPanel8.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Preview"));
/*     */     
/* 207 */     this.image_input.setBackground(new java.awt.Color(204, 255, 255));
/* 208 */     this.image_input.setHorizontalAlignment(0);
/* 209 */     this.image_input.setText("Gambar Asli");
/* 210 */     this.image_input.setToolTipText("Gambar Asli");
/* 211 */     this.image_input.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/* 213 */     this.image_input2.setHorizontalAlignment(0);
/* 214 */     this.image_input2.setText("Gambar Hasil Encrypt");
/* 215 */     this.image_input2.setToolTipText("Gambar Hasil Encrypt");
/* 216 */     this.image_input2.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/* 218 */     this.label_asli.setHorizontalAlignment(0);
/*     */     
/* 220 */     this.label_hasil.setHorizontalAlignment(0);
/*     */     
/* 222 */     GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
/* 223 */     this.jPanel8.setLayout(jPanel8Layout);
/* 224 */     jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(this.label_asli, GroupLayout.Alignment.LEADING, -1, 287, 32767)
                .addComponent(this.image_input, GroupLayout.Alignment.LEADING, -2, 282, -2)).addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.label_hasil, -1, 287, 32767)
                .addComponent(this.image_input2, -2, 282, -2)).addContainerGap()));


/* 237 */     jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(this.image_input2, -2, 222, -2).addComponent(this.image_input, -2, 222, -2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.label_asli, -1, 18, 32767).addComponent(this.label_hasil)).addContainerGap()));


/* 250 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 251 */     this.jPanel3.setLayout(jPanel3Layout);
/* 252 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel8, GroupLayout.Alignment.LEADING, -1, -1, 32767)
                .addComponent(this.jPanel7, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));


/* 261 */     jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel7, -2, -1, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel8, -1, -1, 32767).addContainerGap()));


/* 271 */     this.jTabbedPane1.addTab("  Encrypt  ", this.jPanel3);
/*     */     
/* 273 */     this.jPanel4.setBackground(new java.awt.Color(153, 204, 255));
/*     */     
/* 275 */     this.jLabel12.setText("Steganography Image");
/*     */     
/* 277 */     this.jLabel13.setText("Steganography Key");
/*     */     
/* 279 */     this.txtImageDecode.setEditable(false);
/*     */     
/* 281 */     this.jButton5.setText("Browse");
/* 282 */     this.jButton5.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 284 */         Stegano_view.this.jButton5ActionPerformed(evt);
/*     */       }
/*     */       
/* 287 */     });
/* 288 */     this.jButton6.setText("Decrypt Image");
/* 289 */     this.jButton6.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 291 */         Stegano_view.this.jButton6ActionPerformed(evt);
/*     */       }
/*     */       
/* 294 */     });
/* 295 */     this.btnNew.setText("New");
/* 296 */     this.btnNew.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 298 */         Stegano_view.this.btnNewActionPerformed(evt);
/*     */       }
/*     */       
/* 301 */     });
/* 302 */     GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
/* 303 */     this.jPanel9.setLayout(jPanel9Layout);
/* 304 */     jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup().addGap(33, 33, 33).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.jLabel12).addComponent(this.jLabel13)).addGap(26, 26, 26).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel9Layout.createSequentialGroup().addComponent(this.txtKeyDecode, -2, 194, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(this.jButton6, -1, -1, 32767)).addComponent(this.txtImageDecode, -2, 354, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.btnNew, -1, 88, 32767).addComponent(this.jButton5, -1, 88, 32767))
                .addContainerGap()));



/* 324 */     jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.txtImageDecode, -2, -1, -2).addComponent(this.jButton5))
                .addGroup(jPanel9Layout.createSequentialGroup().addComponent(this.jLabel12).addGap(18, 18, 18).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(this.jLabel13).addComponent(this.txtKeyDecode, -2, -1, -2).addComponent(this.jButton6).addComponent(this.btnNew)))).addContainerGap(20, 32767)));



/* 343 */     this.jPanel10.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Preview Image"));
/*     */     
/* 345 */     this.label_decode.setHorizontalAlignment(0);
/* 346 */     this.label_decode.setText("Object Gambar");
/*     */     
/* 348 */     this.label_decode_name.setHorizontalAlignment(0);
/*     */     
/* 350 */     GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
/* 351 */     this.jPanel10.setLayout(jPanel10Layout);
/* 352 */     jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.label_decode, -2, 278, -2).addComponent(this.label_decode_name, -1, 278, 32767));



/* 357 */     jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup().addComponent(this.label_decode, -2, 242, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(this.label_decode_name, -1, 30, 32767)));



/* 365 */     this.jPanel11.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Isi Pesan"));
/*     */     
/* 367 */     this.jLabel16.setText("Hasil Encrypt :");
/*     */     
/* 369 */     this.txtHasilEncrypt.setColumns(20);
/* 370 */     this.txtHasilEncrypt.setRows(5);
/* 371 */     this.jScrollPane1.setViewportView(this.txtHasilEncrypt);
/*     */     
/* 373 */     this.jLabel17.setText("Hasil Decrypt :");
/*     */     
/* 375 */     this.txtHasilDecrypt.setColumns(20);
/* 376 */     this.txtHasilDecrypt.setRows(5);
/* 377 */     this.jScrollPane2.setViewportView(this.txtHasilDecrypt);
/*     */     
/* 379 */     this.jButton3.setText("Save");
/* 380 */     this.jButton3.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 382 */         Stegano_view.this.jButton3ActionPerformed(evt);
/*     */       }
/*     */       
/* 385 */     });
/* 386 */     GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
/* 387 */     this.jPanel11.setLayout(jPanel11Layout);
/* 388 */     jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup().addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(this.jScrollPane2, GroupLayout.Alignment.LEADING, -1, 292, 32767).addComponent(this.jScrollPane1, GroupLayout.Alignment.LEADING, -1, 292, 32767)
                .addComponent(this.jLabel16, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                .addComponent(this.jLabel17).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 165, 32767).addComponent(this.jButton3))).addContainerGap()));



/* 402 */     jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup().addComponent(this.jLabel16).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jScrollPane1, -2, 111, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel17).addComponent(this.jButton3))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane2, -1, 106, 32767).addContainerGap()));



/* 417 */     GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
/* 418 */     this.jPanel4.setLayout(jPanel4Layout);
/* 419 */     jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jPanel10, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(this.jPanel11, -1, -1, 32767)).addComponent(this.jPanel9, -1, -1, 32767)).addContainerGap()));



/* 431 */     jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel9, -2, -1, -2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.jPanel10, -1, -1, 32767).addComponent(this.jPanel11, -1, -1, 32767)).addContainerGap()));



/* 443 */     this.jTabbedPane1.addTab("  Decrypt  ", this.jPanel4);
/*     */     
/* 445 */     this.jPanel5.setBackground(new java.awt.Color(153, 204, 255));
/*     */     
/* 447 */     this.jPanel6.setBackground(new java.awt.Color(153, 204, 255));
/*     */     
///* 449 */     this.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Settings.png")));
/*     */     
/* 451 */     GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
/* 452 */     this.jPanel6.setLayout(jPanel6Layout);
/* 453 */     jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2).addContainerGap(-1, 32767)));


/* 460 */     jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel2)));


/* 467 */     this.jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 24));
/* 468 */     this.jLabel3.setText("Steganos v 1.0");
/*     */     
/* 470 */     this.jLabel4.setText("JPEG Image Steganography for hidden text message ");
/*     */     
/* 472 */     this.jLabel5.setText("Text Encryption");
/*     */     
/* 474 */     this.jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
/* 475 */     this.jLabel6.setText("Software Version 1.0");
/*     */     
/* 477 */     this.jLabel7.setText("By ......");
/*     */     
/* 479 */     this.jLabel8.setText("mail : .........");
/*     */     
/* 481 */     GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
/* 482 */     this.jPanel5.setLayout(jPanel5Layout);
/* 483 */     jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel6, -2, -1, -2)
                .addGap(18, 18, 18).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.jLabel3).addComponent(this.jLabel5, -2, 323, -2).addComponent(this.jLabel4, -2, 273, -2))
                .addContainerGap(145, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(487, 32767).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.jLabel8).addComponent(this.jLabel7).addComponent(this.jLabel6)).addContainerGap()));



/* 502 */     jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel6, -2, -1, -2))
                .addGroup(jPanel5Layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel4).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jLabel5))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 168, 32767).addComponent(this.jLabel6)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel7).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jLabel8).addGap(50, 50, 50)));



/* 525 */     this.jTabbedPane1.addTab("  About  ", this.jPanel5);
/*     */     
/* 527 */     this.jTextArea1.setColumns(20);
/* 528 */     this.jTextArea1.setRows(5);
/* 529 */     this.jTextArea1.setText("Bantuan\n\nJelaskan disini\n\n......\n");
/* 530 */     this.jScrollPane3.setViewportView(this.jTextArea1);
/*     */     
/* 532 */     GroupLayout jPanel12Layout = new GroupLayout(this.jPanel12);
/* 533 */     this.jPanel12.setLayout(jPanel12Layout);
/* 534 */     jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane3, -1, 624, 32767).addContainerGap()));



/* 541 */     jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane3, -1, 401, 32767).addContainerGap()));



/* 549 */     this.jTabbedPane1.addTab("Help", this.jPanel12);
/*     */     
/* 551 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 552 */     this.jPanel1.setLayout(jPanel1Layout);
/* 553 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane1));
/*     */     
/*     */ 
/*     */ 
/* 557 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane1, -1, 451, 32767));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 562 */     this.jPanel2.setLayout(new java.awt.GridLayout(1, 4));
/*     */     
/* 564 */     this.jLabel1.setText("Copyright @ 2019");
/* 565 */     this.jPanel2.add(this.jLabel1);
/*     */     
/* 567 */     this.jButton1.setText("Close");
/* 568 */     this.jButton1.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 570 */         Stegano_view.this.jButton1ActionPerformed(evt);
/*     */       }
/* 572 */     });
/* 573 */     this.jPanel2.add(this.jButton1);
/*     */     
/* 575 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 576 */     getContentPane().setLayout(layout);
/* 577 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.jPanel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jPanel2, GroupLayout.Alignment.TRAILING, -1, 649, 32767)).addContainerGap()));



/* 586 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, -1, 32767)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel2, -2, -1, -2)));
            
                pack(); }
/*     */   
/*     */   private JButton btnNew;
/*     */   private JLabel image_input;
/*     */   
/* 600 */   private void jButton1ActionPerformed(ActionEvent evt) { System.exit(0); }
/*     */   
/*     */   private JLabel image_input2;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   
/* 606 */   private void btnImageActionPerformed(ActionEvent evt) { this.jFileChooser1.setFileSelectionMode(2);
/* 607 */     this.jFileChooser1.setFileFilter(new Image_Filter());
/* 608 */     int returnVal = this.jFileChooser1.showOpenDialog(this.jPanel1);
/* 609 */     File directory = this.jFileChooser1.getSelectedFile();
/*     */     try {
/* 611 */       String image = directory.getPath();
/* 612 */       this.stat_name = directory.getName();
/* 613 */       this.stat_path = directory.getPath();
/* 614 */       this.ext = Image_Filter.getExtension(directory);
/* 615 */       this.stat_path = this.stat_path.substring(0, this.stat_path.length() - this.stat_name.length() - 1);
/* 616 */       this.stat_name = this.stat_name.substring(0, this.stat_name.length() - 4);
/* 617 */       this.image_input.setIcon(new javax.swing.ImageIcon(javax.imageio.ImageIO.read(new File(image))));
/* 618 */       this.txtImageName.setText(this.stat_path + "\\" + this.stat_name + "." + this.ext);
/* 619 */       this.label_asli.setText(this.stat_name + "." + this.ext);
/*     */     }
/*     */     catch (Exception except)
/*     */     {
/* 623 */       JOptionPane.showMessageDialog(null, "The File cannot be opened!", "Error!", 1);
/*     */     } }
/*     */   
/*     */   private JButton jButton3;
/*     */   private JButton jButton4;
/*     */   private JButton jButton5;
/*     */   private JButton jButton6;
/*     */   
/* 631 */   private void btnMessageActionPerformed(ActionEvent evt) { this.jFileChooser2.setFileSelectionMode(2);
/*     */     
/* 633 */     int returnVal = this.jFileChooser2.showOpenDialog(this.jPanel1);
/* 634 */     File directory = this.jFileChooser2.getSelectedFile();
/*     */     
/* 636 */     System.out.println(directory);
/*     */     
/*     */ 
/* 639 */     java.io.FileInputStream in = null;
/*     */     try {
/* 641 */       in = new java.io.FileInputStream(directory);
/* 642 */       java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));
/* 643 */       String line = null;
/* 644 */       this.isi_file = "";
/* 645 */       while ((line = reader.readLine()) != null)
/*     */       {
/* 647 */         this.isi_file = (this.isi_file + "\n" + line);
/* 648 */         in.close();
/*     */       }
/*     */     }
/*     */     catch (IOException x) {}
/* 652 */     System.out.println("isi :" + this.isi_file);
/*     */     try {
/* 654 */       String image = directory.getPath();
/* 655 */       this.stat_name2 = directory.getName();
/* 656 */       this.stat_path2 = directory.getPath();
/* 657 */       this.ext2 = Image_Filter.getExtension(directory);
/* 658 */       this.stat_path2 = this.stat_path2.substring(0, this.stat_path2.length() - this.stat_name2.length() - 1);
/* 659 */       this.stat_name2 = this.stat_name2.substring(0, this.stat_name2.length() - 4);
/*     */       
/* 661 */       this.txtMessage.setText(this.stat_path2 + "\\" + this.stat_name2 + "." + this.ext2);
/*     */     }
/*     */     catch (Exception except) {
/* 664 */       JOptionPane.showMessageDialog(null, "The File cannot be opened!", "Error!", 1); } }
/*     */   
/*     */   private JFileChooser jFileChooser1;
/*     */   private JFileChooser jFileChooser2;
/*     */   private JFileChooser jFileChooser3;
/*     */   private JLabel jLabel1;
/*     */   
/* 671 */   private void txtImageNameMouseClicked(java.awt.event.MouseEvent evt) { this.btnImage.getChangeListeners(); }
/*     */   
/*     */   private JLabel jLabel10;
/*     */   private JLabel jLabel11;
/*     */   
/* 676 */   private void jButton4ActionPerformed(ActionEvent evt) { if (this.txtImageName.getText().toString().trim().equals("")) {
/* 677 */       JOptionPane.showMessageDialog(null, "Pilih Objeck Gambar terlebih dahulu", "Informasi!", 1);
/*     */     }
/* 679 */     else if (this.txtMessage.getText().toString().trim().equals("")) {
/* 680 */       JOptionPane.showMessageDialog(null, "Pilih Objeck Pesan terlebih dahulu", "Informasi!", 1);
/*     */     }
/* 682 */     else if (this.txtKey.getText().toString().trim().equals("")) {
/* 683 */       JOptionPane.showMessageDialog(null, "Masukan Key / Konci untuk encrypt pesan", "Informasi!", 1);
/*     */     }
/*     */     else {
/* 686 */       String stegan = JOptionPane.showInputDialog(this.jPanel1, "Masukan Nama File", "File name", -1);
/*     */       
/* 688 */       if (stegan.trim().equals("")) {
/* 689 */         stegan = "hasil_encode";
/*     */       }
/* 691 */       String text = "";
/*     */       
/*     */ 
/*     */       try
/*     */       {
/* 696 */         text = this.vc.encrypt(this.isi_file, this.txtKey.getText().trim());
/* 697 */         System.out.println(this.stat_path + " 1 " + this.stat_name + " 2 " + this.ext + " 3 " + stegan + " 4 " + text);
/* 698 */         if (this.model.encode(this.stat_path, this.stat_name, this.ext, stegan, text))
/*     */         {
/* 700 */           JOptionPane.showMessageDialog(this.jPanel1, "The Image was encrypt Successfully!", "Success!", 1);
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 705 */           JOptionPane.showMessageDialog(this.jPanel1, "The Image could not be encrypt!", "Error!", 1);
/*     */         }
/*     */       }
/*     */       catch (ArrayIndexOutOfBoundsException aioobe) {
/* 709 */         JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Proses Encrypt.. Hanya Huruf dan Angka yang dapat di Encrypt");
/*     */       } catch (Exception ex) {
/* 711 */         System.out.println("Terjadi Kesalahan Encrypt");
/*     */       }
/*     */       try
/*     */       {
/* 715 */         this.image_input2.setIcon(new javax.swing.ImageIcon(javax.imageio.ImageIO.read(new File(this.stat_path + "/" + stegan + ".png"))));
/* 716 */         this.label_hasil.setText(stegan + ".png");
/*     */       } catch (IOException ex) {
/* 718 */         JOptionPane.showMessageDialog(this.jPanel1, "Gambar gagal disimpan", "Erorr!", 0);
/*     */       }
/*     */     } }
/*     */   
/*     */   private JLabel jLabel12;
/*     */   private JLabel jLabel13;
/*     */   private JLabel jLabel16;
/*     */   private JLabel jLabel17;
/*     */   
/* 727 */   private void jButton5ActionPerformed(ActionEvent evt) { this.jFileChooser3.setFileSelectionMode(2);
/* 728 */     this.jFileChooser3.setFileFilter(new Image_Filter());
/* 729 */     int returnVal = this.jFileChooser3.showOpenDialog(this.jPanel1);
/* 730 */     File directory = this.jFileChooser3.getSelectedFile();
/*     */     try {
/* 732 */       String image = directory.getPath();
/* 733 */       this.stat_name3 = directory.getName();
/* 734 */       this.stat_path3 = directory.getPath();
/* 735 */       this.ext3 = Image_Filter.getExtension(directory);
/* 736 */       this.stat_path3 = this.stat_path3.substring(0, this.stat_path3.length() - this.stat_name3.length() - 1);
/* 737 */       this.stat_name3 = this.stat_name3.substring(0, this.stat_name3.length() - 4);
/* 738 */       this.label_decode.setIcon(new javax.swing.ImageIcon(javax.imageio.ImageIO.read(new File(image))));
/* 739 */       this.txtImageDecode.setText(this.stat_path3 + "\\" + this.stat_name3 + "." + this.ext3);
/* 740 */       this.label_decode_name.setText(this.stat_name3 + "." + this.ext3);
/*     */     }
/*     */     catch (Exception except) {
/* 743 */       JOptionPane.showMessageDialog(null, "The File cannot be opened!", "Error!", 1); } }
/*     */   
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/* 750 */   private void jButton6ActionPerformed(ActionEvent evt) { if (this.txtImageDecode.getText().toString().trim().equals("")) {
/* 751 */       JOptionPane.showMessageDialog(null, "Pilih Objeck Gambar terlebih dahulu", "Informasi!", 1);
/*     */     }
/* 753 */     else if (this.txtKeyDecode.getText().toString().trim().equals("")) {
/* 754 */       JOptionPane.showMessageDialog(null, "Masukan Key / Konci untuk Membaca pesan", "Informasi!", 1);
/*     */     }
/*     */     else {
/* 757 */       String message = this.model.decode(this.stat_path3, this.stat_name3);
/* 758 */       System.out.println(this.stat_path3 + ", " + this.stat_name3);
/* 759 */       if (message != "")
/*     */       {
/*     */ 
/* 762 */         JOptionPane.showMessageDialog(this.jPanel1, "The Image was decrypt Successfully!", "Success!", 1);
/*     */         
/* 764 */         this.txtHasilEncrypt.setText(message);
/*     */         
/* 766 */         String hasil = this.vc.decrypt(message, this.txtKeyDecode.getText().toString().trim());
/*     */         
/* 768 */         this.txtHasilDecrypt.setText(hasil);
/* 769 */         System.out.println("Hasil : " + hasil);
/*     */       }
/*     */       else
/*     */       {
/* 773 */         JOptionPane.showMessageDialog(this.jPanel1, "The Image could not be decrypt!", "Error!", 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private void btnNewActionPerformed(ActionEvent evt)
/*     */   {
/* 781 */     this.txtHasilDecrypt.setText("");
/* 782 */     this.txtHasilEncrypt.setText(""); 
/* 783 */     this.txtKeyDecode.setText("");
/* 784 */     this.txtKey.setText("");
/* 785 */     this.txtImageDecode.setText("");
/* 786 */     this.label_decode.setIcon(null);
/* 787 */     this.label_asli.setText("");
/* 788 */     this.label_hasil.setText("");
/* 789 */     this.label_decode_name.setText("");
/* 790 */     this.image_input.setIcon(null);
/* 791 */     this.image_input2.setIcon(null);
/* 792 */     this.txtImageName.setText("");
/* 793 */     this.txtMessage.setText("");
/*     */   }
/*     */   
/*     */ 
/*     */   private void jButton2ActionPerformed(ActionEvent evt)
/*     */   {
/* 799 */     this.txtHasilDecrypt.setText("");
/* 800 */     this.txtHasilEncrypt.setText("");
/* 801 */     this.txtKeyDecode.setText("");
/* 802 */     this.txtKey.setText("");
/* 803 */     this.txtImageDecode.setText("");
/* 804 */     this.label_decode.setIcon(null);
/* 805 */     this.label_asli.setText("");
/* 806 */     this.label_hasil.setText("");
/* 807 */     this.label_decode_name.setText("");
/* 808 */     this.image_input.setIcon(null);
/* 809 */     this.image_input2.setIcon(null);
/* 810 */     this.txtImageName.setText("");
/* 811 */     this.txtMessage.setText("");
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt)
/*     */   {
/* 816 */     String stegan = JOptionPane.showInputDialog(this.jPanel1, "Masukan Nama File Hasil Steganography", "File name", -1);
/*     */     
/* 818 */     if (stegan.trim().equals("")) {
/* 819 */       stegan = "hasil_encode";
/*     */     }
/* 821 */     String path = this.stat_path2 + "\\" + stegan + "." + this.ext2;
/* 822 */     File sampleFile = new File(path);
/*     */     try {
/* 824 */       String text = this.txtHasilDecrypt.getText();
/* 825 */       java.io.FileWriter fileWriter = new java.io.FileWriter(sampleFile);
/* 826 */       java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(fileWriter);
/* 827 */       bufferedWriter.write(text, 0, text.length());
/* 828 */       bufferedWriter.newLine();
/* 829 */       bufferedWriter.close();
/* 830 */       JOptionPane.showMessageDialog(this.jPanel1, "Proses Simpan Berhasil. \n File Tersimpan di: " + path, "Informasi!!", 1);
/*     */     }
/*     */     catch (IOException ex)
/*     */     {
/* 834 */       ex.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   private JLabel jLabel7;
/*     */   private JLabel jLabel8;
/*     */   private JLabel jLabel9;
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel10;
/*     */   private JPanel jPanel11;
/*     */   private JPanel jPanel12;
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 849 */         if ("Nimbus".equals(info.getName())) {
/* 850 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 851 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 855 */       Logger.getLogger(Stegano_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 857 */       Logger.getLogger(Stegano_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 859 */       Logger.getLogger(Stegano_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 861 */       Logger.getLogger(Stegano_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 866 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 869 */         new Stegano_view().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */   
/*     */   private JPanel jPanel2;
/*     */   private JPanel jPanel3;
/*     */   private JPanel jPanel4;
/*     */   private JPanel jPanel5;
/*     */   private JPanel jPanel6;
/*     */   private JPanel jPanel7;
/*     */   private JPanel jPanel8;
/*     */   private JPanel jPanel9;
/*     */   private JScrollPane jScrollPane1;
/*     */   private JScrollPane jScrollPane2;
/*     */   private JScrollPane jScrollPane3;
/*     */   private javax.swing.JTabbedPane jTabbedPane1;
/*     */   private JTextArea jTextArea1;
/*     */   private JLabel label_asli;
/*     */   private JLabel label_decode;
/*     */   private JLabel label_decode_name;
/*     */   private JLabel label_hasil;
/*     */   private JTextArea txtHasilDecrypt;
/*     */   private JTextArea txtHasilEncrypt;
/*     */   private JTextField txtImageDecode;
/*     */   private JTextField txtImageName;
/*     */   private JTextField txtKey;
/*     */   private JTextField txtKeyDecode;
/*     */   private JTextField txtMessage;
/*     */ }


/* Location:              C:\Users\farizie\Desktop\steganography viginare.jar!\stegano\gun\Stegano_view.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */