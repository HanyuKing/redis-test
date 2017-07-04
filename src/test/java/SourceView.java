import redis.clients.jedis.Jedis;

/**
 * @author wanghanyu
 * @create 2017-07-04 15:03
 */
public class SourceView {
    public static void main(String[] args) {
        Jedis jedis = new Jedis();
        jedis.set("", "");
    }
}
