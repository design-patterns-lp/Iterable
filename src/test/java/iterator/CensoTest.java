package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CensoTest {

    @Test
    void deveContarQuantidadeMusicasRock(){
        Playlist playlist = new Playlist(
                new Musica("Acid Rain", "Rock"),
                new Musica("5 Minutes Alone", "Metal"),
                new Musica("Save Me", "Rock"),
                new Musica("Con Te Partiro", "Opera")
        );
        assertEquals(2, Filtro.contarMusicasRock(playlist));
    }

    @Test
    void deveContarTotalMusicas(){
        Playlist playlist = new Playlist(
                new Musica("Acid Rain", "Rock"),
                new Musica("5 Minutes Alone", "Metal"),
                new Musica("Save Me", "Rock"),
                new Musica("Con Te Partiro", "Opera")
        );
        assertEquals(4, Filtro.contarTotalMusicas(playlist));
    }

    @Test
    void deveContarQuantidadeMusicasMetal(){
        Playlist playlist = new Playlist(
                new Musica("Acid Rain", "Rock"),
                new Musica("5 Minutes Alone", "Metal"),
                new Musica("Save Me", "Rock"),
                new Musica("Con Te Partiro", "Opera")
        );
        assertEquals(1, Filtro.contarMusicasMetal(playlist));
    }

}