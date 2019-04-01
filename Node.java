/* 
* @author Prateek Chauhan
*
*/
abstract class Node implements Comparable<Node> {
    
  	public  int frequency; // the frequency of this tree
    public  char data;
    public  Node left, right; 
    public Node(int freq) { 
    	frequency = freq;
   	}
 
    // compares on the frequency
    public int compareTo(Node tree) {
        return frequency - tree.frequency;
    }
  
}
 
class HuffmanLeaf extends Node {
    
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
  
}
 
class HuffmanNode extends Node {
    
    public HuffmanNode(Node l, Node r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }

}


class Decoding {

/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

   void decode(String S ,Node root)
    {
        Node mainn=root;
        String ans="";
        for(int i=0;i<S.length();i++){
        
            if(S.charAt(i)=='0')
                mainn=mainn.left;
            else
                mainn=mainn.right;
            if(mainn.right==null && mainn.left==null)
                {
                ans+=(mainn.data);
                mainn=root;
            }
        }
        System.out.println(ans);
       
    }


}