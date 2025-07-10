public abstract class UsuarioBiblioteca {
    protected String nome;
    protected int diasAtraso;

    public UsuarioBiblioteca(String nome, int diasAtraso) {
        this.nome = nome;
        this.diasAtraso = diasAtraso;
    }

    public abstract double calcularMulta();

    public void getResumo() {
        System.out.println("Nome: " + nome + " - Dias em atraso: " + diasAtraso);
    }

    public String getNome() {
        return nome;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }
}