public class Pattern {
    public static void main(String[] args) {
       int n = 5;

       for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
        System.out.print("*");
       }
       System.out.println();
       
       }
       for(int i=n; i>=1; i--){
        for(int j=2; j<=i; j++){
        System.out.print("*");
       } 
       System.out.println();
       
       }


    for(int i= 1; i<=n ; i++){
        for(int j=i;j<=n-1; j++){
            System.out.print(" ");
        }
         for(int j=1;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i= n; i>=1 ; i--){
        for(int j=i;j<=n-1; j++){
            System.out.print(" ");
        }
         for(int j=1;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }


    System.out.println("Triangle: ");
    System.out.println();

    for(int i=1; i<=n; i++){
        for(int j=i; j<=n-1; j++){
            System.out.print(" ");
        }for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
     System.out.println();


    System.out.println("Triangle: ");
    System.out.println();

    for(int i=n; i>=1; i--){
        for(int j=i; j<=n-1; j++){
            System.out.print(" ");
        }for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
     System.out.println();



    System.out.println("Double Triangle on single base: ");
    System.out.println();

    for(int i=1; i<=n; i++){
        for(int j=i; j<=2*n-2; j++){
            System.out.print(" ");
        }for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
     System.out.println();

    System.out.println("Blank Square: ");
    System.out.println();

    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(i==1 || i==n || j==1 ||j==n){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
        System.out.println();

    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
        
    }

    System.out.println();
    System.out.println();

    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
        
    }

    System.out.println();
    System.out.println();

    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
        
    }


    
    System.out.println("Inverted Half Pyramid rotated by 180 deg ");
    System.out.println();

    for(int i =1; i<=n;i++){
        for(int j=1; j<=n-i; j++){
            System.out.print("  ");
        }for(int j=1; j<=i ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    System.out.println();


    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }

        for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    System.out.println();

    System.out.println();


    int number = 1;

    
        for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(number);
            number+=1;
        }
        System.out.println();
    }

    System.out.println();

 
    
System.out.println("0-1 Triangle");
System.out.println();
        for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            int sum = i+j;
            if(sum%2 ==0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
            
        }
        System.out.println();
    }
    System.out.println();



    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=n-1; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println();
    System.out.println();


    for(int i=1; i<=n; i++){
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println();
    System.out.println();

    
    for(int i=1; i<=n; i++){   
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    for(int i=n-1; i>=1; i--){   
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }


    System.out.println();
    System.out.println();

    int num = 1;

    for(int i=1; i<=n; i++){   
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }for(int j=1; j<=i; j++){
            System.out.print(num+" ");
        }
        num ++;

        System.out.println();
    }


    System.out.println();
    System.out.println();


    for(int i=1; i<=n; i++){   
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }for(int j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }

    System.out.println();
    System.out.println();


    for(int i=1; i<=n; i++){   
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }for(int j=i; j>=1; j--){
            System.out.print(j);
        }for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }


    System.out.println();
    System.out.println();
    

    for(int i=1; i<=n; i++){   
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }for(int j=i; j>=1; j--){
            System.out.print("*");
        }for(int j=2;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println();
    System.out.println();

    for(int i=1; i<=n; i++){   
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }for(int j=i; j>=1; j--){
            System.out.print("*");
        }for(int j=2;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=n-1; i>=1; i--){   
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }for(int j=i; j>=1; j--){
            System.out.print("*");
        }for(int j=2;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
            System.out.println();
    System.out.println();

    int num2 =1;

        for(int i=n; i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print(num2);
            }
            num2++;
            System.out.println();
        }

    System.out.println();
    System.out.println();
 

    }
}
