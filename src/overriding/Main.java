package overriding;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{
                new OgretmenKrediManager(), new TarimKrediManager()
        };
        for (BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager+"'nin kredi tutari :"+ krediManager.hesapla(1000));

        }

    }
}
