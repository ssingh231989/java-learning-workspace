package com.designpattern;

/**
 * Adapter design patten is a bridge between the two incompatible interface
 * eg : a card reader is a adapter between phone and laptop to read data of memory card
 */
interface MediaPlayer {
    void play(String audioType, String fileName);
}

interface AdvanceMediaPlayer {
     void playVlc(String fileName);

     void playMp3(String fileName);
}

class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Play File from VLC");
    }

    @Override
    public void playMp3(String fileName) {

    }
}

class Mp3Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp3(String fileName) {
        System.out.println("Play File from Mp3");
    }
}

class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp3Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(fileName);

        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp3(fileName);
        }
    }
}

class AudioPlayer implements MediaPlayer{
MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }

    }
}

public class AdapterDesignPatten {

    public static void main(String args[]){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4","p1");
        audioPlayer.play("vlc","p2");
    }
}
