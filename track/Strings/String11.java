
class String11 {

    public staitc

    void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.append("Java");
        System.out.println(sb);

    }
}
