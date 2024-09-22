package AtividadeBuilder.imepac;

public class Casa2Quartos2BanheirosChurrasqueiro implements I {
    Casa casa = new Casa();

    public Casa2Quartos2BanheirosChurrasqueiro() {
        casa = new Casa(2, 2, true);
    }

    @Override
    public void buildQuartos(){

        System.out.println("Um quarto 2,5 x 1,98 outro 2,3 x 1,80");


    }

    @Override
    public void buildBanheiros() {
        System.out.println("2 Banheiros 2,3 x 1,25");
    }

    @Override
    public void buildChurrasqueira() {
        System.out.println("Com Churrasqueira");

    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}

