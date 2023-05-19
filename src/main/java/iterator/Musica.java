package iterator;

public class Musica {

    private String nome;
    private String estiloMusical;

    public Musica(String nome, String estiloMusical) {
        this.nome = nome;
        this.estiloMusical = estiloMusical;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }
}
