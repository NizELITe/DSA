
class node2 {
    String data;
    node2 next;
    public node2(String  data){
        this.data=data;
    }
}
public class queue {
    node2 head;
    public void ADD(String data){

        if(head==null){
            node2 newn= new node2(data);
            head=newn;
        }else {
            node2 newnode = new node2(data);
            node2 n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=newnode;
        }
        System.out.println("your appointment has been booked");

    }
    public String DELETE(){
        String var=head.data;
        head=head.next;
        return var;
    }
    public String CHECK(){
        return head.data;
    }

}
