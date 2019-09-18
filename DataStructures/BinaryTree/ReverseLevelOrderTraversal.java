/*
https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1
Given below is a tree. The task is to print the Reverse Level Order Traversal of the given tree. 
You will be given a function reversePrint(), which accepts root of the tree as argument.
*/


void reversePrint(Node node) 
        {
            if(node == null)
                return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            Stack<Integer> stack = new Stack<Integer>();
            while(queue.size() > 0)
            {
                int n = queue.size();
                for(int i=0;i<n;i++)
                {
                    Node temp = queue.remove();
                    if(temp.right != null)
                        queue.add(temp.right);
                    if(temp.left != null)
                        queue.add(temp.left);
                    stack.push(temp.data);
                }
            }
            while(!stack.isEmpty())
            {    
                Integer y = (Integer) stack.pop(); 
                System.out.print(y + " "); 
            } 
        }
