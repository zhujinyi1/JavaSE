package com.zjy.homestay;

public class Room {

    private int num;          //房间号
    private String type;      //类型
    private boolean statue;   //有无人住
    private User user = new User();        //居住者
    Room next;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getNum() {
        return num;
    }

    public boolean isStatue() {
        return statue;
    }

    public String getType() {
        return type;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setStatue(boolean statue) {
        this.statue = statue;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return this.type;
    }

    public boolean equals(int num){

        boolean b;
        if(this.num==num){
            b=true;
        }else{
            b=false;
        }
        return b;

    }
}
