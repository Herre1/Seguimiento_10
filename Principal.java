import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.util.Comparator;
import java.util.Iterator;


public class Principal {

  public static void main(String[] args) {
  Scanner lector = new Scanner(System.in);
  ArrayList<Country> lista= new ArrayList<Country>();
 


  boolean salir= false;
  while (salir==false){ 
     System.out.println("Bienvenido \n1. Ingresar un país\n2. Mostrar medallería \n3. Mostrar total de medallas\n4. Mostrar países");
     int menu=lector.nextInt();
     

    switch (menu) {
        case 1:
        System.out.println("Ingrese el nombre del pais :");
        String pais=lector.nextLine();
        pais=lector.nextLine();
        System.out.println("Ingrese el tipo de medalla \n1.Bronce \n2.Plata \n3.Oro  ");
        int aux=lector.nextInt();
        
        String tipoMedalla;
        if (aux==1){
            tipoMedalla="Bronce";
        }else if (aux == 2){
            tipoMedalla="plata";
        }else tipoMedalla="Oro";

        System.out.println("Ingrese la cantidad de medallas");
        int cantMedallas = lector.nextInt();
        Country p1= new Country (pais,tipoMedalla,cantMedallas);

        lista.add(p1);

            break;
        case 2:
        System.out.println("Mostrar Todos los datos : ");
        Collections.sort(lista);
        int i =0;
        for (Country p :lista) 
        {
           i++; 
          System.out.print(i+". Pais: "+p.getNombre()+" Tipo de medallas : "+p.getTipoMedalla()+" Cantidad de medallas "+p.getmedallas()+"\n");
        }
            break;
        case 3:
        System.out.println("Orden Por Medallas: ");
        Collections.sort(lista);
        i =0;
        for (Country p :lista) 
        {
           i++; 
          System.out.print(i+". Pais: "+p.getNombre()+" Cantidad de medallas "+p.getmedallas()+"\n");
        }
            break;
        case 4:
        System.out.println("Orden por alfabeto: ");
        Iterator<Country> custIterator = lista.iterator();
        Collections.sort(lista,new CustomerSortingComparator());
        //Country.compareName(p1);
        for (Country p : lista) {
            System.out.println(p);
        }
            break;


        default:
            break;
    }   
} 
}
static class CustomerSortingComparator implements Comparator<Country> {

@Override
public int compare(Country p1,Country p2)
{

    // for comparison
    int NameCompare = p1.getNombre().compareTo(p2.getNombre());

    return NameCompare;
}

}
}