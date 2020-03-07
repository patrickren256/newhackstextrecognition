package com.example.android.newhackstextrecognition;

import java.util.ArrayList;

public class Storyboard {

    private String scene_text;

    private Storyboard previous_scene;
    private ArrayList<Storyboard> paths;

    public Storyboard(String scene) {
    }

    public String getSceneText() {
        return scene_text;
    }

    public Storyboard getPrevious_scene() {
        return previous_scene;
    }

    public ArrayList<Storyboard> getPaths() {
        return paths;
    }

    public void addPath(Storyboard newPath) {
        this.paths.add(newPath);
    }
}
