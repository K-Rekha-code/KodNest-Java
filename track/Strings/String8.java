class String8
{
    public static void main(String[] args)
    {
        String s1="I am a Java Learner";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.contains("Java"));
        System.out.println(s1.replace("Java","Python"));
       
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(4));
        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.lastIndexOf("Java"));
        System.out.println(s1.startsWith("I"));
        System.out.println(s1.endsWith("Learner"));
        
    
        
    }   
}