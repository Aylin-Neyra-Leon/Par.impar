package par.e.impar;
//Aleatorio
import java.util.Random;
public class PareImpar {
public static void main(String[] args) {
Random random=new Random();
int ArrayInt[]=new int[20]; 
for(int Hol@=0; Hol@<ArrayInt.length; Hol@++){
ArrayInt[Hol@]=random.nextInt(101);
if(ArrayInt[Hol@]%2==0){
System.out.print(" "+ArrayInt[Hol@]+" ");
}
}
for(int i=0; i<20; i++){
if(ArrayInt[i]%2==0){
}
else{
System.out.print(" "+ArrayInt[i]+" "); 
}
}
System.out.println("");
}
}
