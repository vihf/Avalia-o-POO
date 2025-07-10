public class Biblioteca {

    private IMensagem mensagem;

    public Biblioteca(IMensagem mensagem){
        this.mensagem = mensagem;
    }

    public void processarUsuarioBiblioteca(UsuarioBiblioteca func) {
        func.getResumo();
        int atraso = func.getDiasAtraso();
        double multa = func.calcularMulta();
        mensagem.notificar(
                "O valor da multa é R$ " + String.format("%.2f", multa), func
        );
    }
}
