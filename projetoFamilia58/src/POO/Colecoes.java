package POO;

import java.util.*;

public class Colecoes {
    public static void main(String[] args) {

        List<Integer> minhaLista = new ArrayList<Integer>();

        minhaLista.add(2);
        minhaLista.add(1);
        minhaLista.add(3);
        minhaLista.add(2);
        minhaLista.add(3);
        minhaLista.add(7);

        for(Integer listaElementos: minhaLista){

            System.out.println(listaElementos);

        }

        System.out.println("\nRemovendo um elemento da lista...");
        System.out.println();
        minhaLista.remove(0);

        for(Integer listaElementos:minhaLista){
            System.out.println(listaElementos);
        }

        int primeiroElemento = minhaLista.get(0);
        System.out.println("\nO primeiro elemento foi: "+primeiroElemento);
        System.out.println();

        for(int i=0;i<minhaLista.size();i++){

        }

        Collections.sort(minhaLista);
        System.out.println("\nDepois de ordenada...");
        System.out.println(minhaLista);
        System.out.println();

        Set<Integer> meuSet = new HashSet<Integer>();

        meuSet.add(5);
        meuSet.add(1);
        meuSet.add(3);
        meuSet.add(4);
        meuSet.add(2);
        meuSet.add(5);

        Iterator<Integer> iMeuSet = meuSet.iterator();

        while(iMeuSet.hasNext()){
            System.out.println(iMeuSet.next());
            System.out.println(iMeuSet.next());
        }

    }
}
