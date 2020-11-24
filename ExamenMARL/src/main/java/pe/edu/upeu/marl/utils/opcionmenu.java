package pe.edu.upeu.marl.utils;
import pe.edu.upeu.marl.examen.ResolucionExamen;

    public class opcionmenu {

        public static void opcionmenuOpt(LeerTeclado teclado) {
            int numberOption;
            ResolucionExamen examen = new ResolucionExamen();

            System.out.print("============================ BIENVENIDO AL SISTEMA ===============================");
            System.out.println("\nElige una opcion:");
            System.out.println("1° Ejercicio.");
            System.out.println("2° Ejercicio.");
            System.out.println("3° Ejercicio.");
            System.out.println("4° Ejercicio.");
                // "Escoge una opcion :\n[1] Ejercicio 1 DPL\n[2] Ejercicio 2 DPL\n[3] Ejercicio 3 DPL\n[4] Ejercicio 4 DPL\n[0] Salir\n");
            System.out.print("\nLa opcion elegida es: ");
            numberOption = teclado.lector(3);

            switch (numberOption) {
                case 1:
                    examen.problema1();
                    repeatCicle(teclado);
                    break;
                case 2:
                    examen.problema2();
                    repeatCicle(teclado);
                    break;
                case 3:
                    examen.problema3();
                    repeatCicle(teclado);
                    break;
                case 4:
                    int n, e;
                    System.out.println("Digite la base: ");
                    n = teclado.lector(0);
                    System.out.println("Digite el exponente: ");
                    e = teclado.lector(0);

                    System.out.println(examen.problema4(n, e));
                    repeatCicle(teclado);
                    break;
                case 0:
                    System.out.print("Opcion no existente.");
                    break;
                default:
                    System.out.println("Esa opcion no exciste en el sistema....");
                    repeatCicle(teclado);

            }
        }

        public static void repeatCicle(LeerTeclado teclado) {
            int numberOption;
            //System.out.print("\n\nDeseas volver al Menú: \n[1] SI \n[2] NO \n\n==> ");
            System.out.print("\nSi quiere regresar al menu principal marque:");
            System.out.print("\n_1 para no salir.");
            System.out.print("\n_2 para salir.");
            System.out.print("\n¿Que opcion eligio?");
            System.out.print("\n-->");
            numberOption = teclado.lector(3);

            if (numberOption == 1) {
                opcionmenuOpt(null);
            } else if (numberOption == 2) {
                System.out.println("\nGracias por utilizar el sistema vuelva pronto.");
            } else {
                System.out.println("\nOpcion invalido....");
                repeatCicle(null);
            }
        }
    }
