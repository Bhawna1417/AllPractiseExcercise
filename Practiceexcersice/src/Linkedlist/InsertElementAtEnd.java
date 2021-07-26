package Linkedlist;

public class InsertElementAtEnd {
	Node head;
	
	class Node
	{
		Node next;
		int val;
		Node(int data)
		{
			this.val=data;
		this.next=null;
		}
		
//		public Node getnewnode(int i,Node node)
//		{
//			
//			n.i=i;
//			n.next=null;
//		}
		public InsertElementAtEnd insertatend(int i,InsertElementAtEnd node)
		{
			Node n=new Node(i);
			if (head==null)
			{
				head=new Node(i);
				
			}
			n.next=null;
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
				last.next=n;
				return;
			}
		}
		
	
	}

	public static void main(String[] args)
	{
		Node node=null;
		InsertElementAtEnd ele=new InsertElementAtEnd();
		node=ele.insertatend
		
	}
		// TODO Auto-generated method stub

	}

}
