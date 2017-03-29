import redis.clients.jedis.Jedis;

/**
 * Created by taha on 29/03/2017.
 */
public class DAO {
//https://www.adictosaltrabajo.com/tutoriales/spring-redis/#05

    public void crearLibro(Jedis jedis, Llibre llibre){

        String llibrePush = llibre.toString();
        String llibrePush2 = llibre.toString();
        //Para añadir un nuevo libro

        System.out.println("Hacer un push: "+jedis.sadd("Llibre", new String[]{llibrePush,llibrePush2}));

        //System.out.println("Hacer un push: "+jedis.lpush("Llibre","taha"));

    }

    public void verLibro(Jedis jedis, String key){
        //le pasamos la clave y nos muestra los libros con esa clave
        //System.out.println("Hacer un push: "+jedis.lpop(key));
        System.out.println("Hacer un push: "+jedis.spop(key));

    }

    public void eliminarLibro(Jedis jedis, String key) {
        jedis.del(key);
    }



    }
