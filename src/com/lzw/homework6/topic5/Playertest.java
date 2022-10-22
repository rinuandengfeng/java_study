package com.lzw.homwork6.topic5;

public class Playertest {
    public static void main(String[] args) {
        //创建对象
        MusicPlayer mp = new MusicPlayer();
        mp.setFileName("hh.mp3");
        mp.volume = 20;
        System.out.printf("音乐播放器的音量为:%d",mp.volume);
        mp.play();
        mp.encodeAudio();
        mp.stop();
        mp.toString();

        VideoPlayer vp = new VideoPlayer();
        vp.setFileName("aa.mp4");
        vp.duration = 30;
        System.out.printf("视频持续时间为为:%d",vp.duration);
        vp.play();
        vp.encodeVideo();
        vp.stop();
        vp.toString();



//    VideoPlayer vp = new VideoPlayer();
    }



}
