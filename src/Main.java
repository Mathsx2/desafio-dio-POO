import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso de Java...");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição Curso de Python...");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java...");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp...");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());
        
        System.out.println("-----");
        devMatheus.progredir();
        System.out.println("-----");

        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Matheus: " + devMatheus.getConteudosConcluidos());
        System.out.println("XP: " + devMatheus.calcularXp());

        Dev devSara = new Dev();
        devSara.setNome("Sara");
        devSara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sara: " + devSara.getConteudosInscritos());
        
        System.out.println("-----");
        devSara.progredir();
        devSara.progredir();
        System.out.println("-----");

        System.out.println("Conteúdos Inscritos Sara: " + devSara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Sara: " + devSara.getConteudosConcluidos());
        System.out.println("XP: " + devSara.calcularXp());

    }
}
