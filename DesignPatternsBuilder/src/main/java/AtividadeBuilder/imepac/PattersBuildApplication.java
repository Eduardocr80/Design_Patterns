
package AtividadeBuilder.imepac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PattersBuildApplication {
    public static void main(String[] args) {
        SpringApplication.run(PattersBuildApplication.class, args);
        I builderCasa = new Casa2Quartos();
        builderCasa.buildQuartos();
        builderCasa.buildBanheiros();
        builderCasa.buildChurrasqueira();
        Casa casa1 = builderCasa.getCasa();

        System.out.println("Casa 1");
        System.out.println("Quartos: " + casa1.getQuartos());
        System.out.println("Banheiros: " + casa1.getBanheiros() );
        System.out.println("Churrasqueira: " + casa1.isChurrasqueira() );

        System.out.println(" --------------------------------------- ");

        I builderCasa1 = new Casa2Quartos2BanheirosChurrasqueiro();
        builderCasa1.buildQuartos();
        builderCasa1.buildBanheiros();
        builderCasa1.buildChurrasqueira();
        Casa casa2 = builderCasa1.getCasa();

        System.out.println("Banheiros: " + casa2.getBanheiros() );
        System.out.println("Quartos: " + casa2.getQuartos());
        System.out.println("Banheiros: " + casa2.getBanheiros() );
        System.out.println("Churrasqueira: " + casa2.isChurrasqueira() );




    }
}
