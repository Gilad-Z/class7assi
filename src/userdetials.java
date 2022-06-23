import java.io.IOException;
import java.util.Scanner;

public class userdetials {
    public static void main(String[] args) throws IOException {

Scanner x1 =  new Scanner(System.in);
        System.out.println("Name:");
        writelog.getInstance().writelogs(x1.next());
        getAge();
        writelog.getInstance().writelogs(x1.next());
        System.out.println("Address");
        writelog.getInstance().writelogs(x1.next());
        System.out.println("Phone Number");
        writelog.getInstance().writelogs(x1.next());
        System.out.println("thank you very much");


     /*   Scanner x = new Scanner(System.in);
        System.out.println("Name:");
        String Name = x.nextLine() ;
        writelog.getInstance().writelogs(x.next());
        Scanner y = new Scanner(System.in);
        System.out.println("Age:");
        var Age = y.nextInt();
        Scanner z = new Scanner(System.in);
        System.out.println("Address:");
        var Address = z.nextLine();
        Scanner z1 = new Scanner(System.in);
        System.out.println("Phone Number:");
        var Phone = z1.nextLong();

        System.out.println( Name + Age +Address +"0"+Phone);
    }


      */
}

        private static void getAge() {
                System.out.println("Age");
        }
}
