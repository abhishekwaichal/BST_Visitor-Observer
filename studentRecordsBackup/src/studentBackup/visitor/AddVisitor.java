package studentBackup.visitor;

import studentBackup.bst.BST;

/**
 * 
 * @author Abhishek Waichal
 * Class AddVisitor used to implement visitor pattern to perform addition operation (of all nodes).
 *  
 */
public class AddVisitor implements Visitor {

	@Override
	public void visit(BST tree) {
		System.out.print("Addition of all nodes: " + tree.sum(tree.getRootNode())+"\n");
	}
}
