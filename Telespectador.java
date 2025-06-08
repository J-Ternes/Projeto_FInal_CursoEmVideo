package Projetos_Final_CursoEmVideo;

public class Telespectador extends Pessoa {
    private String login;
    private int totalAssistido;

    public Telespectador(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.totalAssistido = 0;
    }

    public void assistiuUmVideo(){
        setTotalAssistido(getTotalAssistido() + 1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "nome = " + nome +
                "; idade = " + idade +
                "; sexo = " + sexo +
                "; totalAssistido = " + totalAssistido +
                '\n';
    }
}



