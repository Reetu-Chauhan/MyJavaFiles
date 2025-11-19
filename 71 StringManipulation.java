class StringManipulation {
    public static void main(String[] args) {
        String firstName ="Reetu";
        String lastName = "Chauhan";
      //  String fullName = firstName+" "+lastName;
        String fullName= firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}
