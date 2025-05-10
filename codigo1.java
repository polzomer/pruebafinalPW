import java.util.Scanner;

public class codigo1{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de el arreglo");
        int Input= sc.nextInt();
        int SumaPares=0;
        int SumaImpares=0;
        sc.nextLine();
        int Total = 0;
        int[] Lista = new int[Input];
        for (int i = 0; i < Lista.length; i++)
            
        {
        System.out.println("Ingrese el numero a agregar");    
        int Num = sc.nextInt();
        sc.nextLine();
        Lista[i]=Num;
            if (Lista[i]%2==0)
            {
             SumaPares = SumaPares +  Lista[i]; 
            }
            else
            {
            SumaImpares = SumaImpares + Lista[i];
            
            }   
        }
        Total = SumaPares -SumaImpares;
        System.out.println("La suma total es de");
        System.out.println(""+Total);
    }
}
