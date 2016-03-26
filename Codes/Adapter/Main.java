/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Class to use the AudioPlayer to play different types of audio formats
 */

package es.ull.esit.pai.exposition.Adapter;

public class Main {
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();
    
    audioPlayer.play("mp3", "beyond the horizon.mp3");
    audioPlayer.play("mp4", "alone.mp4");
    audioPlayer.play("vlc", "far far away.vlc");
    audioPlayer.play("avi", "mind me.avi");
  }
}
