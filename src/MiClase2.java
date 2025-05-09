public class MiClase2 implements Comparable<MiClase2> {
    int ai;
    String ac;

    public MiClase2() {
        ai = 1;
        ac = "";
    }

    public MiClase2(int aip, String acp) {
        ai = aip;
        ac = acp;
    }

    public MiClase2(int aip1, int aip2, String acp1, String acp2) {
        ai = aip1 + aip2;
        ac = acp1 + acp2;
    }

    public int getAi() {
        return ai;
    }

    public String getAc() {
        return ac;
    }

    public void setAi(int aip) {
        ai = aip;
    }

    public void setAc(String acp) {
        ac = acp;
    }


    @Override
    public String toString() {
        return "(" + ai + ", " + ac + ")";
    }

    //@Override
    public int compareTo(MiClase2 o) {
        /* Devolvemos -1 si el atributo ai del objeto que recibe la llamada es menor que el pasado por parámetro
           Devolvemos 0 si el atritbuto a1 del objeto que recibe la llamada es igual al del objeto pasado por parámetro
            Devolvemos 1 si el atritbuto a1 del objeto que recibe la llamada es mayor al del objeto pasado por parámetro
        */
        if (this.getAi() < o.getAi()) {
            return -1;
        } else if (this.getAi() == o.getAi()) {
            return 0;
        } else {
            return 1;
        }
    }
}

    /*public MiClase2 comparaMe(MiClase2 o, Comparator<MiClase2> comp){

    }*/

