

class String6 {

    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "Java";
        if (str1 == str2) {
            System.out.println("ref are equal");
        } else {
            System.out.println("ref are not equal");
        }
        if (str1.equals(str2)) {
            System.out.println("equal");
        } else {
            System.out.println("In equals strings are not equal");
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("In equalsIgnorecase strings are equal");
        } else {
            System.out.println("In equalsIgnorecase strings are not equal");
        }
    }
}
