package br.com.gerenciador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> fibonacci = new ArrayList<>();
        System.out.println(fibonacci = fibonacci());
        int numero = 1;
        boolean resultado = isFibonacci(numero);
        if(resultado) System.out.println("O numero "+ numero +  " existe na sequencia!");

    }

        public static List<Integer> fibonacci(){

            List<Integer> list = new ArrayList<Integer>();
            int current = 1;
            int previous = 0;

            list.addAll(Arrays.asList(0, 1));

            while (current + previous <= 350) {
                current = current + previous;
                list.add(current);
                previous = current - previous;
            }

            return list;
        }


        public static Boolean isFibonacci(Integer a){

            List<Integer> queryList;
            queryList = fibonacci();

            if (queryList.contains(a))
                return true;

            return false;
        }
    }

