package exemploficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ylagorebollar
 */
public class LerFicheiro {

    ArrayList<Alumnos> lista = new ArrayList();

    public void lerFich(String nomeFich) {
        //Creamos obxeto da clase File

        Scanner sc = null;

        try {
            File f = new File(nomeFich);
            sc = new Scanner(f);
            //Outra forma de facelo  Scanner sc=new Scanner(new File(nomFich));
            while (sc.hasNextLine()) {
                String res = sc.nextLine();
                System.out.println(res);
                //Tamen System.out.println(sc.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro1 " + ex.toString());
        } finally {
            sc.close();
        }

    }

    public void lerDatoFich(String nomFich) {
        Scanner ler = null;
        try {
            ler = new Scanner(new File(nomFich)).useDelimiter("\\s*,\\s*");//.useDelimiter:especifica el caracter por el que quiere que salte de linea

            while (ler.hasNext()) {
                System.out.println("** " + ler.next());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Erro2 " + ex.getMessage());

        } finally {
            if (ler != null) {
                ler.close();
            }
        }

    }

    public void lerNumeros(String nomFich) {
        Scanner ler = null;
        try {
            ler = new Scanner(new File(nomFich)).useDelimiter("\\s*,\\s*");//.useDelimiter:especifica el caracter por el que quiere que salte de linea

            while (ler.hasNextInt()) {
                System.out.println("** " + ler.nextInt());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Erro3 " + ex.getMessage());

        } finally {
            if (ler != null) {
                ler.close();
            }
        }

    }

    public ArrayList<Alumnos> lerRexistros(String nomeFich) {
        Scanner sc = null;
        try {
            File f = new File(nomeFich);
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String res = sc.nextLine();
                String[] datos = res.split(",");
                lista.add(new Alumnos(datos[0], datos[1], Integer.parseInt(datos[2])));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro1 " + ex.toString());
        } finally {
            sc.close();

        }
        return lista;

    }

    public void visualizarArray() {
        System.out.println(lista);

    }

    public void lerEscribirFich(String nomFichLec,String nomFichEsc) {
        Scanner ler = null;
        PrintWriter escribir=null;
        
        try {
            File l = new File(nomFichLec);
            File e = new File(nomFichEsc);
           
            ler = new Scanner(l);
            escribir=new PrintWriter(e);
            while (ler.hasNextLine()) {
                String res=ler.nextLine();
                String[]datos=res.split(",");
                if (Integer.parseInt(datos[2]) % 2 == 0) 
                    escribir.println(datos[0]+","+ datos[1]+","+ Integer.parseInt(datos[2]));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro no ficheiro" + ex.toString());
        } finally {
                ler.close();
                escribir.close();
            
        }
    }

}
