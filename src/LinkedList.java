public class LinkedList
{
    Node Head = null ;
    Node Tail = null ;
    int Size = 0;


    public void Add(String data)
    {
        Node newNode = new Node();
        newNode.Data = data;
        newNode.NextNode = newNode;
        if(this.Size == 0)
        {
            this.Head = newNode ;
            this.Tail = newNode ;
            this.Size = 1;
        }
        else
        {

            this.Tail = newNode;
            this.Size++;
            newNode.NextNode = newNode;
        }
    }

    public void AddInBegin(Node node)
    {
        this.Head = node;
        this.Tail = node;

    }
}
