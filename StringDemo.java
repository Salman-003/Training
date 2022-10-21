class StringDemo{
	static String name="salman";
	static String address="perambalur";
	public static void main(String[] args){
		String client1="java";
		String client2="java";
		String client3=new String("java");
		String client4=new String("java");
		System.out.println(client1==client2);
		System.out.println(client1==client3);
		System.out.println(client3==client4);   
		System.out.println(System.identityHashCode(client1));
		System.out.println(System.identityHashCode(client2));
		System.out.println(System.identityHashCode(client3));
		System.out.println(System.identityHashCode(client4));
		client2="python";
		System.out.println(System.identityHashCode(client2));

		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf("sal"));
		System.out.println(name.concat(address));
		System.out.println(1 + 4 + name + " " + address);
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(address.replace('u','o'));
	}
}