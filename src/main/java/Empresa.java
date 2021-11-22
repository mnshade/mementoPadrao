import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private EmpresaPorte porte;
    private List<EmpresaPorte> memento = new ArrayList<EmpresaPorte>();

    public EmpresaPorte getPorte() {
        return this.porte;
    }

    public void setPorte(EmpresaPorte porte) {
        this.porte = porte;
        this.memento.add(this.porte);
    }

    public void restaurarPorte(int indice){
        if(indice < 0 || indice > this.memento.size() -1){
            throw new IllegalArgumentException("Índice inválido");
        }
        this.porte = this.memento.get(indice);
    }
    public List<EmpresaPorte> getPortes(){
        return this.memento;
    }
}
