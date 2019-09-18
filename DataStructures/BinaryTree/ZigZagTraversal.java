/*
Complete the function to print spiral order traversal of a tree. For below tree, function should print 1, 2, 3, 4, 5, 6, 7.
https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1/?ref=self
*/

void printSpiral(Node node) 
      {
           if(node == null)
                return;
            Stack<Node> stack1 = new Stack<Node>();
            Stack<Node> stack2 = new Stack<Node>();
            stack1.push(node);
            while(!stack1.isEmpty() || !stack2.isEmpty())
            {
                    while(!stack1.isEmpty())
                    {
                        Node temp = stack1.pop();
                        System.out.print(temp.data + " ");
                        if(temp.right != null)
                            stack2.push(temp.right);
                        if(temp.left != null)
                            stack2.push(temp.left);
                    }
                    while(!stack2.isEmpty())
                    {
                        Node temp = stack2.pop();
                        System.out.print(temp.data + " ");
                        if(temp.left != null)
                            stack1.push(temp.left);
                        if(temp.right != null)
                            stack1.push(temp.right);
                    }
            }
      }
