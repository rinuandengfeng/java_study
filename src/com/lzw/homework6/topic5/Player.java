package com.lzw.homwork6.topic5;

//播放器
public abstract class Player {
    private String fileName;

    //无参构造方法
    public  Player(){
        System.out.println("Player对象创建成功^_^");
    };
    public Player(String fileName){
        this.fileName = fileName;
    }

    //得到fileName
    public String getFileName(){
        return this.fileName;
    }
    //修改fileName
    public void setFileName(String fileName){
        this.fileName = fileName;
    }


    //播放方法
    public void play(){
        System.out.println("正在准备播放……");
    }
    //停止方法
    public void stop(){
        System.out.println("停止播放中……");
    }


}
