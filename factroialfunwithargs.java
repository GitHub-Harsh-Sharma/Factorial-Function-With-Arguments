import java.util.Scanner;
class factroialfunwithargs
{
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Factroial no: ");
        int num=sc.nextInt();
        loop(num);
    } 
    public void loop(int num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;
        }
        print(fact);
    }    
    public void print(int fact)
    {    
        System.out.println("Factorial value="+fact);
    }    
    public static void main(String[] args)
    {
    factroialfunwithargs fa= new factroialfunwithargs();
    fa.input();
    }
}    


