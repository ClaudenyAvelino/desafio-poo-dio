import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setTitulo("descrição mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Incritos Camila"+devCamila.getConteudosInscritos());
        System.out.println("--");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Incritos Camila"+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Cocluidos Camila"+devCamila.getConteudosConcluidos());
        System.out.println("XP:"+devCamila.calcularTotalXp());

        System.out.println("-------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Incritos João"+devJoao.getConteudosInscritos());
        System.out.println("--");
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("Conteúdos Incritos João"+devJoao.getConteudosInscritos());
        System.out.println("Conteúdos IConcluidos João"+devJoao.getConteudosConcluidos());
        System.out.println("XP:"+devJoao.calcularTotalXp());

    }
}
