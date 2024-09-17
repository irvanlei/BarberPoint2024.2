public class AgendamentoService {

    private static AgendamentoService instance;

    private AgendamentoService() {
    }

    public static AgendamentoService getInstance() {
        if (instance == null) {
            instance = new AgendamentoService();
        }
        return instance;
    }

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public List<Agendamento> findAll() {
        return agendamentoRepository.findAll();
    }

    public Optional<Agendamento> findById(Long id) {
        return agendamentoRepository.findById(id);
    }

    public Agendamento save(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    public boolean deleteById(Long id) {
        if (agendamentoRepository.existsById(id)) {
            agendamentoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public List<Agendamento> findByClienteId(Long clienteId) {
        return agendamentoRepository.findByClienteId(clienteId);
    }

    public boolean existsByClienteId(Long clienteId) {
        return agendamentoRepository.existsByClienteId(clienteId);
    }

    @Transactional
    public void deleteByClienteId(Long clienteId) {
        agendamentoRepository.deleteByClienteId(clienteId);
    }

    public boolean existsByBarbeiroId(Long barbeiroId) {
        return agendamentoRepository.existsByBarbeiroId(barbeiroId);
    }

    @Transactional
    public void deleteByBarbeiroId(Long barbeiroId) {
        agendamentoRepository.deleteByBarbeiroId(barbeiroId);
    }
}
