package learnings.src.dataStructures;



class Node {

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = next;
    }
}

public class CustomLinkedList {
    private Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
        } else {
             Node temp = head;
             while (temp.next != null){
                 temp = temp.next;
             }
            temp.next = newNode;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("list is empty");
        }

        Node temp = head;
        while( temp!= null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public int count(){
        int count =0;
        Node temp = head;

        while(temp != null){
            count ++;
            temp = temp.next;
        }
        return count;
    }

    public void delete(int data){
        if(head.data == data){
            head = head.next;
        }
        Node temp = head;
        while (temp.next != null && temp.data != data && temp.next.next ==null) {
                temp = temp.next;
        }
        if(temp.data ==data && temp.next == null){
            //temp.data =
            temp.next = null;

        } else {
            temp.data = temp.next.data;
            temp.next = temp.next.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        CustomLinkedList c = new CustomLinkedList();
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);

        c.display();
        System.out.println();
        System.out.println("Number of values : " + c.count());

        c.delete(400);
        System.out.println("After Delete from list");
        c.display();
    }
}

