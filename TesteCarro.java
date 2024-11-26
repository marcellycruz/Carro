import java.util.Scanner;

public class TesteCarro{
    public static void main(String[] args) {
        System.out.println("Caso de teste 1");
        
        Scanner input = new Scanner(System.in);

        Carro c1 = new Carro();
        System.out.println("Digite a marca do carro:");
        String m1 = input.nextLine();
        c1.setMarca(m1);

        System.out.println("Digite o modelo do carro:");
        String md1 = input.nextLine();
        c1.setModelo(md1);

        System.out.println("Digite o ano de fabricação do carro:");
        int anoFab1 = input.nextInt();
        c1.setAnoFabricacao(anoFab1);

        System.out.println("Digite a quilometragem do carro:");
        int quilo1 = input.nextInt();
        c1.setQuilometragem(quilo1);

        System.out.println("Digite a quantidade para adicionar à quilometragem:");
        int adicionar1 = input.nextInt();
        c1.adicionarQuilometragem(adicionar1);

        System.out.println("Digite a quantidade para subtrair da quilometragem:");
        int subtrair1 = input.nextInt();
        c1.subtrairQuilometragem(subtrair1);
        System.out.println(" ");
        System.out.println("Caso de teste 2");
        
        Scanner entrada = new Scanner(System.in);

        Carro c2 = new Carro();
        System.out.println("Digite a marca do carro:");
        String m = entrada.nextLine();
        c2.setMarca(m);

        System.out.println("Digite o modelo do carro:");
        String md2 = entrada.nextLine();
        c2.setModelo(md2);

        System.out.println("Digite o ano de fabricação do carro:");
        int anoFab2 = entrada.nextInt();
        c2.setAnoFabricacao(anoFab2);

        System.out.println("Digite a nova quilometragem do carro:");
        int quilo2 = entrada.nextInt();
        c2.setQuilometragem(quilo2);

        System.out.println("Digite a quantidade para adicionar à quilometragem:");
        int adicionar2 = entrada.nextInt();
        c2.adicionarQuilometragem(adicionar2);

        System.out.println("Digite a quantidade para subtrair da quilometragem:");
        int subtrair2 = entrada.nextInt();
        c2.adicionarQuilometragem(subtrair2);
        
        System.out.println(" ");
        System.out.println("Caso de teste 3");
        
        Carro c3 = new Carro();
        c3.setMarca("Ford");
        System.out.println("Digite a marca do carro: " + c3.getMarca());
       
        c3.setModelo("Mustang");
        System.out.println("Digite o modelo do carro: " + c3.getModelo());;
        
        c3.setAnoFabricacao(2020);
        System.out.println("Digite o ano de fabricação do carro: " + c3.getAnoFabricacao());
        
        c3.setQuilometragem(15000);
        System.out.println("Digite a quilometragem do carro: " + c3.getQuilometragem());
        
        c3.adicionarQuilometragem(345);
        System.out.println("Digite a quantidade para adicionar à quilometragem: " + 345);
       
        c3.subtrairQuilometragem(500);
        System.out.println("Digite a quantidade para subtrair da quilometragem: " + 500);

        
        System.out.println(" ");

        System.out.println("Informações do Carro:");
        System.out.println(c1.toString());
        System.out.println(" ");
        System.out.println(c2.toString());
        System.out.println(" ");
        System.out.println(c3.toString());

        input.close();
    }
}