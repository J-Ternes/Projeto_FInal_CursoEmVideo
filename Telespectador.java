package Projetos_Final_CursoEmVideo;

public class Telespectador extends Pessoa {
    private String login;
    private int totalDeVideosAssistidos;

    public Telespectador(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.totalDeVideosAssistidos = 0;
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
        return totalDeVideosAssistidos;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalDeVideosAssistidos = totalAssistido;
    }

    @Override
    public String toString() {
        return "nome = " + nome +
                "; idade = " + idade +
                "; sexo = " + sexo +
                "; totalAssistido = " + totalDeVideosAssistidos +
                '\n';
    }
}



