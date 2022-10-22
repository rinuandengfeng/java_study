package com.lzw.homwork6.topic5;

//音频播放器
public class MusicPlayer extends Player {
    public int volume;

    //无参构造方法
    public MusicPlayer() {
        System.out.println("MusicPlayer对象创建成功^_^");
    }

    public MusicPlayer(String fileName, int volume) {
        super(fileName);
        this.volume = volume;
    }

    //音频解码
    public void encodeAudio() {
        String fileName = super.getFileName();
        System.out.println(fileName + "音频文件正在进行解码");
    }
}
