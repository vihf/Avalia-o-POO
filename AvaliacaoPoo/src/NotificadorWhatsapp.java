public class NotificadorWhatsapp implements IMensagem {
    @Override
    public void notificar(String mensagem, UsuarioBiblioteca usuario) {
        System.out.println("Enviando mensagem de Whatsapp para: " +
                usuario.getNome() +
                ". Conteúdo: " +
                mensagem);
    }
}
