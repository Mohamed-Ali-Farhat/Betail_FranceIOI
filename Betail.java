import java.util.Scanner;
class Main {
    static Scanner entrée = new Scanner(System.in);
    public static void main(String[] args) {
       
 
int tot=0;

for (int i=1 ; i<=20;i++){
 int a= entrée.nextInt();
 tot=tot+a;
 }
 System.out.println(tot);
      
}

}