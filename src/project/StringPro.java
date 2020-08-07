package project;

public class StringPro {
	public static void main(String args[])
	{
	
	String str="www.google.com";
	String newstr = str.replace("com", "in");
	System.out.println("After replacing com by in, the new string is "+newstr);
	
	String str2="tom is becoming a programmer";
	str2 = " "+str2;
	String newstr1="";
	for(int i=0; i<str2.length();i++)
	{
		char ch=str2.charAt(i);
		if(ch == ' ')
		{ 
			newstr1=newstr1+ch;
			i++;
			ch=str2.charAt(i);
			newstr1=newstr1+Character.toUpperCase(ch);
		}
		else
		{
			
			newstr1=newstr1+ch;
		}
			
	    
	}
	 System.out.println(newstr1);
	 
	 String[] s="one two three four five six".split(" ");
	 
	 String newst="";
	 int i;
	 
	 for(i=s.length-1; i>=0;i--)
	 {
		 
	 newst +=s[i] + " ";
	 
	 }
	 System.out.println(newst);
	 
	 String str3="The compiled code of java can run on mac linux or windows if jre is available on operating system.";
	 
	 String s1="";
	 for(int j=0 ; j<str3.length() ; j++)
	 {
		 char ch1=str3.charAt(j);
		 if(ch1 != 'o')
		 {
			 s1=s1+ch1;
		 }
		 else
		 {
			s1= s1+(char)(ch1-32);;
		 }
	 }
	 System.out.println(s1);
	 
	 String st="###%% Hello There !! &&%$#$#$";
	 String newstring= st.replaceAll("[#%&$]", "");
	 System.out.println(newstring);
	 
	
}
}
	 
