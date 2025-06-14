package Projetos_Final_CursoEmVideo;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public Pessoa (String nome, int idade, String sexo){
        setIdade(idade);
        setNome(nome);
        setSexo(sexo);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
