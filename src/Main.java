import redis.clients.jedis.Jedis;

public class Main {

    public static void main(String[] args) {
        // Conectar amb Redis server al localhost
        Jedis jedis = new Jedis("localhost");
        DAO dao = new DAO();

        System.out.println("Conectat al server correctament!");
        System.out.println("Esta corren el server -> " + jedis.ping());
        Llibre libro1 = new Llibre(1,"el perdio","taha");

        dao.crearLibro(jedis,libro1);
        jedis.close();

    }
}
