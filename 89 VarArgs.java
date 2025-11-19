class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Reetu"));
        System.out.println(concatenate("Reetu","Chauhan"));
        System.out.println(concatenate("Welcome","to","Java Programming"));
    }

    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");

        }
        return sb.toString();
    }
}
