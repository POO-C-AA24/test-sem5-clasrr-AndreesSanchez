import java.util.Scanner;
public class testTerreno {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Terreno arrayTerrenos[] = new Terreno[2];
        int i = 0;
        String opc; 
        while (true){
            System.out.print("Dame alto, ancho y vmc: ");
            arrayTerrenos[i] = new Terreno(tc.nextDouble(),tc.nextDouble(),tc.nextDouble());
            i++;
            System.out.print("Desea mas terrenos? (S/N): ");
            opc = tc.next();
            
            System.out.println();
            if(opc.equals("N") || (i >= arrayTerrenos.length)) break;
        }
        System.out.println("LOS TERRENOS INGRESADOS Y CALCULADOS SON: ");
        for (Terreno terr: arrayTerrenos){
        terr.calcularArea(); terr.calcularArea();
        System.out.println(terr);}
    }
}
      //  Terreno arrayTerrenos[] = {new Terreno(10,3,2),new Terreno(20,10,1),new Terreno(40,10,2) };
      //  for(Terreno terreno:arrayTerrenos){
      //      terreno.calcularArea();
      //      terreno.calcularCostoFinal();
      //      System.out.println(terreno);
      //  }
      //  Terreno t1 = new Terreno(40,10,2);
      //  Terreno t2 = new Terreno(21,12,2);
      //  Terreno t3 = new Terreno(10,10,2);
      //  Terreno arrayTerreno[] = new Terreno[3];
      //  arrayTerreno[0] = t1;
      //  arrayTerreno[1] = t2;
      //  arrayTerreno[2] = t3;
      //  for(Terreno terreno:arrayTerreno){
      //      terreno.calcularArea();
      //      terreno.calcularCostoFinal();
      //      System.out.println(terreno);
      // }
      //  for(int i= 0; i < arrayTerreno.length; i++){
      //      arrayTerreno[i].calcularArea();
      //      arrayTerreno[i].calcularCostoFinal();
      //      System.out.println(arrayTerreno[i]);
      //  }
      //  t1.calcularArea();
      //  t1.calcularCostoFinal();
      //  System.out.println(t1);
      //  t2.calcularArea();
      //  t2.calcularCostoFinal();
      //  System.out.println(t2);
      //  t3.calcularArea();
      //  t3.calcularCostoFinal();
      //  System.out.println(t3);  