package exemploficheiros;

import java.io.File;

/**
 *
 * @author ylagorebollar
 */
public class ExemploFicheiros {
    public static void main(String[] args) {
      LerFicheiro obxLer=new LerFicheiro();
      EscribirFich f=new EscribirFich();
     // obxLer.lerFich("nomes");
     // obxLer.lerFich("/datos/local/ylagorebollar/NetBeansProjects/ExemploFicheiros/nomes");
      /*Para windows: (tamen se pode por igual que en linux ca barra "/")
      obxLer.lerFich("\\datos\\local\\ylagorebollar\\NetBeansProjects\\ExemploFicheiros\\nomes");*/
      //obxLer.lerFich("/datos/local/ylagorebollar/Desktop/letras");
      //Outra forma e creando un obxeto de tipo separator
      /*String sep=File.separator;
      obxLer.lerFich(sep+"datos"+sep+"local"+sep+"ylagorebollar"+sep+"Desktop"+sep+"letras");*/
     /* obxLer.lerDatoFich("/datos/local/ylagorebollar/Desktop/letras");
      obxLer.lerDatoFich("nomes");
      obxLer.lerNumeros("numeros");
      //obxLer.lerRexistros("alumnos");*/
      //obxLer.visualizarArray();
      f.escribir("num");
      obxLer.lerEscribirFich("notasPares");
    }
    
}
