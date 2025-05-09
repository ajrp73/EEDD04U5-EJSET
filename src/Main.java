/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author 026_areinpei
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> hss= new HashSet<>();

        System.out.println("hss empty: " + hss.isEmpty());  //Cjto vacio
        hss.add("Xiaomi");
        System.out.println("hss empty: " + hss.isEmpty()); //Cjto NO vacio

        hss.add("Samsung");
        boolean b= hss.add("Oppo");
        System.out.println("b: " + b); //Devuelve true pq Oppo no estaba en el conjunto hss

        b= hss.add("Oppo");
        System.out.println("b: " + b); //Devuelve false pq Oppo ya estaba en el conjunto hss
System.exit(0);

        HashSet<Integer> hsi= new HashSet<>();
        Integer i1 = 1;

        int i2=2;
        hsi.add(i1);



        
        System.out.println("hss size: " + hss.size());
        System.out.println("hss contains hola?: " + hss.contains("Hola"));
        System.out.println("hss contains Oppo?: " + hss.contains("Oppo"));
        
        if( hss.contains("Oppo1") ){
            System.out.println("hss contains Oppo1");
        }else{
            System.out.println("hss doesn't contain Oppo1");
        }
        b= hss.add("Oppo");
        System.out.println("b: " + b);
        System.out.println(hss);
        
        LinkedHashSet<MiClase> lhs = new LinkedHashSet<>();
        MiClase mc1= new MiClase();
        MiClase mc2= new MiClase(5, "seis");
        MiClase mc3= new MiClase(5, 8, "seis", "ocho");
        
        lhs.add(mc1);
        lhs.add(mc2);
        lhs.add(mc3);
        //lhs.add(new Integer(2));
        
        System.out.println(lhs);
        
        lhs.add(mc3);
        System.out.println(lhs);
        lhs.add(new MiClase());
        System.out.println(lhs);
        
        //Incrementar en uno el atributo ai de todos los
        //elementos del conjunto lhs
        Iterator<MiClase> imc= lhs.iterator();
        while(imc.hasNext()){
            MiClase e= imc.next();
            e.setAi(e.getAi()+1);
        }
        System.out.println(lhs);
        
        TreeSet<Integer> tsi = new TreeSet<>();
        
        tsi.add(40);
        tsi.add(25);
        tsi.add((int)28.9);
        tsi.add(1);
        tsi.add(0);
        tsi.add(2);
        tsi.add(2);
        
        
        System.out.println(tsi);
        System.out.println("menor: " + tsi.floor(2));
        System.out.println("menor: " + tsi.ceiling(26));
        System.out.println("menor: " + tsi.first());

        Iterator<Integer> itsi= tsi.iterator();
        int suma=0;
        while(itsi.hasNext()){
            Integer vi= itsi.next();
            suma+= vi;
            
        }
        System.out.println(tsi);
        System.out.println("Suma: " + suma);
        
        TreeSet<MiClase> tsmc = new TreeSet<>();
       
        MiClase mc6= new MiClase(15, "ocho");
        MiClase mc5= new MiClase(5, "seis");
        MiClase mc4= new MiClase(1, "siete");
  
        
        /*
        tsmc.add(mc4);
        tsmc.add(mc5);
        tsmc.add(mc6);
        System.out.println(tsmc);
        */
        
        System.out.println("Estructura tsmc2: ");
        TreeSet<MiClase> tsmc2 = new TreeSet<>(Comparator.comparingInt(MiClase::getAi));
        tsmc2.add(mc6);
        tsmc2.add(mc5);
        tsmc2.add(mc4);
        System.out.println(tsmc2);

        
        MiClase2 mc26= new MiClase2(15, "ocho");
        MiClase2 mc25= new MiClase2(5, "seis");
        MiClase2 mc24= new MiClase2(1, "siete");

        
        TreeSet<MiClase2> tsmc3 = new TreeSet<>();
        tsmc3.add(mc26);
        tsmc3.add(mc25);
        tsmc3.add(mc24);
        System.out.println("Estructura tsmc3: ");
        System.out.println(tsmc3);
  
    
        
        MiClase3 mc36= new MiClase3(15, "uno");
        MiClase3 mc361= new MiClase3(16, "uno");

        MiClase3 mc35= new MiClase3(5, "seis");
        MiClase3 mc34= new MiClase3(1, "siete");
        
        
        TreeSet<MiClase3> tsmc4 = new TreeSet<>();
        tsmc4.add(mc34);
        tsmc4.add(mc35);
        tsmc4.add(mc36);
        tsmc4.add(mc361);
        System.out.println("Estructura tsmc4: ");
        System.out.println(tsmc4);
  
        MiClase4 mc42= new MiClase4(11, "Pepe!!!!!!!!");
        MiClase4 mc43= new MiClase4(11, "Pepito");
        MiClase4 mc41= new MiClase4(11, "Pepito grillo");
        MiClase4 mc44= new MiClase4(11, "holaaaaa");
        
        System.out.println("mc43 nv: " + mc43.getNumeroVocales());
        System.out.println("mc43 nv: " + mc43.getNumeroVocalesTop());
        System.out.println("mc43 nv: " + mc43.getNumeroVocalesTopMax());
        
        TreeSet<MiClase4> tsmc5 = new TreeSet<>();
        tsmc5.add(mc41);
        tsmc5.add(mc42);
        tsmc5.add(mc43);
        tsmc5.add(mc44);
        
        
        System.out.println(tsmc5);

        String c1= "Ahola";
        String c2= "Ahola";
        if (c1.compareTo(c2) == 0){
            System.out.println("Las cadenas son iguales");
        }else if (c1.compareTo(c2) < 0){
            System.out.println(c1+" va antes que " + c2);
        }else{
            System.out.println(c2+" va antes que " + c1);
        }
        
        
    }
    
}
