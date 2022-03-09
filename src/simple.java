public class simple { //main class
    Node front;
    Node rear;
    static class Node{//node class
        Node next;
        int data;
        int priority;
        Node(int data,int priority){// class construct
        this.data=data;
        this.priority=priority;
        }
    }
    public simple(){//main class constructor
        front=null;
        rear=null;
    }
    public void enqueue(Node NewNode){//insertion

       if(front==null|| NewNode.priority<front.priority){
           NewNode.next=front;
           front=NewNode;
       }else{
           Node temp=front;
           while(temp.next!=null&& temp.next.priority<=NewNode.priority){
               temp=temp.next;
           }

       }
    }


}
