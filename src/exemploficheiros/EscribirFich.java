package exemploficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


/**
 *
 * @author ylagorebollar
 */
public class EscribirFich {
    public void escribir(String nomeFich){
        File f=new File(nomeFich);       
        PrintWriter escribir=null;
        try {
            //Abrimos ficheiro para escribir
           escribir =new PrintWriter(f);
           for(int i=0;i<4;i++)
           escribir.println(i);
        } catch (FileNotFoundException ex) {
             System.out.println("Erro escritura " + ex.getMessage());            
        }
        finally{
            escribir.close();
            
        }
    }
}
