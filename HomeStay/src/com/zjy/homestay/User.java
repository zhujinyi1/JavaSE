package com.zjy.homestay;

public class User {

    private String name;
    private char sex;
    private String tel;
    private String id;

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public String getTel() {
        return tel;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        while (sex != 'm' && sex != 'f') {
            io.Printf("输入有误请重新输入");
            io.Printf("请输入性别：");
            sex = io.ScanfChar();
        }
        this.sex = sex;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString(){
        return this.name;
    }

    public boolean equals(int num){

        boolean b;
        if(this.name.compareTo(name)==0){
            b=true;
        }else{
            b=false;
        }
        return b;

    }
}
