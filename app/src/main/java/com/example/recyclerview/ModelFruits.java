package com.example.recyclerview;

class ModelFruits {

   String fruitsNames;
   Integer imageId;

    boolean isSelected;



    public void setGetSelected(boolean getSelected) {
        this.isSelected = getSelected;
    }


    ModelFruits(String fruitsNames, Integer imageId){

        this.fruitsNames=fruitsNames;
        this.imageId=imageId;
    }

}
