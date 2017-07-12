package com.niaj_7991tnahira.miwok;



public class Word {

    private String miwokWord;
    private String englishWord;
    private int NO_IMAGE_FOUND = -1;
    private int imageResource = NO_IMAGE_FOUND;
    private int mmusicResourceId;

    Word( String englishWord,String miwokWord,int mmusicResourceId){
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.mmusicResourceId = mmusicResourceId;

    }

    public void setMusicResourceId(int mmusicResourceId) {
        this.mmusicResourceId = mmusicResourceId;
    }

    public int getMusicResourceId() {

        return mmusicResourceId;
    }

    Word(String englishWord, String miwokWord, int imageResource, int mmusicResourceId) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.imageResource = imageResource;
        this.mmusicResourceId = mmusicResourceId;

    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public int getImageResource() {
        return imageResource;
    }

    public boolean hasImage(){
       return imageResource != NO_IMAGE_FOUND;
    }
}
