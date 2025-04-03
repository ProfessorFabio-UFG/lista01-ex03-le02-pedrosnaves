import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Moradores> moradores = new ArrayList<>();

        String resposta;
        do {
            System.out.println("\nCadastro do morador " + (moradores.size() + 1));

            System.out.print("Nome do morador: ");
            String nome = sc.nextLine();

            System.out.print("CPF do morador: ");
            String cpf = sc.nextLine();

            System.out.print("Telefone para contato do morador: ");
            String contato = sc.nextLine();

            System.out.print("Data de nascimento do morador (DD/MM/AAAA): ");
            String data_nasc = sc.nextLine();

            System.out.print("Sexo do morador (M ou F): ");
            String sexo = sc.nextLine();

            System.out.print("Bloco do morador: ");
            String bloco = sc.nextLine();

            System.out.print("Apartamento do morador: ");
            int apartamento = sc.nextInt();

            System.out.print("Código de acesso do morador: ");
            int cod_acesso = sc.nextInt();
            sc.nextLine(); // limpar buffer

            Moradores m = new Moradores(nome, cpf, contato, data_nasc, sexo, bloco, apartamento, cod_acesso);
            moradores.add(m);

            System.out.println("Morador cadastrado com sucesso!\n");

            System.out.print("Deseja cadastrar outro morador? (S/N): ");
            resposta = sc.nextLine();

        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("\n===== Lista de moradores cadastrados =====");
        for (Moradores m : moradores) {
            System.out.println(m);
        }
    }
}
