public class Encryption {
	public static String output1;

	public static void main(String[] args) {
		userMethod("Book, Me."); 
		System.out.println(output1); 
	}

	public static void userMethod( String input1 ) {
	String[] str=input1.split(" ");

	String encrypt=" ";
	

	for(int i=0;i<str.length;i++){
		char keystring=' ';
		int keyValue=0;
		for(int j=str[i].length()-1;j>=0;j--){
			if(Character.isLetter(str[i].charAt(j))){
				keystring=str[i].charAt(j);
				keyValue=j;
				break;
			}
		}
		for(int x=0;x<str[i].length();x++){
			int k=0;
			if(Character.isUpperCase(keystring)){
				k=(int)keystring-64;
			}
			else if(Character.isLowerCase(keystring)){
				k=(int)keystring-96;
			}
			if(!(Character.isLetter(str[i].charAt(x)))){
				encrypt+=str[i].charAt(x);
			}
			else if(x==keyValue){
				encrypt+=str[i].charAt(x);
			}
			else{
				if(Character.isLowerCase(str[i].charAt(x))){
					int l=(int)str[i].charAt(x);
					int z=l-k;
					int p=(l-96)-k;
					if(p<1){
						z=z+26;
					}
					encrypt+=(char)z;
				}
				else if(Character.isUpperCase(str[i].charAt(x))){
					int l=(int)str[i].charAt(x);
					int z=l-k;
					int p=(l-64)-k;
					if(p<1){
						z=z+26;
					}
					encrypt+=(char)z;
				}
			}
		}
		encrypt+=" ";
		
	}
	output1=encrypt;// assign the output value at the end
	}
}
