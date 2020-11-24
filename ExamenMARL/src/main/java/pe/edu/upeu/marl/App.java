package pe.edu.upeu.marl;

import pe.edu.upeu.marl.examen.ResolucionExamen;
import pe.edu.upeu.marl.utils.LeerTeclado;
import pe.edu.upeu.marl.utils.opcionmenu;
/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        LeerTeclado teclado=new LeerTeclado();
        opcionmenu menu=new opcionmenu();
        menu.opcionmenuOpt(teclado);
    }
}
