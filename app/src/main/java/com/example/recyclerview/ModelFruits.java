package com.example.recyclerview;

public class ModelFruits {

    public String fruitsNames;
    public int imageId;

    public boolean isSelected;



    public void setGetSelected(boolean getSelected) {
        this.isSelected = getSelected;
    }


    public ModelFruits(String fruitsNames, int imageId){

        this.fruitsNames=fruitsNames;
        this.imageId=imageId;


    }


}
