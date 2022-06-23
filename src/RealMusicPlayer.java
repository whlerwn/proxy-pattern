public class RealMusicPlayer implements MusicPlayer {
    private String song;

    public RealMusicPlayer(String song) {
        this.song = song;
        download();
    }
    public void download() {
        System.out.println("Downloading the song " + song + "...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing the song " + song + "...");
    }
}
