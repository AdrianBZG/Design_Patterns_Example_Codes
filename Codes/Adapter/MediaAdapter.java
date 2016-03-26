/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Adapter class implementing the MediaPlayer interface
 */

package es.ull.esit.pai.exposition.Adapter;

public class MediaAdapter implements MediaPlayer {
  private AdvancedMediaPlayer advancedMusicPlayer;
  
  public MediaAdapter(String audioType) {
    if(audioType.equalsIgnoreCase("vlc")) {
      advancedMusicPlayer = new VlcPlayer();
    } else if(audioType.equalsIgnoreCase("mp4")) {
      advancedMusicPlayer = new Mp4Player();
    }
  }
  
  @Override
  public void play(String audioType, String fileName) {
    if(audioType.equalsIgnoreCase("vlc")) {
      advancedMusicPlayer.playVlc(fileName);
    } else if(audioType.equalsIgnoreCase("mp4")) {
      advancedMusicPlayer.playMp4(fileName);;
    }
  }
}
