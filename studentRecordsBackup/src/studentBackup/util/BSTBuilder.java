package studentBackup.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import studentBackup.bst.BST;
import studentBackup.bst.Node;
import studentBackup.driver.Debug;

/**
 * 
 * @author Abhishek Waichal Class BSTBuilder that reads a line from the input file, converts the string to an integer,
 *  and calls the insert method of the BST.
 * 
 */
public class BSTBuilder {

	private BST tree;
	private BST backup1;
	private BST backup2;

	private FileReader in = null;
	private String currentDirectory = System.getProperty("user.dir");
	private String FilePath;
	private BufferedReader br = null;

	/**
	 * Constructor
	 * @param fileName String
	 * the filename containing all the data, the B-Numbers.
	 * 
	 * @param treeIN BST
	 * the original BST.
	 * 
	 * @param backup1IN BST
	 * the backup 1 BST.
	 * 
	 * @param backup2IN BST
	 * the backup 2 BST.
	 * 
	 */
	public BSTBuilder(String fileName, BST treeIN, BST backup1IN, BST backup2IN) {
		Debug.printDebug(1, "In BSTBuilder Class's Constructor");

		this.tree = treeIN;
		this.backup1 = backup1IN;
		this.backup2 = backup2IN;

//		FilePath = "//src//" + fileName;
		FilePath = "\\src\\" + fileName;
		
		try {
			in = new FileReader(currentDirectory + FilePath);
		} catch (FileNotFoundException e) {
			System.err.println("File "+fileName+" was not found at "+currentDirectory+"//src//"+" !");
		}
		br = new BufferedReader(in);
	}

	@Override
	public String toString() {
		return "BSTBuilder [tree=" + tree + ", backup1=" + backup1
				+ ", backup2=" + backup2 + ", in=" + in + ", currentDirectory="
				+ currentDirectory + ", FilePath=" + FilePath + ", br=" + br
				+ "]";
	}

	/**
	 *  
	 *   This method is used to build the main BST and backups, from the input file.
	 * 
	 */
	public void build() {
		String str;
		int bNumber;
		Node node;
		Node bknode1;
		Node bknode2;
		try {
			while (true) {
				str = br.readLine();
				if (str != null) {

					bNumber = Integer.parseInt(str);

					node = new Node();
					node.setbNumber(bNumber);
					bknode1 = new Node();
					bknode1.setbNumber(bNumber);
					bknode2 = new Node();
					bknode2.setbNumber(bNumber);

					node.addObserver(bknode1);
					node.addObserver(bknode2);

					tree.insert(node);
					backup1.insert(bknode1);
					backup2.insert(bknode2);

				} else
					break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
