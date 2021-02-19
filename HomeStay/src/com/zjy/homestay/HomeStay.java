package com.zjy.homestay;

public class HomeStay {

    //初始化,初始5个房间
    public static Room initialization(){
        Room head = new Room();
        Room pnew = new Room();
        Room p = head;
        p.next = pnew;
        p = pnew;
        int i = 1;
        p.setNum(i);
        p.setType("山水之间");

        for(i=1;i<5;i++){
            pnew = new Room();
            p.next = pnew;
            p = pnew;
            p.setNum(i+1);
            if(i<3){
                p.setType("山水之间");
            }else{
                p.setType("农家风情");
            }
        }

        p.next = null;

        io.Printf("房间创建成功！");
        return head;
    }

    //遍历房间
    public static void display(Room head){
        Room p = head;
        System.out.print("房间号  房间类型    有无人居住   居住人姓名     性别  电话  身份证号");
        io.Printf();
        while(p.next!=null){
            p = p.next;
            System.out.print(p.getNum()+"     "+p.getType()+"      "+p.isStatue()+"    ");
            if(p.isStatue()==true){
                User x = p.getUser();
                System.out.print(x.getName()+"        "+x.getSex()+"  "+x.getTel()+"  "+x.getId());

            }
            io.Printf();

        }

    }

    //订房
    public static void book(Room head){
        Room p = head;
        boolean a = false;

        io.Printf("请输入您想预定的房间号：");
        int num = io.ScanfInt();
        while (p.next!=null){
            p=p.next;
            if(p.equals(num)==true){
                a = true;
                p.setStatue(true);
                break;
            }
        }
        if(a == false){
            io.Printf("没有找到该房间");
        }
        else {
            User user = p.getUser();
            io.Printf("请输入姓名：");
            String name = io.ScanfString();
            user.setName(name);

            io.Printf("请输入性别：");
            char sex = io.ScanfChar();
            user.setSex(sex);

            io.Printf("请输入联系电话：");
            String tel = io.ScanfString();
            user.setTel(tel);

            io.Printf("请输入身份证号：");
            String id = io.ScanfString();
            user.setId(id);
        }

    }

    //退房
    public static void rebook(Room head){
        Room p = head;
        boolean a = false;

        io.Printf("请输入您想退订的房间号：");
        int num = io.ScanfInt();
        while (p.next!=null){
            p=p.next;
            if(p.equals(num)==true){
                a = true;
                p.setStatue(true);
                break;
            }
        }
        if(a == false){
            io.Printf("没有找到该房间");
        }
        else {
            p.setStatue(false);
        }
    }

    //查找


    //修改


    //增加房间
   public static void AddRoom(Room head){
        Room p = head;
       while (p.next != null){
           p = p.next;
       }
        while(true) {
            io.Printf("是否要增加一个房间：是：1，否：2");
            int a = io.ScanfInt();
            if(a==1){

                Room pnew = new Room();
                io.Printf("请问这个房间是什么类型的？");
                String type = io.ScanfString();
                pnew.setStatue(false);
                pnew.setType(type);
                pnew.setNum(p.getNum()+1);
                p.next = pnew;
                p = p.next;
            }else{
                break;
            }

        }
   }

}
