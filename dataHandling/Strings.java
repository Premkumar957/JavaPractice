package datahandling;
public class Strings {
    public static void main(String[] args){
        System.out.println("Become the programmer you are meant to be!");

        //String
        String name = "Premkumar";
        // String city = new String("Chennai");
        //System.out.println(name);
        //System.out.println(city);

        //StringBuilder
        StringBuilder country = new StringBuilder("india");
        // StringBuilder village = new StringBuilder();
        //System.out.println(country);
        //System.out.println(village);


        //StringBuffer
        // StringBuffer state = new StringBuffer("Tamilnadu");
        // StringBuffer taluk = new StringBuffer();
        //System.out.println(state);
        //System.out.println(taluk);

        //String methods
        System.out.println(name.length());

        System.out.println(name.charAt(4));

        String subString = name.substring(0, 4);
        System.out.println(subString);

        String name2 = "PremKumar";
        System.out.println(name2 == name);

        System.out.println(name.equalsIgnoreCase(name2));

        System.out.println(name2.toUpperCase());
        System.out.println(name2.toLowerCase());

        String memory = "   Stack   ";
        System.out.println(memory.trim());

        System.out.println(name.replace("Kumar", "G"));

        System.out.println(name.startsWith("Prem"));
        System.out.println(name.endsWith("kumar"));

        String memory1 = "  ";
        System.out.println(memory1.isEmpty());
        System.out.println(memory1.isBlank());

        //StringBuilder and StringBuffer Methods
        country.append("Srilanka");
        System.out.println(country);

        country.insert(0, "Tamil");
        System.out.println(country);

        country.delete(10, 18);
        System.out.println(country);

        StringBuffer area = new StringBuffer("Prem");
        area.reverse();
        System.out.println(area);

        area.deleteCharAt(0);
        System.out.println(area);

        area.replace(0,5, "HI");
        System.out.println(area);

        area.setCharAt(1, 'E');
        System.out.println(area);

        StringBuilder sbb1 = new StringBuilder("Prem");
        System.out.println(sbb1);
        sbb1.setCharAt(3, 'G');
        System.out.println(sbb1);

        


    }

    public static void sayHello() {
        System.out.println("Become the programmer you are meant to be!");
    }
}