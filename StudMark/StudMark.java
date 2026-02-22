import java.util.Scanner;

class student{
    String name;
    int rol_no;   

    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name:");
        name = sc.nextLine();

        System.out.println("enter your roll:");
        rol_no = sc.nextInt();
    }

    void display(){
        System.out.println("name:"+name);
        System.out.println("roll:"+rol_no);
    }
}

class mark extends student{
    int m1, m2, m3, m4, m5;
    int total;
    double average;

    void readMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Subject Marks:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;
    }

    void result(){
        display();
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

public class StudMark{
    public static void main(String[] args){
        mark obj = new mark();
        obj.read();
        obj.readMarks();
        obj.result();
    }
}