package com.estudo.redis;

import redis.clients.jedis.Jedis;

public class Classe1_Get_Set_Delete {
    static Jedis jedis = new Jedis("localhost");

    public static void main(String[] args) {
        basico();
    }

    private static void basico() {
        String chave = "usuario.nome";
        String valor = "Vinicius";
        System.out.println(jedis.echo("Ola Mundo!"));
        System.out.println(jedis.set(chave, valor));
        System.out.println(jedis.get(chave));
        System.out.println(jedis.del(chave));
    }
}
