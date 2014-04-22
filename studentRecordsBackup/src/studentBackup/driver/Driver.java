package studentBackup.driver;

import studentBackup.bst.BST;
import studentBackup.util.BSTBuilder;
import studentBackup.visitor.UpdateVisitor;
import studentBackup.visitor.Visitor;
import studentBackup.visitor.AddVisitor;

/**
 * 
 * @author Abhishek Waichal 
 * Driver class, contains main method, does the following: 
 * Read command line arguments. 
 * Use BSTBuilder to build the three trees. 
 * Call inorder traversal to print the values from the three trees. 
 * Call the visitor to print the sum of all the B-Numbers in the three trees. 
 * Call the visitor to update all nodes with UPDATE_VALUE.
 * Call inorder traversal to print the values from the three trees.
 * Call the visitor to print the sum of all the B-Numbers in the three trees.
 * 
 */

public class Driver {
	private static int debugValue = 0;
	private static int UPDATE_VALUE;

	/**
	 * @param args String
	 */
	public static void main(String[] args) {
		debugValue = 0;

		Debug.setDebugValue(debugValue);

		if (args.length != 2) {
			Debug.printDebug(2, "ERROR: Invalid number of arguments");
			System.exit(0);
		}

		if (Debug.getDebugValue() < 0 || Debug.getDebugValue() > 2) {
			Debug.printDebug(2, "ERROR: Debug value must be between 1-2");
			System.exit(0);
		}

		UPDATE_VALUE = Integer.parseInt(args[1]);

		BST tree = new BST();
		BST backup1 = new BST();
		BST backup2 = new BST();

		Visitor addv = new AddVisitor();
		Visitor updv = new UpdateVisitor(UPDATE_VALUE);

		BSTBuilder builder = new BSTBuilder(args[0], tree, backup1, backup2);

		System.out.println("\nBUILDING TREES USING BSTBUILDER...");
		builder.build();

		System.out.println("________________________________________________\n");
		System.out.println("\nINORDER TRAVERSALS:");
		System.out.println("\nOriginal BST:");
		tree.printInOrder(tree.getRootNode());

		System.out.println("\n\nBackup BST1:");
		tree.printInOrder(backup1.getRootNode());

		System.out.println("\n\nBackup BST2:");
		tree.printInOrder(backup2.getRootNode());

		System.out.println("\n________________________________________________\n");
		System.out.println("\nSUM OF ALL NODES:\n");

		System.out.println("\nOriginal BST:");
		tree.accept(addv);

		System.out.println("\nBackup BST1:");
		backup1.accept(addv);

		System.out.println("\nBackup BST2:");
		backup2.accept(addv);

		System.out.println("________________________________________________\n");
		System.out.println("\nUPDATING ALL NODES BY UPDATE_VALUE...\n");
		tree.accept(updv);

		System.out.println("________________________________________________\n");
		System.out.println("\nINORDER TRAVERSALS AFTER UPDATE:\n");

		System.out.println("\nOriginal BST:");
		tree.printInOrder(tree.getRootNode());

		System.out.println("\n\nBackup BST1:");
		tree.printInOrder(backup1.getRootNode());

		System.out.println("\n\nBackup BST2:");
		tree.printInOrder(backup2.getRootNode());

		System.out.println("\n________________________________________________\n");
		System.out.println("\nSUM OF ALL NODES AFTER UPDATE:\n");

		System.out.println("\nOriginal BST:");
		tree.accept(addv);

		System.out.println("\nBackup BST1:");
		backup1.accept(addv);

		System.out.println("\nBackup BST2:");
		backup2.accept(addv);

		System.out.println("________________________________________________\n");
	}
}