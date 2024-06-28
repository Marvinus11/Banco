import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<IConta> contaList;

    public Banco(String nome) {
        this.nome = nome;
        this.contaList = new ArrayList<IConta>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<IConta> getContaList() {
        return contaList;
    }

    public void setContaList(List<IConta> contaList) {
        this.contaList = contaList;
    }
}
