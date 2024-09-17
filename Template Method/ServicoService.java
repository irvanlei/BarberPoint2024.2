public class ServicoService extends AbstractService<Servico, Long> {

    @Autowired
    private ServicoRepository servicoRepository;

    @Override
    protected Servico doSave(Servico servico) {
        return servicoRepository.save(servico);
    }

    @Override
    protected Optional<Servico> doFindById(Long id) {
        return servicoRepository.findById(id);
    }

    @Override
    protected List<Servico> doFindAll() {
        return servicoRepository.findAll();
    }

    @Override
    protected void doDeleteById(Long id) {
        servicoRepository.deleteById(id);
    }
}
