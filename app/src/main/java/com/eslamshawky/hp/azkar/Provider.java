package com.eslamshawky.hp.azkar;

public class Provider {
    private String text;
    private int imagePlay,imagePause,imageZoomOut,imageZoomIn;

    public Provider(String text, int imagePlay, int imagePause, int imageZoomOut, int imageZoomIn) {
        this.text = text;
        this.imagePlay = imagePlay;
        this.imagePause = imagePause;
        this.imageZoomOut = imageZoomOut;
        this.imageZoomIn = imageZoomIn;
    }

    public Provider() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImagePlay() {
        return imagePlay;
    }

    public void setImagePlay(int imagePlay) {
        this.imagePlay = imagePlay;
    }

    public int getImagePause() {
        return imagePause;
    }

    public void setImagePause(int imagePause) {
        this.imagePause = imagePause;
    }

    public int getImageZoomOut() {
        return imageZoomOut;
    }

    public void setImageZoomOut(int imageZoomOut) {
        this.imageZoomOut = imageZoomOut;
    }

    public int getImageZoomIn() {
        return imageZoomIn;
    }

    public void setImageZoomIn(int imageZoomIn) {
        this.imageZoomIn = imageZoomIn;
    }
}
