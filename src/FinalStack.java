public class FinalStack
{
    int Size = 1 ;
    Character[] Elements;
    int Current ;
    int Top ;
    int Length;


    public FinalStack(int size)
    {
        this.Size = size;
        Elements = new Character[size];
        this.Top = -1;
    }


    public FinalStack()
    {
        Elements = new Character[Size];
        this.Top = -1;
    }



    public boolean empty()
    {
        return (this.Top == -1);
    }


    public void increaseArrSize()
    {
        if(Size == 0)
        {
            Size = 1;
            Elements = new Character[Size];
            Top = -1 ;
            Length = Size;
        }
        else if(Top + 1 >= Size)
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
        if(Top >= Size - 1 || Size == 0 )
        {
            increaseArrSize();
        }
        this.Elements[++Top] = element;
    }

    public Character pop()
    {
        if(empty()){
            return null;
        }
        Character lastElement = Elements[Top];
        Character[] newArr = Elements;
        Elements = new Character[Top];
        for(int i = 0 ; i <= Top-1; i++)
        {
            Elements[i] = newArr[i];
        }
        Top--;
        Size = Elements.length;
        Length = Size;
        return lastElement;

    }


    public Character lastElement()
    {
        return Elements[Top];
    }

    public void Print()
    {
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
