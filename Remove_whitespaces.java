public class Remove_whitespaces
{
    public static void main(String[] args) {
        String name = "Well     come";

        name = name.replaceAll("\\s","");
        System.out.println(name);
    }
}