
class String16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char arr[] = text.toCharArray();
        char newarr[] = new char[arr.length];
        int j = newarr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newarr[j] = arr[i];
            j--;

        }
        String newstr = new String(newarr);
        System.out.println(newstr);

    }
}
