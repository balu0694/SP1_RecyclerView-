package com.balu0694.sp1_recyclerview;

class ListItem {

    private String head;
    private String desc;
    private String imgUrl;

    ListItem(String head, String desc, String imgUrl) {
        this.head = head;
        this.desc = desc;
        this.imgUrl = imgUrl;
    }

    String getHead() {
        return head;
    }

    String getDesc() {
        return desc;
    }

    String getImgUrl() {
        return imgUrl;
    }
}
