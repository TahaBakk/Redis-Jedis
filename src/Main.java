import redis.clients.jedis.Jedis;

public class Main {

    public static void main(String[] args) {
        // Conectar amb Redis server al localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Conectat al server correctament!");

        System.out.println("Esta corren el server -> " + jedis.ping());

        jedis.close();

    }
}
