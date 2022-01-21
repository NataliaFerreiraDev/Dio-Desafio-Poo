package br.com.dio;

import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Boot");
        curso2.setDescricao("Curso de Spring Boot");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println("Curso 1 : " + curso1);
//        System.out.println("Curso 2 : " + curso2);
//        System.out.println("Mentoria : " + mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNatalia = new Dev();
        devNatalia.setNome("Natalia");
        devNatalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Natalia" + devNatalia.getConteudosInscritos());
        devNatalia.progredir();
        System.out.println("-");
        devNatalia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Natalia" + devNatalia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Natalia" + devNatalia.getConteudosConcluidos());
        System.out.println("XP: " + devNatalia.calcularTotalXP());

        System.out.println("------------------------------------------------------");

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodrigo" + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rodrigo" + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rodrigo" + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXP());

    }

}
