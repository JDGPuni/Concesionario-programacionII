package com.tucarro.test;

import com.tucarro.model.Moto;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
       Field[] atributos = Moto.class.getDeclaredFields();
        Field[] atributos2 = Moto.class.getSuperclass().getDeclaredFields();
        Field[] atributos3 = Moto.class.getSuperclass().getSuperclass().getDeclaredFields();
        System.out.println(" = " );
        Arrays.stream(atributos).forEach(System.out::println);
        System.out.println(" Atributos de moto ");
        Arrays.stream(atributos2).forEach(System.out::println);
        System.out.println(" Atributos de Automovil " );
        Arrays.stream(atributos3).forEach(System.out::println);
    }
}
