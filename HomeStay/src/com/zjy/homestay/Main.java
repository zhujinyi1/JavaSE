package com.zjy.homestay;

public class Main {
    public static void main(String[] args) {
        Room head = null;
        io.Printf("欢迎来到民宿管理系统Java版");
        Loop :while(true){

            io.Printf("------菜单------");
            io.Printf("1.初始化");
            io.Printf("2.遍历房间");
            io.Printf("3.订房");
            io.Printf("4.退房");
            io.Printf("5.增加房间");
            io.Printf("0.退出");
            io.Printf("---------------");
            io.Printf("请输入您的选择：");
            int x = io.ScanfInt();
            switch(x){
                case 1:
                    head = HomeStay.initialization();
                    break;
                case 2:
                    HomeStay.display(head);
                    break;
                case 3:
                    HomeStay.book(head);
                    break;
                case 4:
                    HomeStay.rebook(head);
                    break;
                case 5:
                    HomeStay.AddRoom(head);
                    break;
                default :
                    break Loop;
            }
        }
    }

}
