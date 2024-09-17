public class ClienteService extends AbstractService<Cliente, Long> {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    protected Cliente doSave(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    protected Optional<Cliente> doFindById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    protected List<Cliente> doFindAll() {
        return clienteRepository.findAll();
    }

    @Override
    protected void doDeleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    protected void validate(Cliente cliente) {
    }
}
