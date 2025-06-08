package Projetos_Final_CursoEmVideo;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int like;
    private boolean reproduzindo;
    private int deslike;

    public Video(String titulo){
        setTitulo(titulo);
        this.avaliacao = 0;
        this.views = 0;
        this.like = 0;
        this.deslike = 0;
        this.reproduzindo = false;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getAvaliacao(){
        return this.avaliacao;
    }
    public void setAvaliacao(int avaliacao){
        this.avaliacao = (this.avaliacao + avaliacao)/this.views;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return like;
    }

    public void setCurtidas(int curtidas) {
        this.like = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getDeslike() {
        return deslike;
    }

    public void setDeslike(int deslike) {
        this.deslike = deslike;
    }

    @Override
    public void play() {
        setReproduzindo(true);
        setViews(getViews() + 1);
    }

    @Override
    public void pause() {
        setReproduzindo(false);

    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    @Override
    public void deslike() {
        setDeslike(getDeslike() + 1);
    }

    @Override
    public String toString() {
        return "Título = " + titulo +
                "; avaliacao = " + avaliacao +
                "; views = " + views +
                "; like = " + like +
                "; reproduzindo = " + reproduzindo +
                "; deslike = " + deslike;
    }
}
