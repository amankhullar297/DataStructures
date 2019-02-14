package Tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	public static List<Integer> levelOrderTraversal(BinaryNode node){
		Queue<BinaryNode> queue=new LinkedList<>();
		List<Integer> list=new ArrayList<>();
		queue.offer(node);
		BinaryNode temp=node;
		while(!queue.isEmpty()){
			temp=queue.poll();
			list.add(temp.data);
			if(temp.left!=null){
				queue.offer(temp.left);
			}
			if(temp.right!=null){
				queue.offer(temp.right);
			}
		}
		System.out.println(list);
		return list;
	}

	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.root=new BinaryNode(1);
		//binaryTree.insert(1);
		binaryTree.insert(2);
		binaryTree.insert(3);
		binaryTree.insert(4);
		binaryTree.insert(5);
		binaryTree.insert(6);
		binaryTree.insert(7);
		List<Integer> list=new ArrayList<>();
		list=levelOrderTraversal(binaryTree.root);
		System.out.println(list);
	}

}
