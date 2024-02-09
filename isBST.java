import java.util.*;

class BinaryTreeNode{

int data;

BinaryTreeNode left;

BinaryTreeNode right;


public BinaryTreeNode(int d){

data = d;

left = null;

right = null;

}

}



class isBST{

private static void isBSTValid(BinaryTreeNode root,List<Integer> l){

if(root == null){

return;

}

isBSTValid(root.left,l);

l.add(root.data);

isBSTValid(root.right,l);

}

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();

System.out.println("Please enter root : ");

int u = sc.nextInt();

BinaryTreeNode root = new BinaryTreeNode(u);

q.add(root);

while(!q.isEmpty()){

BinaryTreeNode popp = q.peek();

q.remove();

System.out.println("Please enter left child of " + popp.data);

int left = sc.nextInt();

if(left != -1){

BinaryTreeNode leftNode = new BinaryTreeNode(left);

popp.left = leftNode;

q.add(leftNode);

}

System.out.println("Please Enter right child of " + popp.data);

int right = sc.nextInt();

if(right != -1){

BinaryTreeNode rightNode = new BinaryTreeNode(right);

popp.right = rightNode;

q.add(rightNode);

}

}

System.out.println("Would you like to check that the tree you build is a BST or not ? ");

boolean ch = sc.nextBoolean();

if(ch == true){

List<Integer> l = new ArrayList<Integer>();

isBSTValid(root,l);

boolean ans = true;

for(int i = 1;i < l.size();i++){

if(l.get(i - 1) > l.get(i)){

ans = false;

break;

}

}

if(ans == true){

System.out.println("Yes, my dear the tree you build is a BST.");

}

else{

System.out.println("Sorry, build again if you love a BST.");

}

}

else{

System.out.println("Thanks for your feedback.");

}

}

}
