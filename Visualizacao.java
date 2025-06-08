package Projetos_Final_CursoEmVideo;

public class Visualizacao {
    private Telespectador espectador;
    private Video video;

    public Visualizacao(Telespectador espectador, Video video){
        setEspectador(espectador);
        setVideo(video);
        video.play();
        video.setViews(1);
        espectador.assistiuUmVideo();
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Telespectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Telespectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Espectador: " + " " + espectador +
                "Video assistido: " + " " + video;
    }
}
