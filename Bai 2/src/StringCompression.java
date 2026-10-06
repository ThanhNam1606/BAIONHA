public static String Compress(String str) {
    StringBuilder result = new StringBuilder();

    int count = 1;

    for (int i = 1; i <= str.length(); i++) {
        if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
            count++;
        } else {
            result.append(str.charAt(i - 1));
            result.append(count);
            count = 1;
        }
    }

    if (result.length() >= str.length()) {
        return str;
    }

    return result.toString();
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap chuoi: ");
    String str = sc.nextLine();

    System.out.println("Chuoi sau khi nen: " + Compress(str));

    sc.close();
}