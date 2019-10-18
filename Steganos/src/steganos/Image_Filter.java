/*    */ package steganos;
/*    */ 
/*    */ import java.io.File;
/*    */ import javax.swing.filechooser.FileFilter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Image_Filter
/*    */   extends FileFilter
/*    */ {
/*    */   protected boolean isImageFile(String ext)
/*    */   {
/* 18 */     return (ext.equals("jpg")) || (ext.equals("png"));
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean accept(File f)
/*    */   {
/* 24 */     if (f.isDirectory())
/*    */     {
/* 26 */       return true;
/*    */     }
/*    */     
/* 29 */     String extension = getExtension(f);
/* 30 */     if ((extension.equals("jpg")) || (extension.equals("png")))
/*    */     {
/* 32 */       return true;
/*    */     }
/* 34 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */   public String getDescription()
/*    */   {
/* 40 */     return "Supported Image Files";
/*    */   }
/*    */   
/*    */   protected static String getExtension(File f)
/*    */   {
/* 45 */     String s = f.getName();
/* 46 */     int i = s.lastIndexOf('.');
/* 47 */     if ((i > 0) && (i < s.length() - 1))
/* 48 */       return s.substring(i + 1).toLowerCase();
/* 49 */     return "";
/*    */   }
/*    */ }


/* Location:              C:\Users\farizie\Desktop\steganography viginare.jar!\stegano\gun\Image_Filter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */