//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IMensagem mensagem = new NotificadorWhatsapp();
        Biblioteca biblioteca = new Biblioteca(mensagem);
        UsuarioBiblioteca aluno = new Aluno(
                "Vinícius",
                5
        );
        UsuarioBiblioteca professor = new Professor(
                "Leandro",
                25
        );
        UsuarioBiblioteca visitante = new Visitante(
                "Gabriel",
                15
        );

        biblioteca.processarUsuarioBiblioteca(aluno);
        biblioteca.processarUsuarioBiblioteca(professor);
        biblioteca.processarUsuarioBiblioteca(visitante);
    }
}