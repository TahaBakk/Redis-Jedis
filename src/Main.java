import redis.clients.jedis.Jedis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Conectar amb Redis server al localhost
        Jedis jedis = new Jedis("172.31.73.162", 6379);
        Scanner sc = new Scanner(System.in);
        DAO dao = new DAO();

        int numOpcion;
        int numOpcion2;
        System.out.println("Conectat al server correctament!");

        System.out.println("---------------------------------");
        System.out.println("Menu redis");
        System.out.println("---------------------------------");
        System.out.println("\t1.Crear");
        System.out.println("\t2.Ver");
        System.out.println("\t3.Eliminar");
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
                break;
            case 3:
                System.out.println("\t1.Eliminar un libro");
                System.out.println("\t2.Eliminar un Socio");
                System.out.println("\t3.Eliminar un Prestamo");
                break;
            default:
                break;
        }

        System.out.println("Esta corren el server -> " + jedis.ping());
        Llibre libro1 = new Llibre(1,"el perdio","taha");

        dao.crearLibro(jedis,libro1);



        jedis.close();

    }
}
