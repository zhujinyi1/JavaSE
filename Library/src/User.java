import com.zjy.util.util;

import java.util.Scanner;

public class User {

    private String name;
    private double cost;
    private Book book;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = this.cost + cost;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public boolean equals(String name){
        return (this.getName()==name);
    }


    public void borrow(Book head) {
        if(this.getBook()!=null){
            util.print("你只能借一本书");
            return;
        }
        util.print("输入书的编号：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Book p = head;
        while(!p.equals(num)&&null != p.getBook()){
            p = p.getBook();
        }
        if(null == p.getBook()){
            util.print("没这本书");
        }else{
            this.setBook(p);
            user.setCost(p.getMoney());
        }
    }

    public void rebook(Book head) {
        util.print("你还书的编号：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(this.getBook()==null || !this.getBook().equals(num)){
            util.print("你没借这本书");
        }else{
            this.setBook(null);
        }
    }

}
