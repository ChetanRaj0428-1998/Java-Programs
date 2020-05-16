import java.io.*; 
class CopyDataFiletoFile 
{ 
             public static void main(String args[])throws IOException 
        { 
              FileInputStream Fread =new FileInputStream("D:\\java prgms\\text.txt"); 
              FileOutputStream Fwrite=new FileOutputStream("D:\\java prgms\\2.txt") ; 
              System.out.println("File is Copied"); 
              int c; 
              while((c=Fread.read())!=-1) 
              Fwrite.write((char)c); 
              Fread.close(); 
              Fwrite.close(); 
         } 
} 
