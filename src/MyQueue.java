public class MyQueue
{
    int Size = 1 ;
    Character[] Elements;

    int LastAdded ;
    int Current ;
    int Length;


    public MyQueue()
    {
        Elements = new Character[Size];
        this.Current = 0;
        LastAdded = -1;
    }



    public boolean empty()
    {
        return (Elements.length == 0);
    }


    public void increaseArrSize()
    {
        if(Size == 0)
        {
            Size = 1;
            Elements = new Character[Size];
            Current = -1 ;
            Length = Size;
            LastAdded = -1;
        }
        else if(LastAdded + 1 >= Size)
        {
            Size *= 2;
            Length = Size;
            Character[] newArr = new Character[Size];
            for (int i = 0; i < Elements.length; i++) {
                newArr[i] = Elements[i];
            }
            Elements = newArr;
        }


//            Size *= 2;
//            Character[] newArr = Elements;
//            Elements = new Character[Size];
//            for(int i = 0 ; i < newArr.length ; i++)
//            {
//                Elements[i] = newArr[i];
//            }


    }

    public void add(Character element)
    {
        if(LastAdded >= Size - 1 || Size == 0 )
        {
            increaseArrSize();
        }
        this.Elements[++LastAdded] = element;

    }

    public Character remove()
    {
        if(empty()){
            return null;
        }
        Character lastElement = Elements[Current];
        Character[] newArr = Elements;
        Elements = new Character[LastAdded];
        for(int i = 0 ; i <= LastAdded - 1; i++)
        {
            Elements[i] = newArr[i+1];
        }
        Size = Elements.length;
        Length = Size;
        LastAdded--;
        return lastElement;

    }


    public Character lastElement()
    {
        return Elements[Current];
    }

    public void Print()
    {
        System.out.println("==== My Queue: "  );
        for(Character item : Elements)
        {
            if(item != null)
            {
                System.out.println(item);
            }
        }
    }

    public int size()
    {
        return Elements.length ;
    }
}
