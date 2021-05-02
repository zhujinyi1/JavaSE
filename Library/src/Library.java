import com.zjy.util.util;

import java.security.DrbgParameters;
import java.util.Scanner;

public class Library {
    public static void menu() {

        Book head = null;
        if(null == head){
            head = load();
        }

        User uhead = null;
        if(null == uhead){
            uhead = uload();
        }


        Loop:while(true){

            String name;
            User p = null;

            util.print("1.添加一本书");
            util.print("2.创建用户");
            util.print("3.借书");
            util.print("4.遍历用户");
            util.print("5.遍历书籍");
            util.print("6.还书");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch(i){
                case 1:
                    head = addBook(head);
                    break;
                case 2:
                    uhead = uload();
                    break;
                case 3:
                    util.print("请输入借书的用户");
                    name = sc.nextLine();
                    p = uhead;
                    while( !p.equals(name) && null != p ){
                        p = p.getUser();
                    }
                    if(p == null){
                        util.print("没这个人");
                    }else{
                        p.borrow(head);
                    }
                    break;
                case 4:
                    displayU(uhead);
                    break;
                case 5:
                    displayB(head);
                    break;
                case 6:
                    util.print("请输入借书的用户");
                    name = sc.nextLine();
                    p = uhead;
                    while( !p.equals(name) && null != p ){
                        p = p.getUser();
                    }
                    if(p == null){
                        util.print("没这个人");
                    }else{
                        p.rebook(head);
                    }
                    break;
                default:
                    break Loop;
            }

        }
    }

    private static User uload() {
        User head = new User();
        head.setUser(null);
        return head;
    }

    public static Book load() {
        Book head = new Book();
        head.setBook(null);
        return head;
    }

    public static Book addBook(Book head){
        Book book = new Book();
        book.setBook(null);
        Scanner sc = new Scanner(System.in);
        util.print("请输入书名：");
        String name = sc.nextLine();
        book.setName(name);
        util.print("请输入编号（数字）");
        int num = sc.nextInt();
        book.setNum(num);
        util.print("请输入价格");
        double money = sc.nextDouble();
        book.setMoney(money);
        Book p = head;
        for(;null != p.getBook(); p = p.getBook());
        p.setBook(book);
        return head;
    }

    public static void displayB(Book head){
        Book p = head;
        p = p.getBook();
        util.print("书名  编号  价格  是否借出    借书人");
        while(p != null){
            util.print(p.getName()+"    "+p.getNum()+"  "+p.getMoney()+"    "+p.isBorrow()+"    "+p.getUser());
            p = p.getBook();
        }
    }

    public static void displayU(User head){
        User p = head;
        p = p.getUser();
        util.print("姓名  花费  借书");
        while(p != null){
            util.print(p.getName()+"    "+p.getCost()+"  "+p.getBook() + "  ");
            p = p.getUser();
        }
    }

}
