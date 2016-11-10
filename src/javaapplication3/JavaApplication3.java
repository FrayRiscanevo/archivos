package app;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author elprendiz https://www.youtube.com/user/JleoD7
 */
public class ManejoDeArchivos {
    public static void main(String[] arg) throws URISyntaxException
    { 
        //File directorio = new File("C:\\Users\\elprendiz\\Documents\\NetBeansProjects\\Achivos");
        //File file = new File(directorio,"miarchivo.txt");
        //File file = new File("C:\\Users\\elprendiz\\Documents\\NetBeansProjects\\Achivos","miarchivo.txt");
        URI uri = new URI("file:///C:/Users/elprendiz/Documents/NetBeansProjects/Achivos/miarchivo.txt");
        File file = new File(uri);
        if(!file.exists())
        {   
            try{
             file.createNewFile();
             System.out.println(file.getName()+" Ha sido creado");
            }catch(IOException ex){ex.printStackTrace();}
             
        }else
        {
            try{
//             FileWriter fw = new FileWriter(file,true);
//             fw.append("Primera linea hola mundo");
//             fw.append("Continuadno segun texto");
//             fw.close();
               PrintWriter pw = new PrintWriter(file,"utf-8");
               pw.println("Primera linea");
               pw.println("Segunda linea");
               pw.println(" ");
               pw.printf("Hla mundo d/", 10);
                pw.println(" ");
                 pw.printf("Hola %s en %d veces", "mundo", 100);
               pw.close();
                 
           }catch(IOException ex){ex.printStackTrace();}
        }
        System.out.println("Nombre: "+file.getName());
        System.out.println("Ruta Absoluta: "+file.getAbsolutePath());
        System.out.println("Ruta: "+file.getPath());
        System.out.println("Se Puede leer: "+file.canRead());
        System.out.println("Se puede escribir: "+file.canWrite());
        System.out.println("Se puede executar: "+file.canExecute());
        System.out.println("Es Un directorio: "+file.isDirectory());
        System.out.println("Ultima Modificacion: "+file.lastModified());
        System.out.println("Tamaño: "+file.length());
    }       
}