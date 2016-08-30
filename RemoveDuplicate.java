public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=s1.nextLine();
		StringBuffer str1=new StringBuffer(str);
		for(int i=0;i<str1.length();i++){
			for(int j=i+1;j<str1.length();j++){
				if(str1.charAt(i)==str1.charAt(j)){
					str1=str1.deleteCharAt(j);
					j--;
				}
			}
			
	}System.out.println("The modified string is: "+str1);

}
}
