package exemploficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ylagorebollar
 */
public class LerFicheiro {

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
                //Tamen Syste,.out.println(sc.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro1 " + ex.toString());
        } finally {
            sc.close();
        }

    }
}
