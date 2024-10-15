package com.nwa.practical4;

public class ModelClass {
    String name,contact_no;
    int imageId;

    public ModelClass(String name,String contact_no,int imageId){
        this.name = name;
        this.contact_no = contact_no;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getContact_no() {
        return contact_no;
    }

    public int getImageId() {
        return imageId;
    }

}
