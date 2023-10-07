/** Class to enable user to perform a depth first search on a binary tree.
 * 
 *  @author Danny Cannon                                                                                                                                                                                                                                                                 
 */
public class DepthFirstSearch {

	//Instance Variables
	Node root;
	int travCount;
	
	public DepthFirstSearch() {               
		System.out.println("\nCall DFS with root node to do a Depth First Search.\n");
		setTravCount(0);
    }//end constructor
	
	/** Evaluates the height of a given node.
	 *  @param node  Node to be evaluated.
	 *  @return  Height in form of integer. */
	public int getHeight(Node node) {
		if (node != null) {
			return Math.max(getHeight(node.getlChild()), getHeight(node.getrChild())) + 1;
		}//end if
		else return 0;
	}//end getHeight
	
	/** Performs depth first search using recursive methods.
	 * @param node  Node to traverse.  */
	public void DFS(Node node) {
		System.out.println("Node Traversed: " + node.getData()); 
		travCount++;
		System.out.println("Number of Nodes Traversed: " + getTravCount());
		System.out.println("Height: " + getHeight(node) + "\n");
		//If statement evaluates if node is a leaf, then calls to the children.
		if (node.getlChild() != null || node.getrChild() != null) {		
			DFS(node.getlChild());
			DFS(node.getrChild());
		}//end if
     }//end DFS

	//Getter and Setter
	public int getTravCount() {
		return travCount;
	}//end getTravCount

	public void setTravCount(int travCount) {
		this.travCount = travCount;
	}//end setTravCount
	
}//end class