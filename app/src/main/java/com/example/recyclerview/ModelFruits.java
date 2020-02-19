package com.example.recyclerview;

class ModelFruits {

   String fruitsNames;
   int imageId;

    boolean isSelected;



    void setGetSelected(boolean getSelected) {
        this.isSelected = getSelected;
    }


    ModelFruits(String fruitsNames, int imageId){

        this.fruitsNames=fruitsNames;
        this.imageId=imageId;
    }
}
