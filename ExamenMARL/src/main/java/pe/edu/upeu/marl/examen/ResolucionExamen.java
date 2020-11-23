package pe.edu.upeu.marl.examen;

import javax.sound.midi.SysexMessage;

import pe.edu.upeu.marl.utils.LeerTeclado;

public class ResolucionExamen {
    
    public static LeerTeclado teclado = new LeerTeclado();
    
    public void problema1(){
        int cantidadauto=0,cost=0,catg=0,c1=0,c2=0,c3=0;
        double impt=0,imptotal=0;
        System.out.print("Digite cuanto autos tiene:");
        cantidadauto= teclado.lector(0);
        for (int i = 1; i <=cantidadauto; i++) {
            System.out.print("Digite la categoria del auto:");
            catg=teclado.lector(0);
            System.out.print("Digite el costo del auto:");
            cost=teclado.lector(0);
            if (catg==1) {
                impt=cost*0.1;
                c1=(int)(c1+impt);

            }
            if (catg==2) {
                impt=cost*0.07;
                c2=(int)(c2+impt);
                
            }
            if (catg==3) {
                impt=cost*0.05;
                c3=(int)(c3+impt);
                
            }
            imptotal=imptotal+impt;
            System.out.println("El valor del impuesto es:"+impt);
            System.out.println("");

        }
        System.out.println("La categoria 1 a pagar es:"+c1);
        System.out.println("La categoria 2 a pagar es:"+c2);
        System.out.println("La categoria 3 a pagar es:"+c3);
        System.out.println("El total a pagar es::"+imptotal);
    }
    public void problema2(){
        int p,f,m;
        System.out.println("Digite su numero de inicio:");
        p = teclado.lector(0);
        System.out.println("Digite su numero final:");
        f = teclado.lector(0);

        for (int i = p; i < f; i++) {
            for (int j = 0; j <= 12; j++) {
                m = i*j;
                System.out.println(i+ "x" + j + "=" + m);
                
            }
        }
    }
    public void problema3(){
        int r=1,l,p=0;
        System.out.println("Ingrese un numero:");
        l = teclado.lector(0);

        while(r<l){
            if (l%r==0) {
                p=p+r;
            }
            r++;
        }
        if (p==l) {
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }
    public int problema4(int x, int i){
          if (i <= 0){
              return 1;
          } 
          else{
                  return x*problema4(x, i -1);
            }
    }
}