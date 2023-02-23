package overriding;

public class AskerKrediManager extends BaseKrediManager {
    @Override
    public double hesapla(double tutar) {
       return tutar*2.57;
    }
}
