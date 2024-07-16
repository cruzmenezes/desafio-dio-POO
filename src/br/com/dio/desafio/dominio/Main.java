package br.com.dio.desafio.dominio;
import br.com.dio.desafio.dominio.Curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescriçao("descrição curso java");
        curso1.setCargaHoraria(120);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso PHP");
        curso2.setDescriçao("descrição curso PHP");
        curso2.setCargaHoraria(100);

        Curso curso3 = new Curso();

        curso3.setTitulo("Curso HTML");
        curso3.setDescriçao("descrição curso HTML");
        curso3.setCargaHoraria(80);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição de mentoria java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        System.out.println(mentoria);
    }
}
