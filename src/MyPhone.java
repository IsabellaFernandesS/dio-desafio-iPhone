public class MyPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Adicionando os atributos do reprodutor musical
    private String currentTrack;

    // Implementação dos métodos do reprodutor musical
    @Override
    public void play() {
        System.out.println("Playing " + currentTrack);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + currentTrack);
    }

    @Override
    public void selectMusic(String track) {
        currentTrack = track;
        System.out.println("Selected music: " + currentTrack);
    }

    // Implementação dos métodos do aparelho telefônico
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Answering call.");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Starting voicemail.");
    }

    // Implementação dos métodos do navegador web
    @Override
    public void openPage(String url) {
        System.out.println("Opening page " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding new tab.");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page.");
    }
}

