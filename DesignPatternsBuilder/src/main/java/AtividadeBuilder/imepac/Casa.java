package AtividadeBuilder.imepac;

public class Casa {

    private int quartos;
    private int banheiros;
    private boolean churrasqueira;

    public Casa(){}

     public Casa(int quartos, int banheiros, boolean churrasqueira){

        this.quartos = quartos;
        this.banheiros = banheiros;
        this.churrasqueira = churrasqueira;

     }

    public int getBanheiros() {
        return banheiros;
    }

    public int getQuartos() {
        return quartos;
    }

    public boolean isChurrasqueira() {
        return churrasqueira;
    }
}
