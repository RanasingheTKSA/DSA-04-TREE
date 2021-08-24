package EX01;
import java.util.Queue;
import java.util.LinkedList;

public class Tree {
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	
	// this is find function 
	public Node find(int key) {
		Node current = root;
		while (current.iData != key) {
			if( key < current.iData) {
				current =current.LeftChild;
			}
			else {
				current =current.RightChild;
			}
			
			if (current == null) {
				return null;
			}
		}
		return current;
	}
	
	
	
	//this is insert function
	public void insert(int id, double dd) {
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		
		if (root == null) {
			root =newNode;
		}
		else {
			Node current =root;
			Node previous;
			
			while (true) {
				previous = current;
				if (id < current.iData) {
					current = current.LeftChild;
					if (current == null) {
						previous.LeftChild = newNode;
						return;
					}
				}
				else {
					current = current.RightChild;
					if(current == null) {
						previous.RightChild = newNode;
						return;
					}
				}				
			}
		}
	}
	
	
	
	//this is delete function
	public void  delete (Node root, int key) {
		if (root == null)
			return;
		
		if (root.LeftChild == null && root.RightChild == null) {
			if (root.iData == key) {
				root = null;
				return;
			}
			else
				return;
		}
		
		
		Queue <Node> q = new LinkedList <Node>();
		q.add(root);
		Node temp = null, keyNode = null;
		
		
		// Do level order traversal until
	    // we find key and last node.
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if (temp.iData == key)
				keyNode = temp;
			
			if (temp.LeftChild != null)
				q.add(temp.LeftChild);
			
			if (temp.RightChild != null)
				q.add(temp.RightChild);
		}
		
		/* if (keyNode != null) {
			int x = temp.iData;
			deleteDeepest(root, temp);
			keyNode.dData = x
		} */
		
	}
	
}
