package generics.reposotorydemo;

public interface IEntityRepository<T>{
    void add(T entitiy);
    void update(T entitiy);
    void delete(T entitiy);
    void remove(T entitiy);
}
