package com.lzw.homwork6.topic5;

//视频播放器
public class VideoPlayer extends Player{
    public int duration;

    //无参构造方法
    public VideoPlayer(){
        System.out.println("VideoPlayer对象创建成功^_^");
    }


    //视频解码
    public void encodeVideo(){
        String fileName = super.getFileName();
        System.out.println(fileName+"视频文件正在进行解码");
    }
}
