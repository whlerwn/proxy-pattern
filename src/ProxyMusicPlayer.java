public class ProxyMusicPlayer implements MusicPlayer{
    private String song;
    private RealMusicPlayer realMusicPlayer;

    public ProxyMusicPlayer(String song) {
        this.song = song;
    }

    @Override
    public void playMusic() {
        if (realMusicPlayer == null) {
            realMusicPlayer = new RealMusicPlayer(song);
        }
        realMusicPlayer.playMusic();
    }
}
