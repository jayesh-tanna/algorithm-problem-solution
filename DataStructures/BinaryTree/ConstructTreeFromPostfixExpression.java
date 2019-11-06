/*
https://practice.geeksforgeeks.org/problems/construct-an-expression-tree/1
Given a postfix expression.Your task is to complete the method constructTree().
The output of the program will print the infix expression of the given postfix expression.
*/
class GfG
{
    
    public static Node constructTree(char postfix[])
    {
        if(postfix == null || postfix.length == 0)    
            return null;
        Stack<Node> stack = new Stack<Node>();
        Node root;
        for(int i=0;i<postfix.length;i++)
        {
            root = new Node(postfix[i]);
            if(Construct.isOperator(postfix[i]))
            {
                root.left = stack.pop();
                root.right = stack.pop();
            }
            stack.push(root);
        }
        return stack.pop();
    }  
}
class Construct
{
  public static void inorder(Node et)
    {
        if(et != null)
        {
            inorder(et.right);
            System.out.print(et.val + " ");
            inorder(et.left);
        }
    }
    
    public static boolean isOperator(char c)
    {
        if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
          return true;
          
        return false;
    }
}
