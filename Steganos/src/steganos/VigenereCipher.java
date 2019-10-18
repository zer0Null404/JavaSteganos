/*     */ package steganos;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.Vector;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class VigenereCipher
/*     */ {
/*  10 */   private static final char[] alphnum = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '@', '?', '#', '-', '+', '!', '$', '%', '&', '*', '(', ')', '_', '+', '=', '.', ',', ';', ':', '"', '\'', '}', '{', 
                '\\', '/', '^', '<', '>', '[', ']', '^', '|', '`', '~' };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  19 */   private static final int dim = alphnum.length;
/*  20 */   private char[][] vgnrSquare = new char[alphnum.length][alphnum.length];
/*  21 */   private Vector<Character> alphnumv = new Vector();
/*     */   
/*     */   public VigenereCipher() {
/*  24 */     init();
/*     */     
/*     */ 
/*  27 */     for (int i = 0; i < dim; i++) {
/*  28 */       this.alphnumv.add(Character.valueOf(alphnum[i]));
/*     */     }
/*     */     
/*  31 */     print();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void init()
/*     */   {
/*  39 */     for (int i = 0; i < dim; i++) {
/*  40 */       for (int j = i; j < dim; j++) {
/*  41 */         if (i == 0) {
/*  42 */           this.vgnrSquare[i][j] = alphnum[j];
/*     */         } else {
/*  44 */           this.vgnrSquare[i][(j - i)] = alphnum[j];
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*  50 */     for (int i = 1; i < dim; i++) {
/*  51 */       int k = 0;
/*     */       
/*  53 */       for (int j = dim - i; j < dim; j++) {
/*  54 */         this.vgnrSquare[i][j] = alphnum[k];
/*  55 */         k++;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String encrypt(String plaintext, String key)
/*     */   {
/*  66 */     if ((keyHasSpace(key)) || (key.length() == 0)) {
/*  67 */       System.out.println("\nKey cannot contain a space!\n");
/*  68 */       return null; }
/*  69 */     if (plaintext.length() == 0) {
/*  70 */       System.out.println("\nNothing to encrypt!\n");
/*  71 */       return null;
/*     */     }
/*  73 */     char[] ciphertext = new char[plaintext.length()];
/*  74 */     key = generateKey(plaintext, key);
/*     */     
/*  76 */     for (int i = 0; i < ciphertext.length; i++) {
/*  77 */       int row = this.alphnumv.indexOf(Character.valueOf(Character.toUpperCase(key.charAt(i))));
/*  78 */       int col = this.alphnumv.indexOf(Character.valueOf(Character.toUpperCase(plaintext.charAt(i))));
/*     */       
/*  80 */       if (plaintext.charAt(i) == ' ') {
/*  81 */         ciphertext[i] = ' ';
/*  82 */       } else if (plaintext.charAt(i) == '\n') {
/*  83 */         ciphertext[i] = '\n';
/*  84 */       } else if (plaintext.charAt(i) == '\t') {
/*  85 */         ciphertext[i] = '\t';
/*     */       } else {
/*  87 */         ciphertext[i] = this.vgnrSquare[row][col];
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */     System.out.println("\nPlaintext:  " + plaintext);
/*  97 */     System.out.println("Key:        " + key);
/*  98 */     return new String(ciphertext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String decrypt(String ciphertext, String key)
/*     */   {
/* 108 */     if ((keyHasSpace(key)) || (key.length() == 0)) {
/* 109 */       System.out.println("\nKey cannot contain a space!\n");
/* 110 */       return null; }
/* 111 */     if (ciphertext.length() == 0) {
/* 112 */       System.out.println("\nNothing to decrypt!\n");
/* 113 */       return null;
/*     */     }
/*     */     
/* 116 */     char[] plaintext = new char[ciphertext.length()];
/* 117 */     key = generateKey(ciphertext, key);
/*     */     
/* 119 */     for (int i = 0; i < plaintext.length; i++) {
/* 120 */       int row = this.alphnumv.indexOf(Character.valueOf(Character.toUpperCase(key.charAt(i))));
/* 121 */       int col = this.alphnumv.indexOf(Character.valueOf(Character.toUpperCase(ciphertext.charAt(i))));
/*     */       
/* 123 */       if (ciphertext.charAt(i) == ' ') {
/* 124 */         plaintext[i] = ' ';
/* 125 */       } else if (ciphertext.charAt(i) == '\n') {
/* 126 */         plaintext[i] = '\n';
/* 127 */       } else if (ciphertext.charAt(i) == '\t') {
/* 128 */         plaintext[i] = '\t';
/*     */       } else {
/* 130 */         int x = (col - row) % dim;
/*     */         
/* 132 */         if (x >= 0) {
/* 133 */           plaintext[i] = ((Character)this.alphnumv.elementAt(x)).toString().charAt(0);
/*     */         } else {
/* 135 */           plaintext[i] = ((Character)this.alphnumv.elementAt(dim + x)).toString().charAt(0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 140 */         plaintext[i] = Character.toLowerCase(plaintext[i]);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 145 */     System.out.println("\nCiphertext: " + ciphertext);
/* 146 */     System.out.println("Key:        " + key);
/* 147 */     return new String(plaintext);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String generateKey(String text, String key)
/*     */   {
/* 158 */     char[] newKey = new char[text.length()];
/* 159 */     int repeatFlag = 0;
/*     */     
/* 161 */     for (int i = 0; i < newKey.length; i++) {
/* 162 */       if (text.charAt(i) == ' ') {
/* 163 */         newKey[i] = ' ';
/*     */       } else {
/* 165 */         newKey[i] = key.charAt(repeatFlag);
/*     */         
/* 167 */         if (repeatFlag + 1 == key.length()) {
/* 168 */           repeatFlag = 0;
/*     */         } else {
/* 170 */           repeatFlag++;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 175 */     return new String(newKey);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean keyHasSpace(String key)
/*     */   {
/* 184 */     boolean answer = false;
/*     */     
/* 186 */     for (int i = 0; i < key.length(); i++) {
/* 187 */       if (key.charAt(i) == ' ') {
/* 188 */         answer = true;
/* 189 */         break;
/*     */       }
/*     */     }
/*     */     
/* 193 */     return answer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void print()
/*     */   {
/* 200 */     System.out.println();
/*     */     
/* 202 */     for (int i = 0; i < dim; i++) {
/* 203 */       for (int j = 0; j < dim; j++) {
/* 204 */         System.out.print(this.vgnrSquare[i][j] + " ");
/*     */         
/* 206 */         if (j == dim - 1) {
/* 207 */           System.out.println();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\farizie\Desktop\steganography viginare.jar!\stegano\gun\VigenereCipher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */