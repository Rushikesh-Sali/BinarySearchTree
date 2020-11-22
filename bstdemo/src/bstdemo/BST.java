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

}
