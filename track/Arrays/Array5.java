public class Array5
{
    void search(int ref[] int key)
    {
        boolean found =false;
        for(int i=0;i<ref.length;i++)
        {
            if(ref[i]==key)
            {
                System.out.println("Elements found at index:"+i);
                found=true;
                break;
            }   
        }
        if(!found)
        {
            System.out.println("Elements not found:");
        }

    }
    public staitc void main(String args[])
    {
    int a[] ={10,20,30,40,50};
    search(a,30);
    }

    
}
    