package Tests;

public class maxrepeatedchar {
	
	public static void maxrepeatchar() {
		
		String str = "GeeksofGeeks";
		String strlowercase = str.toLowerCase();
		int maxcount =0;
		char maxchar = str.charAt(0);
		for(int i=0; i<str.length(); i++) {
				int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					
					count++;
				}
				
				
				if(maxcount<count) {
					maxcount =count;
					maxchar = str.charAt(i);
				}
			}
		}
		System.out.println(maxchar+"="+maxcount);
	}
	public static void main(String[] args) {
		maxrepeatchar();
	}

}
