public class BarbeiroService extends AbstractService<Barbeiro, Long> {

    @Autowired
    private BarbeiroRepository barbeiroRepository;

    private ValidationStrategy<Barbeiro> validationStrategy = new BarbeiroValidationStrategy();

    @Override
    protected Barbeiro doSave(Barbeiro barbeiro) {
        validationStrategy.validate(barbeiro);
        return barbeiroRepository.save(barbeiro);
    }

    @Override
    protected Optional<Barbeiro> doFindById(Long id) {
        return barbeiroRepository.findById(id);
    }

    @Override
    protected List<Barbeiro> doFindAll() {
        return barbeiroRepository.findAll();
    }

    @Override
    protected void doDeleteById(Long id) {
        barbeiroRepository.deleteById(id);
    }
}
