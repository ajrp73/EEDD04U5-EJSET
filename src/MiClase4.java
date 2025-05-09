public class MiClase4 implements Comparable<MiClase4>{
    int ai;
    String ac;

    public MiClase4(){
        ai= 1;
        ac= "";
    }

    public MiClase4(int aip, String acp){
        ai= aip;
        ac= acp;
    }

    public MiClase4(int aip1, int aip2, String acp1, String acp2){
        ai= aip1 + aip2;
        ac= acp1 + acp2;
    }

    public int getAi(){return ai;}
    public String getAc(){return ac;}

    public void setAi(int aip){ai = aip;}
    public void setAc(String acp){ac= acp;}


    @Override
    public String toString(){
        return "(" + ai + ", " + ac + ")";
    }

    public int getNumeroVocales(){
        int numVocales=0;

        //Recorrer String para ver si cada caracter es o no una vocal

        for(int i=0; i<this.getAc().length(); i++){
            switch(this.getAc().charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': numVocales++;
            }
        }
        return numVocales;
    }

    public int getNumeroVocalesTop(){
        int numVocales=0;

        //Recorrer String para ver si cada caracter es o no una vocal

        for(int i=0; i<this.getAc().length(); i++){
            char []aux= new char[1];
            aux[0]=this.getAc().charAt(i);
            if  ("aeiouAEIOU".contains(new String(aux))){
                numVocales++;
            }

        }
        return numVocales;
    }


    public int getNumeroVocalesTopMax(){
        int numVocales=0;

        //Recorrer String para ver si cada caracter es o no una vocal

        for(int i=0; i<this.getAc().length(); i++){
            char aux=this.getAc().charAt(i);
            if  ("aeiouAEIOU".indexOf(aux) >=0 ){
                numVocales++;
            }

        }
        return numVocales;
    }


    public int[] countTiposVocales(){
        int []vocales= new int[5];

        for(int i=0; i<this.getAc().length(); i++){
            switch(this.getAc().charAt(i)){
                case 'a':
                case 'A': vocales[0]++;
                    break;
                case 'e':
                case 'E': vocales[1]++;
                    break;
                case 'i':
                case 'I': vocales[2]++;
                    break;
                case 'o':
                case 'O': vocales[3]++;
                    break;
                case 'u':
                case 'U': vocales[4]++;
                    break;
            }
        }
        return vocales;
    }







    @Override

    public int compareTo(MiClase4 o){
        /* Devolvemos -1 si el atributo ai del objeto que recibe la llamada es menor que el pasado por parámetro
           Devolvemos 0 si el atritbuto a1 del objeto que recibe la llamada es igual al del objeto pasado por parámetro
            Devolvemos 1 si el atritbuto a1 del objeto que recibe la llamada es mayor al del objeto pasado por parámetro
        */
        if(this.getNumeroVocalesTopMax() < o.getNumeroVocalesTopMax()){
            return -1;
        }else if (this.getNumeroVocalesTopMax() == o.getNumeroVocalesTopMax()){
            return 0;
        }else{
            return 1;
        }
    }

    /*public MiClase2 comparaMe(MiClase2 o, Comparator<MiClase2> comp){

    }*/


}

