package basic;

public class PassByValue {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		b = a;
		System.out.println(b);
		
		User user1 = new User();
		User user2 = new User();
		user2 = user1;
		user1.setName("Tom");
		System.out.println(user2.getName());
		//twoDigtal();
		
		//静态变量(类属性)测试
		System.out.println(User.v);
		System.out.println(user1.v);
		System.out.println(user2.v);
		System.out.println("----------------------------");
		user1.v = 1;
		System.out.println(User.v);
		System.out.println(user1.v);
		System.out.println(user2.v);
		System.out.println("----------------------------");
		user2.v = 2;
		System.out.println(User.v);
		System.out.println(user1.v);
		System.out.println(user2.v);
		System.out.println("----------------------------");
		User.v = 0;
		System.out.println(User.v);
		System.out.println(user1.v);
		System.out.println(user2.v);
		System.out.println("----------------------------");
		
	}
	
	//十位数比个位数小的两位数
	public static void twoDigtal(){
		int count = 0;
		for (int i = 1; i < 9; i++){
			for (int j = i + 1; j < 10; j++){
				System.out.println(i * 10 + j);
				count ++;
			}
		}
		System.out.println("count : " + count);
	}

}
