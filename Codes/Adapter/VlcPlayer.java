/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description VLCPlayer Class that implements the AdvancedMediaPlayer interface
 */

package es.ull.esit.pai.exposition.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
  @Override
  public void playVlc(String fileName) {
    System.out.println("Playing vlc file. Name: " + fileName);
  }
  
  @Override
  public void playMp4(String fileName) {
    // Do nothing
  }
}
