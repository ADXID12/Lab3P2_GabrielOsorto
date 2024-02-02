package lab3p2_gabrielosorto;

import java.util.*;

public class Lab3P2_GabrielOsorto {

    static Scanner sc = new Scanner(System.in);
    static Scanner lt = new Scanner(System.in);
    static ArrayList<Pokemon> pokes = new ArrayList<>();
    static ArrayList<Pokeball> pokebolas = new ArrayList<>();

    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir == true) {
            System.out.println("Menu PokeHot");
            System.out.println("1. Crear Pokemon");
            System.out.println("2. Crear Pokebola");
            System.out.println("3. Listar Pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar Pokemon");
            System.out.println("6. Modificar Pokemon");
            System.out.println("7. Salir");
            System.out.print("Ingrese su opcion:");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    Case1();
                    break;
                case 2:
                    Case2();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saliendo.....");
                    seguir = false;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    System.out.println("");
                    break;
            }
        }
    }

    public static void Case1() {
        System.out.print("Ingrese el nombre de su pokemon:");
        String nombrePok = lt.nextLine();
        System.out.print("Ingrese el numero de entrada del pokemon:");
        int EntradaPoke = sc.nextInt();
        System.out.print("Ingrese la naturaleza del pokemon:");
        String NatuPoke = lt.nextLine();
        boolean atrapado = false;

        System.out.print("==Tipos de Pokemon==\n1. Tipo Grass\n2. Tipo Water\n3. Tipo Fire\nQue tipo desea crear?:");
        int SelecTipo = sc.nextInt();
        switch (SelecTipo) {
            case 1:
                System.out.print("Ingrese el habitat del pokemon:");
                String EcoPoke = lt.nextLine();
                System.out.print("Ingrese el rango del dominio sobre las plantas del pokemon(0-100):");
                int rangoDominio = sc.nextInt();
                while ((rangoDominio < 0) || (rangoDominio > 100)) {
                    System.out.println("Ingrese un rango valido(0-100):");
                    rangoDominio = sc.nextInt();
                }
                GrassType nuevoGrassPokemon = new GrassType(nombrePok, EntradaPoke, NatuPoke, atrapado, null, EcoPoke, rangoDominio);
                pokes.add(nuevoGrassPokemon);
                break;
            //fin crear Grass Pokemon
            case 2:
                System.out.print("Puede vivir fuera del agua?(Si/No):");
                String RespVivrFuera = lt.nextLine();
                boolean vivirfuera = false;
                if (RespVivrFuera.equalsIgnoreCase("si")) {
                    vivirfuera = true;
                } else if (RespVivrFuera.equalsIgnoreCase("no")) {
                    vivirfuera = false;
                }
                System.out.print("Ingrese que tan rapido puede nadar:");
                int VelocidadNadar = sc.nextInt();
                WaterType nuevoWaterPokemon = new WaterType(nombrePok, EntradaPoke, NatuPoke, atrapado, null, vivirfuera, VelocidadNadar);
                pokes.add(nuevoWaterPokemon);
                break;
            //fin crear Water Pokemon
            case 3:
                System.out.print("Ingrese la potencia de las llamas del pokemon:");
                int potenLlama = sc.nextInt();
                FireType nuevoFirePokemon = new FireType(nombrePok, EntradaPoke, NatuPoke, atrapado, null, potenLlama);
                pokes.add(nuevoFirePokemon);
                break;
        }
        System.out.println("Pokemon creado de forma exitosa :D");
        System.out.println("");
    }

    public static void Case2() {
        System.out.print("Ingrese el color de la pokebola:");
        String ColorPokeball = lt.nextLine();
        System.out.print("Ingrese el numero de serie de la Pokebola:");
        int SeriePokeball = sc.nextInt();
        System.out.print("Ingrese la eficiencia para atrapar Pokehots(1-3):");
        int RangoEfi = sc.nextInt();
        while (RangoEfi < 0 || RangoEfi > 3) {
            System.out.print("Ingrese un rango valido:");
            RangoEfi = sc.nextInt();
        }
        Pokeball nuevaPokeball = new Pokeball(ColorPokeball, SeriePokeball, RangoEfi);
        pokebolas.add(nuevaPokeball);
    }

    public static void Case3() {

    }
}
