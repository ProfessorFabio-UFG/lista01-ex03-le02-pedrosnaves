import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Moradores> moradores = new ArrayList<>();
        moradores.add(new Moradores ("Claudio", "70864285744", "62995874412", "12/10/1956", "masculino", "A", 102, 1565));
        moradores.add(new Moradores ("Ramon", "40122587466", "62980521466", "14/03/1945", "masculino", "B", 903, 2548));
        moradores.add(new Moradores ("Jorge", "00125863633", "62980566624", "10/11/1999", "masculino", "B", 801, 3305));
        moradores.add(new Moradores ("Abadia", "85966410002", "62999568874", "20/12/1975", "feminino", "C", 505, 4023));
        moradores.add(new Moradores ("Hilda", "11235684715", "62988451965", "19/09/1988", "feminino", "A", 302, 5900));

        for (int i = 0; i < moradores.size(); i++){
            System.out.println(moradores.get(i));
        }
    }
}
