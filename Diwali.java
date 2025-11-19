public class Diwali {
    public static void main(String[] args) throws InterruptedException {
        String message = "💥💫🎇 HAPPY DIWALI REETU 🎇💫💥";
        String diyas[] = {
                "        ()        ",
                "       (  )       ",
                "      (    )      ",
                "     (      )     ",
                "    (        )    ",
                "   (          )   ",
                "  (    🪔🪔🪔  )  ",
                "   \\          /   ",
                "    \\        /    "
        };

        System.out.println("\n\n✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
        for (String line : diyas) {
            System.out.println(line);
            Thread.sleep(150); // little delay for effect
        }
        System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨\n");

        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            Thread.sleep(150); // animation effect
        }

        System.out.println("\n\nMay your life be as bright as these diyas! 🪔🌟");
    }
}

