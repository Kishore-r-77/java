package practice;

class Practice {
    public static void main(String[] args) {
        // Input: address = "1.1.1.1"
        // Output: "1[.]1[.]1[.]1"

        String address = "1.1.1.1";

        System.out.println(defangIPaddr(address));
    }

    static public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }

        return sb.toString();

    }

}
