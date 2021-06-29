package nomor3;
public class binarytreeapp {
    public static void main(String [] args) {
        binarytree tree = new binarytree();
        
        TreeNode node;
        
        node = new TreeNode(50);
        tree.insert (node);
        
        node = new TreeNode(30);
        tree.insert (node);
        
        node = new TreeNode(20);
        tree.insert (node);
        
        node = new TreeNode(40);
        tree.insert (node);
        
        node = new TreeNode(70);
        tree.insert (node);
        
        
        System.out.print("Traversal dengan inorder : ");
        tree.inOrder();
        System.out.println();
        System.out.print("Traversal dengan preorder : ");
        tree.preOrder();
        System.out.println();
        System.out.print("Traversal dengan postorder : ");
        tree.postOrder();
        System.out.println("Nama : Rizqon Fadillah");
        System.out.println();
    }
}
