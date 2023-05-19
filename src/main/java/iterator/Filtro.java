package iterator;

import java.util.Iterator;

public class Filtro {

    public static Integer contarMusicasRock(Playlist playlist) {
        int quantidade = 0;
        for (Musica musica : playlist) {
            if (musica.getEstiloMusical().equals("Rock")) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarMusicasMetal(Playlist playlist) {
        int quantidade = 0;
        for (Musica musica : playlist) {
            if (musica.getEstiloMusical().equals("Metal")) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMusicas(Playlist playlist) {
        int quantidade = 0;
        for (Iterator a = playlist.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
