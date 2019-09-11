/*
https://practice.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1/?ref=self
Given a Binary Tree your task is to print the nodes which dont have a sibling node .You are required to complete the 
function printSibling. You should not read any input from stdin/console. 
There are multiple test cases. For each test case, this method will be called individually.
*/

void printSibling(Node node)
	{
	    if(node == null)
	        return;
	   int max = 100;
		int[] arr = new int[max];
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		int c = 0;
		while(q.size() > 0)
		{
		    int n = q.size();
		    for(int i=0;i<n;i++)
		    {
		        Node t = q.remove();
		        if(t.left != null)
		            q.add(t.left);
		        if(t.right != null)
		            q.add(t.right);
		        
		        if((t.left == null && t.right == null) || (t.left != null && t.right != null))
		            continue;
		        if(t.left == null)
		            arr[c++] = t.right.data;
		        if(t.right == null)
		            arr[c++] = t.left.data;
		    }
		}
		if(c == 0)
		    System.out.print("-1");
		else{
		Arrays.sort(arr);
		for(int i=max-c;i<max;i++)
		    System.out.print(arr[i] + " ");
		}
	}




