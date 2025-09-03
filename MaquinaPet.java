public class MaquinaPet {

    private boolean clean = true;

    private int agua = 30;

    private int shampoo = 10;

    private Pet pet;


    public MaquinaPet() {

    }


    public boolean isClean() {
        return clean;
    }

    public void darBanhoNoPet(){
        if (this.pet == null){
            System.out.println("Insira o Pet na máquina para começar");
            return;
        }
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " vai começar o banho.");

        this.agua -= 10;
        this.shampoo -= 2;
    }
      


    public void adicionarAgua(){
        if (agua == 30){
            System.out.println("A água está com capacidade máxima");
            return;
        }
        agua += 2;
        System.out.println("Água adicionada com sucesso");

    }

    public void adicionarShampoo(){
        if (shampoo == 30){
            System.out.println("O shampoo está com capacidade máxima");
            return;
        }
        shampoo += 2;
        System.out.println("Shampoo adicionado com sucesso");
    }

     public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean temPet(){
        if (pet == null){
            System.out.println("Coloque o pet na máquina");
            return false;
        }
        System.out.println("Tem o pet " + pet.getName() + " na máquina");
        return true;

    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja, limpe-a antes de adicionar um pet");
            return;
        }
        this.pet = pet;
    }

    public void limparMaquina(){
        if (pet != null){
            System.out.println("Retire primeiro o pet " + pet.getName() + " da máquina");
            return;
        }
        if (this.clean == false){
            this.agua -= 3;
            this.shampoo -=1;
            System.out.println("Máquina foi limpa, insira o Pet");
        }
        System.out.println("Máquina está limpa e pronta pra usar");      
    }

    public void removerPet(){
        if (temPet() == false){
            System.out.println("Nao tem pet para ser removido da máquina");
            return;
        }
        if (pet.isClean() == false){
            System.out.println("Primeiro dê um banho no pet " + this.pet.getName() + ". \nO pet ainda está sujo e aguardando.");
            return;
        }
        this.clean= this.pet.isClean();
        System.out.println("o pet " + this.pet.getName() + " está limpo");
        this.pet = null;
    }




}


