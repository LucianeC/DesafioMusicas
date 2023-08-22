package principal;

import musicas.modelo.MinhasPreferidas;
import musicas.modelo.Musica;
import musicas.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Amar não é pecado");
        musica.setArtista("Luan Santana");
        musica.setAlbum("2022");


        for (int i =0; i < 1000; i++){
            musica.reproduz();
        }
        for (int i = 0; i < 50; i++){
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Passos 1 Java");
        podcast.setDescricao("Aprenda a introdução de java e fique por dentro das atualizações");

        for (int i =0; i < 3000; i++){
            podcast.reproduz();
        }
        for (int i = 0; i < 1000; i++){
            podcast.curte();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}
