package lab2progra2_carlosnoé;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2Progra2_CarlosNoé {

    static ArrayList<Usuario> ListaUsu = new ArrayList();
    static ArrayList Propiedades = new ArrayList();

    public static void main(String[] args) {
        Scanner k1ng = new Scanner(System.in);
        Admin();
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
                            System.out.println("Manejo de estados");
                            ManejoDeEstados();
                            break;
                        case 3:
                            break;

                    }// switch menu p
                    System.out.println("--Bienvenido al menu--");
                    System.out.println("Ingrese el numero adecuado a la opcion que desea ingresar: ");
                    menu = k1ng.nextInt();
                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void Admin(){
        String nombre="??";
        int anios=19;
        String usuario="admin";
        String Contra="admin1234";
        Usuario cas1 = new Usuario(nombre, anios, usuario, Contra);
        ListaUsu.add(cas1);
    } 
    
    public static void LoginSingIN() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);
        System.out.println("Bienvenido al login/sing up \n"
                + "1. Sing up"
                + "2. Log in");

        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 3) {
                if ((menu > 0) && (menu < 3)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            login();
                            break;
                        case 2:
                            Usuarioss();
                            break;
                    }
                } else {
                    x--;
                    System.out.println("Numero invalido");
                }
            }
        }
    }

    public static void login() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String nombre = k1ng.nextLine();
        System.out.println("Ingrese la contrasenya: ");
        String contrasenya=Estado.nextLine();
        int num=BaseDeDatos(nombre,contrasenya);
    }

    public static int BaseDeDatos(String Usuario, String contrasenya) {
            for (int i = 0; i < ListaUsu.size(); i++) {
                ListaUsu.get(i);
                if (ListaUsu.get(i).getUserName().equalsIgnoreCase(Usuario)&&(ListaUsu.get(i).getContrasenya().equalsIgnoreCase(contrasenya))) {
                    System.out.println("Bienvenido");
                    return 1;
                }else{
                    System.out.println("Usuario o contrasenya Incorrectos");
                    return 0;
                }
            }
            return 0;
        } 
        
    public static void Usuarioss() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);
        for (int w = 0; w < 1; w++) {
            System.out.println("Ingrese su nombre");
            String nombre = k1ng.nextLine();
            System.out.println("Ingrese los anios");
            int anios = Estado.nextInt();
            k1ng = new Scanner(System.in);
            Estado = new Scanner(System.in);
            System.out.println("Ingrese su nombre de usuario: ");
            String usuario = k1ng.nextLine();
            System.out.println("Ingrese su contrasenya: ");
            String Contra = Estado.nextLine();
            if (anios > 17) {
                w++;
                Usuario cas1 = new Usuario(nombre, anios, usuario, Contra);
                ListaUsu.add(cas1);
            } else {
                w--;
                System.out.println("Terminos Incorrectos");
            }
        }
    }

    public static void ManejoDeEstados() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);
        System.out.println("Ingrese el tipo del estado que desea cambiar\n"
                + "Opcion 1: Casas\n"
                + "Opcion 2: Edificios\n"
                + "Opcion 3: Solares\n");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 4) {
                if ((menu > 0) && (menu < 4)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            int cont = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Casas) {
                                    System.out.println(cont + ". " + Propiedades.get(i));
                                    cont += 1;
                                }
                                System.out.println("Ingrese el numero: ");
                                int nume = k1ng.nextInt();
                                if ((nume > 0) || (nume < cont)) {
                                    System.out.println("Ingrese el nuevo estado: ");
                                    String nam = Estado.nextLine();
                                    ((Casas) Propiedades.get(nume)).setEstado(nam);
                                    if ((nam.equalsIgnoreCase("Listas")) && (nam.equalsIgnoreCase("Demolicion")) && (nam.equalsIgnoreCase("construccion"))) {
                                        ((Casas) Propiedades.get(nume)).setEstado(nam);
                                    } else {
                                        System.out.println("Variable invalida");
                                        x--;
                                    }
                                } else {
                                    System.out.println("Variable invalida");
                                    i--;
                                }
                            }
                            break;
                        case 2:
                            int cont1 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Edificios) {
                                    System.out.println(cont1 + ". " + Propiedades.get(i));
                                    cont1 += 1;
                                }
                                System.out.println("Ingrese el numero: ");
                                int nume = k1ng.nextInt();
                                if ((nume > 0) || (nume < cont1)) {
                                    System.out.println("Ingrese el nuevo estado: ");
                                    String nam = Estado.nextLine();
                                    if ((nam.equalsIgnoreCase("Listas")) && (nam.equalsIgnoreCase("Demolicion")) && (nam.equalsIgnoreCase("construccion"))) {
                                        ((Edificios) Propiedades.get(nume)).setEstado(nam);
                                    } else {
                                        System.out.println("Variable invalida");
                                        x--;
                                    }
                                } else {
                                    System.out.println("Variable invalida");
                                    i--;
                                }
                            }
                            break;
                        case 3:
                            int cont22 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Solares) {
                                    System.out.println(cont22 + ". " + Propiedades.get(i));
                                    cont22 += 1;
                                }
                                System.out.println("Ingrese el numero: ");
                                int nume = k1ng.nextInt();
                                if ((nume > 0) || (nume < cont22)) {
                                    System.out.println("Ingrese el nuevo estado: ");
                                    String nam = Estado.nextLine();
                                    if ((nam.equalsIgnoreCase("Listas")) && (nam.equalsIgnoreCase("Demolicion")) && (nam.equalsIgnoreCase("construccion"))) {
                                        ((Solares) Propiedades.get(nume)).setEstado(nam);
                                    } else {
                                        System.out.println("Variable invalida");
                                        x--;
                                    }
                                } else {
                                    System.out.println("Variable invalida");
                                    i--;
                                }
                            }

                            break;
                    }
                    System.out.println("--Bienvenido al menu--");
                    System.out.println("Ingrese el tipo del estado que desea cambiar");
                    menu = k1ng.nextInt();

                } else {
                    x--;
                    System.out.println("Invalido");
                }
            }
        }
    }

    public static void CrearCasas() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);
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
            int NumCuart = k1ng.nextInt();
            System.out.println("Ingrese el largo");
            double largo = k1ng.nextInt();
            System.out.println("Ingrese el estado");
            String estado = Estado.nextLine();
            Color color = JColorChooser.showDialog(null, "Elija un color", Color.yellow);
            if ((NumCasa > 0) && (Numbloq > 0) && (anchio > 0.00) && (Numban > 0) && (NumCuart > 0) && (largo > 0.00) && (estado.equalsIgnoreCase("Listas")) && (estado.equalsIgnoreCase("Demolicion")) && (estado.equalsIgnoreCase("construccion"))) {
                Casas cas1 = new Casas(NumCasa, Numbloq, anchio, largo, Numban, NumCuart, color, estado);
                Propiedades.add(cas1);
                w++;

            } else {
                w--;
                System.out.println("Terminos Incorrectos");
            }
        }
    }

    public static void CrearEdificios() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);
        for (int w = 0; w < 1; w++) {
            System.out.println("Ingrese el Numero de edificio: ");
            int num = k1ng.nextInt();
            System.out.println("Ingrese la cantidad locales: ");
            int numeLocales = k1ng.nextInt();
            System.out.println("Ingrese la direccion reff: ");
            String Direccion = Estado.nextLine();
            Estado = new Scanner(System.in);
            System.out.println("Ingrese el estado: ");
            String estado = Estado.nextLine();
            if ((num > 0) && (numeLocales > 0) && (estado.equalsIgnoreCase("Listas")) && (estado.equalsIgnoreCase("Demolicion")) && (estado.equalsIgnoreCase("construccion"))) {
                Edificios edi1 = new Edificios(num, numeLocales, Direccion, estado);
                Propiedades.add(edi1);
                w++;

            } else {
                w--;
                System.out.println("Terminos Incorrectos");
            }
        }

    }

    public static void CrearSolares() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);
        for (int w = 0; w < 1; w++) {
            System.out.println("Ingrese el Ancho del solar: ");
            double num = k1ng.nextInt();
            System.out.println("Ingrese el largo del solar: ");
            double numeLocales = k1ng.nextInt();
            System.out.println("Ingrese el estado");
            String estado = Estado.nextLine();
            if ((num > 0) && (numeLocales > 0) && (estado.equalsIgnoreCase("Listas")) && (estado.equalsIgnoreCase("Demolicion")) && (estado.equalsIgnoreCase("construccion"))) {
                Solares Sol1 = new Solares(num, numeLocales, estado);
                Propiedades.add(Sol1);
                w++;

            } else {
                w--;
                System.out.println("Terminos Incorrectos");
            }
        }
    }

    public static void ListarCasas() {
        for (int i = 0; i < Propiedades.size(); i++) {
            Propiedades.get(i);
            if (Propiedades.get(i) instanceof Casas) {
                System.out.println(Propiedades.get(i));
            }
        }
    }

    public static void ListarEdificios() {
        for (int i = 0; i < Propiedades.size(); i++) {
            Propiedades.get(i);
            if (Propiedades.get(i) instanceof Edificios) {
                System.out.println(Propiedades.get(i));
            }
        }
    }

    public static void ListarSolares() {
        for (int i = 0; i < Propiedades.size(); i++) {
            Propiedades.get(i);
            if (Propiedades.get(i) instanceof Solares) {
                System.out.println(Propiedades.get(i));
            }
        }
    }

    public static void MODCasas() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);

        System.out.println("1. Mod Numero Casa \n"
                + "2. Mod Numero Bloque \n"
                + "3. Mod Ancho \n"
                + "4. Mod Largo \n"
                + "5. Mod Numero Banyio \n"
                + "6. Mod Numero Cuartos \n"
                + "7. Mod Color \n"
                + "8. Mod Estado \n");
        int Mas = k1ng.nextInt();
        for (int w = 0; w < 1; w++) {
            while (Mas != 9) {
                if ((Mas > 0) && (Mas < 9)) {
                    w++;
                    switch (Mas) {
                        case 1:
                            int cont = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Casas) {
                                    System.out.println(cont + ". " + Propiedades.get(i));
                                    cont += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el numero de casa: ");
                            int cheiss = k1ng.nextInt();
                            if (cheiss < cont) {
                                System.out.println("Ingrese el nuevo numero");
                                int new1 = k1ng.nextInt();
                                ((Casas) Propiedades.get(cheiss)).setNumeroC(new1);
                            } else {
                                System.out.println("Error");
                                w--;
                            }

                            break;
                        case 2:
                            int cont1 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                Propiedades.get(i);
                                if (Propiedades.get(i) instanceof Casas) {
                                    System.out.println(cont1 + ". " + Propiedades.get(i));
                                    cont1 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el numero bloque: ");
                            int cheiss1 = k1ng.nextInt();
                            if (cheiss1 < cont1) {
                                System.out.println("Ingrese el nuevo numero de bloque");
                                int new1 = k1ng.nextInt();
                                ((Casas) Propiedades.get(cheiss1)).setNumeroBloq(new1);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 3:
                            int cont12 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Casas) {
                                    System.out.println(cont12 + ". " + Propiedades.get(i));
                                    cont12 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el ancho: ");
                            int cheiss12 = k1ng.nextInt();
                            if (cheiss12 < cont12) {
                                System.out.println("Ingrese el nuevo numero de ancho");
                                double new12 = k1ng.nextDouble();
                                ((Casas) Propiedades.get(cheiss12)).setAncho(new12);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 4:
                            int cont123 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Casas) {
                                    System.out.println(cont123 + ". " + Propiedades.get(i));
                                    cont123 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el largo: ");
                            int cheiss123 = k1ng.nextInt();
                            if (cheiss123 < cont123) {
                                System.out.println("Ingrese el nuevo numero de largo");
                                double new12 = k1ng.nextDouble();
                                ((Casas) Propiedades.get(cheiss123)).setLargo(new12);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 5:
                            int cont1234 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Casas) {
                                    System.out.println(cont1234 + ". " + Propiedades.get(i));
                                    cont1234 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el numero de banio: ");
                            int cheiss1234 = k1ng.nextInt();
                            if (cheiss1234 < cont1234) {
                                System.out.println("Ingrese el nuevo numero de banios");
                                int new12 = k1ng.nextInt();
                                ((Casas) Propiedades.get(cheiss1234)).setNumeroBan(new12);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 6:
                            int cont1231 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Casas) {
                                    System.out.println(cont1231 + ". " + Propiedades.get(i));
                                    cont1231 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el largo: ");
                            int cheiss1231 = k1ng.nextInt();
                            if (cheiss1231 < cont1231) {
                                System.out.println("Ingrese el nuevo numero de largo");
                                int new12 = k1ng.nextInt();
                                ((Casas) Propiedades.get(cheiss1231)).setNumeroBloq(new12);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 7:
                            int cont12311 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Casas) {
                                    System.out.println(cont12311 + ". " + Propiedades.get(i));
                                    cont12311 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el color: ");
                            int cheiss12311 = k1ng.nextInt();
                            if (cheiss12311 < cont12311) {
                                Color color = JColorChooser.showDialog(null, "Elija un color", Color.yellow);

                                ((Casas) Propiedades.get(cheiss12311)).setColor(color);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 8:
                            int cont1212 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Casas) {
                                    System.out.println(cont1212 + ". " + Propiedades.get(i));
                                    cont1212 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el ancho: ");
                            int cheiss1212 = k1ng.nextInt();
                            if (cheiss1212 < cont1212) {
                                System.out.println("Ingrese el estado: ");
                                String estado = Estado.nextLine();
                                if ((estado.equalsIgnoreCase("Listas")) && (estado.equalsIgnoreCase("Demolicion")) && (estado.equalsIgnoreCase("construccion"))) {
                                    ((Casas) Propiedades.get(cheiss1212)).setEstado(estado);
                                } else {
                                    w--;
                                }

                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                    }
                } else {
                    w--;
                    System.out.println("Termino Incorrecto");
                }
            }
        }
    }

    public static void MODEdificios() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);
        System.out.println("1. Mod Numero edificio \n"
                + "2. Mod cantidad locales \n"
                + "3. Mod Direccion de referencia \n"
                + "4. Mod Estado \n");
        int Mas = k1ng.nextInt();
        for (int w = 0; w < 1; w++) {
            while (Mas != 5) {
                if ((Mas > 0) && (Mas < 5)) {
                    w++;
                    switch (Mas) {
                        case 1:
                            int cont = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                Propiedades.get(i);
                                if (Propiedades.get(i) instanceof Edificios) {
                                    System.out.println(cont + ". " + Propiedades.get(i));
                                    cont += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el numero de casa: ");
                            int cheiss = k1ng.nextInt();
                            if (cheiss < cont) {
                                System.out.println("Ingrese el nuevo Numero edificio");
                                int new1 = k1ng.nextInt();
                                ((Edificios) Propiedades.get(cheiss)).setNumeroedificio(new1);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 2:
                            int cont1 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Edificios) {
                                    System.out.println(cont1 + ". " + Propiedades.get(i));
                                    cont1 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el numero de casa: ");
                            int cheiss1 = k1ng.nextInt();
                            if (cheiss1 < cont1) {
                                System.out.println("Ingrese el nuevo Cantidad de locales");
                                int new1 = k1ng.nextInt();
                                ((Edificios) Propiedades.get(cheiss1)).setCantidadLocales(new1);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 3:
                            int cont2 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Edificios) {
                                    System.out.println(cont2 + ". " + Propiedades.get(i));
                                    cont2 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar la dirrecion de la casa: ");
                            int cheiss2 = k1ng.nextInt();
                            if (cheiss2 < cont2) {
                                System.out.println("Ingrese la nueva dirreccion");
                                String new1 = Estado.nextLine();
                                ((Edificios) Propiedades.get(cheiss2)).setDirrecionRef(new1);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 4:
                            int cont23 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Edificios) {
                                    System.out.println(cont23 + ". " + Propiedades.get(i));
                                    cont23 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar la dirrecion de la casa: ");
                            int cheiss23 = k1ng.nextInt();
                            if (cheiss23 < cont23) {
                                System.out.println("Ingrese el nuevo estado ");
                                String estado = Estado.nextLine();
                                if ((estado.equalsIgnoreCase("Listas")) && (estado.equalsIgnoreCase("Demolicion")) && (estado.equalsIgnoreCase("construccion"))) {
                                    ((Edificios) Propiedades.get(cheiss23)).setEstado(estado);
                                } else {
                                    w--;
                                }
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                    }
                } else {
                    w--;
                    System.out.println("Termino Incorrecto");
                }
            }
        }
    }

    public static void MODSolares() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);
        System.out.println("1. Mod Largo \n"
                + "2. Mod cantidad Ancho \n"
                + "3. Mod Estado \n");
        int Mas = k1ng.nextInt();
        for (int w = 0; w < 1; w++) {
            while (Mas != 4) {
                if ((Mas > 0) && (Mas < 4)) {
                    w++;
                    switch (Mas) {
                        case 1:
                            int cont12 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Solares) {
                                    System.out.println(cont12 + ". " + Propiedades.get(i));
                                    cont12 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar el ancho: ");
                            int cheiss12 = k1ng.nextInt();
                            if (cheiss12 < cont12) {
                                System.out.println("Ingrese el nuevo numero de ancho");
                                double new12 = k1ng.nextDouble();
                                ((Solares) Propiedades.get(cheiss12)).setAncho(new12);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 2:
                            int cont123 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Solares) {
                                    System.out.println(cont123 + ". " + Propiedades.get(i));
                                    cont123 += 1;
                                }
                            }
                            System.out.println("Ingrese la solar que desea cambiar el largo: ");
                            int cheiss123 = k1ng.nextInt();
                            if (cheiss123 < cont123) {
                                System.out.println("Ingrese el nuevo numero de largo");
                                double new12 = k1ng.nextDouble();
                                ((Solares) Propiedades.get(cheiss123)).setAncho(new12);
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;
                        case 3:
                            int cont23 = 0;
                            for (int i = 0; i < Propiedades.size(); i++) {
                                if (Propiedades.get(i) instanceof Solares) {
                                    System.out.println(cont23 + ". " + Propiedades.get(i));
                                    cont23 += 1;
                                }
                            }
                            System.out.println("Ingrese la casa que desea cambiar la dirrecion de la casa: ");
                            int cheiss23 = k1ng.nextInt();
                            if (cheiss23 < cont23) {
                                System.out.println("Ingrese el nuevo estado ");
                                String estado = Estado.nextLine();
                                if ((estado.equalsIgnoreCase("Listas")) && (estado.equalsIgnoreCase("Demolicion")) && (estado.equalsIgnoreCase("construccion"))) {
                                    ((Edificios) Propiedades.get(cheiss23)).setEstado(estado);
                                } else {
                                    w--;
                                }
                            } else {
                                System.out.println("Error");
                                w--;
                            }
                            break;

                    }
                }
            }
        }
    }

    public static void EliminarCasa() {
        Scanner k1ng = new Scanner(System.in);
        int cont23 = 0;
        for (int i = 0; i < Propiedades.size(); i++) {
            if (Propiedades.get(i) instanceof Casas) {
                System.out.println(cont23 + ". " + Propiedades.get(i));
                cont23 += 1;
            }
        }
        System.out.println("Ingrese la casa que desea eliminar: ");
        int cheiss23 = k1ng.nextInt();
        if (cheiss23 < cont23) {
            for (int i = 0; i < 1; i++) {
                System.out.println("Ingrese el nuevo estado ");
                int casaelm = k1ng.nextInt();
                if (casaelm > 0) {
                    Propiedades.remove(cont23);
                    i++;
                } else {
                    i--;
                }
            }
        }
    }

    public static void EliminarEdificios() {
        Scanner k1ng = new Scanner(System.in);
        Scanner Estado = new Scanner(System.in);
        int cont23 = 0;
        for (int i = 0; i < Propiedades.size(); i++) {
            if (Propiedades.get(i) instanceof Edificios) {
                System.out.println(cont23 + ". " + Propiedades.get(i));
                cont23 += 1;
            }
        }
        System.out.println("Ingrese la casa que desea eliminar: ");
        int cheiss23 = k1ng.nextInt();
        if (cheiss23 < cont23) {
            for (int i = 0; i < 1; i++) {
                System.out.println("Ingrese el nuevo estado ");
                int casaelm = k1ng.nextInt();
                if (casaelm > 0) {
                    Propiedades.remove(cont23);
                    i++;
                } else {
                    i--;
                }
            }
        }
    }

    public static void EliminarSolar() {
        Scanner k1ng = new Scanner(System.in);
        int cont23 = 0;
        for (int i = 0; i < Propiedades.size(); i++) {
            Propiedades.get(i);
            if (Propiedades.get(i) instanceof Solares) {
                System.out.println(cont23 + ". " + Propiedades.get(i));
                cont23 += 1;
            }
        }
        System.out.println("Ingrese la casa que desea eliminar: ");
        int cheiss23 = k1ng.nextInt();
        if (cheiss23 < cont23) {
            for (int i = 0; i < 1; i++) {
                System.out.println("Ingrese el nuevo estado ");
                int casaelm = k1ng.nextInt();
                if (casaelm > 0) {
                    Propiedades.remove(cont23);
                    i++;
                } else {
                    i--;
                }
            }
        }
    }

    public static void VenderCasa() {
        int cont23 = 0;
        Scanner k1ng = new Scanner(System.in);
        for (int i = 0; i < Propiedades.size(); i++) {
            if (Propiedades.get(i) instanceof Casas) {
                System.out.println(cont23 + ". " + Propiedades.get(i));

            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese la casa que desea Vender: ");
            int cheiss23 = k1ng.nextInt();
            if (cheiss23 > 0) {

                Propiedades.remove(cheiss23);
                i++;
            } else {
                i--;
            }
        }
    }

    public static void VenderEdificio() {
        int cont23 = 0;
        Scanner k1ng = new Scanner(System.in);
        for (int i = 0; i < Propiedades.size(); i++) {
            if (Propiedades.get(i) instanceof Edificios) {
                System.out.println(cont23 + ". " + Propiedades.get(i));

            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el edificio que desea Vender: ");
            int cheiss23 = k1ng.nextInt();
            if (cheiss23 > 0) {

                Propiedades.remove(cheiss23);
                System.out.println("Vendido");
                i++;
            } else {
                i--;
            }
        }

    }

    public static void VenderSolar() {
        int cont23 = 0;
        Scanner k1ng = new Scanner(System.in);
        for (int i = 0; i < Propiedades.size(); i++) {
            if (Propiedades.get(i) instanceof Solares) {
                System.out.println(cont23 + ". " + Propiedades.get(i));

            }
        }
        for (int i = 0; i < 1; i++) {

            System.out.println("Ingrese el solar que desea Vender: ");
            int cheiss23 = k1ng.nextInt();
            if (cheiss23 < cont23) {
            } else {
                i--;
            }
            if (cheiss23 > 0) {
                double pak = ((Solares) Propiedades.get(cheiss23)).getAncho() * ((Solares) Propiedades.get(cheiss23)).getLargo();
                System.out.println(pak + " EL resultado que me pedis en el ejercicio ando totalmente muerto si lees esto puede que manana osea el sabado para mi sabes deberia dejar de escribir esta tontera pero cosas que pasa \n"
                        + "Hola");
                Propiedades.remove(cheiss23);
                System.out.println("Vendido");

                i++;
            } else {
                i--;
            }
        }
    }

}
