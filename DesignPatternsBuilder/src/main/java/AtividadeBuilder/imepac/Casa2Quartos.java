package AtividadeBuilder.imepac;

    public class Casa2Quartos implements I{

    Casa casa = new Casa();

     public Casa2Quartos() {
          casa= new Casa(2,1,false);
        }
        public void buildQuartos(){

        System.out.println("Um quarto 2,5 x 1,98 outro 2,3 x 1,80");

}

        @Override
        public void buildBanheiros() {
            System.out.println("Benheiro 2,3  x 1,25");

        }

        @Override
        public void buildChurrasqueira() {
            System.out.println("Sem churrasqueira");

        }

        @Override
        public Casa getCasa() {
            return casa;
        }
    }
