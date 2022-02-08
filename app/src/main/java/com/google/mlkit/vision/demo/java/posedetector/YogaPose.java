package com.google.mlkit.vision.demo.java.posedetector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YogaPose {
    private String name;
    private String video;
    private String[] Speech ;
    private List<HashMap> BodyPart;

    public YogaPose(String name, String video, List<HashMap> bodyPart, String[] speech){
        this.name = name;
        this.video = video;
        this.BodyPart = bodyPart;
        this.Speech = speech;
    }

    public static List<HashMap> addBodyPart(int firstJoint, int secondJoint, int thirdJoint, int angle){
        HashMap<String, Integer> bodyPartMap = new HashMap();
        List<HashMap> BodyPart = new ArrayList<>();
        bodyPartMap.put("firstjoint", firstJoint);
        bodyPartMap.put("secondjoint", secondJoint);
        bodyPartMap.put("thirdjoint", thirdJoint);
        bodyPartMap.put("Angle", angle);

        BodyPart.add(bodyPartMap);
        return BodyPart;
    }


    public String getName(){
        return name;
    }
    public String getVideo(){
        return video;
    }
    public List<HashMap> getBodyPart(){
        return BodyPart;
    }
    public String[] getSpeech(){
        return Speech;
    }
}
