/**
 * @Author Rudolf Cicko & Adrián Rodríguez Bazaga
 * @Description Mp4Player Class that implements the AdvancedMediaPlayer interface
 */

package es.ull.esit.pai.exposition.Adapter;

public class Mp4Player implements AdvancedMediaPlayer {
  @Override
  public void playVlc(String fileName) {
    // Do nothing
  }
  
  @Override
  public void playMp4(String fileName) {
    System.out.println("Playing mp4 file. Name: " + fileName);
  }
}
