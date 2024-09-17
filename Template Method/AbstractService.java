public abstract class AbstractService<T, ID> {

    public final T save(T entity) {
        validate(entity);
        return doSave(entity);
    }

    public final Optional<T> findById(ID id) {
        preFind(id);
        return doFindById(id);
    }

    public final List<T> findAll() {
        return doFindAll();
    }

    public final void deleteById(ID id) {
        preDelete(id);
        doDeleteById(id);
    }

    protected abstract T doSave(T entity);

    protected abstract Optional<T> doFindById(ID id);

    protected abstract List<T> doFindAll();

    protected abstract void doDeleteById(ID id);

    protected void validate(T entity) {
    }

    protected void preFind(ID id) {
    }

    protected void preDelete(ID id) {
    }
}
