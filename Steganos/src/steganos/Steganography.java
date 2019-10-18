/*     */ package steganos;
/*     */ 
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.DataBufferByte;
/*     */ import java.awt.image.WritableRaster;
/*     */ import java.io.File;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.JOptionPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Steganography
/*     */ {
/*     */   public String encrypt(String text, String key)
/*     */   {
/*  20 */     char[] karakter = text.toCharArray();
/*  21 */     String cipherText = "";
/*  22 */     for (int j = 0; j < karakter.length; j++) {
/*  23 */       key = key + (j + 2);
/*     */     }
/*  25 */     for (int i = 0; i < karakter.length; i++) {
/*  26 */       cipherText = cipherText + (char)(('' + karakter[i] + key.charAt(i)) % 128);
/*     */     }
/*  28 */     return cipherText;
/*     */   }
/*     */   
/*     */   public String Decrypt(String text, String key1)
/*     */   {
/*  33 */     char[] karakter = text.toCharArray();
/*  34 */     String cipherText = "";
/*  35 */     for (int j = 0; j < karakter.length; j++) {
/*  36 */       key1 = key1 + (j + 2);
/*     */     }
/*  38 */     for (int i = 0; i < karakter.length; i++) {
/*  39 */       cipherText = cipherText + (char)(('' + karakter[i] - key1.charAt(i)) % 128);
/*     */     }
/*     */     
/*  42 */     return cipherText;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean encode(String path, String original, String ext1, String stegan, String message)
/*     */   {
/*  48 */     String file_name = image_path(path, original, ext1);
/*  49 */     BufferedImage image_orig = getImage(file_name);
/*     */     
/*     */ 
/*  52 */     BufferedImage image = user_space(image_orig);
/*  53 */     image = add_text(image, message);
/*     */     
/*  55 */     return setImage(image, new File(image_path(path, stegan, "png")), "png");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String decode(String path, String name)
/*     */   {
/*     */     try
/*     */     {
/*  64 */       BufferedImage image = user_space(getImage(image_path(path, name, "png")));
/*  65 */       byte[] decode = decode_text(get_byte_data(image));
/*  66 */       return new String(decode);
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*  70 */       JOptionPane.showMessageDialog(null, "Tidak ada pesan yang tersembunyi di dalam gambar yang dipilih", "Error", 0);
/*     */     }
/*     */     
/*  73 */     return "";
/*     */   }
/*     */   
/*     */ 
/*     */   private String image_path(String path, String name, String ext)
/*     */   {
/*  79 */     return path + "/" + name + "." + ext;
/*     */   }
/*     */   
/*     */   private BufferedImage getImage(String f)
/*     */   {
/*  84 */     BufferedImage image = null;
/*  85 */     File file = new File(f);
/*     */     
/*     */     try
/*     */     {
/*  89 */       image = ImageIO.read(file);
/*     */     }
/*     */     catch (Exception ex)
/*     */     {
/*  93 */       JOptionPane.showMessageDialog(null, "Gambar Tidak dapat Dibaca!", "Error", 0);
/*     */     }
/*     */     
/*  96 */     return image;
/*     */   }
/*     */   
/*     */   private boolean setImage(BufferedImage image, File file, String ext)
/*     */   {
/*     */     try {
/* 102 */       file.delete();
/* 103 */       ImageIO.write(image, ext, file);
/* 104 */       return true;
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 108 */       JOptionPane.showMessageDialog(null, "Gambar Tidak dapat Disimpan!", "Error", 0);
/*     */     }
/* 110 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private BufferedImage add_text(BufferedImage image, String text)
/*     */   {
/* 117 */     byte[] img = get_byte_data(image);
/* 118 */     byte[] msg = text.getBytes();
/* 119 */     byte[] len = bit_conversion(msg.length);
/*     */     try
/*     */     {
/* 122 */       encode_text(img, len, 0);
/* 123 */       encode_text(img, msg, 32);
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 127 */       JOptionPane.showMessageDialog(null, "Target File cannot hold message!", "Error", 0);
/*     */     }
/*     */     
/* 130 */     return image;
/*     */   }
/*     */   
/*     */ 
/*     */   private BufferedImage user_space(BufferedImage image)
/*     */   {
/* 136 */     BufferedImage new_img = new BufferedImage(image.getWidth(), image.getHeight(), 5);
/* 137 */     Graphics2D graphics = new_img.createGraphics();
/* 138 */     graphics.drawRenderedImage(image, null);
/* 139 */     graphics.dispose();
/* 140 */     return new_img;
/*     */   }
/*     */   
/*     */   private byte[] get_byte_data(BufferedImage image)
/*     */   {
/* 145 */     WritableRaster raster = image.getRaster();
/* 146 */     DataBufferByte buffer = (DataBufferByte)raster.getDataBuffer();
/* 147 */     return buffer.getData();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private byte[] bit_conversion(int i)
/*     */   {
/* 158 */     byte byte3 = (byte)((i & 0xFF000000) >>> 24);
/* 159 */     byte byte2 = (byte)((i & 0xFF0000) >>> 16);
/* 160 */     byte byte1 = (byte)((i & 0xFF00) >>> 8);
/* 161 */     byte byte0 = (byte)(i & 0xFF);
/*     */     
/* 163 */     return new byte[] { byte3, byte2, byte1, byte0 };
/*     */   }
/*     */   
/*     */ 
/*     */   private byte[] encode_text(byte[] image, byte[] addition, int offset)
/*     */   {
/* 169 */     if (addition.length + offset > image.length)
/*     */     {
/* 171 */       throw new IllegalArgumentException("File not long enough!");
/*     */     }
/*     */     
/* 174 */     for (int i = 0; i < addition.length; i++)
/*     */     {
/*     */ 
/* 177 */       int add = addition[i];
/* 178 */       for (int bit = 7; bit >= 0; offset++)
/*     */       {
/*     */ 
/*     */ 
/* 182 */         int b = add >>> bit & 0x1;
/*     */         
/*     */ 
/* 185 */         image[offset] = ((byte)(image[offset] & 0xFE | b));bit--;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 188 */     return image;
/*     */   }
/*     */   
/*     */   private byte[] decode_text(byte[] image)
/*     */   {
/* 193 */     int length = 0;
/* 194 */     int offset = 32;
/*     */     
/* 196 */     for (int i = 0; i < 32; i++)
/*     */     {
/* 198 */       length = length << 1 | image[i] & 0x1;
/*     */     }
/*     */     
/* 201 */     byte[] result = new byte[length];
/*     */     
/*     */ 
/* 204 */     for (int b = 0; b < result.length; b++)
/*     */     {
/*     */ 
/* 207 */       for (int i = 0; i < 8; offset++)
/*     */       {
/*     */ 
/* 210 */         result[b] = ((byte)(result[b] << 1 | image[offset] & 0x1));i++;
/*     */       }
/*     */     }
/* 213 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\farizie\Desktop\steganography viginare.jar!\stegano\gun\Steganography.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */