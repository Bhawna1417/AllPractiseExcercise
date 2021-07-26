package Linkedlist;

public class Linkedlist {
  static Node head;
   static class Node
   {
	   int data;
	   Node next;
	   Node(int data)
	   {
		   this.data=data;
		   // next=null;
	   }
	   
   }
	   public void insertnode(int data)
	   {
		  Node n=new Node(data);
		   //n.data=data;
		//   n.next=null;
		   
		   if (head==null)
		   {
			   head=new Node(data);;
			   return;
		   }
		   n.next=null;
		   
		  // else
		  //{  
			   Node node=head;
		    while(node.next!=null)
		    {
			  node=node.next;
		   }
		  node.next=n;
		  return;
		   
		   
	   
   }
	   public void show()
	   {
		   Node node=head;
		   while(node!=null)
		   {
			System.out.println(node.next);
			node=node.next;
			
		   }
		//  System.out.println(node.next);
	   }
   
	
	public static void main(String[] args) 
	{
		Linkedlist list=new Linkedlist();
		list.insertnode(10);
		list.insertnode(20);
		list.insertnode(30);
		list.show();
	}
		// TODO Auto-generated method stub

	}




