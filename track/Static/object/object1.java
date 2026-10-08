
class object1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        obj t1 = new obj();
        t1.setData(y);
        t1.getData();
        sc.close();
    }
}

class obj {

    private int paageNum;

    public void SetData(int x) {
        if (x > 0 && x <= 200) {
            pageNum = x;
        } else {
            System.out.println("invalid page number");
        }
    }

    public void getData() {
        System.out.println(paageNum);
    }
}
