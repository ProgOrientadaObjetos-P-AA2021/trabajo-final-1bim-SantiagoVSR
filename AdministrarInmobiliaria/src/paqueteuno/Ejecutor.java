package paqueteuno;

import java.util.Scanner;
import paquetecinco.Constructora;
import paquetecinco.EscrituraArchivoConstructora;
import paquetecinco.LecturaArchivoConstructora;
import paquetecuatro.Ciudad;
import paquetecuatro.EscrituraArchivoCiudad;
import paquetecuatro.LecturaArchivoCiudad;
import paquetedos.EscrituraArchivoPropietario;
import paquetedos.LecturaArchivoPropietario;
import paquetedos.Propietario;
import paqueteseis.Casa;
import paqueteseis.Departamento;
import paqueteseis.EscrituraArchivoCasa;
import paqueteseis.EscrituraArchivoDepartamento;
import paqueteseis.LecturaArchivoCasa;
import paqueteseis.LecturaArchivoDepartamento;
import paquetetres.EscrituraArchivoUbicacion;
import paquetetres.LecturaArchivoUbicacion;
import paquetetres.Ubicacion;

/**
 *
 * @author reroes
 */

public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Gestion de una Inmobiliaria. ");
         boolean opc = true;
        int obj, datos;
        
        while (opc) {
            System.out.print("Escoja la opcion que desea ingresar: \n"
                    + "1) Ingrese 1 si va ha ingresar una Casa\n"
                    + "2) Ingrese 2 si va ha ingresar un Departamento\n"
                    + "3) Ingrese 3 si quiere ingresar un propietarios\n"
                    + "4) Ingrese 4 si desea ingresar las ubicaciones\n"
                    + "5) Ingrese 5 si desea ingresar las ciudades\n"
                    + "6) Ingrese 6 si va ha ingresar constructoras\n"
                    + "7) Ingrese 7 si quiere ver los datos ingresados\n"
                    + "8) Ingrese 8 si desea salir\n");
            obj = sc.nextInt();
            sc.nextLine();
            if(obj ==1){
                System.out.print("Ingrese cuantas casas desea ingresar \n ");
                datos=sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < datos; i++) {
                    ingresarCasa();
                }
            } else if (obj == 2) {
                System.out.print("Digite cuantos Departamentos desea ingresar\n> ");
                datos = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < datos; i++) {
                    ingresarDepartamento();
                }
            } else if (obj == 3) {
                System.out.print("Digite cuantos propietarios desea ingresar\n> ");
                datos= sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < datos; i++) {
                    ingresarPropietario();
                }
            } else if (obj == 4) {
                System.out.print("Digite cuantas ubicaciones desea ingresar\n> ");
                datos = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < datos; i++) {
                    ingresarUbicacion();
                }
            } else if (obj == 5) {
                System.out.print("Digite cuantas ciudades desea ingresar\n> ");
                datos = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < datos; i++) {
                    ingresarCiudad();
                }
            } else if (obj == 6) {
                System.out.print("Digite cuantas constructoras desea ingresar\n> ");
                datos = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < datos; i++) {
                    ingresarConstructora();
                }
            } else if (obj == 7) {
                System.out.print("Digite el dato que desea ver:\n"
                        + "1) Casa\n"
                        + "2) Departamentos\n"
                        + "3) Propietarios\n"
                        + "4) Ubicaciones\n"
                        + "5) Ciudades\n"
                        + "6) Constructoras\n"
                        + "7) Todos los datos\n> ");
                int verDatos = sc.nextInt();
                mostrarDatos(verDatos);
            } else if (obj >= 8) {
                System.out.println("Opcion Incorrecta");
                opc = false;
            }
        }
    }
    public static Propietario ingresarPropietario() {
        Scanner sc = new Scanner(System.in);
        String nomArchivoPropietario = "datos/propietarios.txt";
        Propietario pro = new Propietario();
        String id, verd, nom, ape;
        LecturaArchivoPropietario lecturaPropietario = new LecturaArchivoPropietario(nomArchivoPropietario);
        EscrituraArchivoPropietario archivoPropietario = new EscrituraArchivoPropietario(nomArchivoPropietario);
        System.out.print("___________________________________________\n");
        System.out.print("        Datos para el Propietario          \n");
        System.out.print("___________________________________________\n");
        System.out.print("Ingrese su identificacion: \n ");
        id = sc.nextLine();
        lecturaPropietario.establecerObjetoBuscado(id);
        lecturaPropietario.establecerBooleanBuscado();
        if (!lecturaPropietario.obtenerBooleanBuscado()) {
            pro = new Propietario(lecturaPropietario.obtenerObjetoBuscado().obtenerNombre(),
                    lecturaPropietario.obtenerObjetoBuscado().obtenerApellido(), id);
            System.out.printf("La identificacion con el numero %s ya "
                    + "se encuentra registrada\n"
                    + "Digite (si) si desea ver los datos\n> ", id);
            verd = sc.nextLine();
            if (verd.toLowerCase().equals("si")) {
                System.out.printf("Nombre : %s\n"
                        + "Apellido: %s\n",
                        lecturaPropietario.obtenerObjetoBuscado().obtenerNombre(),
                        lecturaPropietario.obtenerObjetoBuscado().obtenerApellido());

            }

        } else if (lecturaPropietario.obtenerBooleanBuscado()) {
            System.out.print("Ingrese el nombre: \n ");
            nom = sc.nextLine();
            System.out.print("Ingrese el apellido: \n ");
            ape = sc.nextLine();
            pro = new Propietario(nom, ape, id);
            archivoPropietario.establecerRegistroPropietario(pro);
            archivoPropietario.establecerSalida();
            archivoPropietario.cerrarArchivo();
        }
        return pro;
    }

    public static Ubicacion ingresarUbicacion() {
        Scanner sc = new Scanner(System.in);

        String nomArchivoUbicacion = "datos/ubicaciones.txt";
        String datos, nomBarrio, numCasa, refe;
        Ubicacion ubi = new Ubicacion();
        EscrituraArchivoUbicacion archivoUbicacion = new EscrituraArchivoUbicacion(nomArchivoUbicacion);
        LecturaArchivoUbicacion lecturaUbicacion = new LecturaArchivoUbicacion(nomArchivoUbicacion);
        System.out.print("___________________________________________\n");
        System.out.print("         Datos para la Ubicacion           \n");
        System.out.print("___________________________________________\n");
        System.out.print("Ingrese el número de casas:\n ");
        numCasa = sc.nextLine();
        lecturaUbicacion.establecerObjetoBuscado(numCasa);
        lecturaUbicacion.establecerBooleanBuscado();
        if (!lecturaUbicacion.obtenerBooleanBuscado()) {
            ubi = new Ubicacion(numCasa,
                    lecturaUbicacion.obtenerObjetoBuscado().obtenerNombreBarrio(),
                    lecturaUbicacion.obtenerObjetoBuscado().obtenerReferencia());
            System.out.printf("El numero de casa %s "
                    + "Ha sido registrado\n"
                    + "Digite (S) si desea ver los datos:\n ", numCasa);
            datos = sc.nextLine();
            if (datos.toLowerCase().equals("S")) {
                System.out.printf("Barrio: %s\n"
                        + "Referencia: %s\n",
                        lecturaUbicacion.obtenerObjetoBuscado().obtenerNombreBarrio(),
                        lecturaUbicacion.obtenerObjetoBuscado().obtenerReferencia());
            }
        } else if (lecturaUbicacion.obtenerBooleanBuscado()) {
            System.out.print("Ingrese el nombre de barrio: \n");
            nomBarrio = sc.nextLine();
            System.out.print("Ingrese una referencia: \n");
            refe = sc.nextLine();
            ubi = new Ubicacion(numCasa, nomBarrio, refe);
            archivoUbicacion.establecerRegistroUbicacion(ubi);
            archivoUbicacion.establecerSalida();
            archivoUbicacion.cerrarArchivo();

        }
        return ubi;
    }

    public static Ciudad ingresarCiudad() {
        Scanner sc = new Scanner(System.in);
        String nomArchivoCiudad = "datos/ciudades.txt";
        Ciudad city = new Ciudad();
        String nomCiudad, verDatos, nomProvincia;
        EscrituraArchivoCiudad archivoCiudad = new EscrituraArchivoCiudad(nomArchivoCiudad);
        LecturaArchivoCiudad lecturaCiudad = new LecturaArchivoCiudad(nomArchivoCiudad);
        System.out.print("___________________________________________\n");
        System.out.print("           Datos de las Ciudades           \n");
        System.out.print("___________________________________________\n");
        System.out.print("Ingrese el nombre de la ciudad: \n");
        nomCiudad = sc.nextLine();
        lecturaCiudad.establecerObjetoBuscado(nomCiudad);
        lecturaCiudad.establecerBooleanBuscado();
        if (!lecturaCiudad.obtenerBooleanBuscado()) {
            city = new Ciudad(nomCiudad,
                    lecturaCiudad.obtenerObjetoBuscado().obtenerNombreProvincia());
            System.out.printf("La ciudad %s  "
                    + "Ha sido registrado\n"
                    + "Digite (S) si desea ver los datos\n> ", nomCiudad);
            verDatos = sc.nextLine();
            if (verDatos.toLowerCase().equals("S")) {
                System.out.printf("Provincia: %s\n",
                        lecturaCiudad.obtenerObjetoBuscado().obtenerNombreProvincia());

            }
        } else if (lecturaCiudad.obtenerBooleanBuscado()) {
            System.out.print("Ingrese el nombre de la provinvia: \n ");
            nomProvincia = sc.nextLine();
            city = new Ciudad(nomCiudad, nomProvincia);
            archivoCiudad.establecerRegistroCiudad(city);
            archivoCiudad.establecerSalida();
            archivoCiudad.cerrarArchivo();
        }
        return city;

    }

    public static Constructora ingresarConstructora() {
        Scanner sc = new Scanner(System.in);
        String nomArchivoConstora = "datos/constructoras.txt";
        Constructora constora = new Constructora();
        EscrituraArchivoConstructora archivoConstora = new EscrituraArchivoConstructora(nomArchivoConstora);
        LecturaArchivoConstructora lecturaConstora = new LecturaArchivoConstructora(nomArchivoConstora);
        String nomC, idE,datos;
        System.out.print("___________________________________________\n");
        System.out.print("          Datos de la Constructora         \n");
        System.out.print("___________________________________________\n");
        System.out.print("Ingrese el Id de la empresa: \n");
        idE = sc.nextLine();
        lecturaConstora.establecerObjetoBuscado(idE);
        lecturaConstora.establecerBooleanBuscado();
        if (!lecturaConstora.obtenerBooleanBuscado()) {
            constora = new Constructora(idE,
                    lecturaConstora.obtenerObjetoBuscado().obtenerNombreConstructora());
            System.out.printf("El numero de casa %s "
                    + "Ha sido registrado\n"
                    + "Digite (S) si desea ver los datos:\n ", idE);
            datos = sc.nextLine();

            if (datos.toLowerCase().equals("S")) {
                System.out.printf("Constructora: %s\n",
                        lecturaConstora.obtenerObjetoBuscado().obtenerNombreConstructora());
            }
        } else if (lecturaConstora.obtenerBooleanBuscado()) {
            System.out.print("Ingrese el nombre de la constructora:\n ");
            nomC = sc.nextLine();
            constora = new Constructora(idE, nomC);
            archivoConstora.establecerRegistroConstructora(constora);
            archivoConstora.establecerSalida();
            archivoConstora.cerrarArchivo();
        }

        return constora;
    }

    public static void ingresarCasa() {
        Scanner sc = new Scanner(System.in);
        String nomArchivoCasa = "datos/casas.txt";
        double precioCuadrado;
        int numMetCuadrado, numCuartos;
        EscrituraArchivoCasa archivoCasa = new EscrituraArchivoCasa(nomArchivoCasa);
        System.out.print("___________________________________________\n");
        System.out.print("              Datos de la Casa             \n");
        System.out.print("___________________________________________\n");
        Propietario pro = ingresarPropietario();
        System.out.print("Ingrese el precio por metro cuadrado: \n");
        precioCuadrado = sc.nextDouble();
        System.out.print("Ingrese el numero de metros cuadrados: \n");
        numMetCuadrado = sc.nextInt();
        Ubicacion ubi = ingresarUbicacion();
        Ciudad ciu = ingresarCiudad();
        System.out.print("Ingrese el numero de cuartos: \n ");
        numCuartos = sc.nextInt();
        Constructora cons = ingresarConstructora();
        Casa casa = new Casa(pro, precioCuadrado, numMetCuadrado, ubi,
                ciu, numCuartos, cons);
        casa.establecerCostFinal();
        archivoCasa.establecerRegistroCasa(casa);
        archivoCasa.establecerSalida();
        archivoCasa.cerrarArchivo();

    }

    public static void ingresarDepartamento() {
        Scanner entrada = new Scanner(System.in);
        String nomArchivoDepa = "datos/departamentos.txt";
        double precioCuadrado, valAliMens, precio;
        int numMetCuadrado;
        String nomEdi, ubiEdi;
        EscrituraArchivoDepartamento archivoDepa = new EscrituraArchivoDepartamento(nomArchivoDepa);
        System.out.print("___________________________________________\n");
        System.out.print("        Datos de los Departamentos         \n");
        System.out.print("___________________________________________\n");;
        Propietario p = ingresarPropietario();
        System.out.print("Ingrese el precio por metro cuadrado:\n ");
        precioCuadrado = entrada.nextDouble();
        System.out.print("Ingrese el numero de metros cuadrados:\n ");
        numMetCuadrado = entrada.nextInt();
        System.out.print("Ingrese el valor alicuota mensual:\n ");
        valAliMens = entrada.nextDouble();
        System.out.print("Ingrese el precio\n> ");
        precio = entrada.nextDouble();
        entrada.nextLine();
        Ubicacion u = ingresarUbicacion();
        Ciudad c = ingresarCiudad();
        System.out.print("Ingrese el nombre del edificio: \n");
        nomEdi = entrada.nextLine();
        System.out.print("Ingrese ubicacion del departamento del edificio: \n");
        ubiEdi = entrada.nextLine();
        Constructora cons = ingresarConstructora();
        Departamento depa = new Departamento(p, precioCuadrado,
                numMetCuadrado, valAliMens, precio, u, c, nomEdi, ubiEdi, cons);
        depa.establecerCostoFinal();
        archivoDepa.establecerRegistroDepa(depa);
        archivoDepa.establecerSalida();
        archivoDepa.cerrarArchivo();

    }

    public static void mostrarDatos(int n) {
        String nomArchivoConstructora = "datos/constructoras.txt";
        String nomArchivoCiudad = "datos/ciudades.txt";
        String nomArchivoUbicacion = "datos/ubicaciones.txt";
        String nomArchivoPropietario = "datos/propietarios.txt";
        String nomArchivoCasa = "datos/casas.txt";
        String nomArchivoDepa = "datos/departamentos.txt";

        LecturaArchivoConstructora lecturaConstructora = new LecturaArchivoConstructora(nomArchivoConstructora);
        LecturaArchivoCiudad lecturaCiudad = new LecturaArchivoCiudad(nomArchivoCiudad);
        LecturaArchivoUbicacion lecturaUbicacion = new LecturaArchivoUbicacion(nomArchivoUbicacion);
        LecturaArchivoPropietario lecturaPropiedad = new LecturaArchivoPropietario(nomArchivoPropietario);
        LecturaArchivoCasa lecturaCasa = new LecturaArchivoCasa(nomArchivoCasa);
        LecturaArchivoDepartamento lecturaDepartamento = new LecturaArchivoDepartamento(nomArchivoDepa);
        lecturaConstructora.establecerListaConstructora();
        lecturaCiudad.establecerListaCiudad();
        lecturaUbicacion.establecerListaUbicacion();
        lecturaPropiedad.establecerListaPropietarios();
        lecturaCasa.establecerListaCasa();
        lecturaDepartamento.establecerListaDepartamento();
        switch (n) {
            case 1:
                if (lecturaCasa.obtenerListaCasa().isEmpty()) {
                    System.out.println("________________________");
                    System.out.println("No hay datos que mostrar");
                    System.out.println("_________________________");
                } else {
                    System.out.println(lecturaCasa);
                }
                break;
            case 2:
                if (lecturaDepartamento.obtenerListaDepartamento().isEmpty()) {
                    System.out.println("________________________");
                    System.out.println("No hay datos que mostrar");
                    System.out.println("_________________________");
                } else {
                    System.out.println(lecturaDepartamento);
                }
                break;
            case 3:
                if (lecturaPropiedad.obtenerListaPropietarios().isEmpty()) {
                    System.out.println("________________________");
                    System.out.println("No hay datos que mostrar");
                    System.out.println("_________________________");
                } else {
                    System.out.println(lecturaPropiedad);
                }
                break;
            case 4:
                if (lecturaUbicacion.obtenerListaUbicacion().isEmpty()) {
                    System.out.println("________________________");
                    System.out.println("No hay datos que mostrar");
                    System.out.println("_________________________");
                } else {
                    System.out.println(lecturaUbicacion);
                }
                break;
            case 5:
                if (lecturaCiudad.obtenerListaCiudad().isEmpty()) {
                    System.out.println("________________________");
                    System.out.println("No hay datos que mostrar");
                    System.out.println("_________________________");
                } else {
                    System.out.println(lecturaCiudad);
                }
                break;
            case 6:
                if (lecturaConstructora.obtenerListaConstructora().isEmpty()) {
                    System.out.println("________________________");
                    System.out.println("No hay datos que mostrar");
                    System.out.println("_________________________");
                } else {
                    System.out.println(lecturaConstructora);
                }
                break;
            case 7:
                if (lecturaCasa.obtenerListaCasa().isEmpty()
                        && lecturaDepartamento.obtenerListaDepartamento().isEmpty()
                        && lecturaPropiedad.obtenerListaPropietarios().isEmpty()
                        && lecturaUbicacion.obtenerListaUbicacion().isEmpty()
                        && lecturaCiudad.obtenerListaCiudad().isEmpty()
                        && lecturaConstructora.obtenerListaConstructora().isEmpty()) {
                    System.out.println("________________________");
                    System.out.println("No hay datos que mostrar");
                    System.out.println("_________________________");
                }
                if (!lecturaCasa.obtenerListaCasa().isEmpty()) {
                    System.out.println(lecturaCasa);
                }
                if (!lecturaDepartamento.obtenerListaDepartamento().isEmpty()) {
                    System.out.println(lecturaDepartamento);
                }
                if (!lecturaPropiedad.obtenerListaPropietarios().isEmpty()) {
                    System.out.println(lecturaPropiedad);
                }
                if (!lecturaUbicacion.obtenerListaUbicacion().isEmpty()) {
                    System.out.println(lecturaUbicacion);
                }
                if (!lecturaCiudad.obtenerListaCiudad().isEmpty()) {
                    System.out.println(lecturaCiudad);
                }
                if (!lecturaConstructora.obtenerListaConstructora().isEmpty()) {
                    System.out.println(lecturaConstructora);
                }

                break;
            default:
                System.out.println("\033[0;1mOpcion Incorrecta");
                break;
        }
    }
}