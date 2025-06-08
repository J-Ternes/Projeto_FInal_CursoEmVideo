package Projetos_Final_CursoEmVideo;

public class Main {
    public static void main(String[] args) {
       Video v[] = new Video[3];
        v[0] = new Video("Aula de Java");
        v[1] = new Video("Aula de POO");
        v[2] = new Video("Aula de SpringBoot");


        Telespectador p[] = new Telespectador[2];
        p[0] = new Telespectador("Jonathan", 27, "Masculino","j.ternes");
        p[1] = new Telespectador("Nataly",39,"Feminino","N.Gardona");


        Visualizacao vis = new Visualizacao(p[0], v[0]);
     System.out.println(vis.toString());
    }
    }

