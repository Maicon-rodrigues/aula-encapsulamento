package CadastrodoPet;

// criarr atributos para serem acessados apenas pela classe responsavel.
public class Responsavel {
    private String nome; //private pra proteger o nome, caso tente ser modificado.
    private String sobrenome; //private pra proteger o sobrenome, caso tente ser modificado.
    private String cep;  //private pra proteger o cep, caso tente ser modificado.
    private String numeroResidencial; //private pra proteger o numeroResidencial, caso tente ser modificado.
    private int idade; //private pra proteger o idade, caso tente ser modificado.
    private String email;
    private String telefone;

    public Responsavel(String nome, String sobrenome, String cep, String numeroResidencial, int idade, String email, String telefone) {
        this.nome = nome; //chama a string nome
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.numeroResidencial = numeroResidencial;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    // Metodo que nao retornar um valor e apenas imprime os dados basicos do dono do pet
    public void retornarDadosResponsavel() {
        if (nome == "maicon") {
            System.out.println("esse cara é do bem");
        }
        System.out.println("Nome: " + nome + "\n" + "E-mail: " + email);
    }


    public String retornarTodosDados() {
        return "Responsavel{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cep='" + cep + '\'' +
                ", numeroResidencial='" + numeroResidencial + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public boolean verificarMaioridade(int idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroResidencial() {
        return numeroResidencial;
    }

    public void setNumeroResidencial(String numeroResidencial) {
        this.numeroResidencial = numeroResidencial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
