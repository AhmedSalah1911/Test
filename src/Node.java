public class Node
{

    String Data ;
    Node NextNode ;

    public Node()
    {
        this.Data = null;
        this.NextNode = null;
    }

    public Node(String data)
    {
        this.Data = data;
    }
    public Node(Node node)
    {
        this.Data = node.Data;
        this.NextNode = node.NextNode;
    }

}
