import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Criando os conteúdos
        Conteudo cursoMaven = new Curso("Maven", "Dominando o Maven", 6);
        Conteudo cursoSpring = new Curso("SpringBoot", "Aprenda o Spring framework", 12);
        Conteudo cursoSQL = new Curso("SQL server", "Domine o SQL", 15);
        Conteudo mentoriaAPI = new Mentoria("API REST", "Construindo uma API do zero", LocalDate.now());

        //Criando o bootcamp
        BootCamp bootCamp = new BootCamp("Bootcamp Java Developer", "Bootcamp Java Back-End");

        //Adicionando os conteúdos ao bootcamp
        bootCamp.getConteudos().add(cursoMaven);
        bootCamp.getConteudos().add(cursoSpring);
        bootCamp.getConteudos().add(cursoSQL);
        bootCamp.getConteudos().add(mentoriaAPI);

        //Criando os devs
        Dev devKassio = new Dev("Kássio");
        Dev devFilipe = new Dev("Filipe");

        //Adicionando os devs ao bootcamp e vinculando aos conteudos inscritos.
        devKassio.inscreverBootcamp(bootCamp);
        devFilipe.inscreverBootcamp(bootCamp);

        //Conteúdos inscritos dos Devs
        System.out.printf("Cursos Inscritos - Kássio%n%s",devKassio.getCounteudosInscritos());
        System.out.printf("%n------------------------------------------------------------%n");
        System.out.printf("Cursos Inscritos - Filipe%n%s",devFilipe.getCounteudosInscritos());

        //Concluindo um curso no bootcamp
        devKassio.progredir();
        System.out.printf("%n------------------------------------------------------------%n");
        System.out.printf("Cursos Inscritos - Kássio%n%s",devKassio.getCounteudosInscritos());
        System.out.printf("%n------------------------------------------------------------%n");
        System.out.printf("Cursos Concluídos - Kássio%n%s",devKassio.getCounteudosConcluidos());

        //Exibindo a experiência total do dev
        System.out.printf("%n------------------------------------------------------------%n");
        System.out.printf("XP total - Kássio: %s", devKassio.calcularTotalXp());

        //Exibindo os devs inscritos no bootcamp.
        System.out.printf("%n------------------------------------------------------------%n");
        System.out.println("Devs inscritos no Bootcamp");
        bootCamp.getDevsInscritos().forEach(System.out::println);
    }
}
