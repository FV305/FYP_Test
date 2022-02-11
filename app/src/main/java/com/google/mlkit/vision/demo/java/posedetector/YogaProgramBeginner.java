package com.google.mlkit.vision.demo.java.posedetector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YogaProgramBeginner {
    List<YogaPose> YogaProgram = new ArrayList<YogaPose>();

    public YogaProgramBeginner(){
        addYoga(new YogaPose("abc","video",YogaPose.addBodyPart(15,23,27,150 ,16,24,28,150),new String[]{"good", "perfect"}));
        addYoga(new YogaPose("abc","video",YogaPose.addBodyPart(11,13,15,150 ,12,14,16,150),new String[]{"good", "perfect"}));

    }
    public void addYoga(YogaPose yogaPose){
        YogaProgram.add(yogaPose);
    }

    public List<YogaPose> getProgram(){
        return YogaProgram;
    }
}
