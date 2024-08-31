public class switchcase{
	public static void main(String[] args){
    int x = 5;
    int y = 10;
    
    int add = x + y;
    int sub = x - y;
    int mul = x * y;
    int div = x/y;
    
    int calc = 3;
    switch(calc){
    	case 1: 
        	System.out.println(add);
           	break;
        case 2: 
        	System.out.println(sub);
           	break;
        case 3: 
        	System.out.println(mul);
           	break;
        case 4: 
        	System.out.println(div);
           	break;
        default:
        	System.out.println("error");
        }
    }
 }