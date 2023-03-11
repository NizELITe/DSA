




class node{
    int phone;
    String name;
    String age;
    String adress;
    String disease;
    node next;
    node(String name,String age,String adress,String disease,int phone){
        this.name=name;
        this.age=age;
        this.adress=adress;
        this.disease=disease;
        this.phone=phone;
    }
}
public class patientdb {
    node head;
    node ptr;
    node ptrr;
    node ptr2;

    public void insert(String name,String age,String adress,String disease,int phone) {
        node newnode = new node( name, age, adress, disease, phone);
        newnode.next = null;
        if (head == null) {
            head = newnode;
        } else {
            node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newnode;


        }
    }

    public void remove(String name) {
        node n = head;

       while(n.name!=name){


            //   if (i != index) {
            ptr = n;//3
            n = n.next;
            //n=4
            //    }


        }
        ptr.next = n.next; // ptr.next=4 and n.next =5 and n =4;
        n.next = null;
        n = null;
        System.out.println("removed");


    }



    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.name + " ");
            temp = temp.next;
        }
        System.out.println();

    }




}




