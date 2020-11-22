package bstdemo;

public class BST {
	
	public node insert(node nd,int val)
	 {  
		 if (nd==null)
		return CreateNewNode(val);
		 if(val<nd.data)
			 nd.left=insert(nd.left,val);
		 else if (val>nd.data)
			 nd.right=insert(nd.right,val);
		return nd;
		 
	 }

	private node CreateNewNode(int k) {
		// TODO Auto-generated method stub
		node obj = new node();
		obj.data=k;
		obj.left=null;
		obj.right=null;
		return obj;
		
		

	}
	public void display(node nd){
        if(nd==null){
            return;
        }
        display(nd.left);
        System.out.print(nd.data + "  ");
        
        display(nd.right);
       // System.out.println(" ");
    }
	public node Delete(node nd, int data) {
		if(nd == null) return nd; 
		else if(data < nd.data) nd.left = Delete(nd.left,data);
		else if (data > nd.data) nd.right = Delete(nd.right,data);

		 
        // if key is same as root's 
        // key, then This is the
        // node to be deleted
        else {
            // node with only one child or no child
            if (nd.left == null)
                return nd.right;
            else if (nd.right == null)
                return nd.left;
 
            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            nd.data = minValue(nd.right);
 
            // Delete the inorder successor
            nd.right = Delete(nd.right, nd.data);
        }
 
        return nd;
    }
 
    int minValue(node nd)
    {
        int minv = nd.data;
        while (nd.left != null) 
        {
            minv = nd.left.data;
            nd = nd.left;
        }
        return minv;
    }

}
