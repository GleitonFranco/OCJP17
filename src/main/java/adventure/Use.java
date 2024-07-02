package adventure;

public enum Use {
    CONTAINER("Contêiner"),
    WEAPON("Arma"),
    DESTROY("Quebrar"),
    KEY("Chave"),
    SCROLL("Manuscrito"),
    HEALING("Cura");

    Use(String nome) {
        this.nome = nome;
    }

    private final String nome;
    public String getNome() {return nome;}
}
