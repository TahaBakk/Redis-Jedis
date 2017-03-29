import redis.clients.jedis.Jedis;

/**
 * Created by taha on 29/03/2017.
 */
public class DAO {
//https://www.adictosaltrabajo.com/tutoriales/spring-redis/#05

    Jedis jedis = new Jedis("172.31.73.162", 6379); // Conectar amb Redis server


    public void crearLibro(String titol, String autor){

        Llibre llibre = new Llibre(titol, autor);
        String llibrePush = llibre.toString();

        Long key = jedis.incr("llibrekey");
        jedis.sadd("Llibre"+key, new String[]{llibrePush});

        System.out.println("Libro añadido");

        jedis.close();
    }

    public void verLibro(String key){

        System.out.println("Libro: "+jedis.spop(key));

        jedis.close();

    }

    public void eliminarLibro(String key) {

        jedis.del(key);

        jedis.close();
    }




    }
