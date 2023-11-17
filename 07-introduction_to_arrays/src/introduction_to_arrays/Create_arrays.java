package introduction_to_arrays;

public class Create_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化数组
		//int[] numbers = new int[100];//new创建的数组会得到默认的0值。
		//Java也可以这么创建数组：int[] scores = {87, 98, 69, 54, 65, 76, 87, 99}; 直接使用大括号给出数组的所有元素的初始值，不需要给出数组的大小，编译器替我们数数。
//		int[] scores = {87, 98, 69, 54, 65, 76, 87, 99, 100, 103};
//		System.out.println(scores.length);
//		for ( int i=0; i<scores.length; i++ ) {
//			System.out.print(scores[i]+" ");
//		}
		
		
		//数组变量赋值:java数组的核心：数组变量是“管理者”，而不是“所有者”
//		System.out.printf("\n\n");
//		int[] a = new int[10];
//		a[0] = 5;
//		int[] b = a;
//		System.out.println(a[0]);
//		b[0] = 16;
//		System.out.println(a[0]);
//		System.out.println(b[0]);
		
		
		//练习：
//		int[] a1 = {1,2,3,4,5};
//		int[] a2 = a1;
//		for ( int i=0; i<a2.length; i++ ) {
//			a2[i] ++;
//		}
//		for ( int i=0; i<a1.length; i++ ) {
//			System.out.println(a1[i]);
//		}
		
		//注：数组变量：
		//数组变量是数组的管理者而非数组本身；
		//数组必须创建出来如然后交给数组变量来管理；
		//数组变量之间的赋值是管理权限的赋予；
		//数组变量之间的比较是判断是否管理同一个数组。
//		int[] a = {1,2,3,4,5};
//		
//		int[] b = a;
//		System.out.println(a==b);
//		
//		int[] b2 = {2,3,4,5,6};
//		System.out.println(a==b2);
//		
//		int[] b3 = {1,2,3,4,5};
//		System.out.println(a==b3);
		
		
		//复制数组：
		//必须遍历源数组，将每个元素逐一拷贝给目的数组
//		int[] a = {1,2,3,4,5};
//		int[] b = new int[a.length];
//		for ( int i=0; i<b.length; i++ ) {
//			b[i] = a[i];
//		}
//		for ( int i=0; i<b.length; i++ ) {
//			System.out.println(b[i]);
//		}
//		System.out.println(a==b);
		
		//在上面基础上，如果想要比较两个数组是否相等，我们也需要遍历数组：
		int[] a = {1,2,3,4,5};
		int[] b = new int[a.length];
		for ( int i=0; i<b.length; i++ ) {
			b[i] = a[i];
		}
		boolean isEqu = true;
		for ( int i=0; i<b.length; i++ ) {
			if ( a[i] != b[i] ) {
				isEqu = false;
				break;
			}
		}
		System.out.println(isEqu);
		
	}

}
