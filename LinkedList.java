public class LinkedList{
    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        list.insertatbeginning(10);
        list.insertatbeginning(20);
        list.insertatend(40);
        list.display();
        list.deletenthfromend(1);
        list.display();
        list.removemiddle();
        list.display();
        list.reverse();
        list.display();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class  LinkedList{
    private Node head;
    
    public void insertatbeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertatend(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
                System.out.println(temp.data);
            }
            temp.next=newNode;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println("");
    }
    public void deletenthfromend(int n){
        Node temp=new Node(0);
        temp.next=head;
        Node fast=temp;
        Node slow=temp;
        int count=1;
        for(int i=0;i<=n;i++)
        {
            if(fast==null){
                System.out.println("N is larger than the list");
            }
            fast=fast.next;
        }
        
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        head=temp.next;
    }
    public void removemiddle()
    {
        // Node temp=head;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=slow.next;
    }
    public void reverse()
    {
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
}










