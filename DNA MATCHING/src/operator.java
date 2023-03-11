import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\tWELCOME");
        System.out.println("please enter name");
        String name=sc.nextLine();
        System.out.println("please enter age");
        String age=sc.nextLine();
        System.out.println("please enter address");
        sc.nextLine();
        String adress=sc.nextLine();
        System.out.println("please enter disease");
        String disease=sc.nextLine();
        System.out.println("phone number");
        int phone= sc.nextInt();
        patientdb obj = new patientdb();

        obj.insert(name, age, adress, disease, phone);
        System.out.println("\t\t\tPlease select the service");
        System.out.println("\t\t\t1:Laboratory");
        System.out.println("\t\t\t2:Clinic");
        int select= sc.nextInt();
        switch(select){
            case 1:
                System.out.println("1: DNA matching");
                System.out.println("Other Services are coming soon!");
                System.out.println("0:exist");
                int num=sc.nextInt();
                if(num==1){
                    System.out.println("enter DNA for person 1");
                    trie opt = new trie();
                    sc.nextLine();
                    String DNA = sc.nextLine();

                    opt.insert(DNA);
                    System.out.println("enter DNA for person 2");
                    String DNA2=sc.nextLine();
                    boolean var =opt.CHECK(DNA2);
                    if(var){
                        System.out.println("matched");
                    }else{
                        System.out.println("not matched");
                    }
                }


                break;
            case 2:
                System.out.println("1:Book appointment");
                queue List = new queue();
                int n=sc.nextInt();

              List.ADD(name);

                break;

        }
    }
}
