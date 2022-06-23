public class MusicPlaybackService {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new ProxyMusicPlayer("The Rolling Stones - Under My Thumb");

        musicPlayer.playMusic();
    }
}
