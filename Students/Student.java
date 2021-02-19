import java.util.Scanner;

public class Student {
	String name;//姓名
	char sex;//性别
	int age;//年龄
	double scores[] = new double[5];//成绩
	String num;//学号
	Student next;
	
	public static Student create() {
		Scanner sc = new Scanner(System.in);
		
		Student phead = new Student();
		Student pnew = new Student();
		Student p = phead;
		pnew.next = null;
		
		phead.next = pnew;
		p = pnew;
		pnew = null;
		
		System.out.println("请输入姓名");
		p.name = sc.next();
		System.out.println("请输入性别");
		String s = sc.next();
		p.sex = s.charAt(0);
		System.out.println("请输入年龄");
		p.age = sc.nextInt();
		System.out.println("请输入学号");
		p.num = sc.next();
		System.out.println("请输入语文成绩");
		p.scores[0] = sc.nextDouble();
		System.out.println("请输入数学成绩");
		p.scores[1] = sc.nextDouble();
		System.out.println("请输入英语成绩");
		p.scores[2] = sc.nextDouble();
		p.scores[3] = p.scores[0]+p.scores[1]+p.scores[2];
		p.scores[4] = p.scores[3]/3;
		
		while(true) {
			
			System.out.println("是否再添加一个学生？是1，否2");
			int a = sc.nextInt();
			
			if(a==1) {
				
				Student pnew1 = new Student();
				p = pnew1;
				
				phead.next = pnew1;
				pnew1.next = p;
				p = pnew1;
				pnew1 = null;

				System.out.println("请输入姓名");
				p.name = sc.next();
				System.out.println("请输入性别");
				String s = sc.next();
				p.sex = s.charAt(0);
				System.out.println("请输入年龄");
				p.age = sc.nextInt();
				System.out.println("请输入学号");
				p.num = sc.next();
				System.out.println("请输入语文成绩");
				p.scores[0] = sc.nextDouble();
				System.out.println("请输入数学成绩");
				p.scores[1] = sc.nextDouble();
				System.out.println("请输入英语成绩");
				p.scores[2] = sc.nextDouble();
				p.scores[3] = p.scores[0]+p.scores[1]+p.scores[2];
				p.scores[4] = p.scores[3]/3;
			}
			else {
				break;
			}
		}
	p = null;
	sc.close();
	return phead;
	}
	
	public static void display(Student phead){
		Student p = phead.next;
		System.out.println("姓名		性别		年龄		学号		语文成绩		数学成绩		英语成绩		总分		平均分");
		while(p!=null) {
			System.out.println(p.name+"		"+p.sex+"	"+p.age+"	"+p.num+"	"+p.scores[0]+"		"+p.scores[1]+"		"+p.scores[2]+"		"+p.scores[3]+"		"+p.scores[4]);
			p = p.next;
		}
	}
}
