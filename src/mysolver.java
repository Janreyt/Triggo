
import java.util.Scanner;
import trig.Trig;
public class mysolver {

	public static void main(String[] args) {
		Trig Triangles=new Trig();
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("This program will calculate all sides and all angles of your triangle\nIf the value of the side or angle is unkown, enter 0\n");
		System.out.println("What is the value or a");
		double a = in.nextInt();
		System.out.println("What is the value or b");
		double b = in.nextInt();
		System.out.println("What is the value or c");
		double c = in.nextInt();
		System.out.println("What is the value or A");
		double A = in.nextInt();
		System.out.println("What is the value or B");
		double B = in.nextInt();
		System.out.println("What is the value or C");
		double C = in.nextInt();
		
		//Equilateral triangles
		if (A==60&&B==60&&C==60&&a>0){
			b=a+0;
			c=a+0;
			}
		if (A==60&&B==60&&C==60&&b>0){
			a=b+0;
			c=b+0;
			}
		if (A==60&&B==60&&C==60&&c>0){
			a=c+0;
			b=c+0;
			}
		//Look for special triangles
		//Scalene??
		if(a>0&&b>0&&c>0){
			A = Triangles.cosLawAngle(a, b, c);
			B = Triangles.sinLawAngle(A, a, b);
			C = 180-A-B;
		}
		
		
		
		else if(A>0&&b>0&&c>0){
			a = Triangles.cosLawSide(A, b, c);
B = Triangles.sinLawAngle(A, a, b);
C = 180-A- B;			
			

		}
		
		else if(B>0&&a>0&&c>0){
			b = Triangles.cosLawSide(a, B, c);
			A = Triangles.sinLawAngle(c, B, b);
			C = 180-A- B;
		}
		else if(C>0&&a>0&&b>0){
			c = Triangles.cosLawSide(C, a, b);
			B = Triangles.sinLawAngle(a, C, b);
			A = 180-C- B;
		}
		else if(A>0&&a>0&&b>0){
			B = Triangles.sinLawAngle(b, A, a);
			C = 180-A-B;
			c = Triangles.sinLawSide(C, B, b);
			
		}
		else if(A>0&&a>0&&c>0){
			C = Triangles.sinLawAngle(c, A, a);
			B = 180-A- C;
			b =Triangles.sinLawSide(B, C, c);
			
		}
		else if(B>0&&b>0&&a>0){
			A = Triangles.sinLawAngle(a, B, b);		
			C = 180-A- B;
			c = Triangles.sinLawSide(C, B, b);
			
		}
		else if(C>0&&a>0&&b>0){
			c = Triangles.cosLawSide(C, a, b);
			B = Triangles.sinLawAngle(C, c, b);
			A = 180-C- B;
		}
		else if(A>0&&a>0&&b>0){
			B = Triangles.sinLawAngle(A, a, b);
			C = 180-A- B;
			c = Triangles.sinLawSide(B, b, c);
		
		}
		else if(A>0&&a>0&&c>0){
			C = Triangles.sinLawAngle(A, a, c);
			B = 180-A- C;
			b = Triangles.sinLawSide(C, c, B);
			
		}
		else if(B>0&&b>0&&a>0){
			A = Triangles.sinLawAngle(B, b, a);
			C = 180-A- B;
			c = Triangles.sinLawSide(B, b, C);
		}
		else if(B>0&&b>0&&c>0){
			C = Triangles.sinLawAngle(B, b, c);
			A = 180-C- B;
			a = Triangles.sinLawSide(B, b, A);
		}
		else if(C>0&&c>0&&a>0){
			A = Triangles.sinLawAngle(C, c, a);
			B = 180-A- C;
			b = Triangles.sinLawSide(C, c, B);
		}
		else if(C>0&&c>0&&b>0){
			B = Triangles.sinLawAngle(C, c, b);
			A = 180-B- C;
			a = Triangles.sinLawSide(C, c, A);
		}

		else if(A>0&&B>0&&c>0){
			C = 180-A- B;
			b = Triangles.sinLawSide(C, c, B);
			a = Triangles.sinLawSide(B, b, A);
		}
		else if(A>0&&B>0&&b>0){
			C = 180-A- B;
			c = Triangles.sinLawSide(B, b, C);
			a = Triangles.sinLawSide(B, b, A);
		}
		else if(A>0&&B>0&&a>0){
			C = 180-A- B;
			c = Triangles.sinLawSide(A, a, C);
			b = Triangles.sinLawSide(A, a, B);
		}
		else if(A>0&&C>0&&a>0){
			B = 180-A- C;
			b = Triangles.sinLawSide(A, a, B);
			c = Triangles.sinLawSide(B, b, C);
		}
		
		
		
		
		else if(A>0&&C>0&&b>0){
			B = 180-A- C;
			a = Triangles.sinLawSide(B, b, A);
			c = Triangles.sinLawSide(A, a, C);
		}
		
		
		else if(A>0&&C>0&&c>0){
			B = 180-A- C;
			b = Triangles.sinLawSide(C, c, B);
			c = Triangles.sinLawSide(B, b, C);
		}
		
		
		else if(B>0&&C>0&&a>0){
			A = 180-B- C;
			b =Triangles.sinLawSide(A, a, B);
			c = Triangles.sinLawSide(B, b, C);
		}
		
		else if(B>0&&C>0&&b>0){
			A = 180-B- C;
			a = Triangles.sinLawSide(A, B, b);
			c = Triangles.sinLawSide(A, a, C);
		}
		
		
		
		else if(B>0&&C>0&&c>0){
			A = 180-B- C;
			a = Triangles.sinLawSide(C, c, A);
			b = Triangles.sinLawSide(A, a, B);
		}
		else if(a>0&&b>0&&c>0){
			A=Triangles.cosLawAngle(a, b, c);
			C=Triangles.sinLawAngle(A, a, c);
			B=180-A-C;
		}
		
		
		
		//ambiguous triangles
		
		//Outputs
		System.out.println("Your angles are:");
		System.out.println("A= "+A+"\nB= "+B+"\nC= "+C+"\n");
		System.out.println("Your sides are:");
		System.out.println("a= "+a+"\nb= "+b+"\nc= "+c+"");
		
	
	}

}

