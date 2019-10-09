import java.util.Scanner;

public abstract class User {
    String id;
    String name;
    User(String id,String name){
        this.id = id;
        this.name = name;
    }

    public static User login() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**请输入用户id**");
        String id = scanner.nextLine();
        System.out.println("**请输入用户姓名**");
        String name = scanner.nextLine();
        System.out.println("**请输入用户角色**");
        String use = scanner.nextLine();
        if(use.equals("学生")){
            return  new Student(id,name);
        }else if(use.equals("老师")){
            return new Teacher(id,name);
        }else{
            throw new Exception("错误角色");
        }
    }

    public abstract void menu();

    public abstract boolean input();
}
