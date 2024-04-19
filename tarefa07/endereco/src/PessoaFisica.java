import java.util.*;

public class PessoaFisica {
    
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private Set<Endereco> enderecos;

    public void adicionarEndereco(Endereco e) {
        enderecos.add(e);
    }

    public void removerEndereco(Endereco e) {
        enderecos.remove(e);
    }
}
