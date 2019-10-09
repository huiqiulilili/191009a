import java.util.Scanner;

public class Teacher extends User {
    public Teacher(String id, String name) {
        super(id,name);
    }

    @Override
    public void menu() {

        System.out.println("**老师，请输入**");
        System.out.println("**0:退出**");
        System.out.println("**1:上架**");
        System.out.println("**2:查阅**");
        System.out.println("**3:记录查询**");


    }

    @Override
    public boolean input() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 0:
                System.out.println("退出");return true;
            case 1:
                System.out.println("上架");
                putbook();
                System.out.println("上架成功！");
                break;
            case 2:
                System.out.println("查阅");break;
            case 3:
                System.out.println("记录查询");break;
        }
        return false;
    }

    private void putbook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书序列：");
        String ISBN = scanner.nextLine();
        System.out.println("请输入书名字：");
        String  title = scanner.nextLine();
        System.out.println("请输入书作者：");
        String author = scanner.nextLine();
        System.out.println("请输入书价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入书数量：");
        int count = scanner.nextInt();
        Action.putBook(ISBN,title,author,price,count);
    }
}
