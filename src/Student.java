import java.util.Scanner;

public class Student extends User {
    public Student(String id, String name) {
        super(id,name);
    }

    @Override
    public void menu() {

        System.out.println("**学生，请输入**");
        System.out.println("**0:退出**");
        System.out.println("**1:借书**");
        System.out.println("**2:查阅**");
        System.out.println("**3:记录查询**");
        System.out.println("**4:归还图书**");

    }

    @Override
    public boolean input() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 0:
                System.out.println("退出");return true;
            case 1:
                System.out.println("借书");break;
            case 2:
                System.out.println("查阅");break;
            case 3:
                System.out.println("记录查询");break;
            case 4:
                System.out.println("归还图书");break;
        }
        return false;
    }
}
