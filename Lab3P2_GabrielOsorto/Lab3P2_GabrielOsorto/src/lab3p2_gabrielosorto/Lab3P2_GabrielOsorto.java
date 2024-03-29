package lab3p2_gabrielosorto;

import java.util.*;

public class Lab3P2_GabrielOsorto {

    static Scanner sc = new Scanner(System.in);
    static Scanner lt = new Scanner(System.in);
    static Random ran = new Random();
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
            System.out.println("8. extra");
            System.out.print("Ingrese su opcion:");
            int op = sc.nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    CrearPokemon();
                    break;
                case 2:
                    CrearPokeball();
                    break;
                case 3:
                    ListarPokemons();
                    break;
                case 4:
                    EliminarPokemon();
                    break;
                case 5:
                    AtraparPokehot();
                    break;
                case 6:
                    ModificarPoke();
                    break;
                case 7:
                    System.out.println("Saliendo.....");
                    seguir = false;
                    break;
                case 8:
                    extra();
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    System.out.println("");
                    break;
            }
        }
    }

    public static void CrearPokemon() {
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

    public static void CrearPokeball() {
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

    public static void ListarPokemons() {
        if (pokes.isEmpty()) {
            System.out.println("No hay pokemones D:");
            System.out.println("");
        } else {
            System.out.println("Pokemones");
            System.out.println("===================");
            System.out.println("Pokemones tipo Fire");
            System.out.println("");
            for (int i = 0; i < pokes.size(); i++) {
                Pokemon poks = pokes.get(i);
                if (poks instanceof FireType) {
                    System.out.println("Nombre:" + poks.getNombrePokemon() + "\nNo. Pokedex:" + poks.getNumEntradaPokedex() + "\nNaturaleza:" + poks.getNaturaleza() + "\nCapturado:" + poks.getCapturado() + "\nPokebola donde esta atrapado:" + poks.getPokebola() + "\nPotencia Llamas:" + ((FireType) poks).getPotenciaLlamas());
                }
                System.out.println("");
            }
            System.out.println("===================");
            System.out.println("Pokemon tipo Water");
            System.out.println("");
            for (int i = 0; i < pokes.size(); i++) {
                Pokemon poks = pokes.get(i);
                if (poks instanceof WaterType) {
                    System.out.println("Nombre:" + poks.getNombrePokemon() + "\nNo. Pokedex:" + poks.getNumEntradaPokedex() + "\nNaturaleza:" + poks.getNaturaleza() + "\nCapturado:" + poks.getCapturado() + "\nPokebola donde esta atrapado:" + poks.getPokebola() + "\nCapacidad Vivir fuera:" + ((WaterType) poks).isVivirFueraAgua() + "\nVelocidad Nadar Fuera del Agua:" + ((WaterType) poks).getRapidezNadar());
                }
                System.out.println("");
            }
            System.out.println("===================");
            System.out.println("Pokemon tipo Grass");
            System.out.println("");
            for (int i = 0; i < pokes.size(); i++) {
                Pokemon poks = pokes.get(i);
                if (poks instanceof GrassType) {
                    System.out.println("Nombre:" + poks.getNombrePokemon() + "\nNo. Pokedex:" + poks.getNumEntradaPokedex() + "\nNaturaleza:" + poks.getNaturaleza() + "\nCapturado:" + poks.getCapturado() + "\nPokebola donde esta atrapado:" + poks.getPokebola() + "\nHabitat:" + ((GrassType) poks).getEcosistema() + "\nNivel de dominio sobre las plantas:" + ((GrassType) poks).getPoderSobrePlantas());
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    public static void EliminarPokemon() {
        System.out.print("Ingrese que tipo de Pokemon desea eliminar(Grass/Fire/Water):");
        String opEliminar = lt.nextLine();
        System.out.println("");
        if (opEliminar.equalsIgnoreCase("fire")) {
            System.out.println("===================");
            System.out.println("Pokemones tipo Fire");

            for (int i = 0; i < pokemons.size(); i++) {
                Pokemon poks = pokemons.get(i);
                if (poks instanceof FireType) {
                    System.out.println(i + ". Nombre:" + poks.getNombrePokemon() + "\nNo. Pokedex:" + poks.getNumEntradaPokedex());
                }
                System.out.println("");
            }
            System.out.println("===================");
            System.out.println("Ingrese el indice del pokemon que desea eliminar:");
            int posi = sc.nextInt();
            pokemons.remove(posi);
            //Fin eliminar pokemon tipo Fuego

        } else if (opEliminar.equalsIgnoreCase("water")) {
            System.out.println("===================");
            System.out.println("Pokemon tipo Water");
            for (int i = 0; i < pokemons.size(); i++) {
                Pokemon poks = pokemons.get(i);
                if (poks instanceof WaterType) {
                    System.out.println(i + ". Nombre:" + poks.getNombrePokemon() + "\nNo. Pokedex:" + poks.getNumEntradaPokedex());
                }
                System.out.println("");
            }
            System.out.println("===================");
            System.out.println("Ingrese el indice del pokemon que desea eliminar:");
            int posi = sc.nextInt();
            pokemons.remove(posi);
            //fin eliminar pokemon tipo Agua

        } else if (opEliminar.equalsIgnoreCase("grass")) {
            System.out.println("===================");
            System.out.println("Pokemon tipo Grass");
            for (int i = 0; i < pokemons.size(); i++) {
                Pokemon poks = pokemons.get(i);
                if (poks instanceof GrassType) {
                    System.out.println(i + ". Nombre:" + poks.getNombrePokemon() + "\nNo. Pokedex:" + poks.getNumEntradaPokedex());
                }
                System.out.println("");
            }
            System.out.println("===================");
            System.out.println("Ingrese el indice del pokemon que desea eliminar:");
            int posi = sc.nextInt();
            pokemons.remove(posi);
        }
        System.out.println("");
    }

    public static void AtraparPokehot() {
        System.out.println("SIMULAMAMIS");
        System.out.println("");
        System.out.println("Pokebolas");
        System.out.println("=========");
        for (int i = 0; i < pokebolas.size(); i++) {
            Pokeball listaPokebolas = pokebolas.get(i);
            System.out.println(i + 1 + ". Color: " + listaPokebolas.getColor());
        }
        System.out.println("");
        System.out.print("Seleccione una Pokebola:");
        int PokeSeleccionada = sc.nextInt();
        if (PokeSeleccionada < 0 || PokeSeleccionada > pokebolas.size()) {
            System.out.println("Posicion no disponible");
        } else {
            if (pokes.isEmpty()) {
                System.out.println("No hay pokemones disponibles");
            } else {
                int posiran = ran.nextInt(pokes.size());
                Pokemon pokeCapt = pokes.get(posiran);
                System.out.println("El pokemon " + pokeCapt.getNombrePokemon() + " ha aparecido");
                System.out.print("Que desea hacer?\n1. Huir\n2. Atraparlo con la pokebola\nIngrese su opcion:");
                int OpSimulacion = sc.nextInt();
                if (OpSimulacion == 2) {
                    int PosibilidadSimu = pokebolas.get(PokeSeleccionada).getEficienciaAtrapado();
                    int posiRandom = 0;
                    switch (PosibilidadSimu) {
                        case 1:
                            posiRandom = 1 + ran.nextInt(3);
                            if (posiRandom == 1) {
                                System.out.println("POKEMON CAPTURADO CON EXITOOOOOOOOOO");
                                pokebolas.remove(PokeSeleccionada);
                                pokes.get(posiran).setCapturado(Boolean.TRUE);
                                pokes.get(posiran).setPokebola(pokebolas.get(PokeSeleccionada));
                            } else {
                                System.out.println("Pokemon no capturado :((((((");
                                pokebolas.remove(PokeSeleccionada);
                            }
                            System.out.println("");
                            break;
                        case 2:
                            posiRandom = 1 + ran.nextInt(3);

                            if (posiRandom == 1 || posiRandom == 2) {
                                System.out.println("POKEMON CAPTURADO CON EXITOOOOOOOOOO");
                                pokebolas.remove(PokeSeleccionada);
                                pokes.get(posiran).setCapturado(Boolean.TRUE);
                                pokes.get(posiran).setPokebola(pokebolas.get(PokeSeleccionada));
                            } else {
                                System.out.println("Pokemon no capturado :((((((");
                                pokebolas.remove(PokeSeleccionada);
                            }
                            System.out.println("");
                            break;
                        case 3:
                            posiRandom = 1 + ran.nextInt(3);
                            if (posiRandom < 3 || posiRandom > 0) {
                                System.out.println("POKEMON CAPTURADO CON EXITOOOOOOOOOO");
                                pokebolas.remove(PokeSeleccionada);
                                pokes.get(posiran).setCapturado(Boolean.TRUE);
                                pokes.get(posiran).setPokebola(pokebolas.get(PokeSeleccionada));
                            } else {
                                System.out.println("Pokemon no capturado :((((((");
                                pokebolas.remove(PokeSeleccionada);
                            }
                            System.out.println("");
                            break;
                        default:
                            System.out.println("No disponible");
                            System.out.println("");
                            break;
                    }
                } else {
                    System.out.println("Pedazo de cobarde como va a huir de" + pokeCapt.getNombrePokemon() + " si es el peor Pokemon del universo, verguenza me das");
                    System.out.println("");
                }
            }
        }
    }

public static void ModificarPoke() {
    System.out.println("Lista de pokemones que puede modificar:");
    
    for (int i = 0; i < pokes.size(); i++) {
        Pokemon pokesCapturados = pokes.get(i);
       
        if (pokesCapturados.getCapturado()) {
            System.out.println(i + ". Nombre:" + pokesCapturados.getNombrePokemon() + "\nNo. Pokedex:" + pokesCapturados.getNumEntradaPokedex());
        }
    }

    System.out.println("Pokemon modificado con éxito.");
    System.out.println("");
}


    public static void extra() {
        System.out.println("exta");
        System.out.println("Oh, baby");
        System.out.println("Oh, man");
        System.out.println("You're makin' me crazy");
        System.out.println("Really drivin' me mad");
        System.out.println("That's alright with me");
        System.out.println("It's really no fuss");
        System.out.println("As long as you're next to me");
        System.out.println("Just the two of us");

        System.out.println("You're my, my, my, my kind of woman");
        System.out.println("My, oh my, what a girl");
        System.out.println("You're my, my, my, my kind of woman");
        System.out.println("And I'm down on my hands and knees");
        System.out.println("Beggin' you please, baby");
        System.out.println("Show me your world");

        System.out.println("Oh, brother");
        System.out.println("Sweetheart");
        System.out.println("I'm feelin' so tired");
        System.out.println("Really fallin' apart");
        System.out.println("And it just don't make sense to me");
        System.out.println("I really don't know");
        System.out.println("Why you stick right next to me");
        System.out.println("Wherever I go");

        System.out.println("You're my, my, my, my kind of woman");
        System.out.println("My, oh my, what a girl");
        System.out.println("You're my, my, my, my kind of woman");
        System.out.println("And I'm down on my hands and knees");
        System.out.println("Beggin' you please, baby");
        System.out.println("Show me your world");
        System.out.println("");
    }
}
