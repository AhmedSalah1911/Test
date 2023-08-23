import java.sql.Array;

public class MyStack
{
    int Size = 1;
    String[] Elements;
    int Current ;
    int Top ;
    int Length;


    public MyStack(int size)
    {
        this.Size = size;
        Elements = new String[size];
        this.Top = -1;
    }


    public MyStack()
    {
        Elements = new String[Size];
        this.Top = -1;
    }



    public boolean IsEmpty()
    {
//        return (this.Top == -1);
        return (this.Length == 0);
    }


    public void increaseArrSize()
    {
//        if(Top + 1 >= Size)
        if(Length == Size)
        {
            Size *= 2;
            String[] newArr = new String[Size];
            for(int i = 0 ; i < Elements.length ; i++)
            {
                newArr[i] = Elements[i];
            }
            Elements = newArr;
            Length = Elements.length ;


//            Size *= 2;
//            Character[] newArr = Elements;
//            Elements = new Character[Size];
//            for(int i = 0 ; i < newArr.length ; i++)
//            {
//                Elements[i] = newArr[i];
//            }

        }
    }

    public void Push(String element)
    {
        if(Top >= Size )
        {
            increaseArrSize();
        }
        this.Elements[++Top] = element;
    }

    public String Pop()
    {
        String lastElement = Elements[Top--];
        String[] newArr = Elements;
        Elements = new String[Size-1];
        for(int i = 0 ; i < Elements.length ; i++)
        {
            Elements[i] = newArr[i];
        }
        Length--;
        return lastElement;

    }


    public String GetLastElement()
    {
        return Elements[Top];
    }

    public void Print()
    {
        for(String item : Elements)
        {
            System.out.println(item);
        }
    }


}
