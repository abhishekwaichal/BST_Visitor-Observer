package studentBackup.visitor;

import studentBackup.bst.BST;
import studentBackup.driver.Debug;

/**
 * @author Abhishek Waichal
 * Class UpdateVisitor used to implement visitor pattern to perform update operation(on all nodes).
 * 
 */
public class UpdateVisitor implements Visitor {

	private int updateVal;

	@Override
	public String toString() {
		return "UpdateVisitor [updateVal=" + updateVal + "]";
	}
	
	/**
	 * Constructor
	 * 
	 * @param updateValIN int
	 * the value by which every node needs to be updated.
	 * 
	 */

	public UpdateVisitor(int updateValIN) {
		Debug.printDebug(1, "In UpdateNodes Constructor");
		this.setUpdateVal(updateValIN);
	}


	/**
	 * @return int
	 *  
	 * This method is used to get the update value.
	 *  
	 */
	public int getUpdateVal() {
		return updateVal;
	}

	/**
	 * @param updateVal int
	 * The update value by which the B-Numbers are updated 
	 *  
	 * This method is used to set the update value.
	 *  
	 */
	public void setUpdateVal(int updateVal) {
		this.updateVal = updateVal;
	}

	@Override
	public void visit(BST tree) {
		tree.updateAllNodes(tree.getRootNode(), updateVal);
	}
}