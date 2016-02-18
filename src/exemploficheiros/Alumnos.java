package exemploficheiros;
/**
 *
 * @author ylagorebollar
 */
public class Alumnos {
    private String nome;
    private String telefono;
    private int nota;

    public Alumnos() {
    }

    public Alumnos(String nome, String telefono, int nota) {
        this.nome = nome;
        this.telefono = telefono;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nome=" + nome + ", telefono=" + telefono + ", nota=" + nota + '}';
    }
    
}
