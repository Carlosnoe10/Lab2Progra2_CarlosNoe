package lab2progra2_carlosnoé;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2Progra2_CarlosNoé {

    public static void main(String[] args) {
        Scanner k1ng = new Scanner(System.in);
        ArrayList<Usuario> ListaUsu = new ArrayList();
        ArrayList Propi = new ArrayList();

        System.out.println("--Bienvenido al menu--");
        System.out.println("Ingrese el numero adecuado a la opcion que desea ingresar: ");
        System.out.println("1. Registro de Inmueble/Solar");
        System.out.println("2. Manejo de Estados");
        System.out.println("3. Log In/Sign Up");
        System.out.println("4. Salir");

        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 4) {
                if ((menu > 0) && (menu < 4)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            for (int j = 0; j < 1; j++) {
                                System.out.println("1. Crear Casas/Edificios/Solares ");
                                System.out.println("2. Listar Casas/Edificios/Solares");
                                System.out.println("3. Modificar Casas/Edificios/Solares");
                                System.out.println("4. Borrar Casas/Edificios/Solares");
                                System.out.println("5. Vender Casas/Edificios/Solares");
                                System.out.println(" 6. Atras");
                                int Mini = k1ng.nextInt();
                                while (Mini != 6) {
                                    if ((Mini > 0) && (Mini < 6)) {
                                        j++;
                                        switch (Mini) {
                                            case 1:
                                                System.out.println("Agregar");
                                                System.out.println("1. Casas");
                                                System.out.println("2. Edificio");
                                                System.out.println("3. Solares");
                                                int Moon = k1ng.nextInt();
                                                for (int w = 0; w < 1; w++) {
                                                    while (Moon != 4) {
                                                        if ((Moon > 0) && (Moon < 4)) {
                                                            w++;
                                                            switch (Moon) {
                                                                case 1:
                                                                    CrearCasas();
                                                                    break;
                                                                case 2:
                                                                    CrearEdificios();
                                                                    break;
                                                                case 3:
                                                                    CrearSolares();
                                                                    break;
                                                            }
                                                        } else {
                                                            w--;
                                                            System.out.println("Termino Incorrecto");
                                                        }
                                                    }
                                                }
                                            case 2:
                                                System.out.println("Listar");
                                                System.out.println("1. Casas");
                                                System.out.println("2. Edificio");
                                                System.out.println("3. Solares");
                                                int Malcom = k1ng.nextInt();
                                                for (int w = 0; w < 1; w++) {
                                                    while (Malcom != 4) {
                                                        if ((Malcom > 0) && (Malcom < 4)) {
                                                            w++;
                                                            switch (Malcom) {
                                                                case 1:
                                                                    ListarCasas();
                                                                    break;
                                                                case 2:
                                                                    ListarEdificios();
                                                                    break;
                                                                case 3:
                                                                    ListarSolares();
                                                                    break;
                                                            }
                                                        } else {
                                                            w--;
                                                            System.out.println("Termino Incorrecto");
                                                        }
                                                    }
                                                }
                                                break;
                                            case 3:
                                                System.out.println("Modificar");
                                                System.out.println("1. Casas");
                                                System.out.println("2. Edificio");
                                                System.out.println("3. Solares");
                                                int Miles = k1ng.nextInt();
                                                for (int w = 0; w < 1; w++) {
                                                    while (Miles != 4) {
                                                        if ((Miles > 0) && (Miles < 4)) {
                                                            w++;
                                                            switch (Miles) {
                                                                case 1:
                                                                    MODCasas();
                                                                    break;
                                                                case 2:
                                                                    MODEdificios();
                                                                    break;
                                                                case 3:
                                                                    MODSolares();
                                                                    break;
                                                            }
                                                        } else {
                                                            w--;
                                                            System.out.println("Termino Incorrecto");
                                                        }
                                                    }
                                                }
                                                break;
                                            case 4:
                                                System.out.println("Borrar");
                                                System.out.println("1. Casas");
                                                System.out.println("2. Edificio");
                                                System.out.println("3. Solares");
                                                int Jett = k1ng.nextInt();
                                                for (int w = 0; w < 1; w++) {
                                                    while (Jett != 4) {
                                                        if ((Jett > 0) && (Jett < 4)) {
                                                            w++;
                                                            switch (Jett) {
                                                                case 1:
                                                                    EliminarCasa();
                                                                    break;
                                                                case 2:
                                                                    EliminarEdificios();
                                                                    break;
                                                                case 3:
                                                                    EliminarSolar();
                                                                    break;
                                                            }
                                                        } else {
                                                            w--;
                                                            System.out.println("Termino Incorrecto");
                                                        }
                                                    }
                                                }
                                                break;
                                            case 5:
                                                System.out.println("Borrar");
                                                System.out.println("1. Casas");
                                                System.out.println("2. Edificio");
                                                System.out.println("3. Solares");
                                                int Mas = k1ng.nextInt();
                                                for (int w = 0; w < 1; w++) {
                                                    while (Mas != 4) {
                                                        if ((Mas > 0) && (Mas < 4)) {
                                                            w++;
                                                            switch (Mas) {
                                                                case 1:
                                                                    VenderCasa();
                                                                    break;
                                                                case 2:
                                                                    VenderEdificio();
                                                                    break;
                                                                case 3:
                                                                    VenderSolar();
                                                                    break;
                                                            }
                                                        } else {
                                                            w--;
                                                            System.out.println("Termino Incorrecto");
                                                        }
                                                    }
                                                }
                                                break;
                                            case 6:
                                                System.out.println("Atras");
                                                break;
                                        }

                                    } else {
                                        System.out.println("Ingrese un numero adecuaduo");
                                        j--;
                                    }
                                }
                            }
                            break;

                        case 2:

                            break;
                        case 3:
                            break;

                    }// switch menu p
                    System.out.println("--Bienvenido al menu--");
                    System.out.println("Ingrese el numero adecuado a la opcion que desea ingresar: ");

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void CrearCasas() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado= new Scanner(System.in); 
        for (int w = 0; w < 1; w++) {
            System.out.println("Ingrese Numero de casa: ");
            int NumCasa = k1ng.nextInt();
            System.out.println("Ingrese Numero de bloque: ");
            int Numbloq = k1ng.nextInt();
            System.out.println("Ingrese el ancho: ");
            double anchio = k1ng.nextInt();
            System.out.println("Ingrese el numero de banios");
            int Numban = k1ng.nextInt();
            System.out.println("Ingrese el numero de cuartos");
            int NumCuart =k1ng.nextInt();
            System.out.println("Ingrese el largo");
            double largo= k1ng.nextInt();
            System.out.println("Ingrese ");
            
            if (() &&   ()) {
                w++;

            } else {
                w--;
                System.out.println("Terminos Incorrectos");
            }
        }
    } 
    

    

    public static void CrearEdificios() {

    }

    public static void CrearSolares() {

    }

    public static void ListarCasas() {

    }

    public static void ListarEdificios() {

    }

    public static void ListarSolares() {

    }

    public static void MODCasas() {

    }

    public static void MODEdificios() {

    }

    public static void MODSolares() {

    }

    public static void EliminarCasa() {

    }

    public static void EliminarEdificios() {

    }

    public static void EliminarSolar() {

    }

    public static void VenderCasa() {

    }

    public static void VenderEdificio() {

    }

    public static void VenderSolar() {

    }
}
