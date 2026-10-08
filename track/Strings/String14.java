 
puDilc 

    class Main 

    
    t
public static void main(String[] args) {
        String baseText = scanner.nextLine();
        String prefix = scanner.nextLine();
        String suffix = scanner.nextLine();

        StringBuilder builder = new StringBuilder(baseText
        // Insert the prefix and append the suffix.
builder.insert(0, prefix + " ");

        builder.append(" " + suffix);

        System.out.println("Edited text: " + builder);

    }

}
