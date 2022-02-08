package com.google.mlkit.vision.demo.java.posedetector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YogaProgramBeginner {
    List<YogaPose> YogaProgram;
    final String NAME = "NAME";
    final String VIDEO = "VIDEO";
    final String SPEECH = "SPEECH";
    final String BODYPART = "BODYPART";

    public YogaProgramBeginner(){

        YogaPose yogaPose = new YogaPose("abc","video",YogaPose.addBodyPart(23,25,27,180),new String[]{"good", "perfect"});

        addYoga(yogaPose);
    }
    public void addYoga(YogaPose yogaPose){
        YogaProgram = new ArrayList<YogaPose>();
        YogaProgram.add(yogaPose);
    }

    public List<YogaPose> getProgram(){
        return YogaProgram;
    }
}
