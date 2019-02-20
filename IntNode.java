//Cs 272
//Tony Urbina
//2/10/19
//This Program practices with basic linked list concepts
package Lab3_Cs272;

public class IntNode {
	
	int Data;
	IntNode Link;

//Constructors
//------------------------------------------------------------------------------------------------------	
	public IntNode() {
		Data = 0;
		Link = null;
	}//end no argument constructor
	
	public IntNode(int _Data, IntNode _Node) {
		Data = _Data;
		Link = _Node;
	}//end constructor

//Accessor's & Mutator's	
//------------------------------------------------------------------------------------------------------	
	public int getData() {
		return Data;	
	}//end getData
	
	public IntNode getLink() {
		return Link;
	}//end getLink
	
	public void setData(int ProtoData) {
		Data = ProtoData;
	}//end setData
	
	public void setLink(IntNode ProtoLink) {
		Link = ProtoLink;
	}//end setLink

//methods
//-------------------------------------------------------------------------------------------------
	public static int listLength(IntNode head) {
		int answer = 0;
		for(IntNode Cursor = head; Cursor != null; Cursor = Cursor.getLink()) {
			answer++;
		}//end for loop
		return answer;
	}//end listLength
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int Start = Data;
		IntNode walk = Link;
		sb.append(Start);
		while (walk != null) {
			sb.append(" => ");
			sb.append(walk.getData());
			if (walk != Link)
				sb.append("");
				walk = walk.Link;
		} // end while loop
		return sb.toString();
	}//end toString
	
	public void addNodeAfterThis(int newdata) {
		Link = new IntNode(newdata,Link);
	}//end addNodeAfterThis
	
	@SuppressWarnings("unused")
	public static boolean search(IntNode head, int data) {
		IntNode answer = null;
		for(IntNode Cursor = head; Cursor != null; Cursor = Cursor.getLink()) {
			if(Cursor.Data == data) {
				answer = Cursor;
				return true;
			}//end if
		}//end for
		return false;
	}//end search
	
	public void removeNodeAfterThis() {
		Link = Link.Link;
	}//end removeNodeAfterThis
}//end class
