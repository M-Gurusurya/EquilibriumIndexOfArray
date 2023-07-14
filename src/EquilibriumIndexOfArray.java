import java.util.Scanner;

public class EquilibriumIndexOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        findPrefixSum(array,size);
        System.out.println(findEquilbriumIndex(array,size));
    }
    public static void findPrefixSum(int array[],int size)
    {
        int p=array[0];
        for(int i=1;i<size;i++)
        {
            array[i] = p + array[i];
            p=array[i];
        }
    }
    public static int findEquilbriumIndex(int array[],int size)
    {
        for(int i=1;i<size;i++)
        {
            if(array[i-1]==(array[size-1]-array[i]))
            {
                return i;
            }
        }
        return -1;
    }
}
