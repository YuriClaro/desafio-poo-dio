import Apps.*;

public class IPhone implements Call, Camera, Explorer, Maps, MusicApp{

    @Override
    public void selectMusic(String music) {
        System.out.println("Música selecionada");
    }

    @Override
    public void play() {
        System.out.println("Música tocando...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada");
    }

    @Override
    public void next() {
        System.out.println("Avançando para a próxima música");
    }

    @Override
    public void retry() {
        System.out.println("Retocando a música");
    }

    @Override
    public void stop() {
        System.out.println("Parando a música");
    }

    @Override
    public void startPoint(String startPoint) {
        System.out.println("Ponto de partida selecionado");
    }

    @Override
    public void endPoint(String endPoint) {
        System.out.println("Destino selecionado");
    }

    @Override
    public void startRoute() {
        System.out.println("Rota sendo iniciada");
    }

    @Override
    public void searchExplorer(String url) {
        System.out.println("Pesquisando website");
    }

    @Override
    public void openWindow() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void closeWindow() {
        System.out.println("Aba fechada");
    }

    @Override
    public void updateWindow() {
        System.out.println("Aba atualizada");
    }

    @Override
    public void takePhoto() {
        System.out.println("Tirando a foto");
    }

    @Override
    public void startRec() {
        System.out.println("Iniciando filmagem");
    }

    @Override
    public void stopRec() {
        System.out.println("Parando imagem");
    }

    @Override
    public void viewGallery() {
        System.out.println("Acessando a galeria");
    }

    @Override
    public void discNumber(int number) {
        System.out.println("Discando o número");
    }

    @Override
    public void callNumber() {
        System.out.println("Ligando para o número");
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void endCall() {
        System.out.println("Encerrando ligação");
    }
    
}
