package studentBackup.visitor;

import studentBackup.bst.BST;

/**
 * 
 * @author Abhishek Waichal
 * Interface Visitor used to implement visitor pattern.
 * 
 */
public interface Visitor {

	/**
	 * @param tree BST
	 *  
	 * This method is used to visit the tree to implement visitor pattern.
	 *  
	 */
	public void visit(BST tree);

}
