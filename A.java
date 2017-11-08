  
public class FileExample {  
public static void main(String[] args) {  
    File f=new File("/Users/sonoojaiswal/Documents");  
    String filename[]=f.list();  
    for(String filename:filename){  
        System.out.println(filename);  
    }  
}  
}  
