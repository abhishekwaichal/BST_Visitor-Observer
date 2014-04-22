package studentBackup.bst;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author Abhishek Waichal
 * Class Node to store the B-Number and defines the node structure
 *  
 */
public class Node extends Observable implements Observer {

	private int bNumber;
	private Node left;
	private Node right;

	@Override
	public String toString() {
		return "Node [bNumber=" + bNumber + ", left=" + left + ", right="
				+ right + "]";
	}

	/**
	 *  Constructor 
	 * @param args TODO
	 */
	public Node() {
		this.left = null;
		this.right = null;
	}

	/**
	 * @return int
	 * 
	 *  This method is used to obtain the B-Number of the Node. 
	 * 
	 */
	public int getbNumber() {
		return bNumber;
	}

	/**
	 * 
	 * @param bNumberIN int
	 * The value to which bNumber was set to
	 *  
	 *   This method is used to set the value of B-Number of the Node.
	 *  
	 */
	public void setbNumber(int bNumberIN) {
		this.bNumber = bNumberIN;
	}

	/**
	 * @return Node
	 * 
	 *  This method is used to obtain the left node of the Node. 
	 * 
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param leftIN Node
	 * left value of this node
	 *  
	 *   This method is used to set the value of left node of the Node.
	 *  
	 */
	public void setLeft(Node leftIN) {
		this.left = leftIN;
	}

	/**
	 * @return Node
	 * 
	 *  This method is used to obtain the right Node of the Node. 
	 * 
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param rightIN Node
	 * right value of this node
	 *  
	 *   This method is used to set the value of right node of the Node.
	 *  
	 */
	public void setRight(Node rightIN) {
		this.right = rightIN;
	}

	/**
	 * @param updateValIN int
	 * value by which a node's B-Number is updated.
	 *  
	 *   This method is used to update the B-Number of the Node.
	 *  
	 */
	public void updateNode(int updateValIN) {
		this.bNumber += updateValIN;
		setChanged();
		notifyObservers(updateValIN);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.updateNode(Integer.parseInt(arg.toString()));
	}
}