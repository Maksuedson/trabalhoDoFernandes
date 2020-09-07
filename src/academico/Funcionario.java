package academico;

import java.util.*;

public class Funcionario extends Pessoa {

    private String registro;
    private String funcao;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


    /**
     * @return the endereco
     */
    public String exibir(ArrayList pessoas) {
        if (pessoas.isEmpty()) {
            return "Não há registros de alunos.";
        } else {
            for (int i = 0; i < pessoas.size(); i++) {
                Funcionario a = (Funcionario) pessoas.get(i);
                System.out.println("ID: " + pessoas.indexOf(a) + 1);
                System.out.println("Nome: " + a.getNome());
                System.out.println("Telefone: " + a.getTelefone());
                System.out.println("Sexo: " + a.getSexo());
                System.out.println("Endereço:\nRua: " + a.getEndereco().getRua()
                        + "          Número: " + a.getEndereco().getNumero()
                        + "\nBairro: " + a.getEndereco().getBairro()
                        + "          Cidade: " + a.getEndereco().getCidade()
                        + "          UF: " + a.getEndereco().getUf());
                System.out.println("REGISTRO: " + a.getRegistro());
                System.out.println("Função : " + a.getFuncao());
                System.out.println("————————————————————————————————");
            }
        }
        return "";
    }
}
