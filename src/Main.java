import redis.clients.jedis.Jedis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.31.73.162", 6379); // Conectar amb Redis server

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        DAO dao = new DAO();
        System.out.println("Conectat al server correctament!");

        int numOpcion;
        int numOpcion2;
        do {
            System.out.println("---------------------------------");
            System.out.println("Menu redis");
            System.out.println("---------------------------------");
            System.out.println("\t1.Crear");
            System.out.println("\t2.Ver");
            System.out.println("\t3.Eliminar");
            System.out.println("\t0.Salir");
            System.out.println("---------------------------------");

            numOpcion = sc.nextInt();
            switch (numOpcion) {
                case 1:
                    System.out.println("\t1.Crear un libro");
                    System.out.println("\t2.Crear un Socio");
                    System.out.println("\t3.Crear un Prestamo");
                    numOpcion2 = sc.nextInt();
                    switch (numOpcion2) {
                        case 1:
                            System.out.println("Introduce el titulo:");
                            String titol=sc2.nextLine();
                            System.out.println("Introduce el autor:");
                            String autor=sc2.nextLine();
                            dao.crearLibro(titol,autor);
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\t1.Ver un libro");
                    System.out.println("\t2.Ver un Socio");
                    System.out.println("\t3.Ver un Prestamo");
                    numOpcion2 = sc.nextInt();
                    switch (numOpcion2) {
                        case 1:
                            System.out.println("introduceme la clave");
                            String key = sc3.nextLine();
                            dao.verLibro(key);
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\t1.Eliminar un libro");
                    System.out.println("\t2.Eliminar un Socio");
                    System.out.println("\t3.Eliminar un Prestamo");
                    numOpcion2 = sc.nextInt();
                    switch (numOpcion2) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }while (numOpcion!=0);
        sc.close();

        //System.out.println("Esta corren el server -> " + jedis.ping());



    }
}
