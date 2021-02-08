package com.company;

import java.util.LinkedList;

public class lab14 {
    public LinkedList<Video> videoList = new LinkedList<>();
    public lab14(){
        addVideo("a");
        addVideo("b");
        addVideo("c");
    }
    private void addVideo(String o){
        Video vid = new Video(o);
        videoList.add(vid);
    }
}

class Video {

    public static Object title;
    public static boolean isRent;

    public Video(String t){
        title = t;
        isRent = false;
    }
    public static void setisRent(boolean bool){
        isRent = bool;
    }

    public String toString(){
        return title.toString();
    }
}
