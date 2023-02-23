package generics.reposotorydemo;

public interface IEntityRepository<T extends IEntity>{ // Generic Constraints
    void add(T entitiy);
    void update(T entitiy);
    void delete(T entitiy);
    void remove(T entitiy);
}
