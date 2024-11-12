
public class ofek {


	//pages 26-32
	public static int q21(String str, int size) {
		if (size==1) {
			return 0;
		}
		else {
			if(str.charAt(size)>= 'a' && str.charAt(size) <= 'z') {
				return q21(str,size-1)+1;
			}
			else
				return q21(str,size-1)+0;
		}
	}


	public static String q22(String s) {
		if (s.length()<3)
			return s;
		else {
			String e = s.substring(0,3);
			return e+ '*' +q22(s.substring(3));
		}
	}


	public static String q23(String a) {
		if (a.length()<1)
			return "";
		else {
			return a.charAt(a.length()-1)+q22(a.substring(0,a.length()-1));
		}
	}

	public static String q24(char a, char b) {
		if (a<b)
			return a+q24(++a,b);
		if (a==b)
			return b+ "";
		else 
			return "";
	}


	public static void p25(int n) {
		System.out.println(n + "divides:");
		q25(n,1);
	}
	public static void q25(int n,int i) {
		if ((n !=0) && !(i>n)) {
			if (n%i ==0) {
				System.out.println(i + ", ");
				q25(n,i+1);
			}
			else
				q25(n,i+1);
		}
	}


	public static void q26(int n) {
		if (n/10 ==0) {
			if (n%2==0)
				System.out.println(n);
		}
		else {
			if(n%10%2 ==0)
				System.out.println(n%10);
			q26(n/10);
		}
	}

	public static void q27(int x, int y) {
		q27(x,y,x);
	}

	public static void q27(int x, int y, int orig) {
		if (x>9) {
			System.out.println("");
			q27(orig, y+1, orig);
		}
		if (x<=9 && y<=9) {
			System.out.println(x*y + " ");
			q27(x+1, y, orig);
		}

	}
	
	public static void q28(int a1, int d, int n) {
		if (n==1)
			System.out.println(a1);
		else {
			System.out.println(a1+ ",");
			q28((a1+d),d,(n-1));
		}
	}
	
	public static int q29(int x, int y) {
		if (x>1)
			return q29(x-1,0)+(x-1);
		else
			return 1;
	}
	
	public static void q29(int x) {
		if (x>0) {
			System.out.println(q29(x,0)+ " ");
			q29(x-1);
		}
	}
	
	
	public static void q31(int []a,int i) {
		if (i>a.length-1)
			return;
		if (i%2!=0) {
			System.out.println(a[i]+ ",");
			q31(a,i+1);
		}
		else
			q31(a,i+1);
	}
	
	public static void q32(int []a) {
		q32(a,0);
	}
	
	private static void q32(int[]a,int i) {
		if (i<a.length-1) {
			if(a[i]<a[i+1])
				System.out.println(a[i]);
			q32(a,i+1);
		}
	}
	
	public static int q42a(int n) {
		int result = q42b(n);
		if (result <10)
			return result;
		else
			return q42a(result);
	}
	
	public static int q42b(int n) {
		if (n<10)
			return n;
		if (n==0)
			return 0;
		return n%10 + q42b(n/10);
	}
	
	//question 2
	public static boolean issorted(int n) {
        if (n < 10) {
            return true;
        }
        int lastDigit = n % 10;
        int secondLastDigit = (n / 10) % 10;
        if (lastDigit < secondLastDigit) {
            return false;
        }
        return issorted(n / 10);
    }
	
	//question 3
	public static int counttimes(int[] arr, int number, int index) {
        if (index == arr.length) {
            return 0;
        }
        int count = (arr[index] == number) ? 1 : 0;
        return count + counttimes(arr, number, index + 1);
    }

}
