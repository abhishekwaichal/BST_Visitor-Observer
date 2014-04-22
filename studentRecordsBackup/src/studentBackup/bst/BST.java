package studentBackup.bst;

import studentBackup.visitor.Visitor;
/**
 * 
 * @author Abhishek Waichal
 * Class BST stores Nodes in accordance with the BST rules.
 * 
 */
public class BST {

	private Node rootNode = null;

	@Override
	public String toString() {
		return "BST [rootNode =" + rootNode + "]";
	}
	
	/**
	 * @return Node
	 * 
	 * This method is used to get the value of the member variable rootNode.
	 * 
	 */
	public Node getRootNode() {
		return rootNode;
	}

	/**
	 * @param rootNode Node
	 * Node to which root node is set to.
	 * 
	 * This method is used to set the value of the member variable rootNode.
	 * 
	 */
	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

	/**
	 * @param nodeIN Node
	 * next node to be in the BST.
	 * 
	 *  This method is used to insert a Node in the BST. 
	 * 
	 */
	public void insert(Node nodeIN) {
		if (rootNode == null) {
			rootNode = nodeIN;
		} else
			insertHelper(rootNode, nodeIN);
	}

	/**
	 * @param currNode Node
	 * current node of BST.
	 * 
	 * @param nodeIN Node
	 * next node to be in the BST.
	 * 
	 *  This method is used to help the 'insert' method, to insert Node(s).
	 * 
	 */
	public void insertHelper(Node currNode, Node nodeIN) {
		if (nodeIN.getbNumber() < currNode.getbNumber()) {
			if (currNode.getLeft() != null) {
				insertHelper(currNode.getLeft(), nodeIN);
			} else {
				currNode.setLeft(nodeIN);
			}
		} else if (nodeIN.getbNumber() > currNode.getbNumber()) {
			if (currNode.getRight() != null) {
				insertHelper(currNode.getRight(), nodeIN);
			} else {
				currNode.setRight(nodeIN);
			}
		}
	}

	/**
	 * @param currNode Node 
	 * current node of BST.
	 * 
	 *  This method is used to print the tree Node values in Inorder fashion(recursively).
	 * 
	 */
	public void printInOrder(Node currNode) {
		if (currNode != null) {
			printInOrder(currNode.getLeft());
			System.out.print(" " + currNode.getbNumber());
			printInOrder(currNode.getRight());
		}
	}
	
	/**
	 * @param currNode Node
	 * current node of BST.
	 * 
	 * @return int
	 * 
	 *  This method is used to add the values of all Nodes(recursively) of the tree.
	 * 
	 */
	public int sum(Node currNode) {
		if (currNode != null) {
			return currNode.getbNumber() + this.sum(currNode.getRight()) + this.sum(currNode.getLeft());
		}
		return 0;
	}

	/**
	 * @param currNode Node
	 * current node of BST.
	 * 
	 * @param updateVal int
	 * Value by which a node value needs to be incremented.
	 * 
	 *  This method is used to Update all Nodes of the tree (recursively).
	 * 
	 */
	public void updateAllNodes(Node currNode, int updateVal) {
		if (currNode != null) {
			updateAllNodes(currNode.getLeft(), updateVal);
			currNode.updateNode(updateVal);
			updateAllNodes(currNode.getRight(), updateVal);
		}
	}

	/**
	 * @param v Visitor
	 * (Dynamic)Visitor of either addition or Update operation.
	 * 
	 *  This method is used to implement Visitor pattern.
	 * 
	 */
	public void accept(Visitor v) {
		v.visit(this);
	}
}