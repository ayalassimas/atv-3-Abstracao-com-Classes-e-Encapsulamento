import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static MaquinaPet maquinaPet = new MaquinaPet();

    public static void main(String[] args) {
       
        Pet pet = null;
        int opcao = -1;
        do{
            System.out.println("Bem-vindo à Máquina de Banho para Pets!");
            System.out.println("Escolha a operaçao:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com Shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de Shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

        
        switch (opcao) {
            case 1-> maquinaPet.darBanhoNoPet();
            case 2-> maquinaPet.adicionarAgua();
            case 3-> maquinaPet.adicionarShampoo();
            case 4-> verificarAgua() ;
            case 5-> verificarShampoo() ;
            case 6-> maquinaPet.temPet();
            case 7-> colocarPetNaMaquina();
            case 8-> maquinaPet.removerPet();
            case 9-> maquinaPet.limparMaquina(); 
            case 0-> System.out.println("Finalizando...");
            
        }

        }while (opcao != 0);
    }

    public static void colocarPetNaMaquina(){
        System.out.println("Qual o nome do pet?");
        var name = scanner.next();
        var pet = new Pet(name);
        maquinaPet.setPet(pet);
        System.out.println("O Pet " + pet.getName() + " foi colocado na máquina.");
    }

    public static void verificarAgua(){
        System.out.println("Nível de água: " + maquinaPet.getAgua() + "L");
    }
    public static void verificarShampoo(){
        System.out.println("Nível de shampoo: " + maquinaPet.getShampoo() + "L");
    }

}

            
