//Cs 272
//Tony Urbina
//2/10/19
//This Program is a test to the basic linked list concepts
package Lab3_Cs272;

public class IntNodeTest extends IntNode {
	public static void main(String[]args) {
		
		//Creating the nodes for the list
		IntNode P0 = new IntNode();
		IntNode P1 = new IntNode(28 , null);
		IntNode P2 = new IntNode(12 ,P1);
		IntNode P3 = new IntNode(28 ,P2);
		IntNode P4 = new IntNode(12,P3);
        
		//testing the Mutator's
		P0.setData(12);
		P1.setLink(P0);
		
		//testing the listLength method
		System.out.println("This is the  original list size\n" + IntNode.listLength(P4));
		System.out.println();

		//Print out of the starting link list
		System.out.println("Original Link\n"+P4.toString());
		System.out.println();

		//addition of Node with value 17 after node P2
		P2.addNodeAfterThis(100);
		System.out.println("Link after AddAfter method\n"+ P4.toString());
		System.out.println();

		//removal of the node after P3
		P3.removeNodeAfterThis();
		System.out.println("Link after RemoveAfter method\n"+P4.toString());
		System.out.println();

		//Testing if the search method works correctly
		System.out.println("Does the value 100 exist starting from the head of the link?\n"+ IntNode.search(P4, 100));
		System.out.println();
		System.out.println("Does the value 18 exist starting from the head of the link?\n"+ IntNode.search(P4, 18));
	}//end main
}//end class
