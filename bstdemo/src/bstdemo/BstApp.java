package bstdemo;

import java.util.Scanner;

public class BstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST obj = new BST();
		node root = null;
		root = obj.insert(root, 8);
		root = obj.insert(root, 3);
		root = obj.insert(root, 6);
		root = obj.insert(root, 10);
		root = obj.insert(root, 4);
		root = obj.insert(root, 7);
		root = obj.insert(root,1);
		root = obj.insert(root, 14);
		root = obj.insert(root, 13);
		System.out.println("Before Deletion");
		obj.display(root);
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the element to be deleted");
		 
         int key=scan.nextInt();
         System.out.println("After Deletion");
         root = obj.Delete(root,key);
         obj.display(root);
	}

}
